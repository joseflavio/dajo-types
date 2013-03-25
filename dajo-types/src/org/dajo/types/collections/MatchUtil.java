package org.dajo.types.collections;

import java.util.Collection;
import java.util.Iterator;

public final class MatchUtil {

    private MatchUtil() {
    }

    static public <T> T matchFirst(final Collection<T> collection, final MatchCriteria<T> criteria) {
        for (T t : collection) {
            if (criteria.match(t)) {
                return t;
            }
        }
        return null;
    }

    static public <T> void matchAll(final Collection<T> output, final Collection<T> input, final MatchCriteria<T> criteria) {
        for (T t : input) {
            if (criteria.match(t)) {
                output.add(t);
            }
        }
    }

    static public <T> int removeAll(final Collection<T> all, final MatchCriteria<T> criteria) {
        int c = 0;
        for (Iterator<T> iterator = all.iterator(); iterator.hasNext();) {
            T t = iterator.next();
            if (criteria.match(t)) {
                iterator.remove();
                ++c;
            }
        }
        return c;
    }

}// class
