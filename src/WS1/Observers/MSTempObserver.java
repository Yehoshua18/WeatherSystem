package WS1.Observers;

public class MSTempObserver implements Observer<Integer> {

    private  MonitoringScreen itsMonitoringScreen;

    public MSTempObserver(MonitoringScreen monitoringScreen){
        System.out.println("MSTempObserver was created");
        itsMonitoringScreen = monitoringScreen;
    }


    @Override
    public void update(Integer data) {
        itsMonitoringScreen.displayTemperature(data);

    }
}
