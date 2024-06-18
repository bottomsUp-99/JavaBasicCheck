package day5.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfNestedExample {
	public static void main(String[] args) throws IOException {
		//입력된 score 점수를 확인하여 95~100 A+, 90~94 A, 85~89 B+, 80~84 B, 75~79 C+, 70~74 C, 70 미만은 F로 처리하는 프로그램.
		//최종결과 C 이상 학점은 "당신의 학점은 O입니다." / C 미만의 학점은 "재수강 하세요!"

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String grade;
		if (score >= 90){
			if (score >= 95){
				grade = "A+";
				sb.append("당신의 학점은 ").append(grade).append("입니다.");
			} else {
				grade = "A";
				sb.append("당신의 학점은 ").append(grade).append("입니다.");
			}
		} else if (score >= 80){
			if (score >= 85){
				grade = "B+";
				sb.append("당신의 학점은 ").append(grade).append("입니다.");
			} else {
				grade = "B";
				sb.append("당신의 학점은 ").append(grade).append("입니다.");
			}
		} else if (score >= 70){
			if (score >= 75){
				grade = "C+";
				sb.append("당신의 학점은 ").append(grade).append("입니다.");
			} else {
				grade = "C";
				sb.append("당신의 학점은 ").append(grade).append("입니다.");
			}
		} else {
			grade = "F";
			sb.append("ㅋㅋ재수강ㅋㅋ");
		}
		System.out.println(sb);
	}
}