package Task0701.다형성연습1;

public class Circle extends Shape {

  private double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
}
