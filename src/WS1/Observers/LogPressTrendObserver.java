package WS1.Observers;

import WS1.Observables.Trend;

public class LogPressTrendObserver implements Observer<Trend>{
    Log itsLog;

    public LogPressTrendObserver(Log itsLog) {
        System.out.println("LogPressTrendObserver was created");

        this.itsLog = itsLog;
    }

    @Override
    public void update(Trend data) {
        itsLog.displayPressureTrend(data);
    }
}
