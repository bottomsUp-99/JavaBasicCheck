package Task0625.Task2;

public class Student {

  private String name;
  private int age;
  private int id;

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void print() {
    System.out.println("이 름 : " + this.name + "\t\t나 이 : " + this.age + "\t\t학   번 : " + this.id);
  }
}
