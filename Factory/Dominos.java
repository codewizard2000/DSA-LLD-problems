package Factory;

abstract class Dominos {

    public void cook(){
        System.out.print("pizza is cooking");
    }

    public void items(){
        System.out.print("there is lot of pizzas");

    }

    public abstract void prepdough();// factory method depends on child class how to implement and create the object the logic

    public abstract void prepareKetchup();// factory method
}
