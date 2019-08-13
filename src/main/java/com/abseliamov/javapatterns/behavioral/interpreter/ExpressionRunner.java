package com.abseliamov.javapatterns.behavioral.interpreter;

public class ExpressionRunner {
    public static void main(String[] args) {
        Expression laptopWithIntel = getLaptopWithIntelExpression();
        Expression laptopApple = getLaptopAppleExpression();

        System.out.println("Laptop with Intel: " + laptopWithIntel.interpret("Laptop Intel"));
        System.out.println("Apple laptop: " + laptopApple.interpret("Laptop Apple"));
    }

    public static Expression getLaptopWithIntelExpression() {
        Expression laptop = new TerminalExpression("Laptop");
        Expression intel = new TerminalExpression("Intel i9");

        return new OrExpression(laptop, intel);
    }

    public static Expression getLaptopAppleExpression() {
        Expression laptop = new TerminalExpression("Laptop");
        Expression apple = new TerminalExpression("Apple");

        return new AndExpression(laptop, apple);
    }
}
