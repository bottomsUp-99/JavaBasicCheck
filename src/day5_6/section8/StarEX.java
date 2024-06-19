package day5_6.section8;

public class StarEX {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 9 - i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}