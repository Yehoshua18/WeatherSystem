package WS1.Observables;

import WS1.Nimbus1.Nimbus1PressureSensor;

public abstract class Sensor extends Observable {
    private int lastReading;
    private int interval;
    private String type;
    public String getType() {
        return type;
    }



    public Sensor(int _interval, String _type){
        System.out.println( _type + " registered to clock");
        interval = _interval;
        type = _type;
        AlarmClock.theInstance().register(interval,new SensorAlarmListener(this));

    }


    public abstract int read();

    public void check(){
        int temp = read();
        if (lastReading != temp) {
            lastReading = temp;
            notifyObservers(lastReading);
        }
    }
}
