package org.example.collections.list.emp;

public class Emp {
    private int age;
    private String name;
    private double salary;

    public Emp(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Emp() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}'+"\n";
    }
}
