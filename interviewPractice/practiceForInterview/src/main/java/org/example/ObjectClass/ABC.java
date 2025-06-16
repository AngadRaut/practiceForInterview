package org.example.ObjectClass;

public class ABC {
    public static void main(String[] args) {
        Abc2 obj = new Abc2(5);
    }
}
class Abc{
    public Abc(){
        System.out.println("Abc constructor");
    }
    public void dummy(){
        System.out.println("method");
    }
}
class Abc2 extends Abc{
    public Abc2(int a){
      //  super();
        System.out.println("Abc2 constructor");
    }
}