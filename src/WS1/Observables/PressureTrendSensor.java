package WS1.Observables;

public class PressureTrendSensor {
    private int a;
    private int b;
    private int c;

    public void update(int newReading){
        a = b;
        b = c;
        c = newReading;
    }

    public String getTrend(){
        String res;

        if (a<b && b<c)
            res = "Rising";

        else if(a>b && b>c)
            res = "Declining";

        else
            res = "Stable";

        return res;
    }

}
