public class PrintBook extends Book {
    private String publisher;
    private int numberOfPages;

    public PrintBook(String title, String ISBN, String authorName, int yearOfPublication, String publisher, int numberOfPages) {
        super(title, ISBN, authorName, yearOfPublication);

        this.publisher = publisher;

        if (numberOfPages < 500 && numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } else {
            throw new IllegalArgumentException("Page count must be less than 500.");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s by %s, released in %d with %d pages and published by %s. ISBN: %s",
                super.getTitle(),
                super.getAuthorName(),
                super.getYearOfPublication(),
                this.numberOfPages,
                this.publisher,
                super.getISBN()
        );
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages < 500 && numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } else {
            throw new IllegalArgumentException("Page count must be less than 500.");
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
