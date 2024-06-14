package day2;

public class Car {
    private String model;
    private long distance;
    private int price;
    public String company;
    public char type;
    public boolean auto;
    public int year;
    public float gasmi;

    public String getModel() {
        return model;
    }

    public long getDistance() {
        return distance;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
