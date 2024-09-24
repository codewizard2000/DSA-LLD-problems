package Interface;

public class Cat implements Animal{
    public String name;
    public String walk;

    public Cat(String name,String walk){
        this.name=name;
        this.walk=walk;
    }
    @Override
    public void eat() {
        System.out.println("this is the way "+name+" cat eats");

    }

    @Override
    public void sleep() {
        System.out.println("this the way cat sleep");

    }

    @Override
    public void walk() {
        System.out.println("cat walks "+walk);

    }
}
