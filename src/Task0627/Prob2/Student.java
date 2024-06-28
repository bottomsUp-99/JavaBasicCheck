package Task0627.Prob2;

public class Student {

  private String name;
  private String subject;
  private int fee;
  private int returnFee;

  public Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  void calcReturnFee() {
    if (subject.equals("javaprogram")) {
      this.returnFee = this.fee / 4;
    } else if (subject.equals("jspprogram")) {
      this.returnFee = this.fee / 5;
    } else {
      System.out.println("그런 과정명은 없습니다.");
    }
  }

  void print() {
    System.out.println(
        this.name + " 씨의 과정명은 " + this.subject + " 이고 교육비는 " + this.fee + " 이며 환급금은 "
            + this.returnFee + " 입니다.");
  }
}
