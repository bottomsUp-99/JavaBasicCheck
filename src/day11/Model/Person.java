package day11.Model;

public class Person {

  public String name;
  public int age;
  public String phone;

  public Person() {
  }

  public Person(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public void play() {
    System.out.println("운동을 한다.");
  }

  public void eat() {
    System.out.println("음식을 먹다.");
  }

  public void walk() {
    System.out.println("걷다.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        '}';
  }
}
