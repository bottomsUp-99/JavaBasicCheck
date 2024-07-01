package Inheritance.sec01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone("iphone13promax", "white");

    //Phone으로부터 상속받은 model, color 필드 읽기
    System.out.println(smartPhone1.model + "   " + smartPhone1.color);
    //SmartPhone의 필드 읽기
    smartPhone1.bell();
    smartPhone1.sendVoice("선배 마라탕 사주세요");
    smartPhone1.receiveVoice("그럼 제가 선배 마음에");
    smartPhone1.hangUp();

    //Phone으로부터 상속받은 메소드 호출

    //SmartPhone의 메소드 호출

  }
}