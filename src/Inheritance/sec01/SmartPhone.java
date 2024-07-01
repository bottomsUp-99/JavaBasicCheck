package Inheritance.sec01;

public class SmartPhone extends Phone {

  //필드 선언

  //생성자 선언해서 해당 부모 phone의 필드를 생성자를 통해 smartPhone 생성자 내에서 초기화하시오.
  public SmartPhone(String model, String color) {
//    super();
//    this.model = model;
//    this.color = color;
    super(model, color);
    System.out.println("smart phone(String model, String color) 생성자 실행하여 초기화 완료");
  }

  //메소드 선언


}