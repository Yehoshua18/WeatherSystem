package WS1.Observables;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HiLoDataImp implements HiLoData,java.io.Serializable {
    private long highTime;
    private double highValue;
    private long lowTime;
    private double lowValue;
    PersistenceImp persistenceImp;
    private String type;
    transient private String storageKey;
    transient private api.PersistentImp itsPI;

    public HiLoDataImp(StationToolkit st, String type, double init, LocalDateTime time) {
        try{
            HiLoData t =(HiLoData) itsPI.retrieve(storageKey);//use persistenceImp
            lowValue = t.getLowValue();
            lowTime = t.getLowTime();
            highValue = t.getHighValue();
            highTime = t.getHighTime();
            currentReading(init,time);
        }
        catch (RuntimeException re){
            highValue = lowValue = init;
            highTime = lowTime = time;
        }
    }

    @Override
    public boolean currentReading(double current,LocalDateTime time) {
        if(current>highValue){
            highValue = current;
            highTime = time;
           // store();
            return true;
        } else if (current<lowValue) {
            lowValue=current;
            lowTime = time;
            //store();
            return true;

        }
        return false;
    }

    @Override
    public long getHighTime() {
        return highTime;
    }

    @Override
    public double getHighValue() {
        return highValue;
    }

    @Override
    public long getLowTime() {
        return lowTime;
    }

    @Override
    public double getLowValue() {
        return lowValue;
    }

    @Override
    public void newDay(double intial, LocalDateTime time) {
        store();
        lowValue = highValue = intial;
        lowTime = highTime = time;
       // storageKey = calculateStorageKey(time);
       // store();

    }
    private void store(){
        try {
            itsPI.store(storageKey,this);
        }
        catch (IOException e){
            //log the error somehow
        }
    }
    private String calculateStorageKey(LocalDateTime d){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMddyyyy");
        return(type + "HiLo" + df.format(d));
    }
}
