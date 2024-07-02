package Task0702.Prob1;

abstract public class Animal {

  private int speed;
  private double distance;

  Animal(int speed) {
    this.speed = speed;
  }

  abstract public void run(int hours);

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }
}
