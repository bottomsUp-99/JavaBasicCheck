package day10.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculatorMain {
  //1. 계산기 한개를 생성한데이
  //2. 계산기 전원 킨데이
  //3. 두 개의 정수를 전달하여 계산한 결과값 출력 ㄱㄱ
  //4. 두 개의 실수를 전달하여 계산한 결과값 출력 ㄱㄱ
  //5. 계산기 전원 끈데이

  public static void main(String[] args) throws IOException {
    Calculator calculator = new Calculator();
    calculator.powerOn();
    int result = calculator.plus(10, 20);
    System.out.println("더한 값 : " + result);
    double result1 = calculator.divide(50, 10);
    System.out.println(result1);
    result1 = calculator.divide(50, 0);
    System.out.println(result1);
  }
}
