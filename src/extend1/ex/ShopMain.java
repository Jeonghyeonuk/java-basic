package extend1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "jeong", "12345");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");
        Album album = new Album("앨범1", 15000, "seo");

        book.print();
        movie.print();
        album.print();
        int sum = book.getPrice() + movie.getPrice() + album.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}
