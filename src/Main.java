import task1.FiveSecondsTimerThread;
import task1.SecondsTimerThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    public static void main(String[] args) {

        //Task 1
        scheduler.scheduleAtFixedRate(new SecondsTimerThread(), 1, 1, SECONDS);
        scheduler.scheduleAtFixedRate(new FiveSecondsTimerThread(), 5, 5, SECONDS);


    }
}
