package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;

public abstract class zzg {
    public static class zza extends Exception {
        public zza(String s) {
            super(s);
        }

        public zza(String s, Throwable throwable0) {
            super(s, throwable0);
        }
    }

    private final String zzaju;
    private Object zzajv;

    protected zzg(String s) {
        this.zzaju = s;
    }

    protected final Object zzak(Context context0) throws zza {
        if(this.zzajv == null) {
            zzu.zzu(context0);
            Context context1 = GooglePlayServicesUtil.getRemoteContext(context0);
            if(context1 == null) {
                throw new zza("Could not get remote context.");
            }
            ClassLoader classLoader0 = context1.getClassLoader();
            try {
                this.zzajv = this.zzd(((IBinder)classLoader0.loadClass(this.zzaju).newInstance()));
                return this.zzajv;
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new zza("Could not load creator class.", classNotFoundException0);
            }
            catch(InstantiationException instantiationException0) {
                throw new zza("Could not instantiate creator.", instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new zza("Could not access creator.", illegalAccessException0);
            }
        }
        return this.zzajv;
    }

    protected abstract Object zzd(IBinder arg1);
}

