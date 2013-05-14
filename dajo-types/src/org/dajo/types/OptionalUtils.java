package org.dajo.types;

public final class OptionalUtils {

    private OptionalUtils() {
    }

    static public <A, B> Optional<Pair<A, B>> pair(final Optional<A> a, final Optional<B> b) {
        if (a.isPresent() == false || b.isPresent() == false) {
            return Optional.absent();
        }
        return Optional.of(Pair.of(a.get(), b.get()));
    }

}// class
