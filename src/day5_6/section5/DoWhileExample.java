package day5_6.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileExample {
	public static void main(String[] args) throws IOException {
		//do while문은 while문과 for 문처럼 조건식에 의해 반복되는 점은 비슷하다
		//차이점은 조건식을 확인하기 전에 코드 블럭의 코드가 한버 실행된다.
		int i = 1;
		do {
			System.out.println("Hello Java");
			i++;
		} while (i < 5);

		//키보드로부터 10보다 큰 수부터 10까지의 합을 구하기 위한 do-while 프로그램을 작성해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		do {
			sum += num--;
		} while (num >= 10);
		System.out.println(sum);
	}
}