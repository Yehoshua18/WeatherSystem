package WS1.Observers;

import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observables.Sensor;
import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    WeatherMonitoringSystem ws;
    public MonitoringScreen(WeatherMonitoringSystem ws){
        this.ws=ws;
        System.out.println("MonitoringScreen was created");
        this.ws.addTemperatureObserver(new MSTempObserver(this));
        this.ws.addPressureObserver(new MSPressObserver(this));


    }
    public MonitoringScreen(){//אולי צריך למחוק קת הבנאי למעלה
         ws.theInstance().addTemperatureObserver(new MSTempObserver(this));
         ws.theInstance().addPressureObserver(new MSPressObserver(this));
  //       ws.theInstance().addTemperatureObserver(this::displayTemperature);
    //     ws.theInstance().addPressureObserver(this::displayPressure);


    }
    public void displayPressure(int data) {
        System.out.println("MonitoringScreen: pressure = "+data+" millibars");


    }
    public void displayTemperature(int data) {
        System.out.println("MonitoringScreen: temperature = "+data+" Celsius");

    }

}
