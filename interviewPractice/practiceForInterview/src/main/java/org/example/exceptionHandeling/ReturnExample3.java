package org.example.exceptionHandeling;

public class ReturnExample3 {
    public static void main(String[] args) {
        System.out.println("ans:"+methodReturningValue());
    }
    static int methodReturningValue()
    {
        int s = 100;
        try
        {
             s = s+100;
            return s;
        }
        catch (Exception e)
        {
            s = s + 200;
            return s;
        }
        finally
        {
            s = s + 300;
            return s;
        }
    }
}
