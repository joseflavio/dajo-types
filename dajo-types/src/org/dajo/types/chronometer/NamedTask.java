package org.dajo.types.chronometer;

public interface NamedTask<N,R,I> {

    N getTaskName();

    R execute(I executorInput);

}
