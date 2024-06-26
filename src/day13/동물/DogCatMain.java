package day13.동물;

public class DogCatMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    Cat cat = new Cat();
    cat.eat();
    cat.night();

    Animal x = new Cat();
    x.eat();
    Cat cat1 = (Cat) x;
    cat1.night();

    x = new Dog();
    x.eat();

    Animal cat2 = new Cat();
    cat2.eat();
    cat2 = (Cat) cat2;
    ((Cat) cat2).night();
  }
}