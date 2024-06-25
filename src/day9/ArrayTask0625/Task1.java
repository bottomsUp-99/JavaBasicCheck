package day9.ArrayTask0625;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task1 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    System.out.print("몇번 문제인지 고르시오 : ");
    int num = Integer.parseInt(br.readLine());
    switch (num) {
      case 1:
        prob1();
        break;
      case 2:
        prob2();
        break;
      default:
        System.out.println("제대로 된 값을 입력하시오");
    }
  }

  private static void prob1() {
    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};
    int iaOddSum = 0;
    int iaEvenSum = 0;
    int ibOddSum = 0;
    int ibEvenSum = 0;

    for (int i = 0; i < ia.length; i++) {
      if (ia[i] % 2 == 0) {
        iaEvenSum += ia[i];
      } else {
        iaOddSum += ia[i];
      }
    }
    for (int i = 0; i < ib.length; i++) {
      if (ib[i] % 2 == 0) {
        ibEvenSum += ib[i];
      } else {
        ibOddSum += ib[i];
      }
    }

    System.out.println("(배열 ia)");
    System.out.println("홀수의 합 : " + iaOddSum);
    System.out.println("짝수의 합 : " + iaEvenSum);
    System.out.println("(배열 ib)");
    System.out.println("홀수의 합 : " + ibOddSum);
    System.out.println("짝수의 합 : " + ibEvenSum);
  }

  private static void prob2() {
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[5];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
      sb.append(arr[i]).append(" ");
    }
    System.out.println(sb);
  }
}
