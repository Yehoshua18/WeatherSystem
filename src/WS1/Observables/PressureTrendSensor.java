package WS1.Observables;

enum Trend{
    Rising,
    Declining,
    Stable
}

public class PressureTrendSensor {
    private int a;
    private int b;
    private int c;
    private Trend pressureState;
    private Trend lastState;


    public void update(int newReading){
        a = b;
        b = c;
        c = newReading;
    }

    public Trend calc(){
        Trend res;

        if (a<b && b<c)
            res = Trend.Rising;

        else if(a>b && b>c)
            res = Trend.Declining;

        else
            res = Trend.Stable;

        return res;
    }

}
