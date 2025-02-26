package com.test.calculator;
import java.util.ArrayList;

public class calculator {

    private ArrayList<Integer> list;

    public calculator() {
        list = new ArrayList<>();
    }
    public void setter(Integer data) {
        list.add(data);
    }
    public void getter() {
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
    public void remove() {
        list.remove(0);
    }

    public int calc(int i,int j,char c) {
        int sum = 0;
        switch (c) {
            case '+':
                System.out.println(i + " + " + j + " = " + (i + j));
                sum = i + j;
                break;
            case '-':
                System.out.println(i + " - " + j + " = " + (i - j));
                sum = i - j;
                break;
            case '*':
                System.out.println(i + " * " + j + " = " + (i * j));
                sum = i * j;
                break;
            case '/':
                System.out.println(i + " / " + j + " = " + (i / j));
                sum = i / j;
                break;
        }
        return sum;
    }
}