package day9.ArrayTask0625.Task3;

public class Prob13 {

  public static void main(String[] args) {
    char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    int start = 4;
    int end = 7;
    char[] answer = reverseString(s, start, end);
    System.out.println(answer);
  }

  public static char[] reverseString(char[] s, int start, int end) {
    while (start < end) {
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
    return s;
  }
}