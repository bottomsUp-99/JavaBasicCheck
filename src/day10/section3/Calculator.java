package day10.section3;

public class Calculator {
  //리턴값이 없는 메소드 선언 : public 메소드 이름 : powerOn() 실행 : "전원을 킵니다"
  //리턴값이 없는 메소드 선언 : public 메소드 이름 : powerOff() 실행 : "전원을 끕니다"

  //호출시 두 정수를 전달받고 두값을 더하여 int로 반환메소드 선언 : public 메소드 이름 : plus()
  //호출시 두 실수를 전달받고 두값을 나누어 출한 결과를 double로 반환메소드 선언 : public 메소드 이름 : divide()

  Calculator() {

  }

  public void powerOn() {
    System.out.println("전원을 킵니다!");
  }

  public void powerOff() {
    System.out.println("전원을 끕니다!");
  }

  public int plus(int number1, int number2) {
    int result = number1 + number2;
    return result;
  }

  public double divide(double d1, double d2) {
    if (d2 == 0) {
      return 0;
    }
    double result = d1 / d2;
    return result;
  }
}
