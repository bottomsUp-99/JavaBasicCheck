package day17.database.dbEx.vo;

public class User {

  private String userId;
  private String userName;
  private int userAge;
  private String userEmail;

  public User() {
  }

  public User(String id, String name, int age, String email) {
    this.userId = id;
    this.userName = name;
    this.userAge = age;
    this.userEmail = email;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getUserAge() {
    return userAge;
  }

  public void setUserAge(int userAge) {
    this.userAge = userAge;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  @Override
  public String toString() {
    return "User{" +
        "userId='" + userId + '\'' +
        ", userName='" + userName + '\'' +
        ", userAge=" + userAge +
        ", userEmail='" + userEmail + '\'' +
        '}';
  }
}
