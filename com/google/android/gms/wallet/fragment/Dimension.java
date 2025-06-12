package com.google.android.gms.wallet.fragment;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Dimension {
    public static final int MATCH_PARENT = -1;
    public static final int UNIT_DIP = 1;
    public static final int UNIT_IN = 4;
    public static final int UNIT_MM = 5;
    public static final int UNIT_PT = 3;
    public static final int UNIT_PX = 0;
    public static final int UNIT_SP = 2;
    public static final int WRAP_CONTENT = -2;

    public static int zza(long v, DisplayMetrics displayMetrics0) {
        switch(((int)(v >>> 0x20))) {
            case 0: {
                return Math.round(TypedValue.applyDimension(0, Float.intBitsToFloat(((int)v)), displayMetrics0));
            }
            case 1: {
                return Math.round(TypedValue.applyDimension(1, Float.intBitsToFloat(((int)v)), displayMetrics0));
            }
            case 2: {
                return Math.round(TypedValue.applyDimension(2, Float.intBitsToFloat(((int)v)), displayMetrics0));
            }
            case 3: {
                return Math.round(TypedValue.applyDimension(3, Float.intBitsToFloat(((int)v)), displayMetrics0));
            }
            case 4: {
                return Math.round(TypedValue.applyDimension(4, Float.intBitsToFloat(((int)v)), displayMetrics0));
            }
            case 5: {
                return Math.round(TypedValue.applyDimension(5, Float.intBitsToFloat(((int)v)), displayMetrics0));
            }
            case 0x80: {
                return TypedValue.complexToDimensionPixelSize(((int)v), displayMetrics0);
            }
            case 0x81: {
                return (int)v;
            }
            default: {
                throw new IllegalStateException("Unexpected unit or type: " + ((int)(v >>> 0x20)));
            }
        }
    }

    public static long zza(int v, float f) {
        switch(v) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return Dimension.zzt(v, Float.floatToIntBits(f));
            }
            default: {
                throw new IllegalArgumentException("Unrecognized unit: " + v);
            }
        }
    }

    public static long zza(TypedValue typedValue0) {
        switch(typedValue0.type) {
            case 5: {
                return Dimension.zzt(0x80, typedValue0.data);
            }
            case 16: {
                return Dimension.zzjx(typedValue0.data);
            }
            default: {
                throw new IllegalArgumentException("Unexpected dimension type: " + typedValue0.type);
            }
        }
    }

    public static long zzjx(int v) {
        if(v < 0) {
            if(v != -2 && v != -1) {
                throw new IllegalArgumentException("Unexpected dimension value: " + v);
            }
            return Dimension.zzt(0x81, v);
        }
        return Dimension.zza(0, ((float)v));
    }

    private static long zzt(int v, int v1) {
        return ((long)v) << 0x20 | ((long)v1) & 0xFFFFFFFFL;
    }
}

