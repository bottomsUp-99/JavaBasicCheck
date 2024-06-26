package day9.ArrayTask0625.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prob6 {

  public static void main(String[] args) {
    Prob6 median = new Prob6();

    int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
    System.out.println("input : " + Arrays.toString(values1));
    System.out.println("median : " + median.findMedian(values1));
    System.out.println("=================================================");

    int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
    System.out.println("input : " + Arrays.toString(values2));
    System.out.println("median : " + median.findMedian(values2));
  }

  public Integer findMedian(int[] values) {
    int avg = 0;
    for (Integer a : values) {
      avg += a;
    }
    avg /= values.length; //평균 구하기

    ArrayList<Integer> gap = new ArrayList<>(); // values 배열 안에 값들과 평균과의 차이의 절댓값 저장
    for (Integer a : values) {
      gap.add(Math.abs(avg - a));
    }

    int compare = Collections.min(gap);//values 배열 안에 값들과 평균과의 차이의 절댓값 중에 가장 작은거 뽑아오기
    ArrayList<Integer> answer = new ArrayList<>(); //출력값 저장

    for (Integer a : values) {
      if (Math.abs(avg - a) == compare) {
        answer.add(a);
      }
    }
    return Collections.min(answer);
  }
}
