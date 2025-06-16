package org.example.ObjectClass;

import java.util.Objects;

public class Emp {
    int age;
    String name;

    public Emp(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Emp() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return age == emp.age && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static void main(String[] args) {
        Emp emp = new Emp(11,"nana");
        Emp emp1 = new Emp(11,"nana");
        System.out.println(emp.equals(emp1));
    }
}