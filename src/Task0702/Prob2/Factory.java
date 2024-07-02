package Task0702.Prob2;

abstract public class Factory {

  private String name;
  private int openHour;
  private int closeHour;

  public Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  public String getFactoryName() {
    return name;
  }

  public void setFactoryName(String name) {
    this.name = name;
  }

  public int getOpenHour() {
    return openHour;
  }

  public void setOpenHour(int openHour) {
    this.openHour = openHour;
  }

  public int getCloseHour() {
    return closeHour;
  }

  public void setCloseHour(int closeHour) {
    this.closeHour = closeHour;
  }

  public int getWorkingTime() {
    return closeHour - openHour;
  }

  abstract int makeProducts(char skill);
}
