package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class zzm extends zzt implements PlaceLikelihood {
    private final Context mContext;

    public zzm(DataHolder dataHolder0, int v, Context context0) {
        super(dataHolder0, v);
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzuY();
    }

    @Override  // com.google.android.gms.location.places.PlaceLikelihood
    public float getLikelihood() {
        return this.zzb("place_likelihood", -1.0f);
    }

    @Override  // com.google.android.gms.location.places.PlaceLikelihood
    public Place getPlace() {
        return new zzr(this.zzWu, this.zzYs, this.mContext);
    }

    public PlaceLikelihood zzuY() {
        return PlaceLikelihoodEntity.zza(((PlaceImpl)this.getPlace().freeze()), this.getLikelihood());
    }
}

