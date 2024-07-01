package Inheritance.sec03.exam01;

public class ComputerExample {

  public static void main(String[] args) {
    int radius = 10;
    Calculator calculator = new Calculator();
    System.out.println("원 면적 : " + calculator.areaCircle(radius));
    System.out.printf("원 면적 : %.2f\n", calculator.areaCircle(radius));

    System.out.println("=======Upcasting=======");
    Calculator calculator1 = new Computer();
    double area = calculator1.areaCircle(radius);
    System.out.printf("원의 면적 : %.2f\n", area);
  }
}