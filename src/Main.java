import com.test.calculator.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculator<Double> calc = new calculator<>();
        Scanner sc = new Scanner(System.in);
        double i, j;
        while (true) {
            try {
                System.out.print("첫번째 수를 입력하세요 : ");
                i = sc.nextDouble();
                System.out.print("두번째 수를 입력하세요 : ");
                j = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("양의 정수를 입력해주십시오.");
                sc.nextLine();
                continue;
            }
            System.out.print("사칙연산 기호를 입력하세요 : ");
            String c = sc.next();
            if (c.charAt(0) == '/' && j == 0) {
                System.out.println("분모가 0 이 될수 없습니다. 재입력 부탁드립니다.");
            }
            else {
                calc.setter(i, j, c);
            }
            System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료)");
            String d = sc.next();
            if (d.equals("exit")) {
                break;
            }

        }
        calc.remove();
        calc.getter();
    }
}