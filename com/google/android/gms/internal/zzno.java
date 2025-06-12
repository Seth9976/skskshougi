package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzno {
    private final zznr zzaDU;
    private boolean zzaDV;
    private long zzaDW;
    private long zzaDX;
    private long zzaDY;
    private long zzaDZ;
    private long zzaEa;
    private boolean zzaEb;
    private final Map zzaEc;
    private final List zzaEd;
    private final zzlb zzpw;

    zzno(zzno zzno0) {
        this.zzaDU = zzno0.zzaDU;
        this.zzpw = zzno0.zzpw;
        this.zzaDW = zzno0.zzaDW;
        this.zzaDX = zzno0.zzaDX;
        this.zzaDY = zzno0.zzaDY;
        this.zzaDZ = zzno0.zzaDZ;
        this.zzaEa = zzno0.zzaEa;
        this.zzaEd = new ArrayList(zzno0.zzaEd);
        this.zzaEc = new HashMap(zzno0.zzaEc.size());
        for(Object object0: zzno0.zzaEc.entrySet()) {
            zznq zznq0 = zzno.zzf(((Class)((Map.Entry)object0).getKey()));
            ((zznq)((Map.Entry)object0).getValue()).zza(zznq0);
            Object object1 = ((Map.Entry)object0).getKey();
            this.zzaEc.put(object1, zznq0);
        }
    }

    zzno(zznr zznr0, zzlb zzlb0) {
        zzu.zzu(zznr0);
        zzu.zzu(zzlb0);
        this.zzaDU = zznr0;
        this.zzpw = zzlb0;
        this.zzaDZ = 1800000L;
        this.zzaEa = 3024000000L;
        this.zzaEc = new HashMap();
        this.zzaEd = new ArrayList();
    }

    public void zzL(long v) {
        this.zzaDX = v;
    }

    public void zzb(zznq zznq0) {
        zzu.zzu(zznq0);
        Class class0 = zznq0.getClass();
        if(class0.getSuperclass() != zznq.class) {
            throw new IllegalArgumentException();
        }
        zznq0.zza(this.zze(class0));
    }

    public zznq zzd(Class class0) {
        return (zznq)this.zzaEc.get(class0);
    }

    public zznq zze(Class class0) {
        zznq zznq0 = (zznq)this.zzaEc.get(class0);
        if(zznq0 == null) {
            zznq0 = zzno.zzf(class0);
            this.zzaEc.put(class0, zznq0);
        }
        return zznq0;
    }

    private static zznq zzf(Class class0) {
        try {
            return (zznq)class0.newInstance();
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalArgumentException("dataType doesn\'t have default constructor", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalArgumentException("dataType default constructor is not accessible", illegalAccessException0);
        }
    }

    public zzno zzvP() {
        return new zzno(this);
    }

    public Collection zzvQ() {
        return this.zzaEc.values();
    }

    public List zzvR() {
        return this.zzaEd;
    }

    public long zzvS() {
        return this.zzaDW;
    }

    public void zzvT() {
        this.zzvX().zze(this);
    }

    public boolean zzvU() {
        return this.zzaDV;
    }

    void zzvV() {
        this.zzaDY = this.zzpw.elapsedRealtime();
        this.zzaDW = this.zzaDX == 0L ? this.zzpw.currentTimeMillis() : this.zzaDX;
        this.zzaDV = true;
    }

    zznr zzvW() {
        return this.zzaDU;
    }

    zzns zzvX() {
        return this.zzaDU.zzvX();
    }

    boolean zzvY() {
        return this.zzaEb;
    }

    void zzvZ() {
        this.zzaEb = true;
    }
}

