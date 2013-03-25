package org.dajo.types.collections;

public interface SelectCriteria<T> {

    /*
     * Should return true if 'current' is a better selection than 'selected'
     */
    boolean betterSelection(T current, T selected);

}
