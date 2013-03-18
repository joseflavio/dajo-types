package org.dajo.types.chronometer;


public class SimpleChronometer implements HasMillisPeriod {

    private boolean started = false;
    private boolean finished = false;
    private long start = -1;
    private long end = -1;

    public void start() {
        if (started || finished) {
            throw new RuntimeException("Chronometer already started/finished.");
        }
        started = true;
        start = System.currentTimeMillis();
    }

    public void stop() {
        if (!started || finished) {
            throw new RuntimeException("Chronometer not started or already finished.");
        }
        finished = true;
        end = System.currentTimeMillis();
    }

    @Override
    public long getPeriodInMillis() {
        return end - start;
    }

}
