package Task0701.다형성연습1;

public class Rectangular extends Shape {

  private double width;
  private double height;

  public Rectangular(String name, double width, double height) {
    super(name);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }
}
