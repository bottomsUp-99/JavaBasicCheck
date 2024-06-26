package day9.ArrayTask0625.Task3;

import java.util.Arrays;
import java.util.Collections;

public class Prob12 {

  public static void main(String[] args) {
    int[] inputNumbers = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
    System.out.println(Arrays.toString(ascending(inputNumbers)));
  }

  public static int[] ascending(int[] inputNumbers) {
    Arrays.sort(inputNumbers);
    return inputNumbers;
  }
}
