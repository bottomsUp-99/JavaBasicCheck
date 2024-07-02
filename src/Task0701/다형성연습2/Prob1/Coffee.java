package Task0701.다형성연습2.Prob1;

public class Coffee extends Beverage {

  public static int amount = 0;

  public Coffee(String name) {
    super(name);
    amount++;
    calcPrice();
  }

  public static int getAmount() {
    return amount;
  }

  @Override
  public void calcPrice() {
    switch (getName()) {
      case "Americano":
        price = 1500;
        break;
      case "CafeLatte":
        price = 2500;
        break;
      case "Cappuccino":
        price = 3000;
        break;
    }
  }
}
