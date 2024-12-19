package Runnable;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Thread thread = new Thread(new Run());
        thread.start();
    }
}
