package goodMorningTest.test0627.클래스.Prob18;

public class ShopService {

  private static ShopService singleton = new ShopService();

  private ShopService() {
  }

  static ShopService getInstance() {
    return singleton;
  }
}
