package day3;

public class CastingEx {
    public static void main(String[] args) {
        byte bytevalue = 10;
        int intvalue = bytevalue;
        System.out.println(bytevalue + " " + intvalue);

        char charvalue = 'A';
        int intvalue1 = charvalue;
        //강제 타입변환 -> (큰거에서 작은거로) : casting
        //자동 타입변환 -> (작은거에서 큰거로) : promotion
        char charvalue2 = (char) intvalue1;
        System.out.println(intvalue1);
        System.out.println(charvalue2);

        int v1 = 10302997;
        byte bv1 = (byte) v1;
        System.out.println(v1 + " " + bv1);
        //강제 타입 변환의 목적은? 원래 값이 유지되면서 타입만 바꾸고자 할때

        long longvalue = 300;
        int intvalue2 = (int) longvalue;

        //연산식 자동 타입 변환
        //자바는 실행 속도의 향상을 위해 컴파일 단계에서 연산을 수행한다.
        byte x = 10;
        byte y = 20;
        int result1 = (int) x + (int) y;


    }
}
