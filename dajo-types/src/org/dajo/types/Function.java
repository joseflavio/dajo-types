package org.dajo.types;

public interface Function<I, O> {

    O apply(I input);

}
