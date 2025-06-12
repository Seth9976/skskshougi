package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class DowngradeableSafeParcel implements SafeParcelable {
    private static final Object zzZZ;
    private static ClassLoader zzaaa;
    private static Integer zzaab;
    private boolean zzaac;

    static {
        DowngradeableSafeParcel.zzZZ = new Object();
        DowngradeableSafeParcel.zzaaa = null;
        DowngradeableSafeParcel.zzaab = null;
    }

    public DowngradeableSafeParcel() {
        this.zzaac = false;
    }

    private static boolean zza(Class class0) {
        try {
            return "SAFE_PARCELABLE_NULL_STRING".equals(class0.getField("NULL").get(null));
        }
        catch(NoSuchFieldException unused_ex) {
            return false;
        }
        catch(IllegalAccessException unused_ex) {
            return false;
        }
    }

    protected static boolean zzca(String s) {
        ClassLoader classLoader0 = DowngradeableSafeParcel.zznD();
        if(classLoader0 == null) {
            return true;
        }
        try {
            return DowngradeableSafeParcel.zza(classLoader0.loadClass(s));
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    protected static ClassLoader zznD() {
        synchronized(DowngradeableSafeParcel.zzZZ) {
        }
        return DowngradeableSafeParcel.zzaaa;
    }

    protected static Integer zznE() {
        synchronized(DowngradeableSafeParcel.zzZZ) {
        }
        return DowngradeableSafeParcel.zzaab;
    }

    protected boolean zznF() {
        return this.zzaac;
    }
}

