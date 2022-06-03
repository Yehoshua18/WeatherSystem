package WS1.Observers;
import WS1.Observables.Trend;
import WS1.Observables.WeatherMonitoringSystem;

public class Log {
    WeatherMonitoringSystem ws;
    public void displayPressure(int data){
        System.out.println("Log: pressure = "+data + " millibars");

    }
    public void displayPressureTrend(Trend data){
        System.out.println("Log: pressure trend = "+data);

    }

    public Log(WeatherMonitoringSystem ws){
        this.ws=ws;
        System.out.println("Log was created");
        this.ws.addPressureObserver(new LogPressObserver(this));
        this.ws.addPressureTrendObserver(new LogPressTrendObserver(this));


    }
}
