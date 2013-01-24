/**
 * @author Jose Flavio Aguilar Paulino
 */
package org.dajo.types.collections;

import java.util.Collection;

/**
 * @author Jose Flavio Aguilar Paulino
 */
public interface Map2<K,V> {

    void remove(K key);

    V get(K key);

    Collection<V> values();

    void put(K key, V value);

}
