package org.dajo.types.stringparser;

public class ParsedContainer<T> {

    private final boolean available;

    private final T parsedValue;

    public ParsedContainer() {
        this.available = false;
        this.parsedValue = null;
    }

    public ParsedContainer(final T parsedValue) {
        this.available = true;
        this.parsedValue = parsedValue;
    }

    public T getParsedValue() {
        return parsedValue;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "ParsedContainer [available=" + available + ", parsedValue=" + parsedValue + "]";
    }

}
