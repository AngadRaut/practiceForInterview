package org.example.exception_handeling;

public class ExcAlreadyCaught {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch (NullPointerException e){
            e.printStackTrace();
        }/*catch (Exception e){
            e.printStackTrace();
        }*/
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}