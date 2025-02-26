import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        while (true) {
            try {
                System.out.print("첫번째 정수를 입력하세요 : ");
                i = sc.nextInt();
                System.out.print("두번째 정수를 입력하세요 : ");
                j = sc.nextInt();
            }
            catch (Exception e) {
                System.out.println("에러~ 정수를 입력해주십시오.");
                System.out.println(e);
                sc.nextLine();
                continue;
            }
            System.out.print("사칙연산 기호를 입력하세요(종료를 원하시면 exit) : ");
            String c = sc.next();
            if (c.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }
            else if (c.charAt(0) == '/' && j == 0)
            {
                System.out.println("분모가 0 이 될수 없습니다. 재입력 부탁드립니다.");
                continue;
            }
            else if (c.charAt(0) == '*' || c.charAt(0) == '/' || c.charAt(0) == '+' || c.charAt(0) == '-') {
                switch (c.charAt(0)) {
                    case '+':
                        System.out.println(i + " + " + j + " = " + (i + j));
                        break;
                    case '-':
                        System.out.println(i + " - " + j + " = " + (i - j));
                        break;
                    case '*':
                        System.out.println(i + " * " + j + " = " + (i * j));
                        break;
                    case '/':
                        System.out.println(i + " / " + j + " = " + (i / j));
                        break;
                    default:
                        System.out.println("잘못된 사칙연산 기호 입력");
                }
            }
            else {
                System.out.println("제대로 된 사칙연산 기호를 입력부탁드립니다.(+,*,/,-)");
            }

        }
    }
}