package day12.Inheritance.calculate;

public class Inheritance01 extends Calculation {

  void multiplication(int a, int b) {
    System.out.println("두 수의 곱셉 : " + (a * b));
  }

  public static void main(String[] args) {
    Inheritance01 obj = new Inheritance01();
    int a = 20;
    int b = 10;
    obj.addition(a, b);
    obj.subtraction(a, b);
    obj.multiplication(a, b);
  }
}