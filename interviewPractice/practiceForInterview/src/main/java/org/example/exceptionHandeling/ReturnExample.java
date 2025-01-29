package org.example.exceptionHandeling;

public class ReturnExample {
    public static void main(String[] args) {
        System.out.println("Result :"+test());
    }
    private static int test(){
        try{
            System.out.println("In try");
            return 5;

        } catch(Exception e){
            System.out.println("In catch");
            return 6;
        } finally{
            System.out.println("In finally");
            return 10;  //finally return will be the final Return

        }
        // System.out.println("Outside try-catch");
//        return 0;
    }
}
