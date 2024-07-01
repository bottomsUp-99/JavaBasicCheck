package Inheritance.sec03.exam01;

public class Calculator {

  //메소드 선언 : return vlaue : double  method name : areaCircle(double r)
  //arrCircle 메소드는 반지름을 받아 원의 면적을 계산하는 기능이다.

  public double areaCircle(double radius) {
    return Math.PI * Math.pow(radius, 2);
  }

}