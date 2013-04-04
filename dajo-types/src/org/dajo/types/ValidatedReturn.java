package org.dajo.types;

public class ValidatedReturn<T> {

    private final boolean valid;

    private final T value;

    public ValidatedReturn(final T value) {
        this.valid = true;
        this.value = value;
    }

    public ValidatedReturn() {
        this.valid = false;
        this.value = null;
    }

    public T value() {
        if (valid == false) {
            throw new RuntimeException("Invalid Value.");
        }
        return value;
    }

    public boolean isValid() {
        return valid;
    }

}
