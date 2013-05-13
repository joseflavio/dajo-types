package org.dajo.types.adapter;

import java.util.Collection;
import java.util.List;

import org.dajo.types.Function;
import org.dajo.types.Optional;

public class TransformUtil {

    static public <O, I> void safeAdaptCollection(final Collection<O> output, final List<I> input, final Function<? super I, Optional<O>> adapter) {
        for(I currentInput : input) {
            Optional<O> result = adapter.apply(currentInput);
            if (result != null && result.isPresent() == true && result.get() != null) {
                output.add(result.get());
            }
        }
    }

}// class
