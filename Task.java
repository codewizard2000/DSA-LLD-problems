public class Task implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("this is number"+i+Thread.currentThread().getName());
        }
    }
}
