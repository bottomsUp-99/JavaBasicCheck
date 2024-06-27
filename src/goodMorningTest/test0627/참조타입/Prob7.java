package goodMorningTest.test0627.참조타입;

public class Prob7 {

  public static void main(String[] args) {
    int[] array = {1, 5, 3, 8, 2};
    int max = 0;
    for (Integer a : array) {
      if (a > max) {
        max = a;
      }
    }
    System.out.println(max);
  }
}
