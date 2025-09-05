package src;

import generated.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Window;

public class CodejiInterpreter extends CodejiParserBaseVisitor<Object> {
    private Map<String, Object> variables = new HashMap<>();

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void resetVariables() {
        variables.clear();
    }

    @Override
    public Object visitProgram(CodejiParser.ProgramContext ctx) {
        for (CodejiParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    @Override
    public Object visitVarDeclarationStatement(CodejiParser.VarDeclarationStatementContext ctx) {
        String varName = ctx.ID().getText();
        Object value = visit(ctx.printValue());
        variables.put(varName, value);
        return null;
    }

    @Override
    public Object visitAssignmentStatement(CodejiParser.AssignmentStatementContext ctx) {
        String varName = ctx.ID().getText();
        if (!variables.containsKey(varName)) {
            System.err.println("Error: Variable '" + varName + "' not declared.");
            return null;
        }
        Object value = visit(ctx.printValue());
        variables.put(varName, value);
        return null;
    }

    @Override
    public Object visitPadhleStatement(CodejiParser.PadhleStatementContext ctx) {
        String varName = ctx.ID().getText();

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("User Input");
        dialog.setHeaderText(null);
        dialog.setContentText("Enter value for " + varName + ":");

        dialog.initOwner(
                javafx.stage.Window.getWindows()
                        .stream()
                        .filter(Window::isShowing)
                        .findFirst()
                        .orElse(null));

        Optional<String> result = dialog.showAndWait();
        String input = result.orElse("");

        Object value;
        try {
            if (input.contains(".")) {
                value = Double.parseDouble(input);
            } else {
                value = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            value = input;
        }

        variables.put(varName, value);
        return null;
    }

    @Override
    public Object visitIfStatement(CodejiParser.IfStatementContext ctx) {
        boolean conditionMatched = false;

        if (evaluateCondition(ctx.condition(0))) {
            conditionMatched = true;
            for (CodejiParser.StatementContext stmt : ctx.statementBlock(0).statement()) {
                visit(stmt);
            }
        }

        for (int i = 0; i < ctx.NAHI_AGAR().size(); i++) {
            if (!conditionMatched && evaluateCondition(ctx.condition(i + 1))) {
                conditionMatched = true;
                for (CodejiParser.StatementContext stmt : ctx.statementBlock(i + 1).statement()) {
                    visit(stmt);
                }
                break;
            }
        }

        if (!conditionMatched && ctx.NAHI_TO() != null) {
            for (CodejiParser.StatementContext stmt : ctx.statementBlock(ctx.statementBlock().size() - 1).statement()) {
                visit(stmt);
            }
        }

        return null;
    }

    private boolean evaluateCondition(CodejiParser.ConditionContext ctx) {
        Object left = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));

        if (!(left instanceof Number) || !(right instanceof Number)) {
            System.err.println("Error: Condition values must be numbers.");
            return false;
        }

        double l = ((Number) left).doubleValue();
        double r = ((Number) right).doubleValue();

        if (ctx.comparator().BADA() != null)
            return l > r;
        if (ctx.comparator().CHHOTA() != null)
            return l < r;
        if (ctx.comparator().BARABAR() != null)
            return l == r;
        if (ctx.comparator().BADA_YA_BARAABAR() != null)
            return l >= r;
        if (ctx.comparator().CHHOTA_YA_BARAABAR() != null)
            return l <= r;
        if (ctx.comparator().NAHI_BARABAR() != null)
            return l != r;

        return false;
    }

    @Override
    public Object visitWhileStatement(CodejiParser.WhileStatementContext ctx) {
        while (evaluateCondition(ctx.condition())) {
            for (CodejiParser.StatementContext stmt : ctx.statementBlock().statement()) {
                visit(stmt);
            }
        }
        return null;
    }

    @Override
    public Object visitPrintStatement(CodejiParser.PrintStatementContext ctx) {
        StringBuilder output = new StringBuilder();
        for (CodejiParser.PrintPartContext part : ctx.printArguments().printPart()) {
            if (part.NAYILINE() != null) {
                output.append("\n");
            } else {
                Object value = visit(part.printValue());
                output.append(value);
            }
        }
        System.out.print(output.toString());
        return null;
    }

    @Override
    public Object visitPrintLineStatement(CodejiParser.PrintLineStatementContext ctx) {
        StringBuilder output = new StringBuilder();
        for (CodejiParser.PrintPartContext part : ctx.printArguments().printPart()) {
            if (part.NAYILINE() != null) {
                output.append("\n");
            } else {
                Object value = visit(part.printValue());
                output.append(value).append(" ");
            }
        }
        System.out.println(output.toString().trim());
        return null;
    }

    @Override
    public Object visitPrintValue(CodejiParser.PrintValueContext ctx) {
        if (ctx.STRING() != null) {
            return ctx.STRING().getText().replaceAll("\"", "");
        } else if (ctx.SAHIME() != null) {
            return true;
        } else if (ctx.KUCHNAHI() != null) {
            return false;
        } else {
            return visit(ctx.expression());
        }
    }

    @Override
    public Object visitExpression(CodejiParser.ExpressionContext ctx) {
        Object result = visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            Object right = visit(ctx.term(i));
            if (ctx.JODWA(i - 1) != null) {
                result = (Double) result + (Double) right;
            } else if (ctx.GHATAWA(i - 1) != null) {
                result = (Double) result - (Double) right;
            }
        }
        return result;
    }

    @Override
    public Object visitTerm(CodejiParser.TermContext ctx) {
        Object result = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            Object right = visit(ctx.factor(i));
            if (ctx.GUNAK(i - 1) != null) {
                result = (Double) result * (Double) right;
            } else if (ctx.BATAAK(i - 1) != null) {
                result = (Double) result / (Double) right;
            } else if (ctx.REMAINDERWA(i - 1) != null) {
                result = (Double) result % (Double) right;
            }
        }
        return result;
    }

    @Override
    public Object visitFactor(CodejiParser.FactorContext ctx) {
        Object base = visit(ctx.primary());
        if (ctx.POWERWA() != null) {
            Object exp = visit(ctx.factor());
            return Math.pow((Double) base, (Double) exp);
        }
        return base;
    }

    @Override
    public Object visitPrimary(CodejiParser.PrimaryContext ctx) {
        if (ctx.NUMBER() != null) {
            return Double.parseDouble(ctx.NUMBER().getText());
        } else if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (!variables.containsKey(varName)) {
                System.err.println("Error: Variable '" + varName + "' not defined.");
                return null;
            }
            return variables.get(varName);
        } else {
            return visit(ctx.expression());
        }
    }
}
