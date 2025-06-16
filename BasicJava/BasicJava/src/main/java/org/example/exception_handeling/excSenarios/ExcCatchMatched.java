package org.example.exception_handeling.excSenarios;

public class ExcCatchMatched {
    public static void main(String[] args) {
        try {
            System.out.println("try block!!");
            int b = 10/0;
        }catch (Exception exception){
            System.out.println("Catch Block!!!");
        }finally {
            System.out.println("finally Block!!!");
        }
    }
}
