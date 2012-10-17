package org.dajo.types;

public interface HashProvider<K,E> {

    K calculateHash(E e);

}
