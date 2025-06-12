package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zzlu {
    private static final List zzajL;

    static {
        zzlu.zzajL = Arrays.asList(new TimeUnit[]{TimeUnit.NANOSECONDS, TimeUnit.MICROSECONDS, TimeUnit.MILLISECONDS, TimeUnit.SECONDS, TimeUnit.MINUTES, TimeUnit.HOURS, TimeUnit.DAYS});
    }

    public static long zza(long v, TimeUnit timeUnit0, TimeUnit timeUnit1) {
        return timeUnit0.convert(timeUnit1.convert(v, timeUnit0), timeUnit1);
    }

    public static boolean zza(TimeUnit timeUnit0) {
        return zzlu.zza(timeUnit0, TimeUnit.MILLISECONDS);
    }

    private static boolean zza(TimeUnit timeUnit0, TimeUnit timeUnit1) {
        return zzlu.zzajL.indexOf(timeUnit0) < zzlu.zzajL.indexOf(timeUnit1);
    }
}

