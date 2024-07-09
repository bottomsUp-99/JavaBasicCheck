package Task0709.Prob1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
    String str = br.readLine();
    int result = 0;
    result = convert(str);
    System.out.printf("변환된 숫자는 %d 입니다.", result);
  }

  //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
  private static int convert(String str) {
    int num = 0;
    try {
      num = Integer.parseInt(str);
    } catch (IllegalArgumentException e) {
      System.out.println("예외가 발생하였습니다. 문자열을 입력하지 안고 Enter 키를 누르셨습니다.");
    }
    return num;
  }
}