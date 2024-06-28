package day13.동물;

public class PolyMethodTest {

  public static void main(String[] args) {
    Dog d = new Dog();
    Cat c = new Cat();
    //display(d);
    Animal[] animals = new Animal[2];
    animals[0] = d;
    animals[1] = c;
    display1(animals);
  }

  public static void display(Animal ani) { //다형성 인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.
    ani.eat();
    if (ani instanceof Cat) { //객체의 타입을 검사
      ((Cat) ani).night();
    }
  }

  public static void display1(Animal[] animal) {
    for (Animal ani : animal) {
      ani.eat();
      if (ani instanceof Cat) { //객체의 타입을 검사
        ((Cat) ani).night();
      }
    }
  }
}
