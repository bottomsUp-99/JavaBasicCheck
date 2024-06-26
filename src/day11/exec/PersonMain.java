package day11.exec;

import day11.Model.Person;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PersonMain {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //1. 홍길동 회원이 가입했습니다. 회원정보를 입력받아 저장하고 저장된 정보를 출력 ㄱㄱ
    Person hong = new Person();
//    hong.name = "홍길동";
//    hong.age = 20;
//    hong.phone = "01040310324";
    System.out.println("이름 : ");
    String name = br.readLine();

    System.out.println("나이 : ");
    int age = Integer.parseInt(br.readLine());

    System.out.println("전화번호 : ");
    String phone = br.readLine();

    System.out.println(hong);
    hong.eat();
    hong.walk();
    hong.play();
    personInfoPrint(name, age, phone);
    //2. 나주인 회원이 가입했습니다. 회원정보를 입력받아 저장하고 저장된 정보를 출력 ㄱㄱ
    // ---> 이름과 전화번호는 필수이므로 객체를 초기화하여 객체 생성 --> 생성자 오버로딩
    Person naa = new Person("나주인", "01012345678");
    naa.age = 25;
    System.out.println(naa);
    naa.eat();
    naa.walk();
    naa.play();
    personInfoPrintObject(naa);
  }

  public static void personInfoPrint(String name, int age, String phone) {
    System.out.println("회원의 이름은 : " + name + " 나이 : " + age + " 연락처 : " + phone);
  }

  public static void personInfoPrintObject(Person person) {
    System.out.println(
        "회원의 이름은 : " + person.name + " 나이 : " + person.age + " 연락처 : " + person.phone);
  }
}