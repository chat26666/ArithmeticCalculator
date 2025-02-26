package com.test.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class input {
    private calculator<Double> calc;
    public input() {
        calc = new calculator<>();
    }
    public void number_input() {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        while (true) {
            try {
                System.out.print("첫번째 수를 입력하세요 : ");
                num1 = sc.nextDouble();
                System.out.print("두번째 수를 입력하세요 : ");
                num2 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("수를 입력해주십시오.\n");
                sc.nextLine(); // 버퍼를 비우는 용도
                continue;
            }
            System.out.print("사칙연산 기호를 입력하세요 : ");
            String sign = sc.next();
            if (sign.equals("/") && num2 == 0) {
                System.out.println("분모가 0 이 될수 없습니다. 재입력 부탁드립니다.");
            }
            else if (sign.equals("-") || sign.equals("*") || sign.equals("+") || sign.equals("/")) {
                calc.setter(num1, num2, sign);
            }
            else {
                System.out.println("제대로된 사칙연산 기호를 입력해주세요.");
                continue;
            }
            System.out.println("\n더 계산하시겠습니까? (exit 입력 시 계산 종료)");
            String end = sc.next();
            if (end.toLowerCase().equals("exit")) {
                break;
            }
        }
    }
    public void bigger_number_input() {
        Scanner sc = new Scanner(System.in);
        double num;
        while (true) {
            try {
                System.out.println("수를 입력해주세요. 저장된 데이터 중 입력된 값보다 더 큰값을 검색합니다.");
                num = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("수를 입력해주십시오.\n");
                sc.nextLine(); // 버퍼를 비우는 용도
                continue;
            }
            calc.bigger_data(num);
            return;
        }
    }
}