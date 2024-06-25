package Task0625.Task3_2;

public class Account {

  private String accNo;
  private int balance;


  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
    System.out.println(accNo + " 계좌가 계설되었습니다.");
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void save(int value) {
    this.balance = getBalance() + value;
    System.out.println(getAccNo() + " 계좌에 " + value + "만원이 입금되었습니다.");
  }

  public void deposit(int value) {
    this.balance = getBalance() - value;
    System.out.println(getAccNo() + " 계좌에 " + value + "만원이 출금되었습니다.");
  }
}
