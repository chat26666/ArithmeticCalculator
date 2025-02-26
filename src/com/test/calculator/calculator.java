package com.test.calculator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calculator<T extends Number> {

    private List<T> list;

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

    public void bigger_data(T i) {
        System.out.println(list.stream().filter(e -> e.doubleValue() > i.doubleValue()).toList());
    }

    public void setter(T i,T j,String c) {
        Arrays.stream(operator.values()).filter(cal -> cal.getOp().equals(c)).forEach(cal -> list.add(cal.calc(i,j)));
        /*for 문에서 스트림 필터 방식으로 변환
        operator[] op = operator.values();
         for(operator oo : op) {
           if(oo.getOp().equals(c)) {
                 list.add(oo.calc(i,j));
             }
          }*/
    }
}