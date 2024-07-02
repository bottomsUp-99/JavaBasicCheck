package day15.interfaceEx.sec07;

public interface RemoteControl {

  //추상 메소드
  void turnOn();

  void turnOff();

  //default 메서드로 setVolume()을 만들어보세용
  default void setVolume(int volume) {
    System.out.println("==볼륨 조정==");
    this.setVolume(volume);
  }
}