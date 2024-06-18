package day5.section2;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		//Math.random함수를 이용해서 8시부터 11시까지의 정수값을 발생시켜 int time 변수에 할당
		//8이면 출근합니다
		//9이면 회의합니다
		//10이면 업무를 합니다
		//11이면 출장을 갑니다

		int time = (int) (Math.random() * 4) + 8;
		switch (time){
			case 8:
				System.out.println(time + "시에 출근을 합니다");
				break;
			case 9:
				System.out.println(time + "시에 회의를 합니다");
				break;
			case 10:
				System.out.println(time + "시에 업무를 합니다");
				break;
			case 11:
				System.out.println(time + "시에 출장을 갑니다");
				break;
		}
	}
}
