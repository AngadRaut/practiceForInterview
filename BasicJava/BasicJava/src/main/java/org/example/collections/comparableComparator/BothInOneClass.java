package org.example.collections.comparableComparator;

import java.util.Comparator;

public class BothInOneClass implements Comparable<BothInOneClass>, Comparator<BothInOneClass> {
    private int age;
    private String name;
    private Double salary;

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "BothInOneClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(BothInOneClass o) {
        return this.age-o.age;
    }

    @Override
    public int compare(BothInOneClass o1, BothInOneClass o2) {
        return 1;
    }

}
