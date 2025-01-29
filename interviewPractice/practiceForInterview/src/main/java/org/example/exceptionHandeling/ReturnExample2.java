package org.example.exceptionHandeling;

public class ReturnExample2 {
    public static void main(String[] args) {
        System.out.println(add());
    }
    public static int add(){
        try{
            System.out.println("inside try block");
            return 100;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("inside catch block");
        }
        finally {
            System.out.println("inside finally block");
        }
        return 200;
    }
}
