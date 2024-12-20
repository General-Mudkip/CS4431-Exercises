public class AudioBook extends Book {
    private double fileSize; // IN MEGABYTES
    private double playLength; // IN MINUTES
    private String playbackArtistName;

    public AudioBook(String title, String ISBN, String authorName, int yearOfPublication, double fileSize, double playLength, String playbackArtistName) {
        super(title, ISBN, authorName, yearOfPublication);

        // Can't have a negative file size
        if (fileSize > 0) {
            this.fileSize = fileSize;
        } else {
            throw new IllegalArgumentException("The file size must be above 0 MB.");
        }

        // playLength is given in minutes. 2 hours = 120 minutes
        if (playLength > 0 && playLength < 120) {
            this.playLength = playLength;
        } else {
            throw new IllegalArgumentException("The play length must be between 0 and 120 minutes.");
        }

        this.playbackArtistName = playbackArtistName;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        if (fileSize > 0) {
            this.fileSize = fileSize;
        } else {
            throw new IllegalArgumentException("The file size must be above 0 MB.");
        }
    }

    public double getPlayLength() {
        return playLength;
    }

    public void setPlayLength(double playLength) {
        if (playLength > 0 && playLength < 120) {
            this.playLength = playLength;
        } else {
            throw new IllegalArgumentException("The play length must be between 0 and 120 minutes.");
        }
    }

    public String getPlaybackArtistName() {
        return playbackArtistName;
    }

    public void setPlaybackArtistName(String playbackArtistName) {
        this.playbackArtistName = playbackArtistName;
    }

    @Override
    public String toString() {
        return String.format(
                "%s by %s, released in %d and narrated by %s. It is %.2f minutes long and has a file size of %.2f megabytes. ISBN: %s",
                super.getTitle(),
                super.getAuthorName(),
                super.getYearOfPublication(),
                this.playbackArtistName,
                this.playLength,
                this.fileSize,
                super.getISBN()
        );
    }
}
