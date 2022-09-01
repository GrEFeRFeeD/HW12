package task1;

public class SecondsTimerThread extends Thread{

    private Long seconds = 1L;

    @Override
    public void run() {
        System.out.println(seconds + " seconds program is running...");
        seconds++;
    }
}
