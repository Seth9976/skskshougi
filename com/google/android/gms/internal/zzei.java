package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzgd
public final class zzei implements MediationAdRequest {
    private final Date zzaQ;
    private final Set zzaS;
    private final boolean zzaT;
    private final Location zzaU;
    private final int zzsC;
    private final int zzye;

    public zzei(Date date0, int v, Set set0, Location location0, boolean z, int v1) {
        this.zzaQ = date0;
        this.zzsC = v;
        this.zzaS = set0;
        this.zzaU = location0;
        this.zzaT = z;
        this.zzye = v1;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public Date getBirthday() {
        return this.zzaQ;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public int getGender() {
        return this.zzsC;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public Set getKeywords() {
        return this.zzaS;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public Location getLocation() {
        return this.zzaU;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public boolean isTesting() {
        return this.zzaT;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public int taggedForChildDirectedTreatment() {
        return this.zzye;
    }
}

