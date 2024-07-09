package day18;

import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
    String data1 = "김장완&정수민&김지훈";

    //& 토큰나이저 하여 학생이름을 1. 김장완 2. 정수민 3. 김지훈 출력
    StringTokenizer st = new StringTokenizer(data1, "&");
    int no = 0;
    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      no++;
      System.out.println(no + " " + token);
    }

    //결과 동일하게 split()메서드 사용하여 출력
    String[] list = data1.split("&");
    int num = 0;
    for (String str : list) {
      num++;
      System.out.println(num + " " + str);
    }
  }
}
