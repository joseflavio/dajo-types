package org.dajo.types.adapter;

import java.util.Collection;
import java.util.List;

import org.dajo.types.ValidatedReturn;

public class TypeAdapterUtil {

    static public <O,I> void safeAdaptCollection(final Collection<O> output, final List<I> input, final TypeAdapter<O, I> adapter) {
        for(I currentInput : input) {
            ValidatedReturn<O> result = adapter.adapt(currentInput);
            if (result != null && result.isValid() == true && result.value() != null) {
                output.add(result.value());
            }
        }
    }

}
