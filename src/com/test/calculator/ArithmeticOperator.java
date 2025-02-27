package com.test.calculator;
import java.util.function.BiFunction;

public enum ArithmeticOperator {
    ADD("+", (num1, num2) -> num1.doubleValue() + num2.doubleValue()),
    SUBTRACT("-", (num1, num2) -> num1.doubleValue() - num2.doubleValue()),
    MULTIPLY("*", (num1, num2) -> num1.doubleValue() * num2.doubleValue()),
    DIVIDE("/", (num1, num2) -> num1.doubleValue() / num2.doubleValue());
    //각 상수 객체마다 연산기호와 그에 맞는 연산 메서드를 가지고 있다
    private final BiFunction<Double, Double, Double> operation;
    private final String symbol;
    //함수형 인터페이스 BiFunction을 사용, 선언된 Double들은 <피연산자1, 피연산자2, 연산 반환값>이다
    ArithmeticOperator(String symbol, BiFunction<Double, Double, Double> operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public String getSymbol() {
        return symbol;
    }
    //연산 결과를 리턴하면서 동시에 콘솔화면에 print 해주는 메서드, 리턴값은 리스트에 저장된다
    public <T extends Number> T calculate(T num1, T num2) {
        Double result = operation.apply(num1.doubleValue(), num2.doubleValue());
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
        return (T) result;
    }
}