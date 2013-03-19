package org.dajo.types.chronometer;


public final class TimedResult<R> implements HasNanosPeriod {

    private final long elapsedTimeInNanos;
    private final R result;

    public TimedResult(final R result, final long elapsedTime) {
        this.result = result;
        this.elapsedTimeInNanos = elapsedTime;
    }

    public R getResult() {
        return result;
    }

    @Override
    public double getElapsedTimeInNanos() {
        return elapsedTimeInNanos;
    }

    @Override
    public String toString() {
        double seconds = (elapsedTimeInNanos / 1000000000.0d);
        return "TimedResult [elapsedTime=" + seconds + "s, result=" + result + "]";
    }

}
