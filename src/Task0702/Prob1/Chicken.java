package Task0702.Prob1;

public class Chicken extends Animal implements Cheatable {

  Chicken(int speed) {
    super(speed);
  }

  @Override
  public void run(int hours) {
    setDistance(getDistance() + getSpeed() * hours);
  }

  @Override
  public void fly() {
    setSpeed(getSpeed() * 2);
  }
}
