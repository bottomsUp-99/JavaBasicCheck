package day16.jdbcEx;

import com.mysql.cj.jdbc.result.UpdatableResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

  public static void main(String[] args) {
    //회원의 정보를 사용자 받는 기능 (static method로)
    //Member 클래스
    memberSearch();
    memberInsert();
    memberUpdate();
    memberDelete();
  }

  private static void memberDelete() {
  }

  private static void memberUpdate() {
  }

  private static void memberInsert() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "seungjoon0324^^";
    String query = "INSERT INTO member VALUES (?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement("INSERT INTO member VALUES (?,?,?)");
      pstmt.setInt(1, 6);
      pstmt.setString(2, "test");
      pstmt.setString(3, "testfcase");

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static void memberSearch() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "seungjoon0324^^";
    String query = "SELECT * FROM member where id = 1";

    try {
      Connection con = DriverManager.getConnection(url, userName, password);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      rs.next();
      int id = rs.getInt("id");
      String name = rs.getString("name");
      String job = rs.getString("job");
      System.out.printf("id : %d name : %s job : %s", id, name, job);
    } catch (SQLException e) {
      e.getMessage();
    }
  }
}
