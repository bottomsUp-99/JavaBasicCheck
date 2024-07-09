package Task0709.Prob2;

public class CellPhone {

  String model;
  double battery;

  CellPhone(String model) {
    this.model = model;
  }

  void call(int time) {
    try {
      if (time < 0) {
        throw new IllegalArgumentException();
      }
      System.out.printf("통화시간 : %d분\n", time);
      if ((getBattery() - time * 0.5) < 0) {
        setBattery(0);
      } else {
        setBattery(getBattery() - time * 0.5);
      }
    } catch (IllegalArgumentException e) {
      System.out.println("통화시간입력오류");
    }
  }


  void charge(int time) {
    try {
      if (time < 0) {
        throw new IllegalArgumentException();
      }
      System.out.printf("충전시간 : %d분\n", time);
      if ((getBattery() + time * 3) > 100) {
        setBattery(100);
      } else {
        setBattery(getBattery() + time * 3);
      }
    } catch (IllegalArgumentException e) {
      System.out.println("충전시간입력오류");
    }
  }

  void printBattery() {
    System.out.println("남은 배터리 양 : " + getBattery());
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getBattery() {
    return battery;
  }

  public void setBattery(double battery) {
    this.battery = battery;
  }
}