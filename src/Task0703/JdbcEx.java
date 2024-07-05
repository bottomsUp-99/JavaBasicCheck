package Task0703;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

  public static void main(String[] args) {
    System.out.println("==회원 정보 입력 후 조회===");
    //회원의 정보를 사용자 받는 기능  (static 메소드로)
    //Member 클래스(VO) 새로 만들어서 메소드에 파라미터로 넘겨주기
    //요구사항
    //1. Member 클래스 생성
    //2. JDBCEx class메서드에서 중복 기능을 뽑아서 abstract MemberDB 클래스 생성
    //3. JDBCEx class가 MemberDB의 기능을 사용할 수 있도록 구성 및 구현하기

    memberInsert();
    memberSearch();
    System.out.println("==회원 정보수정 후 조회===");
    memberUpdate();
    memberSearch();
    System.out.println("==회원 정보삭제 후 조회===");
    memberDelete();
    memberSearch();

  }

  private static void memberDelete() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "1234";
    String query = "DELETE FROM member where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);

      pstmt.setInt(1, 1); //빨간줄이라 잠깐 슬래시 처리

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private static void memberUpdate() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "1234";
    String query = "UPDATE member SET job = ? where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);

      pstmt.setString(1, "engineer");
      pstmt.setInt(2, 1);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

  private static void memberInsert() {
    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String password = "1234";
    String query = "INSERT INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, 4);
      pstmt.setString(2, "kss");
      pstmt.setString(3, "professor");

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
    String password = "1234";
    String query = "SELECT * FROM member";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");

        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %s  job : %s", id, name, job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

}
