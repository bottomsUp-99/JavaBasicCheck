package day18.mathEx;

public class MathEx01 {

  public static void main(String[] args) {
    //절댓값을 반환 -> -1, [], null, undefined
    System.out.println(Math.abs(-1));

    //1.4, 1.6, -1.5, 1 : 반올림
    System.out.println(Math.round(1.4));
    System.out.println(Math.round(1.6));
    System.out.println(Math.round(-1.5));
    System.out.println(Math.round(1));

    //1.4, 1.6, -1.5, 1 : 올림
    System.out.println(Math.ceil(1.4));
    System.out.println(Math.ceil(1.6));
    System.out.println(Math.ceil(-1.5));
    System.out.println(Math.ceil(1));

    //1.4, 1.6, -1.5, 1 : 내림
    System.out.println(Math.floor(1.4));
    System.out.println(Math.floor(1.6));
    System.out.println(Math.floor(-1.5));
    System.out.println(Math.floor(1));

    //제곱근
    System.out.println(Math.sqrt(9));

    //랜덤함수
    double random = Math.floor(Math.random() * 10 + 1);
    System.out.println((int) random);
  }
}
