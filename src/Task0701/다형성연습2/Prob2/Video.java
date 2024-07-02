package Task0701.다형성연습2.Prob2;

public class Video extends Content {

  private String genre;

  public Video(String title, String genre) {
    super(title);
    this.genre = genre;
    totalPrice();
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  public void totalPrice() {
    switch (genre) {
      case "new":
        setPrice(2000);
        break;
      case "comic":
        setPrice(1500);
        break;
      case "child":
        setPrice(1000);
        break;
      default:
        setPrice(500);
        break;
    }
  }
}