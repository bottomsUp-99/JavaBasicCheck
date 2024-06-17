package day4.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LogicalOperatorExample {
	public static void main(String[] args) throws IOException {
		int charCode = 'A';
		int charCode1 = 'a';
		int charCode3 = '5';

		Scanner sc = new Scanner(System.in);
		//1. 입력받은 문자가 대문자인지 소문자인지 구분하여, 대문자이면 "대문자 입력값" 소문자이면 "소문자 입력값"
		System.out.println("알파벳 순자 한 자를 입력하세요!");
		int result1 = sc.next().charAt(0);
		if (result1 < 97){
			System.out.println("대문자 입력값");
		} else {
			System.out.println("소문자 입력값");
		}

		//2. 입력받은 문자가 숫자인지, 알파벳 대문자 또는 소문자인지 구분하여 숫자이면 숫자, 대문자이면 대문자, 소문자이면 소문자
		System.out.println("문자(알파벳, 숫자 0 ~ 9) 하나를 입력하세요!");
		int result2 = sc.next().charAt(0);
		if (result2 < 58){
			System.out.println("숫자");
		} else if (result2 < 97){
			System.out.println("대문자 입력값");
		} else {
			System.out.println("소문자 입력값");
		}

		//3. 입력받은 숫자가 2의 배수 또는 3의 배수인지 검사하여 2의 배수 또느 3의 배수이면 "ok", 아니며 "oops.."
		int result3 = Integer.parseInt(sc.next());
		if ((result3 % 3 == 0) || (result3 % 2 ==0)){
			System.out.println("ok");
		} else {
			System.out.println("oops");
		}
		//----------------------------------------------------------

		int value = 6;


	}
}