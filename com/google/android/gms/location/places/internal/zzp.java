package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.zzg;

public class zzp implements zzg {
    private int mIndex;
    private final String zzaAW;
    private final CharSequence zzaAX;
    private final int zzyZ;
    private final int zzza;

    public zzp(String s, int v, int v1, CharSequence charSequence0, int v2) {
        this.zzaAW = s;
        this.zzyZ = v;
        this.zzza = v1;
        this.zzaAX = charSequence0;
        this.mIndex = v2;
    }

    @Override
    public boolean equals(Object other) {
        if(other == this) {
            return true;
        }
        return other instanceof zzp ? ((zzp)other).zzyZ == this.zzyZ && ((zzp)other).zzza == this.zzza && zzt.equal(((zzp)other).zzaAW, this.zzaAW) && zzt.equal(((zzp)other).zzaAX, this.zzaAX) : false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzyZ, this.zzza, this.zzaAW, this.zzaAX});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public zzg zzuZ() [...] // Inlined contents
}

