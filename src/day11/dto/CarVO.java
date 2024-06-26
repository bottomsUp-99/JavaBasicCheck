package day11.dto;

public class CarVO {

  public int carSn;
  public String carName;
  public int carPrice;
  public String carOwner;
  public int carYear;
  public String carType;

  public int getCarSn() {
    return carSn;
  }

  public void setCarSn(int carSn) {
    this.carSn = carSn;
  }

  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public int getCarPrice() {
    return carPrice;
  }

  public void setCarPrice(int carPrice) {
    this.carPrice = carPrice;
  }

  public String getCarOwner() {
    return carOwner;
  }

  public void setCarOwner(String carOwner) {
    this.carOwner = carOwner;
  }

  public int getCarYear() {
    return carYear;
  }

  public void setCarYear(int carYear) {
    this.carYear = carYear;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }
}