public class TaskMain {
    public static void main(String[] args){
        Task T = new Task();
        Thread m = new Thread(T);
        m.start();
    }
}
