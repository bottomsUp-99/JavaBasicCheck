package day4.section6;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		if (num1 == num2){ //num1과 num2의 값을 비교하여 같으면 같다. 다르면 다르다 결과값을 출력
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (num1 != num2){ //num1과 num2의 값을 비교하여 같으면 같다. 다르면 다르다 결과값을 출력
			System.out.println("다르다");
		} else {
			System.out.println("같다");
		}

		char ch = 'A';
		int chInt = 65;
		if (ch == chInt){ //num1과 num2의 값을 비교하여 같으면 같다. 다르면 다르다 결과값을 출력
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println(ch == chInt);

		//예외 check
		//0.0.f != 0.1
		System.out.println(0.1f == 0.1);
		System.out.println(0.1f == (float) 0.1);

		// 문자열을 비교시, equals()와 !equals() 사용
		String str1 = "안녕";
		String str2 = "안 녕";
		boolean result = str1.equals(str2);
		System.out.println(result);

		boolean result1 = !str1.equals(str2);
		System.out.println(result1);


		/*System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);*/
			

		//System.out.println("result4: " + result4);
			

		//System.out.println("result5: " + result5);


		/*System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);*/


		/*boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);*/
	}
}