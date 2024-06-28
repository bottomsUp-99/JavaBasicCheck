package day13.Example;

public abstract class Account {

  private String accid;
  private long balance;
  private String ownerName;

  Account() {
  }

  Account(String accid, long balance, String ownerName) {
    this.accid = accid;
    this.balance = balance;
    this.ownerName = ownerName;
  }

  public abstract void calcRate();

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
