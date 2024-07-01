package Task0701.다형성연습1;

public class Main {

  public static void main(String[] args) {
    Circle circle = new Circle("Circle", 10);
    Rectangular rectangular = new Rectangular("Rectangular", 10, 20);

    System.out.println("원의 면적은 " + circle.getArea());
    System.out.println("직사각형의 면적은 " + rectangular.getArea());
  }
}
