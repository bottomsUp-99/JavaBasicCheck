package day9.ArrayTask0625.Task3;

public class Prob5 {

  public static int getValue(int[] values, boolean isMax) {
    int answer = values[0];
    if (isMax) {
      for (int i = 1; i < values.length; i++) {
        answer = Math.max(answer, values[i]);
      }
    } else {
      for (int i = 1; i < values.length; i++) {
        answer = Math.min(answer, values[i]);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최대값 = " + maxValue);
    System.out.println("최소값 = " + minValue);

  }
}