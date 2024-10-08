package Factory;

public class PizzaShop {
    private PizzaFactory pizzafactory;

    public PizzaShop(PizzaFactory pizzafactory){
        this.pizzafactory=pizzafactory;
    }

    public void createpizza(){
        Dominos dominos = pizzafactory.createfactory();
        dominos.prepdough();
        dominos.prepareKetchup();

    }
}
