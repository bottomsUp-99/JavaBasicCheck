package Task0627.Prob1;

public class Drink {

  private String name;
  private int price;
  private int count;

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

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  int getTotalPrice() {
    return this.price * this.count;
  }

  Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public static void printTitle() {
    System.out.println("상품명\t\t단가\t\t\t수량\t\t금액");
  }

  void printData() {
    System.out.println(
        this.name + "\t\t\t" + this.price + "\t\t" + this.count + "\t\t\t" + getTotalPrice());
  }
}