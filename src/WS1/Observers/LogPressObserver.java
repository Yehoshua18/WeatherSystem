package WS1.Observers;

public class LogPressObserver implements Observer<Integer>{
    Log itsLog;

    public LogPressObserver(Log itsLog) {
        this.itsLog = itsLog;
    }


    @Override
    public void update(Integer data) {
        itsLog.displayPressure(data);
    }
}
