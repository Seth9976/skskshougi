package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.List;

public abstract class zznr {
    private final zzns zzaEe;
    protected final zzno zzaEf;
    private final List zzaEg;

    protected zznr(zzns zzns0, zzlb zzlb0) {
        zzu.zzu(zzns0);
        this.zzaEe = zzns0;
        this.zzaEg = new ArrayList();
        zzno zzno0 = new zzno(this, zzlb0);
        zzno0.zzvZ();
        this.zzaEf = zzno0;
    }

    protected void zza(zzno zzno0) {
    }

    protected void zzd(zzno zzno0) {
        for(Object object0: this.zzaEg) {
            ((zznp)object0).zza(this, zzno0);
        }
    }

    public zzno zzhc() {
        zzno zzno0 = this.zzaEf.zzvP();
        this.zzd(zzno0);
        return zzno0;
    }

    protected zzns zzvX() {
        return this.zzaEe;
    }

    public zzno zzwa() {
        return this.zzaEf;
    }

    public List zzwb() {
        return this.zzaEf.zzvR();
    }
}

