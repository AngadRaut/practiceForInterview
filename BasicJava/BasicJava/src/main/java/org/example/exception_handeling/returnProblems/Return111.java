package org.example.exception_handeling.returnProblems;

public class Return111 {
    static int c;
    public static int division(int a,int b){
        try{
            c = a/b;
            return c;
        }catch (Exception e){
          //  return c;
        }finally {
          //  return c;
        }
        return 10;
    }
    public static void main(String[] args) {
        System.out.println(division(25,0));
    }
}
