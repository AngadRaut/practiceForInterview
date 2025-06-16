package org.example.interviewQuestions;

interface A{
    int a();
    default void a1(){
        System.out.println("A");
    }
}
interface B{
    int a();
    default void a1(){
        System.out.println("B");
    }
}
public class MultipleInheritance implements A,B{
    public static void main(String args[]){
        MultipleInheritance ob1 = new MultipleInheritance();
        ob1.a();
        ob1.a1();
    }

    @Override
    public int a() {
        System.out.println("a in child class");
        return 0;
    }

    @Override
    public void a1() {
        A.super.a1();
    }
}
