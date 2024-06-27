package goodMorningTest.test0627.클래스.Prob14;

public class Member {

  String name;
  String id;
  String passWord;
  int age;

  Member(String name, String id) {
    setName(name);
    setId(id);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
