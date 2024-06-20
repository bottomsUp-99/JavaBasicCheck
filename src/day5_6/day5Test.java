package day5_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day5Test {

  public static void main(String[] args) throws IOException {
    calculate(2, 3);
    calculate(2, 3.14);
    calculate(2);
    calculate(2.5);
  }

  public static void calculate(int x, int y) {
    System.out.println(x * y);
  }

  public static void calculate(int x) {
    System.out.println(x * x);
  }

  public static void calculate(int x, double y) {
    System.out.println(x * y);
  }

  public static void calculate(double x) {
    System.out.println(x * x);
  }
}
