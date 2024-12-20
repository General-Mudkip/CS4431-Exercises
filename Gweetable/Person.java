package Gweetable;

public class Person implements Greetable{
    @Override
    public void greet() {
        System.out.println("This is a person");
    }
}
