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

        //상수 : float(4), double(8)
        double result4 = 1.2f + 3.6;

        //intvalue3에서 10을 할당
        //double value3에 5.5 할당
        //그리고 두 수를 더한 결과값을 result5에서 저장
        int intvalue3 = 10;
        double value3 = 5.5f;
        int result5 = (int) (intvalue3 + value3);
    }
}
