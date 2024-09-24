package DependencyInversion;

public class Main {
    public static void main(String [] args){
        Lightbulb lightBulb = new Lightbulb();
        Switch lightSwitch = new Switch(lightBulb);

        lightSwitch.flip(true);  // Output: bulb is on
        lightSwitch.flip(false);


    }
}
