package org.example.threading.check_then_act;

public class BankAccount implements Runnable{
    double amount = 677;

    @Override
    public void run() {
        if (amount >= 500){
            System.out.println("Amount Withdraw :"+amount+", of thread name "+Thread.currentThread().getName());
            amount = amount - 50;
        }
        else {
            System.out.println("Withdraw not done for:"+Thread.currentThread().getName());
        }
        System.out.println("withdrawn done final balance : "+amount);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread t1 = new Thread(bankAccount ,"t1");
        Thread t2 = new Thread(bankAccount,"t2");
        t1.start();
        t2.start();
    }
}
