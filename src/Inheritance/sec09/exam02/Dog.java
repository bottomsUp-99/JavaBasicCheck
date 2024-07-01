package Inheritance.sec09.exam02;

public class Dog extends Animal {

  //추상 메소드 재정의
  @Override
  void sound() {
    System.out.println("이야~~~~개 짖는 소리 좀 안나게 해라~~~");
  }
}