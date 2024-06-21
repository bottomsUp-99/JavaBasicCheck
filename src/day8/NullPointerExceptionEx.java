package day8;

public class NullPointerExceptionEx {

  public static void main(String[] args) {
    int[] intArray = null;
    int[] intArratClone = intArray;
    intArray = new int[5];
    System.out.println(intArray + " " + intArray.hashCode());
    intArray[0] = 10;
    intArray[1] = 20;
    intArray[2] = 30;
    intArray[3] = 40;
    intArray[4] = 50;
    for (int value : intArray) {
      System.out.println(value);
    }
    if (intArray == intArratClone) {
      System.out.println("주소값이 같다.");
    } else {
      System.out.println("주소값이 다르다.");
    }
    intArratClone = null;
    for (int value : intArratClone) {
      System.out.println(value);
    }
  }
}