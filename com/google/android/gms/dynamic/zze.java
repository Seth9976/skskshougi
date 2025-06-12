package com.google.android.gms.dynamic;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class zze extends zza {
    private final Object mWrappedObject;

    private zze(Object object0) {
        this.mWrappedObject = object0;
    }

    public static Object zzn(zzd zzd0) {
        if(zzd0 instanceof zze) {
            return ((zze)zzd0).mWrappedObject;
        }
        IBinder iBinder0 = zzd0.asBinder();
        Field[] arr_field = iBinder0.getClass().getDeclaredFields();
        if(arr_field.length != 1) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        Field field0 = arr_field[0];
        if(!field0.isAccessible()) {
            field0.setAccessible(true);
            try {
                return field0.get(iBinder0);
            }
            catch(NullPointerException nullPointerException0) {
                throw new IllegalArgumentException("Binder object is null.", nullPointerException0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", illegalArgumentException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException0);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
    }

    public static zzd zzw(Object object0) {
        return new zze(object0);
    }
}

