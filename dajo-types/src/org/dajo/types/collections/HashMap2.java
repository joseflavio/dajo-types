/**
 * @author Jose Flavio Aguilar Paulino
 */
package org.dajo.types.collections;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author Jose Flavio Aguilar Paulino
 */
public final class HashMap2<K,V> implements Map2<K,V> {

    private final HashMap<K, V> hashMap;

    public HashMap2(final int initialCapacity) {
        this.hashMap = new HashMap<K, V>(initialCapacity);
    }

    @Override
    public void remove(final K key) {
        hashMap.remove(key);
    }

    @Override
    public V get(final K key) {
        return hashMap.get(key);
    }

    @Override
    public Collection<V> values() {
        return hashMap.values();
    }
    @Override
    public void put(final K key, final V value) {
        hashMap.put(key, value);
    }

}// class
