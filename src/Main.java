import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    List<String> foods = Arrays.asList("KimBab", "Ramen", "Fried rice", "Kimchi noodle");
    List<Integer> lengths = new ArrayList<>();
    // 잘못된 사용: 외부 상태 변경
    foods.parallelStream().forEach(food -> lengths.add(food.length())); // 동기화 문제 발생 가능, 성능 저하
    System.out.println(lengths);
  }
}