package WS1.Observers;

public class MSTempObserver implements Observer<Integer> {

    private  MonitoringScreen itsMonitoringScreen;

    public MSTempObserver(MonitoringScreen monitoringScreen){

        itsMonitoringScreen = monitoringScreen;
    }


    @Override
    public void update(Integer data) {
        itsMonitoringScreen.displayTemperature(data);

    }
}
