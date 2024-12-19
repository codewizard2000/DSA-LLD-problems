package Callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallablePractice callablePractice = new CallablePractice();
        Future<String> future = executorService.submit(callablePractice);
        try{
            String result  = future.get();
            System.out.print(result);
        }catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }
}
