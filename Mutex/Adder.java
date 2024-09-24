package Mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    public Count count;
    public Lock lock;

    public Adder(Count count,Lock lock){
        this.count=count;
        this.lock=lock;
    }

    @Override
    public Void call() {
        for(int i=0;i<=100;i++){
            lock.lock();
            count.value+=i;
            lock.unlock();
        }
        return null;

    }
}
