package Factory;

public class DelhiPizzaFactory extends PizzaFactory{
    @Override
    public Dominos createfactory() {
        return new DelhiOutlet();// concrete factory class
    }
}
