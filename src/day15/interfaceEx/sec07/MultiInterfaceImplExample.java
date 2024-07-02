package day15.interfaceEx.sec07;

public class MultiInterfaceImplExample {

  public static void main(String[] args) {
    //RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
    RemoteControl rc = new SmartTelevision();
    SmartTelevision smartTelevision = new SmartTelevision();
    rc = smartTelevision;

    //RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
    rc.turnOn();
    rc.turnOff();

    //Searchable 인터페이스 변수 선언 및 구현 객체 대입
    Searchable searchable = smartTelevision;

    //Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
    searchable.search("https://yoyo.kr");

  }
}