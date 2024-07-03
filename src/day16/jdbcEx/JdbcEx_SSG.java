//package day16.jdbcEx;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JdbcEx_SSG {
//
//  public static void main(String[] args) {
//    String url = "jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=UTC";
//    String userName = "root";
//    String password = "1234";
//    String query = "SELECT * FROM member";
//
//    Connection con = null;
//    Statement stmt = null;
//    ResultSet rs = null;
//
//    try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      con = DriverManager.getConnection(url, userName, password);
//      System.out.println(con);
//      stmt = con.createStatement();
//      rs = stmt.executeQuery(query);
//      while (rs.next()) {
//        int id = rs.getInt("id");
//
//        String name = rs.getString("name");
//        String job = rs.getString("job");
//        System.out.printf("id : %d name : %s  job : %s", id, name, job);
//      }
//      rs.close();
//      stmt.close();
//      con.close();
//    } catch (ClassNotFoundException e) {
//      throw new RuntimeException(e);
//    } catch (SQLException e) {
//      throw new RuntimeException(e);
//    }
//  }
//}
