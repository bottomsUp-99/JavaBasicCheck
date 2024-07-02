package Task0701.다형성연습2;

public class Tea extends Beverage {

  public int amount;

  public Tea(String name) {
    super(name);
    amount++;
  }

  @Override
  public void calcPrice() {

  }
}
