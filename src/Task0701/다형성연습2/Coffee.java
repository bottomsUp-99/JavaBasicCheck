package Task0701.다형성연습2;

public class Coffee extends Beverage {

  public int amount;

  public Coffee(String name) {
    super(name);
    amount++;
  }

  @Override
  public void calcPrice() {
  }
}
