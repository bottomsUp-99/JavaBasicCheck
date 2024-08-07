package day15.interfaceEx.sec03;

public class Television implements RemoteControl {

  int volume;

  @Override
  public void turnOn() {
    System.out.println("TV를 켰습니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 껐습니다.");
  }

  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    } else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 TV의 볼륨 :" + this.volume);
  }

  //필드

  //turnOn() 추상 메소드 오버라이딩

  //turnOff() 추상 메소드 오버라이딩

  //setVolume() 추상 메소드 오버라이딩

}	