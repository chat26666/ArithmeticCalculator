package com.test.calculator;

public enum operator {
    ADD("+") {
        @Override
        public int calc(int i, int j) {
            System.out.println(i + " + " + j + " = " + (i+j));
            return i + j;
        }
    },
    SUB("-") {
        @Override
        public int calc(int i, int j) {
            System.out.println(i + " - " + j + " = " + (i-j));
            return i - j;
        }
    },
    MUL("*") {
        @Override
        public int calc(int i, int j) {
            System.out.println(i + " * " + j + " = " + (i*j));
            return i * j;
        }
    },
    DIV("/") {
        @Override
        public int calc(int i, int j) {
            System.out.println(i + " / " + j + " = " + (i/j));
            return i / j;
        }
    };
    private final String op;
    operator(String op) {
        this.op = op;
    }
    public String getOp() {
        return op;
    }
    abstract int calc(int i, int j);
}
