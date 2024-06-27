package day12.Inheritance.cat;

public class CatMain {

  public static void main(String[] args) {
    BabyCat babyCat = new BabyCat();
    System.out.println(babyCat.color);
    System.out.println(babyCat.breed);
    babyCat.meow();
    babyCat.eat();
  }
}
