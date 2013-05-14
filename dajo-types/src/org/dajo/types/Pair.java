package org.dajo.types;

public class Pair<A, B> {

    static public <LA, LB> Pair<LA, LB> of(final LA a, final LB b) {
        return new Pair<LA, LB>(a, b);
    }

    private final A a;
    private final B b;

    private Pair(final A a, final B b) {
        checkNotNull(a);
        checkNotNull(b);
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Pair [a=" + a + ", b=" + b + "]";
    }

    // @CheckForNull or @Nonnull @Nullable or at some point
    static private <T> void checkNotNull(final T object) {
        if (object == null) {
            throw new NullPointerException();
        }
    }

}// class
