package org.example.ObjectClass;

final class Immutable{
    private int age;
    private String name;

    public Immutable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class ImmutableClass {
    public static void main(String[] args) {

    }
}
