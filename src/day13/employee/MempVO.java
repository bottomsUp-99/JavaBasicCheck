package day13.employee;

public class MempVO extends Employee {

  private String mdept;

  public MempVO(String mdept) {
    this.mdept = mdept;
  }

  public MempVO() {
  }

  public MempVO(String name, int age, String phone, String empDate, boolean marriage, String dept,
      String mdept) {
    super(name, age, phone, empDate, marriage, dept);
    this.mdept = mdept;
  }
}
