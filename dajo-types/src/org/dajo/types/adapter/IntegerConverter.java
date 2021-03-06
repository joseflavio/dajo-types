package org.dajo.types.adapter;

public final class IntegerConverter {

    static public int checkedLongToInt(final long l) {
        if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(l + " cannot be cast to int without changing its value."); //$NON-NLS-1$
        }
        return (int) l;
    }

    static public int safeLongToInt(final long l) {
        if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) l;
    }

}// class
