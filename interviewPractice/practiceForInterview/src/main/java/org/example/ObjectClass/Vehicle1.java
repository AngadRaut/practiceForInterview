package org.example.ObjectClass;

public class Vehicle1 {
    public static void main(String[] args) {
        Bike12 b = new Bike12(5);
        b.sayhello();
    }
}
class Vehicle12{
    public Vehicle12(){
        System.out.println("vehicle12 called");
    }
   public void sayhello(){
       System.out.println("Hello");
    }
}
class Bike12 extends Vehicle12{
    public Bike12(int i){
        System.out.println("bike12 constructor");
    }
}