package org.dajo.types;

public abstract class Optional<T> {

    static public <L> Optional<L> of(final L object) {
        checkNotNull(object);
        return new Present<L>(object);
    }

    @SuppressWarnings("unchecked")
    static public <L> Optional<L> fromNullable(final L object) {
        return object != null ? new Present<L>(object) : (Optional<L>) Absent.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    static public <L> Optional<L> absent() {
        return (Optional<L>) Absent.INSTANCE;
    }

    // @CheckForNull or @Nonnull @Nullable or at some point
    static private <O> void checkNotNull(final O object) {
        if (object == null) {
            throw new NullPointerException();
        }
    }

    public abstract boolean isPresent();

    public abstract T get();

    static private final class Present<O> extends Optional<O> {
        private final O ref;
        protected Present(final O object) {
            this.ref = object;
        }
        @Override
        public boolean isPresent() {
            return true;
        }
        @Override
        public O get() {
            return ref;
        }

        @Override
        public String toString() {
            return "Present [ref=" + ref + "]";
        }
    }// class

    static private final class Absent extends Optional<Object> {
        static final Absent INSTANCE = new Absent();
        private Absent() {
        }
        @Override
        public Object get() {
            throw new IllegalStateException("Optional object is not present, get() can not be called"); //$NON-NLS-1$;
        }
        @Override
        public boolean isPresent() {
            return false;
        }

        @Override
        public String toString() {
            return "Absent []";
        }
    }// class

}// class

