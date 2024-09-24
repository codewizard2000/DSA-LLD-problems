package Singleton;

public class Zookeeper {
    String name;


    private static Zookeeper singleInstance=null;//= new Zookeeper;



    private Zookeeper(String name){
        this.name=name;
    }
// entry point of class
    public static Zookeeper getInstance(){
        if(singleInstance==null ){
            singleInstance=new Zookeeper("rishav");
        }
        return singleInstance;
    }

    public void feed(){
        System.out.print(name+"is feeeding the animal");
    }

    public void claning(){
        System.out.print(name+"is cleaning the animal");
    }
}
