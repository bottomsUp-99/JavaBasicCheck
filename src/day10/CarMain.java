package day10;

public class CarMain {

  public static void main(String[] args) {
    //자동차 클래스 -> 자동차 객체 한 개를 생성하세요.
    Car volvo = new Car();
    System.out.println("company : " + volvo.company);
    System.out.println("model : " + volvo.model);
    System.out.println("color : " + volvo.color);

    Car mycar = new Car("현대기아", "뉴카니발", "white");
    System.out.println("company : " + mycar.company);
    System.out.println("model : " + mycar.model);
    System.out.println("color : " + mycar.color);
  }
}
