package Inheritance.sec07.exam01;

public class KumhoTire extends Tire {

  //메소드 재정의(오버라이딩)

  @Override
  public void roll() {
    System.out.println("금호타이어 장착 : 회전합니다.");
  }
}