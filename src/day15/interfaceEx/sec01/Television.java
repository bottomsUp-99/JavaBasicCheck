package day15.interfaceEx.sec01;

public class Television implements RemoteControl {

  //RemoteControl 을 통해서 TV의 전원을 킵니다.
  @Override
  public void turnOn() {
    System.out.println("TV의 전원을 켠다.");
  }
}