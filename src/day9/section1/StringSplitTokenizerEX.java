package day9.section1;

public class StringSplitTokenizerEX {

  //String 클래스 : 문자열을 추출 split()
  public static void main(String[] args) {
    //public String[] split(String regex, int limit)
    //반환을 string 배열로 받는다.
    //구분 기호를 문자열이 아닌 정규표현식으로 받는다.

    String str1 = "seungjoon0324@gmail.com";
    String[] splitch = str1.split("@");
    int index = 1;
    for (String s : splitch) {//enhanced for(향상된 for문)
      System.out.println(index + " " + s);
      index++;
    }
    for (int i = 0; i < splitch.length; i++) {
      System.out.printf("%d : %s \n", i, splitch[i]);
    }

    String str2 = "seungjoon0324@gmail.com@https://github.com/bottomsUp-99@notion.so/bottomsUp";
    String[] splitch1 = str2.split("@", 4);
    int index2 = 1;
    for (String s : splitch1) {//enhanced for(향상된 for문)
      System.out.println(index2 + " " + s);
      index2++;
    }

    String str3 = "ssg-in&chttps://github.com/bottomsUp-99";
    String[] result1 = str3.split("[-&%]");
    int index3 = 1;
    for (String s : result1) {//enhanced for(향상된 for문)
      System.out.println(index3 + " " + s);
      index3++;
    }

    String str4 = "ssg in c https://github.com/bottomsUp-99";
    String[] result2 = str4.split(" ");
    int index4 = 1;
    for (String s : result2) {//enhanced for(향상된 for문)
      System.out.println(index4 + " " + s);
      index4++;
    }

    String str5 = "ssg|in|c|https://github.com/bottomsUp-99";
    String[] result3 = str5.split("\\|");
    int index5 = 1;
    for (String s : result3) {//enhanced for(향상된 for문)
      System.out.println(index5 + " " + s);
      index5++;
    }

    System.out.println("=====================================");
  }
}
