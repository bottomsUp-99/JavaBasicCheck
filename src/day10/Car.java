package day10;

public class Car {

  String company = "Volvo";
  String model = "V3-1003";
  String carNumber = "1234567";
  String color = "black";
  int maxSpeed = 300;
  int speed;

  Car() {
  }//디폴트 생성자

  Car(String company, String model, String color) {//생성자 오버로딩
    this.company = company;
    this.model = model;
    this.color = color;
  }
}
