package WS1.Observers;

public class MSPressObserver implements Observer<Integer> {
    MonitoringScreen itsMonitoringScreen;

    public MSPressObserver(MonitoringScreen itsMonitoringScreen) {
        System.out.println("MSPressObserver was created");

        this.itsMonitoringScreen = itsMonitoringScreen;
    }


    @Override
    public void update(Integer data) {
        itsMonitoringScreen.displayPressure(data);

    }
}
