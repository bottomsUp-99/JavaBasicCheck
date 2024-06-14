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
        double doublevalue6 = 5.5f;
        double result5 = (int) (intvalue3 + doublevalue6);
        System.out.println(result5);
        int result6 = intvalue3 + (int) doublevalue6;
        System.out.println(result6);

        // 1/2=0.5

        int f = 1;
        int s = 2;
        double ans1 = (double) f/s;
        double ans2 = (double) f/ (double) s;
        double ans3 = (double) f/s;
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

        //자바에서 + 연산자의 기능이 두가지
        //1. 피연산자 모두 숫자일 경우 덤셈연산 수행
        //2. 피연산자 중 하나가 문자일 경우 나머지 피연산도 문자열로 자동변환되어 문자열 결합 연산 수행
        int op1 = 3 + 7;
        System.out.println(op1);
        String op2 = "3" + 7;
        System.out.println(op2);
        String op3 = "3" + "7";
        System.out.println(op3);
        int op4 = 1 + 2 + 3;
        System.out.println(op4);
        String op5 = 1 + 2 + "3";
        System.out.println(op5);
        String op6 = 1 + "2" + 3;
        System.out.println(op6);
        String op7 = "1" + (2 + 3);
        System.out.println(op7);

        //String 타입 변환
        int op8 = Integer.parseInt("10");
        System.out.println(op8 + 10);
        double op9 = Double.parseDouble("3.14");
        System.out.println(op9 + 5.5);
        boolean op10 = Boolean.parseBoolean("true");
        System.out.println(op10);

        //기본 타입으로 바꾼 값을 다시 string 타입으로 변경
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(op9);
        String str3 = String.valueOf(op10);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //변수의 유효범위 (variable scope) : 해당 변수가 접근 가능한 범위를 의미
        //자바에서는 변수가 선언된 위치에 따라 범위가 결정된다.

        //1. 블럭 내부의 변수
        int a = 10;
        if (a == 10){
            int b = 20;
            System.out.println("a = " + a + " b = " + b);
        }
        System.out.println(a);

        //2. 메소드의 내부 변수 : 메소드 내에서 선언된 변수는
        calculator(100, 200);
    }

    /*public static void calculator(int n1, int n2){
        int result = n1 + n2;
        System.out.printf("%d + %d 의 결과는 %d", n1, n2, result);
    }*/
    public static int calculator(int n1, int n2){
        int result = n1 + n2;
        System.out.printf("%d + %d 의 결과는 %d", n1, n2, result);
        return result;
    }
}
