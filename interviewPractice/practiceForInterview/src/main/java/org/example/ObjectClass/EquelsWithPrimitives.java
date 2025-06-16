package org.example.ObjectClass;

public class EquelsWithPrimitives {
    public static void main(String[] args) {
        Integer a=29;
        int b=20;
        System.out.println(a.equals(b)); // false
        System.out.println();
        Integer i = null;
        System.out.println(a.equals(i));
    }
}
