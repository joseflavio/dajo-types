package org.dajo.types;

public interface HashProvider<H, I> {

    H hash(I e);

}
