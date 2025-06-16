package org.example.exception_handeling.returnProblems;

public class ReturnValueFromTryCatchFinally2 {
    public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }
    static int methodReturningValue()
    {
        try
        {
            System.out.println(10/0);
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            return 50;    //This method returns 50 not 10 or 20
        }
    }
}
