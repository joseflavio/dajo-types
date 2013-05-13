package org.dajo.types.criterias;

import org.dajo.types.collections.MatchCriteria;

public class StringStartsWithCriteria implements MatchCriteria<String> {

    private final String prefix;

    public StringStartsWithCriteria(final String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean match(final String item) {
        return item.startsWith(prefix);
    }

    @Override
    public String toString() {
        return "StringStartsWithCriteria [prefix=" + prefix + "]"; //$NON-NLS-1$
    }

}// class
