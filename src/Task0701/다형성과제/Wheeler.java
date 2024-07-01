package Task0701.다형성과제;

public abstract class Wheeler {

  protected String carName;
  protected int velocity;
  protected int wheelNumber;

  abstract public void speedUp(int speed);

  abstract public void speedDown(int speed);

  public Wheeler(String carName, int velocity, int wheelNumber) {
    this.velocity = velocity;
    this.carName = carName;
    this.wheelNumber = wheelNumber;
  }

  public void stop() {
    velocity = 0;
    System.out.println("정지상태로 속도를 0으로 초기화합니다.");
  }

  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public int getVelocity() {
    return velocity;
  }

  public void setVelocity(int velocity) {
    this.velocity = velocity;
  }

  public int getWheelNumber() {
    return wheelNumber;
  }

  public void setWheelNumber(int wheelNumber) {
    this.wheelNumber = wheelNumber;
  }
}