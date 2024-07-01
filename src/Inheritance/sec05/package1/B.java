package Inheritance.sec05.package1;

public class B extends A {

  //메소드 선언
  public void method() {
    A a = new A();
    a.field = "value";
    a.method();
  }
}