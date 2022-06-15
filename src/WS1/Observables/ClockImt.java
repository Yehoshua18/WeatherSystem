package WS1.Observables;

import java.util.ArrayList;

public abstract class ClockImt {

    protected static ArrayList<ClockListener> itsClockListener = new  ArrayList<ClockListener>();//maybe do it generic

    protected ClockImt(ArrayList<ClockListener> cl){
        itsClockListener = cl;
    }
    public abstract void notifyClockListener();
}
