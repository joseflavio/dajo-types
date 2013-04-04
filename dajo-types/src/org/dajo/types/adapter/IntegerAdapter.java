package org.dajo.types.adapter;

import org.dajo.types.ValidatedReturn;

public final class IntegerAdapter implements TypeAdapter<Integer, String> {

    @Override
    public ValidatedReturn<Integer> adapt(final String value) {
        try {
            int intValue = Integer.parseInt(value);
            return new ValidatedReturn<Integer>(Integer.valueOf(intValue));
        } catch (NumberFormatException e) {
            return new ValidatedReturn<Integer>();
        }
    }

}// class
