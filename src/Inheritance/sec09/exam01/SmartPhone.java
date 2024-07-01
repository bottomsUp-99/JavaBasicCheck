package Inheritance.sec09.exam01;

public class SmartPhone extends Phone {

  private String recieveMember;

  //생성자 선언
  SmartPhone() {
  }

  SmartPhone(String owner) {
    super(owner);
  }

  //메소드 선언
  void internetPlay() {
    System.out.println("인터넷 검색 기능을 실행합니다.");
  }

  @Override
  void sendVoice() {
    this.recieveMember = "박다미";
    System.out.println(recieveMember + "에게 보이스 메시지를 전달합니다.");
  }

  @Override
  void recieveVoice() {

  }
}