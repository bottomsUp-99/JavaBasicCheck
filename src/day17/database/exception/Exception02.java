package day17.database.exception;

public class Exception02 {

  public static void main(String[] args) {
    String[] array = {"1000", "1000", "100", "200"};

//    for (String str : array) {
//      System.out.println(str);
//    }

    try {
      for (int i = 0; i < 4; i++) {
        int value = Integer.parseInt(array[i]);
        System.out.println("array[" + i + "] : " + value);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    } catch (NullPointerException | NumberFormatException e) {
      e.printStackTrace();
    }
    System.out.println("프로그램 안전 종료");
  }
}