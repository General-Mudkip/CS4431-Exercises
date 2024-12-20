package Gweetable;

import java.util.ArrayList;
import java.util.Collection;

public class TestGweetable {
    public static void main(String[] args) {
        Collection<Greetable> greetables = new ArrayList<>();
        greetables.add(new Person());
        greetables.add(new Robot());

        for (Greetable greetable: greetables) {
            greetable.greet();
        }
    }
}
