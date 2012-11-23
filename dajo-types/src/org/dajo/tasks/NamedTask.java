package org.dajo.tasks;

public interface NamedTask<N,R,I> {

    N getTaskName();

    R execute(I executorInput);

}
