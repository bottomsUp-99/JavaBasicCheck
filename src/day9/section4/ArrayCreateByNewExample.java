package day9.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayCreateByNewExample {

  public static void main(String[] args) throws IOException {
    //정수형 배열 변수 arr1을 길이가 3인 배열로 생성하세용
    int[] arr1 = new int[3];

    //배열 항목의 초기값 출력
    for (Integer i : arr1) {
      System.out.println(i);
    }
    System.out.println("====================");
    //arr1에 10, 20, 30 값을 차례로 입력하고 출력하는 프로그램
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }
    for (Integer i : arr1) {
      System.out.println(i);
    }

    System.out.println("====================");

    String[] str = new String[4];
    str[0] = "봄";
    str[1] = "여름";
    str[2] = "가을";
    str[3] = "겨울";
    str[2] = str[3];
    for (String s : str) {
      System.out.println(s);
    }
    System.out.println("====================");

  }
}
