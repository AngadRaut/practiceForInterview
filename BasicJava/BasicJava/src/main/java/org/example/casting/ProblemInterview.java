package org.example.casting;

class A {
    public Object show() {
        return "A";
    }
}

class B extends A {
    public String show() {
        return "B";
    }
}

public class ProblemInterview {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.show());
    }
}
