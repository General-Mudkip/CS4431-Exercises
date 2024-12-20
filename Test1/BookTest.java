public class BookTest {
    public static void main(String[] args) {
        System.out.println("Book tests. \n\nCorrect formats:");

        // Correct formats
        try {
            Book mortBook = new Book("Mort", "123456789ABCD", "Terry Pratchett", 1990);
            PrintBook theWayOfKingsBook = new PrintBook("The Way Of Kings", "123456789ABCD", "Brandon Sanderson", 2013, "TOR Books", 400);
            AudioBook babelBook = new AudioBook("Babel", "123456789ABCD", "R. F. Kuang", 2021, 3.2, 110, "Me");

            System.out.println(mortBook);
            System.out.println(theWayOfKingsBook);
            System.out.println(babelBook);
        } catch (Exception e) {
            // This should never be reached.
            System.out.println("Encountered an exception!");
            throw e;
        }


        /*
            Testing if the validation works correctly
         */
        System.out.println("\n\nIncorrect formats:");
        // Incorrect ISBN
        try {
            Book errorBook = new Book("Mort", "OOPS!", "Terry Pratchett", 1990);
        } catch (Exception e) {
            // This will throw an IllegalArgument Exception
            System.out.println("Encountered an exception!");
            System.out.println(e);
        }

        // Incorrect number of pages
        try {
            PrintBook errorBook = new PrintBook("The Way Of Kings", "123456789ABCD", "Brandon Sanderson", 2013, "TOR Books", 1400);
        } catch (Exception e) {
            // This will throw an IllegalArgument Exception
            System.out.println("\nEncountered an exception!");
            System.out.println(e);
        }

        // Incorrect playback length
        try {
            AudioBook errorBook = new AudioBook("Babel", "123456789ABCD", "R. F. Kuang", 2021, 3.2, 1010, "Me");
        } catch (Exception e) {
            // This will throw an IllegalArgument Exception
            System.out.println("\nEncountered an exception!");
            System.out.println(e);
        }
    }
}
