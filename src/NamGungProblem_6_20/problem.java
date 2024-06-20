package NamGungProblem_6_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class problem {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
//    problem4_1_1();
//    problem4_1_2();
//    problem4_1_3();
//    problem4_1_4();
//    problem4_1_5();
//    problem4_1_6();
//    problem4_1_7();
//    problem4_1_8();
//
//    problem4_2();
//    problem4_3();
//    problem4_4();
//    problem4_5();
//    problem4_6();
//    problem4_7();
//    problem4_8();
//    problem4_9();
//    problem4_10();
  }

  public static void problem4_1_1() throws IOException {
    int x = Integer.parseInt(br.readLine());
    boolean b = (x > 10 && x < 20);
    System.out.println("4-1-1 문제 : " + b);
  }

  public static void problem4_1_2() throws IOException {
    char c = (br.readLine()).charAt(0);
    boolean b = (c != ' ' && c != '\t');
    System.out.println("4-1-2 문제 : " + b);
  }

  public static void problem4_1_3() throws IOException {
    char c = (br.readLine()).charAt(0);
    boolean b = (c == 'x' || c == 'X');
    System.out.println("4-1-3 문제 : " + b);
  }

  public static void problem4_1_4() throws IOException {
    char c = (br.readLine()).charAt(0);
    boolean b = (c > '0' && c < '9');
    System.out.println("4-1-4 문제 : " + b);
  }

  public static void problem4_1_5() throws IOException {
    char c = (br.readLine()).charAt(0);
    if (c >= 'A' && c <= 'z') {
      System.out.println("true");
    }
  }

  public static void problem4_1_6() throws IOException {
    int year = Integer.parseInt(br.readLine());
    boolean b = ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0);
    System.out.println("4-1-6 문제 : " + b);
  }

  public static void problem4_1_7() throws IOException {
    boolean powerOn = false;
    boolean b = (!powerOn);
    System.out.println("4-1-7 문제 : " + b);
  }

  public static void problem4_1_8() throws IOException {
    String str = br.readLine();
    if (Objects.equals(str, "yes")) {
      System.out.println("true");
    }
  }

  public static void problem4_2() throws IOException {
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0 && i % 3 != 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }

  public static void problem4_3() throws IOException {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
    }
    System.out.println(sum);
  }

  public static void problem4_4() throws IOException {
    int sum = 0;
    int var = 1;
    while (sum < 100) {
      sum += var;
      if (var < 0) {
        var--;
      } else if (var > 0) {
        var++;
      }
      var = -var;
    }
    System.out.println(Math.abs(var) - 1);
  }

  public static void problem4_5() throws IOException {
    for (int i = 0; i <= 10; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.println("*");
      }
      System.out.println();
    }

  }

  public static void problem4_6() throws IOException {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i + j == 6) {
          System.out.println("{ " + i + " , " + j + "}");
        }
      }
    }
  }

  public static void problem4_7() throws IOException {
    String str = "12345";
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      int num = Integer.parseInt(String.valueOf(str.charAt(i)));  // -> 정답
      sum += num;                                                 // -> 정답
    }
    System.out.println(sum);
  }

  public static void problem4_8() throws IOException {
    int value = (int) (Math.random() * 6) + 1; // -> 정답
    System.out.println("value : " + value);
  }

  public static void problem4_9() throws IOException {
    int num = 12345;
    int sum = 0;
    while (num > 10) {   // -> 정답
      sum += num % 10;   // -> 정답
      num /= 10;         // -> 정답
    }                    // -> 정답
    sum += num;
    System.out.println(sum);
  }

  public static void problem4_10() throws IOException {
    int answer = (int) (Math.random() * 100) + 1;  // -> (1) 정답
    int input;
    int count = 0;
    java.util.Scanner s = new java.util.Scanner(System.in);
    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 :");
      input = s.nextInt();
      if (input == answer) {
        System.out.println(count + "번 만에 맞추셨습니다.");
        break;
      } else if (input < answer) {
        System.out.println("더 큰 수를 입력하세요!");
      } else {
        System.out.println("더 작은 수를 입력하세요!");
      }
    } while (true);
  }
}