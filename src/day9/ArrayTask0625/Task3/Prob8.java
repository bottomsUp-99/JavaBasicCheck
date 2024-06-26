package day9.ArrayTask0625.Task3;

public class Prob8 {

  public static void main(String[] args) {
    int value = 5;
    for (int i = 1; i <= 5; i++) {
      int start = value * i;
      for (int j = start; j > start - 5; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}