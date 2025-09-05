package src;

import generated.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Scanner;

public class CodejiREPL {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CodejiInterpreter interpreter = new CodejiInterpreter();

            System.out.println("Codeji me swagat hai. Bas 'ab jane do thikHai' type karke exit karein.");

            while (true) {
                System.out.print(">>> ");
                String input = scanner.nextLine();

                // Change exit condition to 'exit thikHai'
                if (input.trim().equals("ab jane do thikHai"))
                    break;

                try {
                    // Create lexer & parser
                    CharStream charStream = CharStreams.fromString(input);
                    CodejiLexer lexer = new CodejiLexer(charStream);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    CodejiParser parser = new CodejiParser(tokens);

                    // Parse statement, this will be handled by the grammar with 'thikHai'
                    ParseTree tree = parser.statement();

                    // Interpret
                    interpreter.visit(tree);
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            System.out.println("Goodbye!");
        }
    }
}
