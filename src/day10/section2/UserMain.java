package day10.section2;

public class UserMain {

  public static void main(String[] args) {
    User me = new User("이주환", "000000000000");
    String oldName = me.getName();
    String oldGetResidentRegistrationNumber = me.getResidentRegistrationNumber();
    //me 객체의 이름을 홍길동 그리고 주민번호를 11111111111111로 변경
    me.setName("홍길동");
    me.setResidentRegistrationNumber("111111111111");
    System.out.println(oldName + " -> " + oldGetResidentRegistrationNumber);
    System.out.println(me.getName() + " -> " + me.getResidentRegistrationNumber());
  }
}