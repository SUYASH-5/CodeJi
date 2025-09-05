// Generated from CodejiParser.g4 by ANTLR 4.13.2
package generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodejiParser}.
 */
public interface CodejiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodejiParser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterProgram(CodejiParser.ProgramContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitProgram(CodejiParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterStatement(CodejiParser.StatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#statement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitStatement(CodejiParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#varDeclarationStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatement(CodejiParser.VarDeclarationStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#varDeclarationStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatement(CodejiParser.VarDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#assignmentStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(CodejiParser.AssignmentStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#assignmentStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(CodejiParser.AssignmentStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#printStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(CodejiParser.PrintStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#printStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(CodejiParser.PrintStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#printLineStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrintLineStatement(CodejiParser.PrintLineStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#printLineStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrintLineStatement(CodejiParser.PrintLineStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#padhleStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPadhleStatement(CodejiParser.PadhleStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#padhleStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPadhleStatement(CodejiParser.PadhleStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#ifStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CodejiParser.IfStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#ifStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CodejiParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#whileStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CodejiParser.WhileStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#whileStatement}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CodejiParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#statementBlock}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(CodejiParser.StatementBlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#statementBlock}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(CodejiParser.StatementBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#condition}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondition(CodejiParser.ConditionContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#condition}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondition(CodejiParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#comparator}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterComparator(CodejiParser.ComparatorContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#comparator}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitComparator(CodejiParser.ComparatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#printArguments}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrintArguments(CodejiParser.PrintArgumentsContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#printArguments}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrintArguments(CodejiParser.PrintArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#printPart}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrintPart(CodejiParser.PrintPartContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#printPart}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrintPart(CodejiParser.PrintPartContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#printValue}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrintValue(CodejiParser.PrintValueContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#printValue}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrintValue(CodejiParser.PrintValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#expression}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterExpression(CodejiParser.ExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#expression}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitExpression(CodejiParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#term}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterTerm(CodejiParser.TermContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#term}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitTerm(CodejiParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#factor}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFactor(CodejiParser.FactorContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#factor}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFactor(CodejiParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodejiParser#primary}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrimary(CodejiParser.PrimaryContext ctx);

	/**
	 * Exit a parse tree produced by {@link CodejiParser#primary}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrimary(CodejiParser.PrimaryContext ctx);
}