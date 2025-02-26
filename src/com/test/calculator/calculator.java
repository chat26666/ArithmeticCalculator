package com.test.calculator;
import java.util.ArrayList;

public class calculator {

    private ArrayList<Integer> list;

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
    public void setter(int i,int j,String c) {
        operator[] op = operator.values();
        for(operator oo : op) {
            if(oo.getOp().equals(c)) {
                list.add(oo.calc(i,j));
            }
        }
    }
}