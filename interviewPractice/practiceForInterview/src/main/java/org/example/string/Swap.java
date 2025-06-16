package org.example.string;

public class Swap {
    public static void main(String[] args) {
        // swap strings without using third variable
        String s1 = "java";
        String s2 = "programming";
        System.out.println("before swapping\ns1:"+s1+"\ns2:"+s2);
        s1 = s1+s2;
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("\nafter swapping\ns1:"+s1+"\ns2:"+s2);
    }
}
