package Task0702.Prob2;

public class CarFactory extends Factory implements IWorkingTogether {

  public CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {
    int skillValue;
    switch (skill) {
      case 'A':
        skillValue = 3;
        break;
      case 'B':
        skillValue = 2;
        break;
      case 'C':
        skillValue = 1;
        break;
      default:
        skillValue = 0;
    }
    return skillValue * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return makeProducts('B');
  }
}
