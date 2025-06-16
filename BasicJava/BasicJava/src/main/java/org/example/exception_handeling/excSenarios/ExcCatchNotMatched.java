package org.example.exception_handeling.excSenarios;

public class ExcCatchNotMatched {
    public static void main(String[] args) {
        try {
            System.out.println("try block!!");
            int a = 10/0;
        }catch (NullPointerException exception){
            exception.printStackTrace();
            System.out.println("Catch Block!!!");
        }finally {
            System.out.println("finally Block!!!");
        }
    }
}
