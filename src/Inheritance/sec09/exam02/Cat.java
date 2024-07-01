package Inheritance.sec09.exam02;

public class Cat extends Animal {

  //추상 메소드 재정의
  @Override
  void sound() {
    System.out.println("꽁꽁 얼어붙은 한강 위로 고양이가 지나갑니다.");
  }
}