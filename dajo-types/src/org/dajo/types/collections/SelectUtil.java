package org.dajo.types.collections;

import java.util.Collection;

public class SelectUtil {

    static public <T> T select(final Collection<T> collection, final SelectCriteria<T> criteria) {
        T selected = null;
        for (T current : collection) {
            if (selected == null) {
                selected = current;
            } else {
                if (criteria.betterSelection(current, selected)) {
                    selected = current;
                }
            }
        }// for
        return selected;
    }

}
