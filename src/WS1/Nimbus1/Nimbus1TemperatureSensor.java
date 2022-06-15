package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;
import WS1.Observables.TemperatureImt;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor implements TemperatureImt {
    private Random rnd;
    private int interval;
    private int lastReading;

//    public Nimbus1TemperatureSensor(int interval, String type) {
//
//        super(interval, type);
//    }


    public Nimbus1TemperatureSensor(int _interval,String _type) {
        super(_interval, _type);
        this.rnd = rnd;
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
