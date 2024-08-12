package net.proselyte.basepatterns.behavioral.interpreter;

public class OrExpression {
    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
