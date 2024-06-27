package goodMorningTest.test0627.참조타입;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prob9 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int numOfStudent;
  static int[] scoreList;

  public static void main(String[] args) throws IOException {

    showMenu();

    boolean quit = true;
    while (quit) {
      System.out.print("선택> ");
      int choice = Integer.parseInt(br.readLine());
      switch (choice) {
        case 1:
          studentNum();
          showMenu();
          break;
        case 2:
          scoreInput();
          showMenu();
          break;
        case 3:
          showList();
          showMenu();
          break;
        case 4:
          analyzeScore();
          showMenu();
          break;
        case 5:
          menuExit();
          quit = false;
          break;
      }
    }
  }

  public static void drawDividingLine() {
    for (int i = 0; i < 50; i++) {
      System.out.print("-");
    }
    System.out.println();
  }

  public static void showMenu() {
    drawDividingLine();
    System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
    drawDividingLine();
  }

  public static void studentNum() throws IOException {
    System.out.print("학생수> ");
    numOfStudent = Integer.parseInt(br.readLine());
    scoreList = new int[numOfStudent];
  }

  public static void scoreInput() throws IOException {
    for (int i = 0; i < numOfStudent; i++) {
      System.out.print("score[" + i + "]> ");
      scoreList[i] = Integer.parseInt(br.readLine());
    }
  }

  public static void showList() {
    for (int i = 0; i < scoreList.length; i++) {
      System.out.println("score[" + i + "] :" + scoreList[i]);
    }
  }

  public static void analyzeScore() {
    int max = 0;
    double avg = 0;
    for (Integer a : scoreList) {
      avg += a;
      if (max < a) {
        max = a;
      }
    }
    System.out.println("최고 점수 : " + max);
    System.out.println("평균 점수 : " + avg / numOfStudent);
  }

  public static void menuExit() {
    System.out.println("프로그램 종료");
  }
}
