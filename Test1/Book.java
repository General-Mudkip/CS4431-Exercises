public class Book {
    private String title;
    private String ISBN;
    private String authorName;
    private int yearOfPublication;

    public Book(String title, String ISBN, String authorName, int yearOfPublication) {
        if (ISBN.length() != 13) {
            throw new IllegalArgumentException("ISBN must be exactly 13 characters long.");
        } else {
            this.ISBN = ISBN;
        }

        this.title = title;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return String.format("%s by %s, released in %d. ISBN: %s", title, authorName, yearOfPublication, ISBN);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if (ISBN.length() != 13) {
            throw new IllegalArgumentException("ISBN must be exactly 13 characters long.");
        } else {
            this.ISBN = ISBN;
        }
    }
}
