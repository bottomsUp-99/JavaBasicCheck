package Task0701;

public class Truck extends Wheeler {

  Truck(String carName, int velocity, int wheelNumber) {
    super(carName, velocity, wheelNumber);
  }

  @Override
  public void speedUp(int speed) {
    if (super.getVelocity() + speed * 5 > 100) {
      super.setVelocity(100);
      System.out.println("트럭의 최고속도 위반으로 속도를 100으로 낮춥니다.");
    } else {
      super.setVelocity(super.getVelocity() + speed * 5);
    }
  }

  @Override
  public void speedDown(int speed) {
    if (super.getVelocity() - speed * 5 < 50) {
      super.setVelocity(50);
      System.out.println("트럭의 최저속도 위반으로 속도를 50으로 올립니다.");

    } else {
      super.setVelocity(super.getVelocity() - speed * 5);
    }
  }

  public void stop() {
    super.stop();
  }
}
