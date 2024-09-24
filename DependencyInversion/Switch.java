package DependencyInversion;

public class Switch {
    private Lightbulb light;

    public Switch(Lightbulb light) {
        this.light = light;
    }

    public void flip(boolean on) {
        if (on) {
            light.turnOn();
        } else {
            light.turnOff();
        }
    }
}
