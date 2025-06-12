package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import java.lang.reflect.Method;

public class ProviderInstaller {
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int arg1, Intent arg2);

        void onProviderInstalled();
    }

    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static Method zzaJM;
    private static final Object zzoW;

    static {
        ProviderInstaller.zzoW = new Object();
        ProviderInstaller.zzaJM = null;
    }

    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        zzu.zzb(context, "Context must not be null");
        GooglePlayServicesUtil.zzY(context);
        Context context1 = GooglePlayServicesUtil.getRemoteContext(context);
        if(context1 == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new GooglePlayServicesNotAvailableException(8);
        }
        synchronized(ProviderInstaller.zzoW) {
            try {
                if(ProviderInstaller.zzaJM == null) {
                    ProviderInstaller.zzaD(context1);
                }
                ProviderInstaller.zzaJM.invoke(null, context1);
            }
            catch(Exception exception0) {
                Log.e("ProviderInstaller", "Failed to install provider: " + exception0.getMessage());
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener listener) {
        zzu.zzb(context, "Context must not be null");
        zzu.zzb(listener, "Listener must not be null");
        zzu.zzbY("Must be called on the UI thread");
        new AsyncTask() {
            protected Integer zzc(Void[] arr_void) {
                try {
                    ProviderInstaller.installIfNeeded(context);
                    return 0;
                }
                catch(GooglePlayServicesRepairableException googlePlayServicesRepairableException0) {
                    return googlePlayServicesRepairableException0.getConnectionStatusCode();
                }
                catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
                    return googlePlayServicesNotAvailableException0.errorCode;
                }
            }

            protected void zze(Integer integer0) {
                if(((int)integer0) == 0) {
                    listener.onProviderInstalled();
                    return;
                }
                Intent intent0 = GooglePlayServicesUtil.zzaT(((int)integer0));
                listener.onProviderInstallFailed(((int)integer0), intent0);
            }
        }.execute(new Void[0]);
    }

    private static void zzaD(Context context0) throws ClassNotFoundException, NoSuchMethodException {
        ProviderInstaller.zzaJM = context0.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", Context.class);
    }
}

