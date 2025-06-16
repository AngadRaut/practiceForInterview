package org.example.oops;

abstract class Vehicle{
    abstract void speed();
}
interface Machine{
    default void speed(){
        System.out.println("Machine Speed!!");
    }
}
class Car extends Vehicle implements Machine{

    @Override
    public void speed() {
//        Machine.super.speed();
        System.out.println("Car Speed!!!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
    }
}
