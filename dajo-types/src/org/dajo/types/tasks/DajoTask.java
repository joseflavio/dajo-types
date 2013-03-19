package org.dajo.types.tasks;

public interface DajoTask<N,R,I> {

    N getTaskId();

    R execute(I executorInput);

}
