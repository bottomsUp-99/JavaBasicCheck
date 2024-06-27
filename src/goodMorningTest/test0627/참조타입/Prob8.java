package goodMorningTest.test0627.참조타입;

public class Prob8 {

  public static void main(String[] args) {
    int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
    int sum = 0;
    double count = 0;
    for (int[] ints : array) {
      for (int anInt : ints) {
        sum += anInt;
        count++;
      }
    }
    System.out.println("전체 총합 : " + sum);
    System.out.println("총합에 대한 평균 : " + sum / count);
  }
}
