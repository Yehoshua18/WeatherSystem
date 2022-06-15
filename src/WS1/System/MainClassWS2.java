package WS1.System;

import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1StationToolKit;
import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observables.AlarmClock;
import WS1.Observables.PressureTrendSensor;
import WS1.Observables.StationToolkit;
import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observers.Log;
import WS1.Observers.MonitoringScreen;

public class MainClassWS2
{

    // TODO: initialize the weatherStation and the UI instances (log and screen)
    public static void main(String[] args) {
        WeatherMonitoringSystem wms = WeatherMonitoringSystem.theInstance();
        MonitoringScreen ms = new MonitoringScreen();
        Log log = new Log(wms);


    }
}
