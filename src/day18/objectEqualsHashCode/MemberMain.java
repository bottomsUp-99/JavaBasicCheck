package day18.objectEqualsHashCode;

public class MemberMain {

  public static void main(String[] args) {
    Member member1 = new Member(112, "SSG");
    Member member2 = new Member(111, "SSG");
//    System.out.println(member1 == member2); // 주소값을 비교
    System.out.println(member1.equals(member2)); // 동명이인
    System.out.println(member1.hashCode() + "\t" + member2.hashCode());
  }
}