package Gweetable;

public class Robot implements Greetable {
    @Override
    public void greet() {
        System.out.println("This is a robot");
        Greetable.super.greet();
    }
}
