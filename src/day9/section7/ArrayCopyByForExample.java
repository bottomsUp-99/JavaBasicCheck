package day9.section7;

public class ArrayCopyByForExample {

  public static void main(String[] args) {
    //길이 3인 정수형 oldIntArray 배열1,2,3으 초기화하여 생성 ㄱㄱ
    int[] oldIntArray = {1, 2, 3};

    //길이 5인 배열을 새로 생성
    int[] newIntArray = new int[5];

    //배열 항목 복사
    for (int i = 0; i < oldIntArray.length; i++) {
      newIntArray[i] = oldIntArray[i];
    }

    //배열 항목 출력
    String result = "";
    for (int i = 0; i < oldIntArray.length; i++) {
      result.concat(String.valueOf(newIntArray[i]));
      System.out.println(newIntArray[i] + ", ");
    }
  }
}

