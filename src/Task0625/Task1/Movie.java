package Task0625.Task1;

public class Movie {

  String Title;
  String Genre;

  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }

  public String getGenre() {
    return Genre;
  }

  public void setGenre(String genre) {
    Genre = genre;
  }

  public void play() {
    System.out.println(this.Title + "(" + this.Genre + ")" + "상영중입니다.");
  }
}
