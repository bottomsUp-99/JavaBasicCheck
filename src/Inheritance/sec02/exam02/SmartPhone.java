package Inheritance.sec02.exam02;

public class SmartPhone extends Phone {

  private boolean wifi;

  //생성자 선언, 부모의 필드 초기화하고 자신의 wifi 필드 초기화 해주세요.
  public SmartPhone() {
  }

  public SmartPhone(String model, String color, boolean wifi) {
    super(model, color);
    this.wifi = wifi;
  }

  public boolean isWifi() {
    return wifi;
  }

  public String getWifi() {
    String message = "";
    if (this.wifi) {
      message = "Wifi 사용 중";
    } else {
      message = "Wifi 꺼짐";
    }
    return message;
  }

  public void setWifi(boolean wifi) {
    this.wifi = wifi;
    if (this.wifi) {
      System.out.println("Wifi 상태정보  on");
    } else {
      System.out.println("Wifi 상태정보  off");
    }
  }
}