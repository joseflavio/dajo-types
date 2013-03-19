package org.dajo.types.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListReverseIterator<T> implements Iterator<T>, Iterable<T> {

    static public <R> ListReverseIterator<R> getInstance(final List<R> list) {
        ListIterator<R> listIterator = list.listIterator(list.size());
        return new ListReverseIterator<R>(listIterator);
    }

    private final ListIterator<T> listIterator;

    private ListReverseIterator(final ListIterator<T> listIterator) {
        this.listIterator = listIterator;
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return listIterator.hasPrevious();
    }

    @Override
    public T next() {
        return listIterator.previous();
    }

    @Override
    public void remove() {
        listIterator.remove();
    }

}
