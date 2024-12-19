package Callable;

import java.util.concurrent.Callable;

public class CallablePractice implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "this is example for callable ";
    }
}
