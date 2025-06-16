package org.example.interviewQuestions.exception_overriding;

public class Parent {
    public void add() throws Exception{
        System.out.println("parent add method");
    }
    public static void main(String[] args) throws Exception {
        Parent p = new Parent();
        p.add();
    }
}