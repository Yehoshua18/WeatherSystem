package WS1.Observers;

import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observables.Sensor;

public class MonitoringScreen {
    public MonitoringScreen(Sensor ts){
        if(ts.getType().equals("temperature")){
            ts.addObserver(new MSTempObserver(this));
        }
        else if(ts.getType().equals("pressure ")){
            ts.addObserver(new MSPressObserver(this));
        }


    }
    public void displayPressure(int data) {

    }
    public void displayTemperature(int data) {

    }

}
