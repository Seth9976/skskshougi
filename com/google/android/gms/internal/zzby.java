package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.GooglePlayServicesUtil;

@zzgd
public class zzby {
    private boolean zzpb;
    private final Object zzqt;
    private SharedPreferences zztB;

    public zzby() {
        this.zzqt = new Object();
        this.zzpb = false;
        this.zztB = null;
    }

    public Object zzc(zzbv zzbv0) {
        synchronized(this.zzqt) {
            if(!this.zzpb) {
                return zzbv0.zzcY();
            }
        }
        return zzbv0.zza(this.zztB);
    }

    public void zzw(Context context0) {
        synchronized(this.zzqt) {
            if(this.zzpb) {
                return;
            }
            Context context1 = GooglePlayServicesUtil.getRemoteContext(context0);
            if(context1 == null) {
                return;
            }
            this.zztB = zzo.zzbC().zzv(context1);
            this.zzpb = true;
        }
    }
}

