package Inheritance.sec08;

public class InstanceofExample {

  //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
  public static void personInfo(Person person) {
    System.out.println(person.name + "입니다.");
    person.walk();

    //person이 참조하는 객체가 Student 타입인지 확인
    if (person instanceof Student student) {
      System.out.println("studentNo : " + student.studentNo);
      student.study();
    }

    if (person instanceof Student) {//다운 캐스팅 시 반드시 객체 타이 체크 후 진행한데이
      Student s = (Student) person;
      System.out.println("studentNo : " + s.studentNo);
      s.study();
    }
  }

  public static void main(String[] args) {
    //Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
    Person person = new Person("신세계");
    personInfo(person);
    System.out.println();
    //Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
    Student student = new Student("이주환", 1111);
    personInfo(student);
    student.study();

  }
}