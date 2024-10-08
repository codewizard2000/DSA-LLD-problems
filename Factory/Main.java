package Factory;

public class Main {
    public static void main(String[] args){
        PizzaShop pizza = new PizzaShop(new DelhiPizzaFactory());
        pizza.createpizza();

    }
}
