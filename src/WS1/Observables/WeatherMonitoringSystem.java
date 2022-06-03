package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observers.Observer;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance = null;


    Nimbus1TemperatureSensor nts;
    Nimbus1PressureSensor nps;
    PressureTrendSensor pts;

    protected WeatherMonitoringSystem() {

        System.out.println("WeatherMonitoringSystem was created");
        Nimbus1Clock.theInstance();
        nps= new Nimbus1PressureSensor();
        nts=new Nimbus1TemperatureSensor();
        pts = new PressureTrendSensor();
        addPressureObserver(pts);
    }

    public void addPressureObserver(Observer<Integer> observer){
        nps.addObserver(observer);
        System.out.println(observer.getClass().getName()+" observes "+nps.getType());


    }
    public void addPressureTrendObserver(Observer<Trend> observer){
        pts.addObserver(observer);
        System.out.println(observer.getClass().getName()+" observes pressure trend");
    }
    public void addTemperatureObserver(Observer observer){
        nts.addObserver(observer);
        System.out.println(observer.getClass().getName()+" observes "+ nts.getType());

    }
    public static WeatherMonitoringSystem theInstance()
    {
        if(null==instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
}
