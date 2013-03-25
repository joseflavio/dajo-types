package org.dajo.types.collections;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    private ListUtil() {
    }

    static public <T> List<List<T>> divide(final List<T> list, final int partitions) {

        List<List<T>> parts = new ArrayList<List<T>>();
        final int totalSize = list.size();
        final int pBaseSize = (totalSize / partitions);
        int pMod = totalSize % partitions;

        int i = 0;
        final int modPartSize = pBaseSize + 1;
        for (int m = 0; m < pMod; ++m) {
            parts.add(list.subList(i, Math.min(totalSize, i + modPartSize)));
            i += modPartSize;
        }

        for (; i < totalSize;) {
            parts.add(list.subList(i, Math.min(totalSize, i + pBaseSize)));
            i += pBaseSize;
        }

        return parts;
    }

    static public <T> List<List<T>> divide2(final List<T> list, final int partitions) {

        List<List<T>> parts = new ArrayList<List<T>>();
        final int totalSize = list.size();
        final int pBaseSize = (totalSize / partitions);
        int pMod = totalSize % partitions;

        for (int i = 0; i < totalSize;) {
            final int sliceSize;
            if (pMod != 0) {
                sliceSize = pBaseSize + 1;
                --pMod;
            } else {
                sliceSize = pBaseSize;
            }
            parts.add(list.subList(i, Math.min(totalSize, i + sliceSize)));
            i += sliceSize;
        }

        return parts;

    }
}
