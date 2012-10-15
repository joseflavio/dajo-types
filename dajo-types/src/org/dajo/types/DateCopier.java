package org.dajo.types;

import java.util.Date;

public class DateCopier {

    static public java.util.Date copy(final Date date) {
        return date != null ? new Date(date.getTime()) : null;
    }

}
