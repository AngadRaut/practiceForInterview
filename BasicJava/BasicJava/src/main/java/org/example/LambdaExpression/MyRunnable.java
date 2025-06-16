package org.example.LambdaExpression;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("My Runnable class!!");
    }

    public static void main(String[] args) {
        Runnable run = new MyRunnable();
        Thread t = new Thread(run);
        t.start();
        Runnable runnable = () -> System.out.println("without my runnable");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
interface A{
    default int age(){
        return 100;
    }
}