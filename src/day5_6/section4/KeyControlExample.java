package day5_6.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyControlExample {
	public static void main(String[] args) throws IOException {
		//키보드로부터 입력받은 수가 짝수인지 홀수인지 판별하고, 계속 입력을 진행할지 여부를 선택하기 위한 프로그램 while문 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean quit = false;
		while(!quit){
			System.out.print("숫자를 입력해주세요 : ");
			int num = Integer.parseInt(br.readLine());
			if (num % 2 == 0){
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속 입력을 하시려면 1번을, 그만하시고 싶으시면 0번을 눌러주세요.");
			int choice = Integer.parseInt(br.readLine());
			if (choice == 1){
				continue;
			} else {
				quit = true;
			}
		}
	}
}