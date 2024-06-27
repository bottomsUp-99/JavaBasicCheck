package day12.Inheritance.부자관계;

public class Son extends Father {

  void name() {
    System.out.println("나의 이름은 홍길동");
  }

  void printDetails() {
    name();
    super.familyName();
    super.houseAddress();
  }
}