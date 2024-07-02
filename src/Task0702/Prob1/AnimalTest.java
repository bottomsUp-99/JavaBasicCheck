package Task0702.Prob1;

public class AnimalTest {

  public static void main(String[] args) {
    Animal dog = new Dog(8);
    Animal chicken = new Chicken(3);
    Chicken cheatableChicken = new Chicken(5);
    for (int i = 0; i < 3; i++) {
      System.out.println((i + 1) + "시간 후");
      System.out.print("개의 이동거리 = ");
      dog.run(1);
      System.out.println(dog.getDistance());
      System.out.print("닭의 이동거리 = ");
      chicken.run(1);
      System.out.println(chicken.getDistance());
      System.out.print("날으는 닭의 이동거리 = ");
      cheatableChicken.run(2);
      System.out.println(cheatableChicken.getDistance());
    }
  }
}
