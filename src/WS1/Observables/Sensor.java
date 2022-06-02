package WS1.Observables;

public abstract class Sensor extends Observable {
    private int lastReading;
    private int interval;
    private String type;
    public String getType() {
        return type;
    }



    public Sensor(int _interval, String _type){
        interval = _interval;
        type = _type;
    }


    public abstract int read();

    public void check(){
            if(read() != lastReading);
    }
}
