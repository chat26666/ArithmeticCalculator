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
    ADD("+", (i, j) -> i.doubleValue() + j.doubleValue()),
    SUB("-", (i, j) -> i.doubleValue() - j.doubleValue()),
    MUL("*", (i, j) -> i.doubleValue() * j.doubleValue()),
    DIV("/", (i, j) -> i.doubleValue() / j.doubleValue());

    private final BiFunction<Double,Double,Double> calc;
    private final String op;
    operator(String op, BiFunction<Double,Double,Double> calc) {
        this.op = op;
        this.calc = calc;
    }
    public String getOp() {
        return op;
    }
    public <T extends Number> T calc(T i, T j) {
        Double result = calc.apply(i.doubleValue(), j.doubleValue());
        System.out.println(i + " " + op + " " + j + " = " + result);
        return (T) result;
    }
}
