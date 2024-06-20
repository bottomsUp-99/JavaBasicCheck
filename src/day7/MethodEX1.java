package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEX1 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


  public static void main(String[] args) throws IOException {

    //주사위 게임을 몇개의 그룹에서 몇명이 참하며 여러명이 참여하여 한버씩 주사위를 던질 수 있도록 프로그램 설계

    MethodEX1 mex1 = new MethodEX1();
    int group = 0;
    int n = 0;
    for (int i = 0; i < 3; i++) {
      group = mex1.settingGroup();
      n = mex1.playerSetting();
      mex1.dicePlay(group, n);
    }
    getPlayerInfo(group, n);
  }

  static void getPlayerInfo(int group, int n) {
    String diceGroupName = new String("");
    System.out.println("그룹 : " + group + " 각 그룹의 인원수 : " + n);
  }

  int settingGroup() throws IOException {
    System.out.print("참여자의 그룹수를 입력해주세요 : ");
    int group = Integer.parseInt(br.readLine());
    return group;
  }

  int playerSetting() throws IOException {
    System.out.print("참여자의 인원수를 입력해주세요 : ");
    int n = Integer.parseInt(br.readLine());
    return n;
  }

  void dicePlay(int group, int n) {

    for (int j = 0; j < group; j++) {
      for (int i = 1; i <= n; i++) {
        int num = (int) (Math.random() * 6) + 1;
        if (num == 1) {
          System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
          System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
          System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
          System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
          System.out.println("5번이 나왔습니다.");
        } else {
          System.out.println("6번이 나왔습니다.");
        }
      }
      System.out.println("---------" + (j + 1) + "번 그룹 끝---------");
    }
  }
}