package com.test.calculator;
import java.util.function.BiFunction;

public enum operator {
    /*ADD("+") {
        @Override
        public <T extends Number> T calc(T i, T j) {
            System.out.println(i + " + " + j + " = " + (i.doubleValue() + j.doubleValue()));
            return (T)(Double)(i.doubleValue() + j.doubleValue());
        }
    },
    SUB("-") {
        @Override
        public <T extends Number> T calc(T i, T j) {
            System.out.println(i + " - " + j + " = " + (i.doubleValue() - j.doubleValue()));
            return (T)(Double)(i.doubleValue() - j.doubleValue());
        }
    },
    MUL("*") {
        @Override
        public <T extends Number> T calc(T i, T j) {
            System.out.println(i + " * " + j + " = " + (i.doubleValue() * j.doubleValue()));
            return (T)(Double)(i.doubleValue() * j.doubleValue());
        }
    },
    DIV("/") {
        @Override
        public <T extends Number> T calc(T i, T j) {
            System.out.println(i + " / " + j + " = " + (i.doubleValue() / j.doubleValue()));
            return (T)(Double)(i.doubleValue() / j.doubleValue());
        }
    };
     */
    //public abstract <T extends Number> T calc(T i, T j);

    // 람다식 표현을 통해 코드를 좀 더 간결하게
    ADD("+", (num1, num2) -> num1.doubleValue() + num2.doubleValue()),
    SUB("-", (num1, num2) -> num1.doubleValue() - num2.doubleValue()),
    MUL("*", (num1, num2) -> num1.doubleValue() * num2.doubleValue()),
    DIV("/", (num1, num2) -> num1.doubleValue() / num2.doubleValue());

    private final BiFunction<Double,Double,Double> calc;
    private final String op;
    operator(String op, BiFunction<Double,Double,Double> calc) {
        this.op = op;
        this.calc = calc;
    }
    public String getOp() {
        return op;
    }
    public <T extends Number> T calc(T num1, T num2) {
        Double result = calc.apply(num1.doubleValue(), num2.doubleValue());
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        return (T) result;
    }
}