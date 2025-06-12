package com.google.android.gms.common.internal;

import java.util.Iterator;

public class zzs {
    private final String separator;

    private zzs(String s) {
        this.separator = s;
    }

    public final String zza(Iterable iterable0) {
        return this.zza(new StringBuilder(), iterable0).toString();
    }

    public final StringBuilder zza(StringBuilder stringBuilder0, Iterable iterable0) {
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(this.zzs(object0));
            while(iterator0.hasNext()) {
                stringBuilder0.append(this.separator);
                Object object1 = iterator0.next();
                stringBuilder0.append(this.zzs(object1));
            }
        }
        return stringBuilder0;
    }

    public static zzs zzci(String s) {
        return new zzs(s);
    }

    CharSequence zzs(Object object0) {
        return object0 instanceof CharSequence ? ((CharSequence)object0) : object0.toString();
    }
}

