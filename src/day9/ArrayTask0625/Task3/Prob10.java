package day9.ArrayTask0625.Task3;

public class Prob10 {

  public static void main(String[] args) {

    int[][] a = {{30, 30, 30, 30}, {40, 40, 40, 40}, {50, 50, 50, 50}};
    int[][] b = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    int[][] c = new int[3][4];

    sub(a, b, c);
    prn(c);
  }

  public static void sub(int[][] a, int[][] b, int[][] c) {
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c[i].length; j++) {
        c[i][j] = a[i][j] - b[i][j];
      }
    }
  }

  public static void prn(int[][] c) {
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c[i].length; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}