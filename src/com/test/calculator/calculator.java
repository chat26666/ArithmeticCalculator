package com.test.calculator;
import java.util.ArrayList;

public class calculator<T extends Number> {

    private ArrayList<T> list;

    public calculator() {
        list = new ArrayList<>();
    }
    public void getter() {
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
    public void remove() {
        list.remove(0);
    }
    public void setter(T i,T j,String c) {
        operator[] op = operator.values();
        for(operator oo : op) {
            if(oo.getOp().equals(c)) {
                list.add(oo.calc(i,j));
            }
        }
    }
}