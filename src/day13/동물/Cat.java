package day13.동물;

public class Cat extends Animal {

  public Cat() {
    super();
  }

  //Override(재정의) :super 클래스의 동일한 이름을 가진(파라미터와 타입)까지 똑같아야 함.
  public void eat() {
    System.out.println("꽁꽁 얼어붙은 한강 위로 고양이가 MYA A!!");
  }

  public void night() {
    System.out.println("밤에 꽁꽁 얼어붙은 한강 위로 고양이 눈이 반짝입니다.");
  }
}