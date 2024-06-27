package goodMorningTest.test0627.클래스.Prob20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankApplication {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static Account[] accounts = new Account[100];
  private static int accountCount = 0;

  public static void main(String[] args) throws IOException {

    showMenu();

    boolean quit = true;
    while (quit) {
      System.out.print("선택> ");
      int choice = Integer.parseInt(br.readLine());
      drawDividingLine();
      switch (choice) {
        case 1:
          createAccount();
          showMenu();
          break;
        case 2:
          accountList();
          showMenu();
          break;
        case 3:
          depositAccount();
          showMenu();
          break;
        case 4:
          withdrawAccount();
          showMenu();
          break;
        case 5:
          menuExit();
          quit = false;
          break;
      }
    }
  }

  public static void drawDividingLine() {
    for (int i = 0; i < 48; i++) {
      System.out.print("-");
    }
    System.out.println();
  }

  public static void showMenu() {
    drawDividingLine();
    System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
    drawDividingLine();
  }

  private static void createAccount() throws IOException {
    System.out.println("계좌생성");
    drawDividingLine();
    System.out.print("계좌번호: ");
    String accountNumber = br.readLine();
    System.out.print("계좌주: ");
    String accountHolder = br.readLine();
    System.out.print("초기입금액: ");
    int initialDeposit = Integer.parseInt(br.readLine());

    accounts[accountCount] = new Account(accountNumber, accountHolder, initialDeposit);
    accountCount++;
    System.out.println("결과: 계좌가 생성되었습니다.");
  }

  private static void accountList() {
    System.out.println("계좌목록");
    drawDividingLine();
    for (int i = 0; i < accountCount; i++) {
      System.out.println(
          "계좌 : " + accounts[i].getAccountNumber() + " \t 이름 : " + accounts[i].getAccountHolder()
              + " \t 잔액: " + accounts[i].getBalance());
    }
  }

  private static void depositAccount() throws IOException {
    System.out.println("예금");
    drawDividingLine();
    System.out.print("계좌번호: ");
    String accountNumber = br.readLine();
    System.out.print("예금액: ");
    int amount = Integer.parseInt(br.readLine());

    Account account = findAccount(accountNumber);
    if (account != null) {
      account.deposit(amount);
      System.out.println("결과: 예금이 성공되었습니다.");
    } else {
      System.out.println("결과: 계좌를 찾을 수 없습니다.");
    }
  }

  private static void withdrawAccount() throws IOException {
    System.out.println("출금");
    drawDividingLine();
    System.out.print("계좌번호: ");
    String accountNumber = br.readLine();
    System.out.print("출금액: ");
    int amount = Integer.parseInt(br.readLine());

    Account account = findAccount(accountNumber);
    if (account != null) {
      account.withdraw(amount);
      System.out.println("결과: 출금이 성공되었습니다.");
    } else {
      System.out.println("결과: 계좌를 찾을 수 없습니다.");
    }
  }

  private static Account findAccount(String accountNumber) {
    for (int i = 0; i < accountCount; i++) {
      if (accounts[i].getAccountNumber().equals(accountNumber)) {
        return accounts[i];
      }
    }
    return null;
  }

  public static void menuExit() {
    System.out.println("프로그램 종료");
  }
}
