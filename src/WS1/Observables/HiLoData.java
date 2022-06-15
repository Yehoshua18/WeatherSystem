package WS1.Observables;

public interface HiLoData {
    void currentReading(int value);
    long getHighTime();
    double getHighValue();
    long getLowTime();
    double getLowValue();
    void newDay(double intial,long time);
}
