package com.test.calculator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericCalculator<T extends Number> {
    private List<T> results;

    public GenericCalculator() {
        results = new ArrayList<>();
    }
    //단순하게 리스트에 저장된 모든 데이터를 print 해주는 메서드
    public void printResults() {
        for (T result : results) {
            System.out.println(result);
        }
    }
    //가장 먼저 저장된 데이터를 삭제하는 메서드 순서대로 저장되기 때문에 인덱스 0을 제거하면 된다.
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
    //스트림 필터를 이용하여 사용자가 입력한 값보다 더 큰 값들을 서치해온다.
    public void printGreaterThan(T threshold) {
        System.out.println(results.stream()
                .filter(e -> e.doubleValue() > threshold.doubleValue())
                .toList());
    }
    //스트림 필터를 이용한 계산 메서드
    public void computeAndStoreResult(T num1, T num2, String operatorSymbol) {
        Arrays.stream(ArithmeticOperator.values())
                .filter(op -> op.getSymbol().equals(operatorSymbol))
                .forEach(op -> results.add(op.calculate(num1, num2)));
    }
}