package org.example.ObjectClass;

public class TestNullObject {
    public static void add(){
        System.out.println("static method add");
    }
    public void dum(){
        System.out.println("non static method dum");
    }
    public static void main(String[] args) {
        TestNullObject object = new TestNullObject();
        object = null;
        object.add();
        object.dum();
    }
}
