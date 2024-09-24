package Mutex;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();
        Subtractor sub = new Subtractor(count,lock);
        Adder add = new Adder(count,lock);

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Void> a=executor.submit(add);
        Future<Void> b =executor.submit(sub);
        a.get();
        b.get();

        System.out.print(count.value);

    }




}
