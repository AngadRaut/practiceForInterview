package org.example.passByValueOrReference;

public class CheckPremitives {
    public static void testPrimitive(int a){
        a = 1000;
        System.out.println("modified value a: "+a);
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("original value a: "+a);
        testPrimitive(a);
        System.out.println(a);
    }
}