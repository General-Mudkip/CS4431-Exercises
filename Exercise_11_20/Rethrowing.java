package Exercise_11_20;

import Exercise_11_19.ValidationException;

public class Rethrowing {
    public static void someMethod() {
        try {
            someMethod2();
        } catch(Exception e) {
            throw e;
        }
    }

    public static void someMethod2() {
        throw new ValidationException("Hello!");
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            throw e;
        }
    }
}
