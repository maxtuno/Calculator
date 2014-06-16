/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author maxtuno
 */
public class CalculatorRuntime extends CalculatorBaseVisitor<CalculatorObject> {

    private Map<String, CalculatorObject> memory = new HashMap<>();

    @Override
    public CalculatorObject visitPrintExpression(CalculatorParser.PrintExpressionContext ctx) {
        CalculatorObject obj = visit(ctx.expr());
        obj.show();

        return obj;
    }

    @Override
    public CalculatorObject visitAssignExpression(CalculatorParser.AssignExpressionContext ctx) {
        String id = ctx.ID().getText();
        CalculatorObject obj = visit(ctx.expr());
        memory.put(id, obj);

        return obj;
    }

    @Override
    public CalculatorObject visitIntExpression(CalculatorParser.IntExpressionContext ctx) {

        return new CalculatorObject(ctx.INT().getText());
    }

    @Override
    public CalculatorObject visitIDExpression(CalculatorParser.IDExpressionContext ctx) {
        CalculatorObject obj = memory.get(ctx.ID().getText());

        return obj;
    }

    @Override
    public CalculatorObject visitParentizedExpression(CalculatorParser.ParentizedExpressionContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public CalculatorObject visitMulExpression(CalculatorParser.MulExpressionContext ctx) {
        CalculatorObject a = visit(ctx.expr(0));
        CalculatorObject b = visit(ctx.expr(1));

        return a.mul(b);
    }

    @Override
    public CalculatorObject visitAddExpression(CalculatorParser.AddExpressionContext ctx) {
        CalculatorObject a = visit(ctx.expr(0));
        CalculatorObject b = visit(ctx.expr(1));

        return a.add(b);
    }

    @Override
    public CalculatorObject visitDivExpression(CalculatorParser.DivExpressionContext ctx) {
        CalculatorObject a = visit(ctx.expr(0));
        CalculatorObject b = visit(ctx.expr(1));

        return a.div(b);
    }

    @Override
    public CalculatorObject visitSubExpression(CalculatorParser.SubExpressionContext ctx) {
        CalculatorObject a = visit(ctx.expr(0));
        CalculatorObject b = visit(ctx.expr(1));

        return a.sub(b);
    }
}
