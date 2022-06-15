package WS1.Observables;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HiLoDataProxy implements HiLoData{
    PersistenceImp persistenceImp;
    //private api.PersistentImt itsPI;
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
    public void newDay(double intial, long time) {
        store();
        hiLoDataImp.newDay(intial,time);
        calculateStorageKey(time);
        store();

    }
    private void store(){
        try{
            persistenceImp.store(storageKey,this);
        }
        catch (IOException e){
            //log the error somehow
        }
    }
    private String calculateStorageKey(LocalDateTime d){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMddyyyy");
        return(type+"HiLo"+df.format(d));
    }
}
