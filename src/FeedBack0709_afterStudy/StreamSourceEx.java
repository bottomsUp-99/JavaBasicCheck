package FeedBack0709_afterStudy;

import java.util.stream.IntStream;

public class StreamSourceEx {

  public static void main(String[] args) {
    //1에서 10까지의 정수 스트림을 만들고 스트림에 있는 숫자를 출력하세요.
    IntStream.rangeClosed(1, 100).forEach(System.out::println);

    //1부터 100까지의 정수 스트림을 만들고 스트림의 짝수의 합을 구하세요.
    int sumOfEvenNumbers = IntStream.rangeClosed(1, 100).filter(number -> number % 2 == 0).sum();
    System.out.println(sumOfEvenNumbers);
  }
}
