package org.example.exception_handeling.returnProblems;

public class ReturnValueFromTryCatchFinally1
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }

    static int methodReturningValue()
    {
        try
        {
            System.out.println(1/0);
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            return 30;
            //Now, This block may or may not return a value
            //as both try and catch blocks are returning a value
        }
    }
}
