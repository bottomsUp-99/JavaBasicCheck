package day9.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultidimensionalArrayByNewExample {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
    int[][] engScores = new int[2][3];

    int studentNum = 0;
    // 배열 항목 초기값 출력(for 이용)
    for (int i = 0; i < engScores.length; i++) {
      studentNum += engScores[i].length;
      for (int j = 0; j < engScores[i].length; j++) {
        System.out.print(i + "," + j + " = " + engScores[i][j] + " ");
      }
      System.out.println();
    }

    // engScores 배열 값을 받아서 항목 값을 변경ㄱㄱ
    for (int i = 0; i < engScores.length; i++) {
      for (int j = 0; j < engScores[i].length; j++) {
        engScores[i][j] = Integer.parseInt(br.readLine());
      }
    }

    for (int i = 0; i < engScores.length; i++) {
      for (int j = 0; j < engScores[i].length; j++) {
        System.out.print(i + "," + j + " = " + engScores[i][j] + " ");
      }
      System.out.println();
    }

    // 전체 학생의 영어과목 총점과 평균 구하기
    int sum = 0;
    for (int i = 0; i < engScores.length; i++) {
      for (int j = 0; j < engScores[i].length; j++) {
        sum += engScores[i][j];
      }
    }
    System.out.println("총점 : " + sum);
    System.out.println("평균 : " + sum / studentNum);

    // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성. 조건 : 전체반은 3반이다
    int[][] mathScores = new int[3][];
    int stuNum = 0; // 각 반의 학생수를 정한다.

    //1반 -> 5명, 2반 -> 3명, -> 3반 10명. 각 반의 학생수를 셋팅해서 초기값을 출력하시오.
    for (int i = 0; i < mathScores.length; i++) {
      System.out.print((i + 1) + "반의 학생 수 를 입력해주세요 : ");
      stuNum = Integer.parseInt(br.readLine());
      mathScores[i] = new int[stuNum];
      System.out.print((i + 1) + "반의 학생들의 점수를 인원수에 맞게 공백을 포함해 입력해주세요 : ");
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < stuNum; j++) {
        mathScores[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < mathScores.length; i++) {
      for (int j = 0; j < mathScores[i].length; j++) {
        System.out.print((i + 1) + "반의 점수 ->" + i + "," + j + " = " + mathScores[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();
    // 배열 항목 값 변경

    // 전체 학생의 영어 평균 구하기

  }
}
