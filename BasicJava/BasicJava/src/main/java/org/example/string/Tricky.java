package org.example.string;

public class Tricky {

    public static  String method(Object o){
        return "Object";
    }
    public static String method(String o){
        return "String";
    }

    public static void main(String[] args) {
        System.out.println(method(null));
    }
}