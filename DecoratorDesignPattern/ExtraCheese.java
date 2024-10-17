package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
     PizzaBase pizzaBase;

    public ExtraCheese(PizzaBase pizzaBase){
        this.pizzaBase=pizzaBase; // has a reation with base pizza
    }
    @Override
    public int cost() {
        return pizzaBase.cost()+10;
    }
}
