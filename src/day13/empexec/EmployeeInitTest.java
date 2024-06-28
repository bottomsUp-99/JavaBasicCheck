package day13.empexec;

import day13.employee.RempVO;

public class EmployeeInitTest {

  public static void main(String[] args) {
    RempVO vo1 = new RempVO();
    RempVO vo = new RempVO("홍길동", 30, "010-111-1111", "2024-06-27", true, "홍보부");
    RempVO vo2 = new RempVO("김종민", 30, "010-111-1112", "2024-06-27", false, "개발부");

    System.out.println(vo);
    System.out.println(vo2);
  }
}
