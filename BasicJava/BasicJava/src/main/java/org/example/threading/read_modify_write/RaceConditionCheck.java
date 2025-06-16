package org.example.threading.read_modify_write;

public class RaceConditionCheck {
    public static void main(String[] args) throws InterruptedException {
        RaceCondition raceCondition = new RaceCondition();
        Thread thread1 = new Thread(raceCondition);
        Thread thread2 = new Thread(raceCondition);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final value: "+raceCondition.getCount());
    }
}