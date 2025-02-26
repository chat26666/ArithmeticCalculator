package com.test.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorInputHandler {
    private GenericCalculator<Double> calculator;

    public CalculatorInputHandler() {
        calculator = new GenericCalculator<>();
    }

    public void handleArithmeticInput() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = scanner.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("⚠ 숫자를 입력해 주세요.");
                scanner.nextLine();
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operatorSymbol = scanner.next();

            if (operatorSymbol.equals("/") && num2 == 0) {
                System.out.println("⚠ 분모가 0이 될 수 없습니다.");
            } else if (operatorSymbol.matches("[+\\-*/]")) {
                calculator.computeAndStoreResult(num1, num2, operatorSymbol);
            } else {
                System.out.println("⚠ 올바른 연산 기호를 입력해 주세요.");
                continue;
            }

            System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitCommand = scanner.next();
            if (exitCommand.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    public void handleThresholdInput() {
        Scanner scanner = new Scanner(System.in);
        double threshold;

        while (true) {
            try {
                System.out.println("기준 값을 입력하세요. 저장된 결과 중에서 더 큰 값을 검색합니다.");
                threshold = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("⚠ 숫자를 입력해 주세요.");
                scanner.nextLine();
                continue;
            }

            calculator.printGreaterThan(threshold);
            return;
        }
    }
}