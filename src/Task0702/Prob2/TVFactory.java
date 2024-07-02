package Task0702.Prob2;

public class TVFactory extends Factory implements IWorkingTogether {

  public TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {
    int skillValue;
    switch (skill) {
      case 'A':
        skillValue = 8;
        break;
      case 'B':
        skillValue = 5;
        break;
      case 'C':
        skillValue = 3;
        break;
      default:
        skillValue = 1;
    }
    return skillValue * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return makeProducts('C');
  }
}
