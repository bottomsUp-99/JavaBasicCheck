package day12.Inheritance;

class GrandFather {

  void printGrandFather() {

  }
}

class subFather extends GrandFather {

  String familyName = "홍";
  String houseAddress = "인천";

  void printFather() {
    System.out.println("나는 아버지 입니다. 할아버지로부터 상속 받습니다.");
  }
}

class subSon extends subFather {

  void printSon() {
    System.out.println("나는 아들입니다.");
    System.out.println("나는 아버지로부터 상속 받습니다.");
    System.out.println("나의 아버지는 프로그래머");
    System.out.println("나의 집은 " + super.houseAddress + "입니다.");
  }
}

public class Inheritance03 {

  public static void main(String[] args) {
    subSon objSon = new subSon();
    objSon.printSon();
    objSon.printFather();
    objSon.printGrandFather();
  }
}
