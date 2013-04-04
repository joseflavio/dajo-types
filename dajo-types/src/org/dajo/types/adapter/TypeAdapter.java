package org.dajo.types.adapter;

import org.dajo.types.ValidatedReturn;

public interface TypeAdapter<T, K> {

    ValidatedReturn<T> adapt(K value);

}
