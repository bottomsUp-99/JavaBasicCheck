package day9.ArrayTask0625;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Task2 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;

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

  private static void prob1() throws IOException {
    System.out.print("입력할 정수의 갯수를 입력해주세요 : ");
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    System.out.print("입력할 정수 " + num + "개를 공백을 포함해 입력해주세요 : ");
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println(sum);

    for (int i = 0; i < arr.length; i++) {
      double ration = (double) arr[i] / sum * 100;
      for (int j = 0; j < ration; j++) {
        System.out.print("*");
      }
      System.out.print("(" + ration + ")");
      System.out.println();
    }
  }

  private static void prob2() {
    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = (char) (start + j);
      }
      start += 5;
    }
    //2.원본 배열 출력
    System.out.println("\t\t\t\t\t원본배열");
    for (int i = 0; i < 34; i++) {
      System.out.print("=");
    }
    System.out.println();
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j] + "       ");
      }
      System.out.println();
    }

    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i][i] = '*';
    }

    //4. 수정된 배열 출력
    System.out.println();
    System.out.println("\t\t\t\t\t수정된 배열");
    for (int i = 0; i < 34; i++) {
      System.out.print("=");
    }
    System.out.println();
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j] + "       ");
      }
      System.out.println();
    }
  }
}
