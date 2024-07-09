package day18.lombokEx;

public class shopMain {

  public static void main(String[] args) {
    ShopDTO shop = new ShopDTO();
    System.out.println(shop.toString());
    ShopDTO shop1 = new ShopDTO("emart-강남", "e-001", "02-444-8888", "emart-001",
        "서울시 강남구 봉은사로 112");
    ShopDTO shop2 = new ShopDTO("emart-강남", "e-001", "02-444-8888", "emart-001",
        "서울시 강남구 봉은사로 112");
    System.out.println(shop1);

    if (shop1.equals(shop2)) {
      System.out.println("같은 가게");
    } else {
      System.out.println("다른 가게");
    }

    ShopDTO shop4 = ShopDTO.builder().shopName("emart-청담점").shopTel("02-4444-5565").build();
    System.out.println(shop4);
  }
}