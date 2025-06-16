package org.example.java8;


interface A{
    //public abstract void  a();
    default void aaa(){
        System.out.println("A");
    }
}

interface C {
   // public abstract void  b();

    default void aaa(){
        System.out.println("C");
    }

}
public class B implements C,A{


    public static void main(String[] args) {
       B b=new B();
       b.aaa();
    }


    @Override
    public void aaa() {
        A.super.aaa();
    }
}
