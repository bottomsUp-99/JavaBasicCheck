package Inheritance.sec09.exam01;

public abstract class Phone {

  //필드 선언
  String owner;

  //생성자 선언
  public Phone(String owner) {
    this.owner = owner;
  }

  Phone() {
  }

  abstract void sendVoice(); //추상 메서드

  abstract void recieveVoice(); //추상 메서드

  void calling() {
  } /// {}설정이 되면 구현 메서드로 봄

  //메소드 선언
  void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}