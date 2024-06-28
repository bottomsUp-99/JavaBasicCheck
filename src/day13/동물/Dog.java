package day13.동물;

public class Dog extends Animal {

  public Dog() {
    super();
  }

  //Override(재정의) :super 클래스의 동일한 이름을 가진(파라미터와 타입)까지 똑같아야 함.
  public void eat() {
    System.out.println("이야~~~~!!!! 개 짖는 소리 좀 안나게 해라이~~~");
  }
}