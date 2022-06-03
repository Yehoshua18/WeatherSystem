package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;

public class PressureTrendSensor extends Observable<Trend> implements Observer<Integer> {
    private int a;
    private int b;
    private int c;
    private Trend pressureState;
    private Trend lastState;
    public int counter=1;


    public Trend calc(int newReading) {
        //Trend res;


        lastState=pressureState;

        a=b;
        b=c;
        c=newReading;



        if (a < b && b < c)
            pressureState = Trend.RISING;

        else if (a > b && b > c)
            pressureState = Trend.FALLING;

        else
            pressureState = Trend.STABLE;

        return pressureState;
    }


    @Override
    public void update(Integer newReading) {
        check(newReading);
    }


    public void check(Integer newReading) {
        Trend temp = calc(newReading);
        if (lastState != temp) {
            lastState = temp;
        }
        if(counter>2){
            notifyObservers(lastState);
        }
            counter++;
    }
}
