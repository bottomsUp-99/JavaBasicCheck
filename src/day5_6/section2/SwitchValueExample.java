package day5_6.section2;

public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		//Java 11 이전 문법

		
		//Java 12부터 가능
		int score2 = switch (grade){
			case "A" -> 100;
			case "B" ->{
				int result = 100 - 20;
				//java13 부터 지원
				yield result;
			}
			default -> 60;
		};
		System.out.println("scor2의 값 : " + score2);
	}
}