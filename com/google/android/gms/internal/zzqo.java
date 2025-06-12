package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class zzqo implements Runnable {
    private final Context mContext;
    private final zzqm zzaMS;
    private final zzqd zzaPU;
    private final zzqn zzaQb;
    private final zzqi zzaQc;

    public zzqo(Context context0, zzqd zzqd0, zzqn zzqn0) {
        this(context0, zzqd0, zzqn0, new zzqm(), new zzqi());
    }

    zzqo(Context context0, zzqd zzqd0, zzqn zzqn0, zzqm zzqm0, zzqi zzqi0) {
        zzu.zzu(context0);
        zzu.zzu(zzqn0);
        this.mContext = context0;
        this.zzaPU = zzqd0;
        this.zzaQb = zzqn0;
        this.zzaMS = zzqm0;
        this.zzaQc = zzqi0;
    }

    public zzqo(Context context0, zzqd zzqd0, zzqn zzqn0, String s) {
        this(context0, zzqd0, zzqn0, new zzqm(), new zzqi());
        this.zzaQc.zzeU(s);
    }

    @Override
    public void run() {
        this.zzeH();
    }

    boolean zzAI() {
        if(!this.zzba("android.permission.INTERNET")) {
            zzbg.zzaz("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
        if(!this.zzba("android.permission.ACCESS_NETWORK_STATE")) {
            zzbg.zzaz("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
        NetworkInfo networkInfo0 = ((ConnectivityManager)this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkInfo0 == null || !networkInfo0.isConnected()) {
            zzbg.zzaC("NetworkLoader: No network connectivity - Offline");
            return false;
        }
        return true;
    }

    boolean zzba(String s) {
        return this.mContext.getPackageManager().checkPermission(s, "org.dyndns.vivi.SkskShogi") == 0;
    }

    void zzeH() {
        InputStream inputStream0;
        if(!this.zzAI()) {
            this.zzaQb.zza(zza.zzaPW);
            return;
        }
        zzbg.zzaB("NetworkLoader: Starting to load resource from Network.");
        try(zzql zzql0 = this.zzaMS.zzAG()) {
            String s = this.zzaQc.zzt(this.zzaPU.zzAf());
            try {
                inputStream0 = zzql0.zzfd(s);
            }
            catch(FileNotFoundException unused_ex) {
                zzbg.zzaz(("NetworkLoader: No data is retrieved from the given url: " + s));
                this.zzaQb.zza(zza.zzaPY);
                return;
            }
            catch(IOException iOException0) {
                zzbg.zzb(("NetworkLoader: Error when loading resource from url: " + s + " " + iOException0.getMessage()), iOException0);
                this.zzaQb.zza(zza.zzaPX);
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                zzlg.zza(inputStream0, byteArrayOutputStream0);
                byte[] arr_b = byteArrayOutputStream0.toByteArray();
                this.zzaQb.zzu(arr_b);
            }
            catch(IOException iOException1) {
                zzbg.zzb(("NetworkLoader: Error when parsing downloaded resources from url: " + s + " " + iOException1.getMessage()), iOException1);
                this.zzaQb.zza(zza.zzaPY);
                return;
            }
        }
        zzbg.zzaB("NetworkLoader: Resource loaded.");
    }
}

