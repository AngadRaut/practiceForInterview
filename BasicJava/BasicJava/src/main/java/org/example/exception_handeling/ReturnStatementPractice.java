package org.example.exception_handeling;

public class ReturnStatementPractice {
    public static int value(){
        try {
            System.out.println(10/1);
            return 20;
        }catch (Exception e){
            return 30;
        }
        finally {
            return 40;
        }
       // return 10;
    }
    public static void main(String[] args) {
        System.out.println(value());
    }
}
