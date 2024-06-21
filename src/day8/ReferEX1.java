package day8;

public class ReferEX1 {

  public static void main(String[] args) {
    ReferEX1 refer1 = new ReferEX1();
    ReferEX1 refer2 = new ReferEX1();
    System.out.println(refer1.toString() + " " + refer2.toString());
    System.out.println(refer1.hashCode() + " " + refer2.hashCode());
    if (refer1 == refer2) {
      System.out.println("주소 값이 같으므로 같은 객체");
    } else {
      System.out.println("주소 값이 다르므로 다른 객체");
    }

    String str1 = new String("Happy Birth Day");
    String str2 = new String("Happy Birth Day");
    if (str1 == str2) {
      System.out.println("주소 값이 같으므로 같은 객체");
    } else {
      System.out.println("주소 값이 다르므로 다른 객체");
    }

    String str3 = "Hi wake up!";
    String str4 = "Hi wake up!";
    if (str3 == str4) {
      System.out.println("주소 값이 같으므로 같은 객체");
    } else {
      System.out.println("주소 값이 다르므로 다른 객체");
    }
  }

  public static void method1() {
    System.out.println("method1");
  }

  public static void method2() {
    System.out.println("method2");
  }
}
