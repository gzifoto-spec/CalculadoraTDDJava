package org.example;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double firstOperand = 10;
        double secondOperand = 5;

        System.out.println("=== Calculator TDD ===");
        System.out.println("Operands: " + firstOperand + " and " + secondOperand);
        System.out.println("---------------------");
        System.out.println("Addition:       " + firstOperand + " + " + secondOperand + " = " + calculator.add(firstOperand, secondOperand));
        System.out.println("Subtraction:    " + firstOperand + " - " + secondOperand + " = " + calculator.subtract(firstOperand, secondOperand));
        System.out.println("Multiplication: " + firstOperand + " * " + secondOperand + " = " + calculator.multiply(firstOperand, secondOperand));
        System.out.println("Division:       " + firstOperand + " / " + secondOperand + " = " + calculator.divide(firstOperand, secondOperand));
        System.out.println("---------------------");

        System.out.println("\n=== Edge Cases ===");
        System.out.println("Division by zero attempt:");
        try {
            calculator.divide(firstOperand, 0);
        } catch (ArithmeticException e) {
            System.out.println("  Caught: " + e.getMessage());
        }
    }
}