// Generated from /Users/maxtuno/NetBeansProjects/Calculator/src/calculator/Calculator.g4 by ANTLR 4.2.2
package calculator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#AssignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(@NotNull CalculatorParser.AssignExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#PrintExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(@NotNull CalculatorParser.PrintExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#AddExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull CalculatorParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#IDExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDExpression(@NotNull CalculatorParser.IDExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#IntExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpression(@NotNull CalculatorParser.IntExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ParentizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentizedExpression(@NotNull CalculatorParser.ParentizedExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#DivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull CalculatorParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#BlankExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankExpression(@NotNull CalculatorParser.BlankExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#SubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(@NotNull CalculatorParser.SubExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull CalculatorParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#MulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull CalculatorParser.MulExpressionContext ctx);
}