package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {
    private Random rnd;

    public int read()
    {
        return (int) (rnd.nextInt(1050-950) + 950);
    }
}
