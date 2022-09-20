package task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FirstTaskLauncher {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    public static void main(String[] args) {

        scheduler.scheduleAtFixedRate(new SecondsTimerThread(), 1, 1, SECONDS);
        scheduler.scheduleAtFixedRate(new FiveSecondsTimerThread(), 5, 5, SECONDS);
    }
}
