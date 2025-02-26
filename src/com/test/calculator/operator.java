package com.test.calculator;

public enum operator {
    ADD("+") {
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
    private final String op;
    operator(String op) {
        this.op = op;
    }
    public String getOp() {
        return op;
    }

    public abstract <T extends Number> T calc(T i, T j);
}
