// Generated from CodejiParser.g4 by ANTLR 4.13.2
package generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodejiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CodejiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodejiParser#program}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CodejiParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#statement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CodejiParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#varDeclarationStatement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationStatement(CodejiParser.VarDeclarationStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#assignmentStatement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(CodejiParser.AssignmentStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#printStatement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(CodejiParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#printLineStatement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintLineStatement(CodejiParser.PrintLineStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#padhleStatement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadhleStatement(CodejiParser.PadhleStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#ifStatement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CodejiParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#whileStatement}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CodejiParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#statementBlock}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(CodejiParser.StatementBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#condition}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CodejiParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#comparator}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(CodejiParser.ComparatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#printArguments}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArguments(CodejiParser.PrintArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#printPart}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintPart(CodejiParser.PrintPartContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#printValue}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintValue(CodejiParser.PrintValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#expression}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CodejiParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#term}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CodejiParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#factor}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CodejiParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodejiParser#primary}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CodejiParser.PrimaryContext ctx);
}