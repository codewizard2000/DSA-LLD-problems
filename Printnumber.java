public class Printnumber implements Runnable {
    int x;

    Printnumber(int x){
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println("this is thread " +x+ Thread.currentThread().getName() );
    }
}
