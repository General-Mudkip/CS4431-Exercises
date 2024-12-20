package Exercise9_6;

public class BookTests {
    public static void main(String[] args) {
        Book twok = new Book("The Way of Kings", "Brandon Sanderson", 2013);
        System.out.println(twok);

        PaperBook bale = new PaperBook("Babel", "R. F. Kuang", 2021, "Penguin", "ASDF");
        System.out.println(bale);

        AudioBook agot = new AudioBook("A Game of Thrones", "George R. R. Martin", 2000, "29 hours", 12.0);
        System.out.println(agot);
    }
}