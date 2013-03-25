package org.dajo.types.collections;

import java.util.Collection;

public interface Map2<K, V> {

    void remove(K key);

    V get(K key);

    Collection<V> values();

    void put(K key, V value);

}
