package day17.database.dbEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEx {

  public static void main(String[] args) {
    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/ssgdatabase";

    String id = "root";
    String pwd = "seungjoon0324^^";

    String query = "INSERT INTO users (userid, username, userage, useremail)" + "VALUES (?,?,?,?)";

    try {
      connection = DriverManager.getConnection(url, id, pwd);
      //PreparedStatement 객체 생성하여 쿼리문 넣기
      PreparedStatement pstmt = connection.prepareStatement(query);

      //PreparedStatement 객체 파라미터(?)에 순서와 타입 확인하여 데이터 할당하기
      pstmt.setString(1, "winter");
      pstmt.setString(2, "LeeJuHwan");
      pstmt.setInt(3, 26);
      pstmt.setString(4, "carcar@car.com");

      //SQL문 실행
      int rows = pstmt.executeUpdate();
      System.out.println("저장된 행의 수 : " + rows);
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (connection != null) {
        try {
          //서버와 연결 끊기 bye~bye~
          connection.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

}
