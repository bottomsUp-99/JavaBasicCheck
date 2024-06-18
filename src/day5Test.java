import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day5Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("숫자1 : ");
        int a = Integer.parseInt(br.readLine());
        System.out.printf("숫자2 : ");
        int b = Integer.parseInt(br.readLine());
        int sum = a + b;
        double avg = (double) sum / 2;
        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.1f", avg);
    }
}
