package day9.ArrayTask0625.Task3;

public class Prob2 {

  static int[] arr;

  public static void main(String[] args) {
    System.out.println("<<생성된 난수>>");
    generateRandom(10);
    System.out.println("========================");
    getMaxNum(arr);
  }

  public static void generateRandom(int x) {
    arr = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 30 + 1);
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  public static void getMaxNum(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println("배열에서 가장 큰 숫자 : " + max);
  }
}
