package org.dajo.types;

public final class Optional<T> {

    static public <O> Optional<O> of(final O object) {
        return new Optional<O>(object);
    }

    static public <O> Optional<O> absent() {
        return new Optional<O>();
    }

    private final boolean available;
    private final T object;

    private Optional(final T object) {
        this.available = true;
        this.object = object;
    }

    private Optional() {
        this.available = false;
        this.object = null;
    }

    public boolean isPresent() {
        return available;
    }

    public T get() {
        if (available == false) {
            throw new IllegalStateException("Optional object is not present"); //$NON-NLS-1$
        }
        return object;
    }

    @Override
    public String toString() {
        return "Optional [available=" + available + ", object=" + object + "]"; //$NON-NLS-1$
    }

}// class

