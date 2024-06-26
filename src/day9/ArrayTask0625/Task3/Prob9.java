package day9.ArrayTask0625.Task3;

public class Prob9 {

  public static void main(String[] args) {

    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = (char) (start + j);
      }
      start += 5;
    }
    //2.원본 배열 출력
    System.out.println("\t\t\t\t\t원본배열");
    for (int i = 0; i < 34; i++) {
      System.out.print("=");
    }
    System.out.println();
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j] + "       ");
      }
      System.out.println();
    }

    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i][i] = '*';
    }

    //4. 수정된 배열 출력
    System.out.println();
    System.out.println("\t\t\t\t\t수정된 배열");
    for (int i = 0; i < 34; i++) {
      System.out.print("=");
    }
    System.out.println();
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j] + "       ");
      }
      System.out.println();
    }
  }
}
