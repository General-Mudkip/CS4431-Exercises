package TA_Studio;

public class Person {
    public String name;
    public int age;
    public String country = "unknown";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overloaded constructor
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
}
