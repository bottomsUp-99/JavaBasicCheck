package day15.interfaceEx.sec06;

public interface Service {

  //디폴트 메소드
  default void defaultMethod1() {
    System.out.println("default method1 이고 구현부 실행!");
    defaultCommon();
  }

  default void defaultMethod2() {
    System.out.println("default method2 이고 구현부 실행!");
    defaultCommon();
  }

  //private 메소드
  private void defaultCommon() {
    System.out.println("default common 이고 중복 코드 A 구현부 실행!");
  }

  //정적 메소드
  static void staticMethod1() {
    System.out.println("나는 staticMethod1 이야");
  }

  static void staticMethod2() {
    System.out.println("나는 staticMethod2 이야");
  }

  //private 정적 메소드
  public static void staticCommon() {
    System.out.println("나는 staticCommon 이야");
  }
}