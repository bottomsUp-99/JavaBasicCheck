package Task0701.다형성연습2.Prob1;

public abstract class Beverage {

  private String name;
  protected int price;

  public Beverage(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public abstract void calcPrice();

  public void print() {
    System.out.println("음료명: " + name + ", 가격: " + price);
  }
}
