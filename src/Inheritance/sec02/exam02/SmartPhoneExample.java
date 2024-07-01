package Inheritance.sec02.exam02;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 디폴트 생성자를 이용한 객체 생성과 필드값 겟팅&읽기
    SmartPhone smartPhone1 = new SmartPhone();
    smartPhone1.setModel("iphone");
    smartPhone1.setColor("yellow");
    System.out.println(smartPhone1.getModel() + "   " + smartPhone1.getColor());

    SmartPhone smartPhone2 = new SmartPhone("galaxy", "yellow", true);

    System.out.println(
        smartPhone2.getModel() + "   " + smartPhone2.getColor() + "   " + smartPhone2.getWifi());
    //Phone으로부터 상속 받은 필드 읽기

  }
}