package day9.ArrayTask0625.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Prob3 {

  public static void main(String[] args) {
    int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
    System.out.println("<< 중복되지 않은 숫자 >>");
    printUniqueNumber(array);
  }

  private static void printUniqueNumber(int[] array) {
    //1111111111111111111111111111111111111111111111111111111 -- 성공
//    HashMap<Integer, Integer> map = new HashMap<>();//각 숫자와 각각 숫자에 해당하는 저장횟수를 저장
//    ArrayList<Integer> answer = new ArrayList<>();
//    for (Integer a : array) {
//      map.put(a, map.getOrDefault(a, 0) + 1);
//      //a에 해당하는 value가 존재하면, 그 해당 value값에 +1을 해준다 --> 이전에 이미 넣었다는 것은 1이 들어가 있고 거기에 +1을 해주면 2가된다
//      //a에 해당하는 value가 존재하지 않으면, dafault값인 0에 +1을 해준 value를 넣는다.
//      //즉 기존에 존재하면, 기존 value에 +1
//      //존재하지 않으면, 새로 1을 넣어준다
//    }
//    for (Integer a : array) {
//      if (map.get(a) == 1) {
//        answer.add(a);
//      }
//    }
//    System.out.println(answer);

    //222222222222222222222222222222222222222222222222222222222222 --> 실패
//    ArrayList<Integer> answer = new ArrayList<>();
//    for (Integer a : array) {
//      answer.add(a);
//    }
//    for (Integer a : array) {
//      if (Collections.frequency(answer, a) > 1) {
//        answer.remove(a);
//      }
//    }
//    System.out.println(answer);

    //2에 대한 수정본 --> 성
//    ArrayList<Integer> answer = new ArrayList<>();
//    for (int a : array) {
//      answer.add(a);
//    }
//
//    ArrayList<Integer> compareList = new ArrayList<>(answer);
//    for (Integer a : compareList) {
//      if (Collections.frequency(compareList, a) > 1) {
//        answer.removeAll(Collections.singleton(a));//->answer에서 특정 값 a의 모든 인스턴스를 제거하기 위해 사용
//        //Collections.singleton(a)는 요소 a만을 포함하는 불변의 단일 요소 집합(Set)을 반환해줌.
//        //answer.removeAll는 answer 리스트에서 Collections.singleton(a) 집합에 포함된 모든 요소를 제거
//        //그냥 remove와 removeAll
//      }
//    }
//
//    // 결과 출력
//    System.out.println(answer);

    //3333333333333333333333333333333333333333333333333333333333 -- 성공
//    int[] arr = new int[array.length];
//    for (int i = 0; i < array.length; i++) {
//      arr[i] = array[i];
//      int count = 0;
//      for (int j = 0; j < array.length; j++) {
//        if (j == i || count > 0) {
//          continue;
//        }
//        if (array[i] == array[j]) {
//          count++;
//          arr[i] -= array[i];
//        }
//      }
//      if (arr[i] != 0) {
//        System.out.printf("%d, ", arr[i]);
//      }
//    }

    //4444444444444444444444444444444444444444444444444444444444444444 -- 성공
//    boolean[] check = new boolean[array.length];
//
//    // 중복 체크
//    for (int i = 0; i < array.length; i++) {
//      for (int j = i + 1; j < array.length; j++) {
//        if (array[i] == array[j]) {
//          check[i] = true;
//          check[j] = true;
//        } // 중복되는 값 인덱스에 true를 넣음.
//      }
//    }
//
//    // 이차원 배열에 넣기 위한 길이 체크.
//    int count = 0;
//    for (boolean b : check) {
//      if (!b) { // flase라면 증가.
//        count++;
//      }
//    }
//
//    int[][] num = new int[1][count];
//    int index = 0;
//    for (int i = 0; i < array.length; i++) {
//      if (!check[i]) {
//        num[0][index++] = array[i];
//      }
//    }
//
//    // 출력
//    for (int i = 0; i < num[0].length; i++) {
//      System.out.print(num[0][i] + " ");
//    }
  }
}
