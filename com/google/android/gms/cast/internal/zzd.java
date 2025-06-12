package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.io.IOException;

public abstract class zzd {
    protected final zzl zzUi;
    private final String zzUj;
    private zzn zzUk;

    protected zzd(String s, String s1, String s2) {
        zzf.zzbD(s);
        this.zzUj = s;
        this.zzUi = new zzl(s1);
        this.setSessionLabel(s2);
    }

    public final String getNamespace() {
        return this.zzUj;
    }

    public void setSessionLabel(String sessionLabel) {
        if(!TextUtils.isEmpty(sessionLabel)) {
            this.zzUi.zzbJ(sessionLabel);
        }
    }

    public final void zza(zzn zzn0) {
        this.zzUk = zzn0;
        if(this.zzUk == null) {
            this.zzlJ();
        }
    }

    protected final void zza(String s, long v, String s1) throws IOException {
        this.zzUi.zza("Sending text message: %s to: %s", new Object[]{s, s1});
        this.zzUk.zza(this.zzUj, s, v, s1);
    }

    public void zzb(long v, int v1) {
    }

    public void zzbB(String s) {
    }

    public void zzlJ() {
    }

    protected final long zzlK() {
        return this.zzUk.zzlu();
    }
}

