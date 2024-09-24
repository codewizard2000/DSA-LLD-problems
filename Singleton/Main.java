package Singleton;

public class Main {
    public static void main(String[] args){
        Zookeeper zookeeper = Zookeeper.getInstance();
        zookeeper.claning();

        Dog dog = new Dog();
        dog.keeper();// both them will be having same a=objecyt address sharing
    }
}
