package Task0701.다형성연습2;

public abstract class Beverage {

  private String name;
  protected int price;

  public Beverage(String name) {
    setName(name);
    if (this.name.equals("Americano")) {
      setPrice(1500);
    } else if (this.name.equals("CafeLatte")) {
      setPrice(2500);
    } else if (this.name.equals("Cappuccino")) {
      setPrice(3000);
    } else if (this.name.equals("lemonTea")) {
      setPrice(1500);
    } else if (this.name.equals("ginsengTea")) {
      setPrice(2000);
    } else if (this.name.equals("redginsengTea")) {
      setPrice(2500);
    }
  }

  abstract public void calcPrice();

  public void print() {

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

  public void setPrice(int price) {
    this.price = price;
  }
}
