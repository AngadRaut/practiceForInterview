package org.example.coupling;

class A{
    int a = 100;
    static  int b = 200;
    public static void add(){
        System.out.println("parent class static method");
    }
    public  void add1(){
        System.out.println("parent class npn static method");
    }
}
public class Encapsulation extends A{
    int a = 300;
    static  int b = 400;

    @Override
    public void add1() {
        System.out.println("child class non static method");;
    }
    public static void add(){
        System.out.println("child class static method");
    }

    public static void main(String[] args) {
        A a = new Encapsulation();
        System.out.println(a.a+" "+a.b);
        a.add1();
        a.add();
    }
}
