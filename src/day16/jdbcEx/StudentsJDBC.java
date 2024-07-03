package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsJDBC {

  public static void main(String[] args) {
    mySQLConnection();
  }

  public static void mySQLConnection() {
    String url = "jdbc:mysql://localhost:3306/students?serverTimezone=UTC";
    String userName = "root";
    String password = "seungjoon0324^^";
    String query = "SELECT * FROM students";

    try {
      Connection con = DriverManager.getConnection(url, userName, password);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        String id = rs.getString("sno");
        String name = rs.getString("name");
        int korean = rs.getInt("korean");
        int english = rs.getInt("english");
        int math = rs.getInt("math");
        int science = rs.getInt("science");
        int total = rs.getInt("total");
        float average = rs.getFloat("average");
        String grade = rs.getString("grade");

        System.out.printf(
            "id : %s name : %s korean : %s english : %s math : %s science : %s total : %s average : %s grade : %s\n",
            id, name, korean, english, math, science, total, average, grade);
      }
    } catch (SQLException e) {
      e.getMessage();
    }
  }
}
//Last login: Wed Jul  3 11:15:07 on ttys000
//zoohwan_99@ijuhwan-ui-noteubug ~ % ls
//Desktop		Library		Pictures	Test2		baekend
//Documents	Movies		Public		Test3		javaproject
//Downloads	Music		Test1		a.txt		third-repo
//zoohwan_99@ijuhwan-ui-noteubug ~ % cd
//zoohwan_99@ijuhwan-ui-noteubug ~ % cd Documents
//zoohwan_99@ijuhwan-ui-noteubug Documents % ls
//    employees
//javaproject
//    인턴
//주화니
//    티스토리
//부트캠프
//인텔리제이 자료
//zoohwan_99@ijuhwan-ui-noteubug Documents % cd employees
//zoohwan_99@ijuhwan-ui-noteubug employees % ls
//Changelog			load_dept_manager.dump
//README				load_employees.dump
//employees.sql			load_salaries.dump
//employees_partitioned.sql	load_titles.dump
//employees_partitioned2.sql	mysql-connector-j-8.3.0
//employees_partitioned3.sql	objects.sql
//load_departments.dump		test_employees_md5.sql
//load_dept_emp.dump		test_employees_sha.sql
//zoohwan_99@ijuhwan-ui-noteubug employees % mysql.server start
//Starting MySQL
//. SUCCESS!
//zoohwan_99@ijuhwan-ui-noteubug employees % mysql -u root -p
//Enter password:
//Welcome to the MySQL monitor.  Commands end with ; or \g.
//Your MySQL connection id is 8
//Server version: 8.3.0 Homebrew
//
//Copyright (c) 2000, 2024, Oracle and/or its affiliates.
//
//Oracle is a registered trademark of Oracle Corporation and/or its
//affiliates. Other names may be trademarks of their respective
//owners.
//
//    Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.
//
//mysql> show databases
//    ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        ->
//        -> show databses;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'show databses' at line 15
//mysql> USE employees;
//Reading table information for completion of table and column names
//You can turn off this feature to get a quicker startup with -A
//
//Database changed
//mysql> show databases;
//+--------------------+
//    | Database           |
//    +--------------------+
//    | employees          |
//    | information_schema |
//    | mysql              |
//    | performance_schema |
//    | sys                |
//    +--------------------+
//    5 rows in set (0.00 sec)
//
//mysql> -u root -p shutdown
//    -> mysql.server stop
//    -> ;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '-u root -p shutdown
//mysql.server stop' at line 1
//mysql> show databases;
//+--------------------+
//    | Database           |
//    +--------------------+
//    | employees          |
//    | information_schema |
//    | mysql              |
//    | performance_schema |
//    | sys                |
//    +--------------------+
//    5 rows in set (0.00 sec)
//
//mysql> ps -ef | grep mmysql
//    -> ;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ps -ef | grep mmysql' at line 1
//mysql> CREATE DATABASE IF NOT EXISTS students;
//Query OK, 1 row affected (0.01 sec)
//
//mysql> show databases;
//+--------------------+
//    | Database           |
//    +--------------------+
//    | employees          |
//    | information_schema |
//    | mysql              |
//    | performance_schema |
//    | students           |
//    | sys                |
//    +--------------------+
//    6 rows in set (0.00 sec)
//
//mysql> USE students;
//Database changed
//mysql> CREATE TABLE students(sno varchar(10) not null, name varchar(20) not null, korean int not null, english int not null, math int not null, science int not null, total int default 0, average float not null, grade varchar(2) default 'D');
//Query OK, 0 rows affected (0.01 sec)
//
//mysql> show databases;
//+--------------------+
//    | Database           |
//    +--------------------+
//    | employees          |
//    | information_schema |
//    | mysql              |
//    | performance_schema |
//    | students           |
//    | sys                |
//    +--------------------+
//    6 rows in set (0.00 sec)
//
//mysql> insert into students ("1", "lsj", 90, 95, 85, 90, 360, 90, 'A');
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '"1", "lsj", 90, 95, 85, 90, 360, 90, 'A')' at line 1
//mysql> insert into students ("1", "lsj", 90, 95, 85, 90, 360, 90, "A");
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '"1", "lsj", 90, 95, 85, 90, 360, 90, "A")' at line 1
//mysql> insert into students ('1', 'lsj', 90, 95, 85, 90, 360, 90, 'A');
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''1', 'lsj', 90, 95, 85, 90, 360, 90, 'A')' at line 1
//mysql> insert into students ('1', 'lsj', 90, 95, 85, 90, 360, 90, 'A');
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''1', 'lsj', 90, 95, 85, 90, 360, 90, 'A')' at line 1
//mysql> insert into students values('1', 'lsj', 90, 95, 85, 90, 360, 90, 'A');
//Query OK, 1 row affected (0.01 sec)
//
//mysql> insert into students values('2', 'ljh', 80, 85, 75, 80, 320, 80, 'B');
//Query OK, 1 row affected (0.00 sec)
//
//mysql> insert into students values('3', 'lbs', 70, 75, 65, 70, 280, 70, 'C');
//Query OK, 1 row affected (0.01 sec)
//
//mysql> select from * students
//    -> ;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from * students' at line 1
//mysql> select from * students;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from * students' at line 1
//mysql> SELECT FROM * students;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'FROM * students' at line 1
//mysql> select from * students;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from * students' at line 1
//mysql> select from * students;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from * students' at line 1
//mysql> show databases;
//+--------------------+
//    | Database           |
//    +--------------------+
//    | employees          |
//    | information_schema |
//    | mysql              |
//    | performance_schema |
//    | students           |
//    | sys                |
//    +--------------------+
//    6 rows in set (0.00 sec)
//
//mysql> select from * students;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from * students' at line 1
//mysql> use students;
//Database changed
//mysql> select from * students;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from * students' at line 1
//mysql> select * from students;
//+-----+------+--------+---------+------+---------+-------+---------+-------+
//    | sno | name | korean | english | math | science | total | average | grade |
//    +-----+------+--------+---------+------+---------+-------+---------+-------+
//    | 1   | lsj  |     90 |      95 |   85 |      90 |   360 |      90 | A     |
//    | 2   | ljh  |     80 |      85 |   75 |      80 |   320 |      80 | B     |
//    | 3   | lbs  |     70 |      75 |   65 |      70 |   280 |      70 | C     |
//    +-----+------+--------+---------+------+---------+-------+---------+-------+
//    3 rows in set (0.00 sec)
//
//mysql> commit;
//Query OK, 0 rows affected (0.00 sec)
//
//mysql>
