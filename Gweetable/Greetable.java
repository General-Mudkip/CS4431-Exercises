package Gweetable;

public interface Greetable {
    default void greet() {
        System.out.println("This is Greetable");
    }
}
