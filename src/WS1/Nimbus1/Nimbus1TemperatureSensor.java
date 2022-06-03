package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {
    private Random rnd;

    public Nimbus1TemperatureSensor(int interval, String type) {

        super(interval, type);
    }

    public Nimbus1TemperatureSensor(){
        super(700,"temperature");
        this.rnd = RandomSupplier.getRnd();
    }

    public int read()
    {
        return (int) (rnd.nextInt(40));
    }
}
