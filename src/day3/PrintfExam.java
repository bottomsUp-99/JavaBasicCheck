package day3;

public class PrintfExam {
    public static void main(String[] args) {
        //prinf :  출력한 후 줄바꿈을 하지 않는다. "\n", "%n"
        //%b : boolean으로 출력해라잉
        //%d : 10진 정수로 출력해라잉
        //%o : 8진수로 출력해라잉
        //%x : 16진수로 출력해라잉
        //%f : 소수로 출력해라잉
        //%e, %c : 문자로 출력해라잉

        //result = [     10]
        long l1 = 10;
        System.out.printf("result = [%5d]%n", l1);
        System.out.printf("result = [%-5d]%n", l1);
        System.out.printf("result = [%05d]%n", l1);

        long hx = 0xFFFF;
        System.out.printf("hx = %x%n", hx);
        System.out.printf("hx = %#x%n", hx);
        System.out.printf("hx = %#X%n", hx);

        //10진수를 2진수로 출력하는 지시자는 없다. Integer.toBinaryString(int i) 사용한다.
        //해당 메소드는 정수를 2진수로 변환해서 문자열로 반환한다. %s
        int binaryNum = 0b10;
        System.out.printf("binarynum = %s%n", Integer.toBinaryString(binaryNum));

        char c = 'A';
        System.out.printf("c = %c, %d %n", c, (int)c);
    }
}
