package day17.database.dbEx;

import java.sql.Connection;
import java.sql.*;

public class ConnectionEx {

  private static Connection connection = null;
  private static String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private static String id = "root";
  private static String pwd = "seungjoon0324^^";

  public static void main(String[] args) {
    try {
      //JDBC 드라이버 로드 -> 생략 가능
      Class.forName("com.mysql.cj.jdbc.Driver");

      //연결하기
      connection = DriverManager.getConnection(url, id, pwd);
      System.out.println("connection 객체 값 : " + connection);
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      if (connection != null) {
        try {
          //연결 끊기
          connection.close();
          System.out.println("서버와의 연결이 끊겼습니다.");
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}