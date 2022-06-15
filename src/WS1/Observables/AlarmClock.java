package WS1.Observables;

import java.util.ArrayList;

public class AlarmClock implements ClockListener
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();

    protected AlarmClock() {//,might be public


    }
    public AlarmClock(StationToolkit st){
        st.getAlarmClock().notifyClockListener();
    }
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }

    public void tic(){

            for(AlarmClockRecord record: itsAlarmClockRecords){
                if(record.getRemainingTime() - CLOCK_INTERVAL_MILLIS <= 0){
                    record.getItsAlarmListener().wakeup();
                    record.setRemainingTime(record.getInterval());
                }
                else
                record.decrementRemainingTime(CLOCK_INTERVAL_MILLIS);
            }
    }

    public void register(int interval, AlarmListener pal) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval,pal));
    }
    public long getTime(){

    }
    public void wakeUpEveryDay(AlarmListener alarmListener){

    }


}

