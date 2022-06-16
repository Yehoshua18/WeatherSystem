package WS1.Observables;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HiLoDataProxy implements HiLoData{
    PersistenceImp persistenceImp;
    private PersistenceImp itsPI;
    private HiLoDataImp itsImp;
    HiLoDataImp hiLoDataImp;
    String storageKey;
    String type;


    @Override
    public boolean currentReading(double current, LocalDateTime time) {
        boolean change;
        change = hiLoDataImp.currentReading(current,time);
        if(change)
            store();
        return change;
    }

    @Override
    public LocalDateTime getHighTime() {
        return itsImp.getHighTime();
    }

    @Override
    public double getHighValue() {
        return itsImp.getHighValue();
    }

    @Override
    public LocalDateTime getLowTime() {
        return itsImp.getLowTime();
    }

    @Override
    public double getLowValue() {
        return itsImp.getLowValue();
    }


    @Override
    public void newDay(double intial, LocalDateTime time) {
        store();
        hiLoDataImp.newDay(intial,time);
        calculateStorageKey(time);
        store();

    }
    private void store(){
        try{
            persistenceImp.store(storageKey, (Serializable) this);
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
    private String calculateStorageKey(LocalDateTime d){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMddyyyy");
        return(type+"HiLo"+df.format(d));
    }
}
