package WS1.Observables;

import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemperatureSensor;

public interface StationToolkit {
    /*
    SensorImp makeTemperature();
    SensorImp makePressure();*/

    ClockImt getAlarmClock();
    Nimbus1PressureSensor makePressure();
    Nimbus1TemperatureSensor makeTemperature();

    PersistenceImp getPersistentImp();



}
