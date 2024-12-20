package Exercise_11_16;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("Hello!");
        } catch (ExceptionA e) {
            // WILL catch
            System.out.println("Caught exception A" + e);
        }

        try {
            throw new ExceptionC("Hello!");
        } catch (ExceptionB e) {
            // WILL catch
            System.out.println("Caught exception B" + e);
        }

        try {
            throw new ExceptionB("Hello!");
        } catch (ExceptionC e) {
            // WON'T catch
            System.out.println("Caught exception C" + e);
        }
    }
}
