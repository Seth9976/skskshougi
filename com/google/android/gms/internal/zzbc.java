package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

@zzgd
public class zzbc {
    protected zzbb zza(Context context0, VersionInfoParcel versionInfoParcel0, zzhs zzhs0) {
        zzbb zzbb0 = new zzbd(context0, versionInfoParcel0);
        zzbb0.zza(new zza() {
            @Override  // com.google.android.gms.internal.zzbb$zza
            public void zzcf() {
                zzhs0.zzf(zzbb0);
            }
        });
        return zzbb0;
    }

    public Future zza(Context context0, VersionInfoParcel versionInfoParcel0, String s) {
        Future future0 = new zzhs();
        com.google.android.gms.internal.zzbc.1 zzbc$10 = new Runnable() {
            @Override
            public void run() {
                zzbc.this.zza(context0, versionInfoParcel0, ((zzhs)future0)).zzs(s);
            }
        };
        zzhl.zzGk.post(zzbc$10);
        return future0;
    }
}

