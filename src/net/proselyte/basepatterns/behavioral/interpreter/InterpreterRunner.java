package net.proselyte.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        return null;
    }

    public static Expression getJavaEEExpression() {

        return null;
    }
}
