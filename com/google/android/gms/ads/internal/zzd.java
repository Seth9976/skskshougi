package com.google.android.gms.ads.internal;

import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzid;

@zzgd
public class zzd {
    public interface zza {
        void zzp(String arg1);
    }

    @zzgd
    public static class zzb implements zza {
        private final zzid zzoA;
        private final com.google.android.gms.internal.zzha.zza zzoz;

        public zzb(com.google.android.gms.internal.zzha.zza zzha$zza0, zzid zzid0) {
            this.zzoz = zzha$zza0;
            this.zzoA = zzid0;
        }

        @Override  // com.google.android.gms.ads.internal.zzd$zza
        public void zzp(String s) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("An auto-clicking creative is blocked");
            Uri.Builder uri$Builder0 = new Uri.Builder();
            uri$Builder0.scheme("https");
            uri$Builder0.path("//pagead2.googlesyndication.com/pagead/gen_204");
            uri$Builder0.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if(!TextUtils.isEmpty(s)) {
                uri$Builder0.appendQueryParameter("navigationURL", s);
            }
            if(this.zzoz != null && this.zzoz.zzFs != null && !TextUtils.isEmpty(this.zzoz.zzFs.zzCP)) {
                uri$Builder0.appendQueryParameter("debugDialog", this.zzoz.zzFs.zzCP);
            }
            zzo.zzbv().zzc(this.zzoA.getContext(), this.zzoA.zzgI().zzGG, uri$Builder0.toString());
        }
    }

    private zza zzow;
    private boolean zzox;
    private boolean zzoy;

    public zzd() {
        this.zzoy = ((Boolean)zzbz.zztI.get()).booleanValue();
    }

    public zzd(boolean z) {
        this.zzoy = z;
    }

    public void recordClick() {
        this.zzox = true;
    }

    public void zza(zza zzd$zza0) {
        this.zzow = zzd$zza0;
    }

    // 去混淆评级： 低(20)
    public boolean zzbd() {
        return !this.zzoy || this.zzox;
    }

    public void zzo(String s) {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Action was blocked because no click was detected.");
        if(this.zzow != null) {
            this.zzow.zzp(s);
        }
    }
}

