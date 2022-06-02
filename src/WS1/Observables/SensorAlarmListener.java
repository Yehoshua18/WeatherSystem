package WS1.Observables;

import WS1.Nimbus1.Nimbus1TemperatureSensor;

public class SensorAlarmListener implements AlarmListener {
    Sensor itsTemperatureSensor;

    public SensorAlarmListener(Sensor itsTemperatureSensor) {
        this.itsTemperatureSensor = itsTemperatureSensor;
    }

    @Override
    public void wakeup() {
        itsTemperatureSensor.check();
    }
}
