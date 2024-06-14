package day2;

public class VDATest {
    public static void main(String[] args) {
        //Q1.[정수 : int] 한 개를 저장하기 위해서 변수를 선언. 변수명은 v.
        int v;//변수 선언
        //정수형 변수 v에 20을 저장.
        v = 20;
        //정수형 v에 값을 "v = 10"출력
        System.out.println("v = " + v);

        //Q2.변수 a에 10을 저장하고, a에 저장된 값을 변수 b에 저장하고, 변수 b에 10을 곱하여 변수 c에 저장.
        int a = 10;//변수 초기화
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        //Q3. sum이라는 변수에 1부터 5까지의 수를 누적하여 출력.
        int sum = 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        System.out.println("sum = " + sum);

        //Q4. x=10, y=20을 저장하고 서로 값을 교환(swap)해보세요
        int x = 10;
        int y = 20;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + " / y = " + y);
    }
}
