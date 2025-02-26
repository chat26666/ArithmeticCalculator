import com.test.calculator.calculator;
import com.test.calculator.input;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        input data = new input();
        data.number_input(); //계산기 실행 메소드
        data.bigger_number_input(); //연산 결과 값중 입력된 값보다 더 큰 값들을 출력하는 메소드
        //calc.remove();
        //calc.getter();
    }
}