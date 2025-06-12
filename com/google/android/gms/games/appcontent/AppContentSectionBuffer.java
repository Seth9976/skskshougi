package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import java.util.ArrayList;

public final class AppContentSectionBuffer extends zzf {
    private final ArrayList zzaoD;

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public void release() {
        super.release();
        int v = this.zzaoD.size();
        for(int v1 = 1; v1 < v; ++v1) {
            DataHolder dataHolder0 = (DataHolder)this.zzaoD.get(v1);
            if(dataHolder0 != null) {
                dataHolder0.close();
            }
        }
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzm(v, v1);
    }

    protected AppContentSection zzm(int v, int v1) {
        return new AppContentSectionRef(this.zzaoD, v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "section_id";
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zznk() {
        return "card_id";
    }
}

