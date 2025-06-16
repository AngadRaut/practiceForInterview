package org.example.ObjectClass;

public class Dummy {
    public static void main(String[] args) {
        B b = new B(1);
        b.dummy();
    }
}
 class A{
    A(){
        System.out.println("A");
    }
    public void dummy(){
        System.out.println("dummy");
    }
}
class B extends A{
    B(int a){
        System.out.println("B");
    }
}