package org.example.exceptionHandeling;

class ExecptionExample {
    public static void main(String[] args) {
        System.out.println("Result :"+test());
    }
    private static int test(){
        try{
            System.out.println("In try");
//            throw new StackOverflowError("SOError");
            return 100;
//
        } catch(Throwable e){
            System.out.println("In catch");
            return 200;
            //throw new ArrayIndexOutOfBoundsException();
        } finally{
            System.out.println("In finally");
            //throw new RuntimeException();
            return 300;
        }
//        System.out.println("Outside try-catch");
//        return 0;
    }
}
