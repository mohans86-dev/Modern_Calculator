package com.example.mycalculator;

import java.util.Stack;

public class EvaluateOperation {
    public static Double evaluate(String expression) {

        if(expression.charAt(expression.length()-1)=='+' ||
                expression.charAt(expression.length()-1)=='-' ||
                expression.charAt(expression.length()-1)=='*' ||
                expression.charAt(expression.length()-1)=='/'){
            return null;
        }
        // Create a stack to hold operands
        Stack<Double> operands = new Stack<>();

        // Create a stack to hold operators
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the current character is a whitespace, skip it
            if (ch == ' ') {
                continue;
            }

            // If the current character is a digit, push it to the operand stack
            if (Character.isDigit(ch)) {
                double num = 0.0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10.0 + Character.getNumericValue(expression.charAt(i));
                    i++;
                }
                i--;
                operands.push(num);
            }

            // If the current character is an operator, push it to the operator stack
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.empty() && hasPrecedence(ch, operators.peek())) {
                    operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
                }
                operators.push(ch);
            }
        }

        while (!operators.empty()) {
            operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
        }

        return operands.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    public static Double applyOperation(char op, Double b, Double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
        }
        return 0.0;
    }
}
