package day9.section3;

public class CharAtExample {

  public static void main(String[] args) {
    String ssn = "0106241230123";
    //1. chatAt() 통해서 "1230123"만 추출하여 출력하기
    for (int i = 6; i < ssn.length(); i++) {
      System.out.print(ssn.charAt(i));
    }

    //2. 남성은 (1,3) 여성은 (2,4) 해당 인덱스를 추출하여 (1,3)은 "남성", (2,4)는 여성 출력
    if (ssn.charAt(6) == 1 || ssn.charAt(6) == 3) {
      System.out.println("남성");
    } else if (ssn.charAt(6) == 2 || ssn.charAt(6) == 4) {
      System.out.println("여성");
    }
  }
}
