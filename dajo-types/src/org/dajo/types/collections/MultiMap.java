package org.dajo.types.collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MultiMap<K,E> {

    final HashMap<K, List<E>> map = new HashMap<K, List<E>>();

    public void insert(final K key, final E e) {
        List<E> list = map.get(key);
        if( list == null ) {
            list = new LinkedList<E>();
            map.put(key, list);
        }
        list.add(e);
    }

    public Set<Entry<K, List<E>>> entrySet() {
        return map.entrySet();
    }

}
