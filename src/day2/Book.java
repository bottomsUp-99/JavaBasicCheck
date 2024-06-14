package day2;

public class Book {
    //책(Object) : 제목, 가격, 출판사, 저자, 페이지수, isbn.......
    //class : 새로운 자료형을 설계하는 도구(Modeling)
        public String title;
        public int price;
        public String company;
        public String author;
        public int totalPage;
        public String isbn;

        public void bookInfo(){
            System.out.println("야옹서점 북 정보입니다.");
            System.out.println(this.title + "\t" + this.author);
        }
        public int bookPrice(){
            int price = (int) (this.price * 0.1);
            return price;
        }
        public  void setBookPrice(int price){
            this.price = price;
        }
}