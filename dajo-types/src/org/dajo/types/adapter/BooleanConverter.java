package org.dajo.types.adapter;

import org.dajo.types.Function;
import org.dajo.types.Optional;

public class BooleanConverter implements Function<Integer, Optional<Boolean>> {

    static public boolean checkedIntToBool(final int value) {
        if (value == 0) {
            return false;
        } else if (value == 1) {
            return true;
        } else {
            throw new RuntimeException("Invalid value. value=" + value); //$NON-NLS-1$
        }
    }

    @Override
    public Optional<Boolean> apply(final Integer value) {
        if (value == null) {
            return Optional.absent();
        }
        final Boolean booleanValue = Boolean.valueOf(checkedIntToBool(value.intValue()));
        return Optional.of(booleanValue);
    }

}
