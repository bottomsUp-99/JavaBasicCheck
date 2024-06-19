package day5_6.section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGudan {
    public static void main(String[] args) throws IOException {
//        for (int i = 2; i < 10; i++) {
//            System.out.println("구구단" + i + "단");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + i*j);
//            }
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //사용자에게 원하는 단을 입력받아 해당 단만 출력
        int num1 = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            System.out.println(num1 + " x " + i + " = " + num1*i);
        }

        //사용자에게 원하는 것 해당 범위의 단만 출력
        int first = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        for (int i = first; i <= end; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}