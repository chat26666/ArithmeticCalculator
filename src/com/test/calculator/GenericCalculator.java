package com.test.calculator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericCalculator<T extends Number> {
    private List<T> results;

    public GenericCalculator() {
        results = new ArrayList<>();
    }

    public void printResults() {
        for (T result : results) {
            System.out.println(result);
        }
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    public void printGreaterThan(T threshold) {
        System.out.println(results.stream()
                .filter(e -> e.doubleValue() > threshold.doubleValue())
                .toList());
    }

    public void computeAndStoreResult(T num1, T num2, String operatorSymbol) {
        Arrays.stream(ArithmeticOperator.values())
                .filter(op -> op.getSymbol().equals(operatorSymbol))
                .forEach(op -> results.add(op.calculate(num1, num2)));
    }
}