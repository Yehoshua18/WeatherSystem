package WS1.Observables;

public class AlarmClockRecord {
    

    private int interval;
    private int remainingTime;
    AlarmListener itsAlarmListener;
    public AlarmClockRecord(int interval,AlarmListener itsAlarmListener) {
        this.itsAlarmListener=itsAlarmListener;
        this.remainingTime=this.interval=interval;
    }


    public AlarmListener getItsAlarmListener() {
        return itsAlarmListener;
    }
   
    public int getInterval() {
        return interval;
    }


    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public void decrementRemainingTime(int clock_interval_millis) {
        remainingTime=remainingTime-clock_interval_millis;
    }
}
