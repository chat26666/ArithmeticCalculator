package com.test.calculator;
import java.util.function.BiFunction;

public enum ArithmeticOperator {
    ADD("+", (num1, num2) -> num1.doubleValue() + num2.doubleValue()),
    SUBTRACT("-", (num1, num2) -> num1.doubleValue() - num2.doubleValue()),
    MULTIPLY("*", (num1, num2) -> num1.doubleValue() * num2.doubleValue()),
    DIVIDE("/", (num1, num2) -> {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("⚠ 나눗셈에서 분모가 0이 될 수 없습니다.");
        }
        return num1.doubleValue() / num2.doubleValue();
    });

    private final BiFunction<Double, Double, Double> operation;
    private final String symbol;

    ArithmeticOperator(String symbol, BiFunction<Double, Double, Double> operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public String getSymbol() {
        return symbol;
    }

    public <T extends Number> T calculate(T num1, T num2) {
        Double result = operation.apply(num1.doubleValue(), num2.doubleValue());
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
        return (T) result;
    }
}