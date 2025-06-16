package org.example.exception_handeling;

public class DOg {
    public static void main(String[] args) {
        String str = "DOG";
        str = null;
        try {
            System.out.println(str.toLowerCase());
        }catch (NullPointerException ex){
            ex.toString();
        }
    }
}