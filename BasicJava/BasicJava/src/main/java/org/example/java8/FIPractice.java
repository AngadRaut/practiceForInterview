package org.example.java8;

public class FIPractice implements B{
    public static void main(String[] args) {
        FIPractice obj = new FIPractice();
        obj.add();
        obj.add2();

    }

    @Override
    public void add() {
        System.out.println("add from child class");
    }

    @Override
    public void add2() {
        System.out.println("add2 from child class");
    }
}
@FunctionalInterface
interface A{
    default void add(){
        System.out.println("default of A");
    }
    void add2();
}
interface B extends  A{
    void add();
}
