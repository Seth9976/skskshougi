package com.google.android.gms.maps.internal;

public final class zza {
    public static Boolean zza(byte b) {
        switch(b) {
            case 0: {
                return false;
            }
            case 1: {
                return true;
            }
            default: {
                return null;
            }
        }
    }

    public static byte zze(Boolean boolean0) {
        if(boolean0 != null) {
            return boolean0.booleanValue() ? 1 : 0;
        }
        return -1;
    }
}

