package Task0627.Prob1;

public class Alcohol extends Drink {

  private String name;
  private int price;
  private int count;
  private double alcper;

  Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.name = name;
    this.price = price;
    this.count = count;
    this.alcper = alcper;
  }

  static void printTitle() {
    System.out.println("상품명(도수[%])\t\t단가\t\t\t수량\t\t\t금액");
  }


  void printData() {
    System.out.println(
        this.name + "(" + this.alcper + ")\t\t\t\t" + this.price + "\t\t" + this.count + "\t\t\t\t"
            + this.getTotalPrice());
  }
}
