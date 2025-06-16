package org.example.collections.comparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomSortingUsingComparable {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>(Arrays.asList(
                new People("Alice", 30, 65.5),
                new People("Bob", 25, 75.0),
                new People("Charlie", 35, 80.0)
        ));
        // using sort method
//        Arrays.sort(people);
        Collections.sort(people);
        System.out.println(people);

    }
}
class People implements Comparable<People>{
    String name;
    int age;
    double weight;

    @Override
    public int compareTo(People people){
        return (people.age-this.age);
    }
    public People() {
    }

    public People(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
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
}

