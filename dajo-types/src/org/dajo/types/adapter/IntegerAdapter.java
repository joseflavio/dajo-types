package org.dajo.types.adapter;

import org.dajo.types.Function;
import org.dajo.types.Optional;

public final class IntegerAdapter implements Function<String, Optional<Integer>> {

    @Override
    public Optional<Integer> apply(final String value) {
        try {
            int intValue = Integer.parseInt(value);
            return Optional.of(Integer.valueOf(intValue));
        } catch (NumberFormatException e) {
            return Optional.absent();
        }
    }

}// class
