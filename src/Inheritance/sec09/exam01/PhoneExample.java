package Inheritance.sec09.exam01;

public class PhoneExample {

  public static void main(String[] args) {
    Phone phone = new SmartPhone("SSG");
    phone.turnOn();
    phone.calling();
    phone.sendVoice();
    phone.recieveVoice();
    phone.turnOff();
  }
}