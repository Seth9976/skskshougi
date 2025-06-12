package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

public class zzab extends zzk {
    private final zzb zzaH;

    public zzab(int v, String s, zzb zzm$zzb0, zza zzm$zza0) {
        super(v, s, zzm$zza0);
        this.zzaH = zzm$zzb0;
    }

    public zzab(String s, zzb zzm$zzb0, zza zzm$zza0) {
        this(0, s, zzm$zzb0, zzm$zza0);
    }

    @Override  // com.google.android.gms.internal.zzk
    protected zzm zza(zzi zzi0) {
        try {
            String s = zzx.zza(zzi0.zzA);
            return zzm.zza(new String(zzi0.data, s), zzx.zzb(zzi0));
        }
        catch(UnsupportedEncodingException unused_ex) {
            return zzm.zza(new String(zzi0.data), zzx.zzb(zzi0));
        }
    }

    @Override  // com.google.android.gms.internal.zzk
    protected void zza(Object object0) {
        this.zzi(((String)object0));
    }

    protected void zzi(String s) {
        this.zzaH.zzb(s);
    }
}

