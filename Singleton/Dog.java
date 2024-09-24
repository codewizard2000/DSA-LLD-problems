package Singleton;

public class Dog {
    public void keeper(){
        Zookeeper zookeeper = Zookeeper.getInstance();
        zookeeper.feed();
    }
}
