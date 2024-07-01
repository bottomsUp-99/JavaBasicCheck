package Task0701.다형성과제;

public class Bike extends Wheeler {

  Bike(String carName, int velocity, int wheelNumber) {
    super(carName, velocity, wheelNumber);
  }

  @Override
  public void speedUp(int speed) {
    if (super.getVelocity() + speed > 40) {
      super.setVelocity(40);
      System.out.println("자전거의 최고속도 위반으로 속도를 40으로 낮춥니다.");
    } else {
      super.setVelocity(super.getVelocity() + speed);
    }
  }

  @Override
  public void speedDown(int speed) {
    if (super.getVelocity() - speed < 10) {
      super.setVelocity(10);
      System.out.println("자전거의 최저속도 위반으로 속도를 10으로 올립니다.");

    } else {
      super.setVelocity(super.getVelocity() - speed);
    }
  }

  public void stop() {
    super.stop();
  }
}
