package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.zzg;

public class zzq extends zzt implements zzg {
    private final String zzaAW;

    public zzq(DataHolder dataHolder0, int v) {
        super(dataHolder0, v);
        this.zzaAW = this.getString("photo_fife_url");
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzuZ();
    }

    public CharSequence getAttributions() {
        return this.zzB("photo_attributions", null);
    }

    public int getMaxHeight() {
        return this.zzz("photo_max_height", 0);
    }

    public int getMaxWidth() {
        return this.zzz("photo_max_width", 0);
    }

    public zzg zzuZ() {
        int v = this.getMaxWidth();
        int v1 = this.getMaxHeight();
        CharSequence charSequence0 = this.getAttributions();
        return new zzp(this.zzaAW, v, v1, charSequence0, this.zzYs);
    }
}

