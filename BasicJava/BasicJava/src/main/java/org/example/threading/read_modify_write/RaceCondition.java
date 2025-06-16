package org.example.threading.read_modify_write;

// race condition problem in java
public class RaceCondition implements Runnable{
    int count = 0 ;
    @Override
    public void run() {
        for (int i = 0 ; i <= 5000 ; i++){
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}