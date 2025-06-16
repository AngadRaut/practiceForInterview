package org.example.LambdaExpression;

public class CanLambdaMdifyLocalVariable{


    public static void main(String[] args) {
        int a = 100;
        Runnable run = () -> {
            System.out.println("nana"+a);
        };
    }
}
