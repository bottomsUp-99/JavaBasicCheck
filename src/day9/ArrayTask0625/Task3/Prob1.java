package day9.ArrayTask0625.Task3;

public class Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    Prob1 p = new Prob1();
    System.out.println("( 배열 ia )");
    p.calc(ia);
    System.out.println("( 배열 ib )");
    p.calc(ib);
  }

  public void calc(int[] ix) {
    int ixOddSum = 0;
    int ixEvenSum = 0;
    for (int i = 0; i < ix.length; i++) {
      if (ix[i] % 2 == 0) {
        ixEvenSum += ix[i];
      } else {
        ixOddSum += ix[i];
      }
    }
    System.out.println("홀수의 합 : " + ixOddSum);
    System.out.println("짝수의 합 : " + ixEvenSum);
  }
}