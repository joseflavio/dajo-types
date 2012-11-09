package org.dajo.types;

import java.util.Collection;
import java.util.List;

public class TypeAdapterUtil {

    static public <O,I> void safeAdaptCollection(final Collection<O> output, final List<I> input, final TypeAdapter<O, I> adapter) {
        for(I currentInput : input) {
            TypeAdapterResult<O> result = adapter.adapt(currentInput);
            if( result != null && result.isSuccess() == true && result.getValue() != null ) {
                output.add(result.getValue());
            }
        }
    }

}
