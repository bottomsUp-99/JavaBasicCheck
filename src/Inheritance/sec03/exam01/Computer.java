package Inheritance.sec03.exam01;

public class Computer extends Calculator {

  //메소드 오버라이딩
  //areaCircle 메소드는 반지름을 받아 원의 면전적을 계산하는 기능이다.


  @Override
  public double areaCircle(double radius) {
    System.out.println("computer의 areaCircle() 실행");
    double area = super.areaCircle(radius);
    System.out.printf("부모의 areaCircle() 실행 결과 : %.2f\n", area);
    return Math.PI * Math.pow(radius, 2);
  }
}