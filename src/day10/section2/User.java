package day10.section2;

public class User {//국적, 이름, 주민번호 -> 이 필드 중에서 이름과 주민번호를 입력하여 객체를 생성할 수 있다.
  private String nationality = "대한민국";
  private String name;
  private String residentRegistrationNumber;

  User() {

  }

  User(String name, String residentRegistrationNumber) {
    this.name = name;
    this.residentRegistrationNumber = residentRegistrationNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getResidentRegistrationNumber() {
    return residentRegistrationNumber;
  }

  public void setResidentRegistrationNumber(String residentRegistrationNumber) {
    this.residentRegistrationNumber = residentRegistrationNumber;
  }
}
