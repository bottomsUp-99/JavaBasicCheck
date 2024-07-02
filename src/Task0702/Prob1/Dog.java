package Task0702.Prob1;

public class Dog extends Animal {

  Dog(int speed) {
    super(speed);
  }

  @Override
  public void run(int hours) {
    setDistance(getDistance() + getSpeed() * ((double) hours / 2));
  }
}
