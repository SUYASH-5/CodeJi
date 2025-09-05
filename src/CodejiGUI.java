package src;

import generated.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CodejiGUI extends Application {

    private CodeArea codeArea;
    private TextArea outputArea;
    private VariableViewer variableViewer;
    private List<String> commandHistory = new ArrayList<>();
    private int historyPointer = -1;

    private CodejiInterpreter interpreter = new CodejiInterpreter();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CodeJi IDE");

        codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setPrefHeight(400);
        codeArea.setWrapText(true);

        CodejiSyntaxHighlighter.applyHighlighting(codeArea);

        loadTheme("Light");

        outputArea = new TextArea();
        outputArea.setEditable(false);
        outputArea.setPrefHeight(150);

        PrintStream printStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                outputArea.appendText(String.valueOf((char) b));
            }
        });
        System.setOut(printStream);
        System.setErr(printStream);

        Button runButton = new Button("Run");
        Button clearButton = new Button("Clear");
        Button resetButton = new Button("Reset"); // NEW Reset button
        Button exitButton = new Button("Exit");
        Button saveButton = new Button("Save");
        Button loadButton = new Button("Load");

        ComboBox<String> themeComboBox = new ComboBox<>();
        themeComboBox.getItems().addAll("Light", "Dark");
        themeComboBox.setValue("Light");

        themeComboBox.setOnAction(e -> loadTheme(themeComboBox.getValue()));

        // Include Reset button in the button bar
        HBox buttonBar = new HBox(10, runButton, clearButton, resetButton, saveButton, loadButton, themeComboBox,
                exitButton);
        buttonBar.setPadding(new Insets(5));

        variableViewer = new VariableViewer();
        variableViewer.setPrefWidth(300);

        SplitPane horizontalSplit = new SplitPane();
        horizontalSplit.setOrientation(Orientation.HORIZONTAL);

        VBox leftPane = new VBox(codeArea, outputArea, buttonBar);
        VBox.setVgrow(codeArea, Priority.ALWAYS);
        VBox.setVgrow(outputArea, Priority.ALWAYS);

        horizontalSplit.getItems().addAll(leftPane, variableViewer);
        horizontalSplit.setDividerPositions(0.7);

        Scene scene = new Scene(horizontalSplit, 1000, 600);

        runButton.setOnAction(e -> executeCode());

        // Clear button now clears output, history, and interpreter variables but keeps
        // codeArea intact
        clearButton.setOnAction(e -> {
            outputArea.clear();
            commandHistory.clear();
            historyPointer = -1;
            interpreter.resetVariables();
            variableViewer.updateVariables(interpreter.getVariables());
        });

        // Reset button clears everything including the code area
        resetButton.setOnAction(e -> {
            codeArea.clear();
            outputArea.clear();
            commandHistory.clear();
            historyPointer = -1;
            interpreter.resetVariables();
            variableViewer.updateVariables(interpreter.getVariables());
        });

        exitButton.setOnAction(e -> primaryStage.close());

        saveButton.setOnAction(e -> saveCode(primaryStage));

        loadButton.setOnAction(e -> loadCode(primaryStage));

        codeArea.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP && !commandHistory.isEmpty()) {
                if (historyPointer > 0)
                    historyPointer--;
                codeArea.replaceText(commandHistory.get(historyPointer));
            }
            if (e.getCode() == KeyCode.DOWN && !commandHistory.isEmpty()) {
                if (historyPointer < commandHistory.size() - 1)
                    historyPointer++;
                codeArea.replaceText(commandHistory.get(historyPointer));
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void executeCode() {
        String inputCode = codeArea.getText();
        if (inputCode.trim().isEmpty()) {
            outputArea.appendText("No code to run.\n");
            return;
        }

        try {
            interpreter.resetVariables(); // Clear internal variable map
            variableViewer.updateVariables(interpreter.getVariables());
            CodejiLexer lexer = new CodejiLexer(CharStreams.fromString(inputCode));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CodejiParser parser = new CodejiParser(tokens);

            CodejiParser.ProgramContext tree = parser.program();
            // Keep same interpreter instance, don't reset here
            interpreter.visit(tree);

            variableViewer.updateVariables(interpreter.getVariables());

            // Add to history on successful execution
            commandHistory.add(inputCode);
            historyPointer = commandHistory.size(); // reset pointer to end

        } catch (Exception e) {
            outputArea.appendText("Runtime Error: " + e.getMessage() + "\n");
            e.printStackTrace(new PrintStream(new OutputStream() {
                @Override
                public void write(int b) {
                    outputArea.appendText(String.valueOf((char) b));
                }
            }));
        }
    }

    private void loadTheme(String theme) {
        codeArea.getStylesheets().clear();
        String cssFile = theme.equalsIgnoreCase("Dark") ? "/styles/codeji-dark.css" : "/styles/codeji-light.css";
        URL cssUrl = CodejiGUI.class.getResource(cssFile);
        if (cssUrl == null) {
            System.err.println("Could not load CSS file: " + cssFile);
        } else {
            String css = cssUrl.toExternalForm();
            codeArea.getStylesheets().add(css);
        }
    }

    private void saveCode(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Code");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CodeJi Files", "*.cji"));
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(codeArea.getText());
            } catch (IOException ex) {
                System.err.println("Save error: " + ex.getMessage());
            }
        }
    }

    private void loadCode(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load Code");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CodeJi Files", "*.cji"));
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                codeArea.replaceText(content.toString());
            } catch (IOException ex) {
                System.err.println("Load error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}