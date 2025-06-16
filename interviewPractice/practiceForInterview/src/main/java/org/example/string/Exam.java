package org.example.string;

public class Exam {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2= s1;
        s1 = s1 + " efg";
        System.out.println(s1);
        System.out.println(s2);
    }
}
