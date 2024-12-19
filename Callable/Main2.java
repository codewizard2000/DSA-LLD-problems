package Callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> futures = new ArrayList<>();
        for(int i=0;i<10;i++){
            CountNumber countNumber = new CountNumber(i);
//            executorService.submit(countNumber);
            Future<Integer> future = executorService.submit(countNumber);
            futures.add(future);

        }
        for (Future<Integer> future : futures) {
            try {
                System.out.print("Result: " + future.get() + " ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
