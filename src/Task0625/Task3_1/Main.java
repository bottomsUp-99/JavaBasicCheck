package Task0625.Task3_1;

public class Main {

  public static void main(String[] args) {

    Emp emp = new Emp();
    emp.setId("12345");
    emp.setName("홍길동");
    emp.setBaseSalary(50000);
    System.out.println(emp);
    emp.getSalary(30);

  }
}
