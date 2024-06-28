package day13.employee;

public class RempVO extends Employee {

  public RempVO() {
  }

  public RempVO(String name, int age, String phone, String empDate, boolean marriage, String dept) {
    super(name, age, phone, empDate, marriage, dept);
  }

  public RempVO(String name, int age, String phone) {
    super(name, age, phone);
  }
}
