package ss4.baitap.StopWatch;

import java.util.Date;

public class StopWatch {
    public long startTime;
    public long endTime;

    public StopWatch() {

    }

    public long start() {
        startTime = new Date().toInstant().toEpochMilli();
        return startTime;
    }

    public long stop() {
        endTime = new Date().toInstant().toEpochMilli();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
