package org.example.ObjectClass;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle Constructor called");
    }

    void sayHello() {
        System.out.println("Hello");
    }
}

class Bike extends Vehicle {
    Bike(int i) {
        System.out.println("Bike Constructor called");
    }
}

public class Test {
    public static void main(String[] args) {
        Bike b = new Bike(5);  // Creating a Bike object
        b.sayHello();          // Calling the method from Vehicle
    }
}

