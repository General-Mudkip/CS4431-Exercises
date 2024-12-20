package Exercise9_6;

public class AudioBook extends Book {
    private String playLength;
    private double fileSize;

    public AudioBook(String title, String author, int publicationYear, String playLength, double fileSize) {
        super(title, author, publicationYear);

        this.fileSize = fileSize;
        this.playLength = playLength;
    }


    @Override
    public String toString() {
        return String.format(
                "%s by %s, released in %d. Has a play length of %s and a file size of %.2fMB",
                super.getTitle(),
                super.getAuthor(),
                super.getPublicationYear(),
                this.playLength,
                this.fileSize
        );
    }
}
