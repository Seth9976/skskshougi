package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzgd
public final class zzhp extends zzhh {
    private final Context mContext;
    private final String zzF;
    private String zzFP;
    private final String zzqr;

    public zzhp(Context context0, String s, String s1) {
        this.zzFP = null;
        this.mContext = context0;
        this.zzqr = s;
        this.zzF = s1;
    }

    public zzhp(Context context0, String s, String s1, String s2) {
        this.mContext = context0;
        this.zzqr = s;
        this.zzF = s1;
        this.zzFP = s2;
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        try {
            zzb.zzaB(("Pinging URL: " + this.zzF));
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(this.zzF).openConnection();
            try {
                if(TextUtils.isEmpty(this.zzFP)) {
                    zzo.zzbv().zza(this.mContext, this.zzqr, true, httpURLConnection0);
                }
                else {
                    zzo.zzbv().zza(this.mContext, this.zzqr, true, httpURLConnection0, this.zzFP);
                }
                int v1 = httpURLConnection0.getResponseCode();
                if(v1 < 200 || v1 >= 300) {
                    zzb.zzaC(("Received non-success response code " + v1 + " from pinging URL: " + this.zzF));
                }
            }
            finally {
                httpURLConnection0.disconnect();
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            zzb.zzaC(("Error while parsing ping URL: " + this.zzF + ". " + indexOutOfBoundsException0.getMessage()));
        }
        catch(IOException iOException0) {
            zzb.zzaC(("Error while pinging URL: " + this.zzF + ". " + iOException0.getMessage()));
        }
        catch(RuntimeException runtimeException0) {
            zzb.zzaC(("Error while pinging URL: " + this.zzF + ". " + runtimeException0.getMessage()));
        }
    }
}

