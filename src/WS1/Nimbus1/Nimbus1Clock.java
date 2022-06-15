package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.ClockImt;
import WS1.Observables.ClockListener;

import java.util.ArrayList;

public class Nimbus1Clock extends ClockImt // hksjadhfj
{
    public AlarmClock ac;
    protected static ClockImt instance = new Nimbus1Clock(itsClockListener);
    protected Nimbus1Clock(ArrayList<ClockListener> cl)
    {
        super(cl);
        new Thread("polling Alarm Clock Records")
        {
            public void run()
            {
                System.out.println("running clock thread ---");
                for(int i=0;i<60;i++)
                {
                    //System.out.println("Thread: " + getName() + " running");
                    cl.get(i).tic();
                    try  { Thread.sleep(ac.CLOCK_INTERVAL_MILLIS);}
                    catch (InterruptedException e)
                    { e.printStackTrace(); }
                }
            }
        }.start();
    }
    public void notifyClockListener(){
        for (ClockListener cl:itsClockListener) {
            cl.tic();
        }
    }

//    public static AlarmClock theInstance()
//    {
//        if(null==instance)
//            instance = new Nimbus1Clock();
//        return instance;
//    }
    public static ClockImt theInstance()
    {
        /*
        if(null==instance)
            instance = new Nimbus1Clock(itsClockListener);
         */
        return instance;
   }
}


