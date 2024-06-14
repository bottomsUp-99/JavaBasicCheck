package day2;

public class VDATest1 {
    public static void main(String[] args) {
        int age;
        double value;
        int score = 90;
        //문자 타입은 하나의 문자 '' -> 문자리터럴은 유니코드로 저장됨.
        //유니코드란? 세계 각국의 문자를 0~65535 숫자로 매핍한 국제 표준 규약
        //자바는 유니코드를 저장할 수 있도록 char 타입을 제공해준다.

        char var1 = 'A'; //숫자 65
        char var2 = 65;
        char var3 = '가'; //44032
        char var4 = 44032;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        char c = ' '; // 공백의 유니코드 : 32  숫자형 변수는 반드시 실제값을 할당해주어야한다.

        //리터럴 : 코드에서 프로그래머가 직접 입력한 값
        int x = 0b1011; // 0B1011 --> 이진수 1011을 십진수인 11로 바꿔준다.
        int y = 0b10100; // 0B10100 --> 이진수 10100을 십진수인 20로 바꿔준다.

        //8진수 : 0으로 시작하고 0 ~ 7
        int o1 = 013; // 1*8 + 3 *1 = 11
        int o2 = 0206; // 1*6 + 64*2 = 134

        //16진수 : 0x or 0X
        int z = 0xB3; // 11*16 + 3*1 = 179
        int z1 = 0x2A0F; // 2*16^3 + 10*16^2 + 15*1 = 10767

        byte v1 = -128;
        byte v2 = 127;
        byte v3 = (byte) 128; // down casting

        //long 타입은 수치가 큰 데이터를 다루는 프로그램에서 사용된다.
        long l1 = 10;
        long l2 = 20L;
        long l3 = 10000000000000L;

        //실수타입 float(소수점 7자리)32bit and double(소수점 15자리)64bit
        double d1 = 0.25;
        double d2 = -3.14;
        double d3 = 5e2; // 5.0 곱하기 10의 제곱 -> 500.0
        double d4 = 0.12E-2; //0.12 곱하기 10의 -2 제곱 -> 0.0012

        float f1 = 3.14f;
        float f2 = 3E6F;

        //double 타입은 float 타입보다 약 2배정도 유효 자릿수를 가지기때문에 정확한 데이터 저장이 가능하다.
        //논리타입 : 참과 거짓을 의미. 리터럴은 true,false
        boolean stop = true;
        stop = false;


        int x5 = 30;
        //변수 x5의 값이 20인가?
        boolean result = (x5 == 20);
        //변수 x5의 값이 20이 아닌가?
        result = (x5 != 0);
        //변수 x5의 값이 20보다 큰가?
        result = (x5 > 20);
        //변수 x5의 값이 0보다 크고 20보다 작은가?
        result = (x5 > 0 && x5 < 20);
        //변수 x5의 값이 0보다 작거나 200보다큰가?
        result = (x5 < 0 || x5 > 200);

    }
}