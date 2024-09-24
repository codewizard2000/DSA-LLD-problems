package DependencyInversion;

public class Lightbulb implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("bulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("bulb is off");
    }
}
