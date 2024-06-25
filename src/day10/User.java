package day10;

public class User {//국적, 이름, 주민번호 -> 이 필드 중에서 이름과 주민번호를 입력하여 객체를 생성할 수 있다.
  String nationality = "대한민국";
  String name;
  String residentRegistrationNumber;

  User() {

  }

  User(String name, String residentRegistrationNumber) {
    this.name = name;
    this.residentRegistrationNumber = residentRegistrationNumber;
  }
}
