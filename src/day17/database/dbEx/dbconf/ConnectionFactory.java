package day17.database.dbEx.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  //ConnectionFactory에 Mysql server로부터 connection을 얻어오는 open()메서드를 작성하세요
  //조건 : 싱글톤 패턴을 적용하여 만들어주세요.

  private Connection connection = null;
  private String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private String id = "root";
  private String pwd = "seungjoon0324^^";

  private static final ConnectionFactory instance = new ConnectionFactory();

  private ConnectionFactory() {
  }

  public static ConnectionFactory getInstance() {
    return instance;
  }

  public Connection open() {
    try {
      connection = DriverManager.getConnection(url, id, pwd);
      return connection;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return connection;
  }

  public void close() {
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }
}
