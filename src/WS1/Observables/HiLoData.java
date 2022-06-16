package WS1.Observables;

import java.time.LocalDateTime;

public interface HiLoData {
    boolean currentReading(double value, LocalDateTime time);
    LocalDateTime getHighTime();
    double getHighValue();
    LocalDateTime getLowTime();
    double getLowValue();
    void newDay(double intial, LocalDateTime time);
}
