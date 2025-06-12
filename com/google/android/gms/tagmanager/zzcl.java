package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzql;
import com.google.android.gms.internal.zzqm;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

class zzcl implements Runnable {
    private final Context mContext;
    private volatile String zzaKV;
    private final String zzaKy;
    private final zzqm zzaMS;
    private final String zzaMT;
    private zzbf zzaMU;
    private volatile zzs zzaMV;
    private volatile String zzaMW;

    zzcl(Context context0, String s, zzqm zzqm0, zzs zzs0) {
        this.mContext = context0;
        this.zzaMS = zzqm0;
        this.zzaKy = s;
        this.zzaMV = zzs0;
        this.zzaMT = "/r?id=" + s;
        this.zzaKV = this.zzaMT;
        this.zzaMW = null;
    }

    public zzcl(Context context0, String s, zzs zzs0) {
        this(context0, s, new zzqm(), zzs0);
    }

    @Override
    public void run() {
        if(this.zzaMU == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        this.zzaMU.zzyv();
        this.zzzj();
    }

    void zza(zzbf zzbf0) {
        this.zzaMU = zzbf0;
    }

    void zzeB(String s) {
        zzbg.zzay(("Setting previous container version: " + s));
        this.zzaMW = s;
    }

    void zzem(String s) {
        if(s == null) {
            this.zzaKV = this.zzaMT;
            return;
        }
        zzbg.zzay(("Setting CTFE URL path: " + s));
        this.zzaKV = s;
    }

    private boolean zzzi() {
        NetworkInfo networkInfo0 = ((ConnectivityManager)this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkInfo0 == null || !networkInfo0.isConnected()) {
            zzbg.zzaB("...no network connectivity");
            return false;
        }
        return true;
    }

    private void zzzj() {
        InputStream inputStream0;
        if(!this.zzzi()) {
            this.zzaMU.zza(zza.zzaMi);
            return;
        }
        zzbg.zzaB("Start loading resource from network ...");
        String s = this.zzzk();
        try(zzql zzql0 = this.zzaMS.zzAG()) {
            try {
                inputStream0 = zzql0.zzfd(s);
            }
            catch(FileNotFoundException unused_ex) {
                zzbg.zzaC(("No data is retrieved from the given url: " + s + ". Make sure container_id: " + this.zzaKy + " is correct."));
                this.zzaMU.zza(zza.zzaMk);
                return;
            }
            catch(IOException iOException0) {
                zzbg.zzd(("Error when loading resources from url: " + s + " " + iOException0.getMessage()), iOException0);
                this.zzaMU.zza(zza.zzaMj);
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                zzqf.zzc(inputStream0, byteArrayOutputStream0);
                zzj zzaf$zzj0 = zzj.zzd(byteArrayOutputStream0.toByteArray());
                zzbg.zzaB(("Successfully loaded supplemented resource: " + zzaf$zzj0));
                if(zzaf$zzj0.zziO == null && zzaf$zzj0.zziN.length == 0) {
                    zzbg.zzaB(("No change for container: " + this.zzaKy));
                }
                this.zzaMU.zzz(zzaf$zzj0);
            }
            catch(IOException iOException1) {
                zzbg.zzd(("Error when parsing downloaded resources from url: " + s + " " + iOException1.getMessage()), iOException1);
                this.zzaMU.zza(zza.zzaMk);
                return;
            }
        }
        zzbg.zzaB("Load resource from network finished.");
    }

    // 去混淆评级： 低(25)
    String zzzk() {
        String s = this.zzaMW == null || this.zzaMW.trim().equals("") ? "https://www.googletagmanager.com" + this.zzaKV + "&v=a65833898" : "https://www.googletagmanager.com" + this.zzaKV + "&v=a65833898" + "&pv=" + this.zzaMW;
        return zzcb.zzzf().zzzg().equals(com.google.android.gms.tagmanager.zzcb.zza.zzaMK) ? s + "&gtm_debug=x" : s;
    }
}

