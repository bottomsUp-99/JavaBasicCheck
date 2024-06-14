package day2;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.company = "BMW";
        bmw.type = 'A';
        bmw.auto = true;
        bmw.year = 2010;
        bmw.gasmi = 12.5F;
        System.out.println("현재 모델은" + bmw.getModel());
        bmw.setModel("탕탕후루루루루루루");
        System.out.println("현재 모델은 " + bmw.getModel());
    }
}
