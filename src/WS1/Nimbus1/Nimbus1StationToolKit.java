package WS1.Nimbus1;

import WS1.Observables.ClockImt;
import WS1.Observables.PersistenceImp;
import WS1.Observables.StationToolkit;

public class Nimbus1StationToolKit implements StationToolkit {
    @Override
    public ClockImt getAlarmClock() {
        return Nimbus1Clock.theInstance();
    }

    @Override
    public Nimbus1PressureSensor makePressure() {
        return new Nimbus1PressureSensor();
    }

    @Override
    public Nimbus1TemperatureSensor makeTemperature() {
        return new Nimbus1TemperatureSensor();
    }

    @Override
    public PersistenceImp getPersistentImp() {
        return null;
    }
}
