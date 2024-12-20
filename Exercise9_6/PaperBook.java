package Exercise9_6;

public class PaperBook extends Book {
    private String publisher;
    private String ISBN;

    public PaperBook(String title, String author, int publicationYear, String publisher, String ISBN) {
        super(title, author, publicationYear);

        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return String.format(
                "%s by %s, released in %d and published by %s. ISBN: %s",
                super.getTitle(),
                super.getAuthor(),
                super.getPublicationYear(),
                this.publisher,
                this.ISBN
        );
    }
}
