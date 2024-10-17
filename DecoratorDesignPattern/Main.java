package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args){
        PizzaBase pizza = new ExtraCheese(new MargeretaPizza());
        System.out.println(pizza.cost()); // output 110

        PizzaBase pizza1 = new Mushroom(new ExtraCheese(new MargeretaPizza()));
        System.out.print(pizza1.cost()); // use of decorater design pattern  output 125

    }
}
