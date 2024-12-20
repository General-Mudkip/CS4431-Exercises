package Exercise_11_17;

import java.io.IOException;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Test");
        } catch(Exception e) {
            System.out.println("Successfully caught " + e);
        }
        try {
            throw new ExceptionB("Test");
        } catch(Exception e) {
            System.out.println("Successfully caught " + e);
        }
        try {
            throw new NullPointerException("Test");
        } catch(Exception e) {
            System.out.println("Successfully caught " + e);
        }
        try {
            throw new IOException("Test");
        } catch(Exception e) {
            System.out.println("Successfully caught " + e);
        }
    }
}
