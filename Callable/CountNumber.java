package Callable;

import java.util.concurrent.Callable;

public class CountNumber implements Callable<Integer> {
    private int number;

    CountNumber(int number){
        this.number=number;
    }
    @Override
    public Integer call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread " + threadName + " processing number: " + number);
        return number;
    }
}
