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
    public void bigger_data(T data) {
        //스트림 필터 기능을 사용하여 매개변수로 받아온 data보다 더 큰 값만 걸러내서 콘솔에 출력
        System.out.println(list.stream().filter(e -> e.doubleValue() > data.doubleValue()).toList());
    }
    public void setter(T num1,T num2,String sign) {
        Arrays.stream(operator.values()).filter(cal -> cal.getOp().equals(sign)).forEach(cal -> list.add(cal.calc(num1,num2)));
        /*for 문에서 스트림 필터 방식으로 변환
        operator[] op = operator.values();
         for(operator oo : op) {
           if(oo.getOp().equals(sign)) {
                 list.add(oo.calc(num1,num2));
             }
          }*/
    }
}