package extend1.ex;

public class Movie extends Item{
    private String director;

    private String actor;

    public Movie(String name, int price, String author, String isbn) {
        super(name, price);
        this.director = author;
        this.actor = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독 : " + director + ", 배우 : " + actor);
    }
}
