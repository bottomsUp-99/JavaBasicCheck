package goodMorningTest.test0627.클래스.Prob19;

public class Account {

  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
      return;
    }
    this.balance = balance;
  }

  private int balance;
}
