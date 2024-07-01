package Task0701;

public class Main {

  public static void main(String[] args) {
    Wheeler truck = new Truck("트럭", 100, 4);
    Wheeler bike = new Bike("자전거", 25, 2);
    System.out.println("트럭 : 바퀴" + truck.wheelNumber + "개입니다.");
    System.out.println("자전거 : 바퀴" + bike.wheelNumber + "개입니다.");
    System.out.println("트럭의 현재 속도는 " + truck.velocity + "입니다.");
    System.out.println("자전거의 현재 속도는 " + bike.velocity + "입니다.");
    truck.speedDown(20);
    bike.speedDown(20);
    bike.stop();
    bike.stop();
    System.out.println("트럭의 현재 속도는 " + truck.velocity + "입니다.");
  }
}
