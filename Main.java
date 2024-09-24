import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i=0;i<=10;i++){
            Printnumber number = new Printnumber(i);
            service.submit(number);

        }
    }
}
