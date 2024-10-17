package DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{
    PizzaBase pizzaBase;

    public Mushroom(PizzaBase pizzaBase){
        this.pizzaBase=pizzaBase;
    }
    @Override
    public int cost() {
        return pizzaBase.cost()+15;
    }
}
