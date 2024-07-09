package goodMorningTest.test0627.클래스.Prob20;

public class Account {

  // Account 클래스 리팩토링
  // 사용자 정의 예외 클래스를 생성합니다.
  // 잔고가 부족합니다. 메세지를 출력하게끔
  //InsufficientExceoption 예외 클래스로 처리.
  private String accountNumber;
  private String accountHolder;
  private int balance;

  public Account(String accountNumber, String accountHolder, int initialDeposit) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialDeposit;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("입금액은 0보다 커야 합니다.");
    }
  }

  public void withdraw(int amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("출금액이 유효하지 않습니다.");
    }
  }
}
