package org.example.interviewQuestions.exception_overriding;

public class Child extends Parent {
    @Override
    public void add(){
        System.out.println("Child add method");
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.add();
    }
}
