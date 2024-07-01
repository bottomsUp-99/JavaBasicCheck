package Inheritance.sec02.exam01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone("iphone", "black");
    System.out.println(smartPhone1.getModel() + "  " + smartPhone1.getColor());
    System.out.println();
    System.out.println("private의 필드의 값 리셋은 setter를 통해서");
    smartPhone1.setModel("galaxy");
    smartPhone1.setColor("white");
    System.out.println(smartPhone1.getModel() + "  " + smartPhone1.getColor());

  }
}