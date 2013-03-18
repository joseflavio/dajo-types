package org.dajo.types.chronometer;

public interface DajoTask<N,R,I> {

    N getTaskId();

    R execute(I executorInput);

}
