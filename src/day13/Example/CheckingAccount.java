package day13.Example;

import java.util.Objects;

public class CheckingAccount extends Account {

  private String cardNo;

  public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
    super(accid, balance, ownerName);
    this.cardNo = cardNo;
  }

  @Override
  public void calcRate() {

  }

  public void pay(String cardNo, long amount) {
    if (Objects.equals(cardNo, this.cardNo) && amount < getBalance()) {
      withdraw(amount);
    } else {
      System.out.println("지불이 불가능합니다.");
    }

  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }
}
