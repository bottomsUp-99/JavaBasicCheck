import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkBasic {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int problemNum = Integer.parseInt(br.readLine());
    switch (problemNum) {
      case 1:
        problem_1();
        break;
      case 2:
        problem_2();
        break;
      case 3:
        problem_3();
        break;
      case 4:
        problem_4();
        break;
      case 5:
        problem_5();
        break;
      case 6:
        problem_6();
        break;
      case 7:
        problem_7();
        break;
      case 8:
        problem_8();
        break;
      case 9:
        problem_9();
        break;
      case 10:
        problem_10();
        break;
      case 11:
        problem_11();
        break;
      case 12:
        problem_12();
        break;
      case 13:
        problem_13();
        break;
      case 14:
        problem_14();
        break;
      case 15:
        problem_15();
        break;
      case 16:
        problem_16();
        break;
      case 17:
        problem_17();
        break;
      default:
        System.out.println("정확한 값을 입력하시오");
        break;
    }
  }

  public static void problem_1() {
    System.out.println("자바 소스파일의 확장자 : javac.exe");
    System.out.println("컴파일된 파일의 확장자 : java.exe");
  }

  public static void problem_2() {
    System.out.println("Shape.java");
    System.out.println("Shape");
  }

  public static void problem_3() {
    System.out.println("int sum = (sum > 100) ? 100 : 0;");
  }

  public static void problem_4() {
    System.out.println("2번 4번");
  }

  public static void problem_5() {
    System.out.println("5-1번 : int height;");
    System.out.println("5-2번 : double size = 0.25;");
    System.out.println("5-3번 : double total = (double) height + size;");
    System.out.println("5-4번 : char c = 'a';");
    System.out.println("5-5번 : String name = \"이주환\";");
  }

  public static void problem_6() {
    System.out.println(
        "int형 변수 k가 선언된 윗줄에 public static void main(String[] args) 을 넣어주고 괄호를 하나씩 더 넣어준다.");
  }

  public static void problem_7() {
    System.out.println("javac.exe SampleProgram.java");
  }

  public static void problem_8() {
    System.out.println("java.exe SampleProgram.java");
  }

  public static void problem_9() {
    System.out.println("SampleProgram.java");
  }

  public static void problem_10() {
    System.out.println("X");
    System.out.println("X");
    System.out.println("X");
    System.out.println("O");
  }

  public static void problem_11() {
    System.out.println("InputStreamReader");
  }

  public static void problem_12() {
    System.out.println("Override");
  }

  public static void problem_13() {
    System.out.println("Overloading");
  }

  public static void problem_14() {
    System.out.println("double");
  }

  public static void problem_15() {
    System.out.println("int add(int a, int b, int c){\n"
        + "    return a + b + c;\n"
        + "  }");
  }

  public static void problem_16() {
    System.out.println("1 2 3 4 5 6 7 8 9");
  }

  public static void problem_17() {
    System.out.println("17-1번 : sum += i;");
    System.out.println("17-2번 : 총합 : 120");
  }
}