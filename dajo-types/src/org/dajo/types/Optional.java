package org.dajo.types;

public abstract class Optional<T> {

    static public <O> Optional<O> of(final O object) {
        checkNotNull(object);
        return new Present<O>(object);
    }

    @SuppressWarnings("unchecked")
    static public <O> Optional<O> fromNullable(final O object) {
        return object != null ? new Present<O>(object) : (Optional<O>) Absent.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    static public <O> Optional<O> absent() {
        return (Optional<O>) Absent.INSTANCE;
    }

    // @CheckForNull or @Nonnull @Nullable or at some point
    static private <T> void checkNotNull(final T object) {
        if (object == null) {
            throw new NullPointerException();
        }
    }

    public abstract boolean isPresent();

    public abstract T get();

    static private final class Present<T> extends Optional<T> {
        private final T object;
        protected Present(final T object) {
            this.object = object;
        }
        @Override
        public boolean isPresent() {
            return true;
        }
        @Override
        public T get() {
            return object;
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
    }// class

}// class

