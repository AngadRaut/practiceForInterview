package org.example.exception_handeling.excSenarios;

public class NoException {
    public static void main(String[] args) {
        try {
            System.out.println("try block!!");
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Catch Block!!!");
        }finally {
            System.out.println("finally Block!!!");
        }
    }
}