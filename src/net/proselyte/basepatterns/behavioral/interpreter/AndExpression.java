package net.proselyte.basepatterns.behavioral.interpreter;

public class AndExpression {
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
