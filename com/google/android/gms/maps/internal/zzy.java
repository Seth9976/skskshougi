package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class zzy {
    private static Context zzaCM;
    private static zzc zzaCN;

    private static Context getRemoteContext(Context context) {
        if(zzy.zzaCM != null) {
            return zzy.zzaCM;
        }
        zzy.zzaCM = GooglePlayServicesUtil.getRemoteContext(context);
        return zzy.zzaCM;
    }

    private static Object zza(ClassLoader classLoader0, String s) {
        try {
            return zzy.zzc(((ClassLoader)zzu.zzu(classLoader0)).loadClass(s));
        }
        catch(ClassNotFoundException unused_ex) {
            throw new IllegalStateException("Unable to find dynamic class " + s);
        }
    }

    private static zzc zzaA(Context context0) {
        Log.i("zzy", "Making Creator dynamically");
        return zza.zzcg(((IBinder)zzy.zza(zzy.getRemoteContext(context0).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl")));
    }

    public static zzc zzay(Context context0) throws GooglePlayServicesNotAvailableException {
        zzu.zzu(context0);
        if(zzy.zzaCN != null) {
            return zzy.zzaCN;
        }
        zzy.zzaz(context0);
        zzy.zzaCN = zzy.zzaA(context0);
        try {
            zzy.zzaCN.zzd(zze.zzw(zzy.getRemoteContext(context0).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            return zzy.zzaCN;
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    private static void zzaz(Context context0) throws GooglePlayServicesNotAvailableException {
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context0);
        if(v != 0) {
            throw new GooglePlayServicesNotAvailableException(v);
        }
    }

    private static Object zzc(Class class0) {
        try {
            return class0.newInstance();
        }
        catch(InstantiationException unused_ex) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + class0.getName());
        }
        catch(IllegalAccessException unused_ex) {
            throw new IllegalStateException("Unable to call the default constructor of " + class0.getName());
        }
    }

    public static boolean zzvE() [...] // Inlined contents

    private static Class zzvF() {
        try {
            return Build.VERSION.SDK_INT >= 15 ? Class.forName("com.google.android.gms.maps.internal.CreatorImpl") : Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException(classNotFoundException0);
        }
    }
}

