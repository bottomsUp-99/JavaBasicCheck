package day18.wrapperEx;

public class WrapEx01 {

  public static void main(String[] args) {
    //100값을 객체로 생성해주세요. 박싱(Boxing)
    Integer value = 100; // AutoBoxing 자동박싱 -> java5 부터 제공
    int v = value.intValue(); // 언박싱
    v = v + 100;
    value = v;// 박싱
    int v1 = value; // AutoBoxing 자동 언박싱
    System.out.println(value);

    Boolean b1 = true;
    boolean b2 = b1.booleanValue();

    Integer num1 = 10;
    Integer num2 = 20;
    Integer result1 = num1 + num2;
    System.out.println(result1);

    //객체 값 비교 equals()로 비교해야함.
    System.out.println(num1.equals(num2));
    System.out.println(num1 < num2);
    System.out.println(num1 + num2);

    //String 문자를 포장객체가 언박싱할때
    String str1 = "10";
    String str2 = "10.5";
    int value2 = Integer.parseInt(str1);
    byte value4 = Byte.parseByte(str2);
    short value5 = Short.parseShort(str1);
    long value6 = Long.parseLong(str1);
    float value7 = Float.parseFloat(str2);
    double value3 = Double.parseDouble(str2);

    //AutoBoxing과 기본타입으로 100만건 이상 되어있는 성능평가 찾아보기
  }
}