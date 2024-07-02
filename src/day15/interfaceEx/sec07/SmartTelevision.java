package day15.interfaceEx.sec07;

public class SmartTelevision implements RemoteControl, Searchable {
  //구현 객체는 여러개의 인터페이스를 implements 할 수 있다.
  //구현 객체가 인터페이스 A와 인터페이스 B를 구현하고 있다면, 인터페이스를 통해 구현 객체를 사용할 수 있다.


  @Override
  public void turnOn() {
    System.out.println("스마트 tv를 킵니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("스마트 tv를 끕니다.");
  }

  @Override
  public void search(String url) {
    System.out.println(url + " 의 검색을 시작합니다.");
  }
}		