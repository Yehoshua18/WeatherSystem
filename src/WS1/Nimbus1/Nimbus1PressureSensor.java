package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {
    private Random rnd;

    public Nimbus1PressureSensor() {
        super(1100,"pressure");
        this.rnd = RandomSupplier.getRnd();

    }

    public Nimbus1PressureSensor(int interval, String type){
        super(interval,type);
    }

    public int read()
    {
        return (int) (rnd.nextInt(1050-950) + 950);
    }


}
