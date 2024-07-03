package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

  public static void main(String[] args) {
    mySQLConnection();
  }

  public static void mySQLConnection() {
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
