package day13;

public abstract class Account {

  protected String accid;
  protected long balance;
  protected String ownerName;

  Account() {
  }

  public Account(String accid, long balance, String ownerName) {
    this.accid = accid;
    this.balance = balance;
    this.ownerName = ownerName;
  }

  void deposit(long money) {
    this.balance = this.balance + money;
  }

  void withdraw(long amount) {
    this.balance = this.balance - amount;
  }

  public String getAccid() {
    return accid;
  }

  public void setAccid(String accid) {
    this.accid = accid;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
}
