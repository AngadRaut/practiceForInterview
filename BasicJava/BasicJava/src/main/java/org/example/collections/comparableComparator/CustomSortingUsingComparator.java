package org.example.collections.comparableComparator;

import java.util.*;

public class CustomSortingUsingComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 30, 65.5),
                new Person("Bob", 25, 75.0),
                new Person("Charlie", 35, 80.0)
        ));
        Collections.sort(people,new PersonWeightComparator());
        System.out.println(people);
    }
}
class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1,Person p2){
        return p1.getName().compareTo(p2.getName());
    }
}
class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1,Person p2){
        return p1.getAge()-p2.getAge();
    }
}
class PersonWeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1,Person p2){
        return (int) -(p1.getWeight()-p2.getWeight());
    }
}
class Person{
    String name;
    int age;
    double weight;

    public Person() {
    }

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
