package Task0701.다형성연습1;

public abstract class Shape {

  protected double area;
  private String name;

  public Shape() {
  }

  public Shape(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract double getArea();
}
