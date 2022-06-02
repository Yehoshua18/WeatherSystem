package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;

public class PressureTrendSensor extends Observable implements Observer<Trend> {
    private int a;
    private int b;
    private int c;
    private Trend pressureState;
    private Trend lastState;

//    public PressureTrendSensor(ArrayList<Observer> itsObservers) {
//        super(itsObservers);
//    }



    public Trend calc() {
        Trend res;

        if (a < b && b < c)
            res = Trend.Rising;

        else if (a > b && b > c)
            res = Trend.Declining;

        else
            res = Trend.Stable;

        return res;
    }


    @Override
    public void update(Trend newReading) {
//        a = b;
//        b = c;
//        c = newReading;
    }

    public void check() {
        Trend temp = calc();
        if (lastState != temp) {
            lastState = temp;
            notifyObservers(lastState);
        }
    }
}
