package day5_6.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFrom1To100Example {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		//키보드로 부터 입력받은 5개의 숫자의 합을 출력하는 프로그램을 작성하시오 반복문 for 사용
		int sum1 = 0;
		for (int i = 0; i < 5; i++) {
			sum1 += Integer.parseInt(br.readLine());
		}
		System.out.println(sum1);

		int a = 1;
		while (a <= 5){
			int number = Integer.parseInt(br.readLine());
			sum += number;
			a++;
		}
	}
 }