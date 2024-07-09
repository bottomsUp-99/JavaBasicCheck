package day18.objectEx;

class Myobject implements Cloneable {

  private String name;
  private int age;

  @Override
  protected Myobject clone() throws CloneNotSupportedException {
    try {
      return (Myobject) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }

  }
}

public class objectEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    Myobject myobject = new Myobject();
    System.out.println(myobject);  //myobject 객체의 자신의 정보를 문자열로 반환
    Myobject copyobject = myobject.clone();

    System.out.println(myobject);
    System.out.println(copyobject);
  }
}