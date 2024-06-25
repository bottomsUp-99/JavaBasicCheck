package Task0625.Task3_1;

public class Emp {

  private String id;
  private String name;
  private int baseSalary;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  public void getSalary(double bonus) {
    double salary = baseSalary + baseSalary * bonus;
    System.out.println("봉급 = " + salary);
  }

  @Override
  public String toString() {//홍길동(12345) 사원의 기본급은 50000원 입니다.
    return name + "(" + id + ") 사원의 기본급은 " + baseSalary + "원 입니다.";
  }
}
