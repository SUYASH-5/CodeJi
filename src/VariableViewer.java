package src;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

import java.util.Map;

public class VariableViewer extends VBox {
    private TableView<Map.Entry<String, Object>> table;

    public VariableViewer() {
        table = new TableView<>();

        TableColumn<Map.Entry<String, Object>, String> nameCol = new TableColumn<>("Variable");
        nameCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getKey()));

        TableColumn<Map.Entry<String, Object>, Object> valueCol = new TableColumn<>("Value");
        valueCol.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getValue()));

        nameCol.setPrefWidth(150);
        valueCol.setPrefWidth(150);

        table.getColumns().add(nameCol);
        table.getColumns().add(valueCol);
        table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);

        this.getChildren().add(table);
    }

    public void updateVariables(Map<String, Object> variables) {
        ObservableList<Map.Entry<String, Object>> items = FXCollections.observableArrayList(variables.entrySet());
        table.setItems(items);
    }
}
