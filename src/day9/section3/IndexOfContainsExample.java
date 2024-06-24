package day9.section3;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    String subject = "자바 객체 프로그래밍";
    //1. 문제에서 "객체 프로그래밍" 문자열을 추출하여 저장하여 출력하세요.
    for (int i = 3; i < subject.length(); i++) {
      System.out.print(subject.charAt(i));
    }
    System.out.println();

    //2. subject 문자열에서 "프로그래밍" 문자열의 첫 인덱스를 저장하여 "프로그래밍 과목입니다."문자열을 추출하여 출력하세요
    int num = subject.indexOf("프");
    for (int i = num; i < subject.length(); i++) {
      sb.append(subject.charAt(i));
    }
    sb.append(" 과목입니다.");
    System.out.println(sb);

    //3. subject 문자열에서 "자바" 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요" 출력
    if (subject.contains("자바")) {
      System.out.println("자바 관련 과목이군요!");
    } else {
      System.out.println("자바와 관련 없는 과목이군요");
    }

    //4. subject 에서 "자바" 문자열이 포함되어 있는지 검사하고 해당 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요" 출력
    String[] split = subject.split(" ");
    for (String s : split) {
      if (s.equals("자바")) {
        System.out.println("자바 관련 과목이군요!");
      } else {
        System.out.println("자바와 관련 없는 과목이군요");
      }
    }
  }
}
