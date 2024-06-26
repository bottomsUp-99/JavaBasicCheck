package day9.ArrayTask0625.Task3;

public class Prob7 {

  public static void main(String[] args) throws Exception {
    CalculateRates calculateRates = new CalculateRates();

    // 비율 결과: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
    calculateRates.calculate(new int[]{10, 30, 20, 80, 50});

    // 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
    calculateRates.calculate(new int[]{50, 50, 50, 50, 50});

    // 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
    calculateRates.calculate(new int[]{1, 2, 3, 4, 5});
  }
}

class CalculateRates {

  public void calculate(int[] nums) throws Exception {
    System.out.println("------------------------------------------------------");
    int total = 0;
    for (Integer a : nums) {
      total += a;
    }
    for (Integer a : nums) {
      double ration = (double) a / total * 100;
      for (int i = 0; i < ration; i++) {
        System.out.print("*");
      }
      System.out.printf(" (%.1f)\n", ration);
    }
    System.out.println("------------------------------------------------------");
  }
}