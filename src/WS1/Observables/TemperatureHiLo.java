package WS1.Observables;

import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observers.Observer;

public class TemperatureHiLo implements Observer , AlarmListener {
    AlarmClock ac;
    Nimbus1TemperatureSensor temperatureSensor;
    HiLoData hd;
    @Override
    public void update(Object data) {

    }

    @Override
    public void wakeup() {

    }
}
