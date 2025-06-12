package com.google.android.gms.location.places;

import android.content.Context;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.internal.zzm;

public class PlaceLikelihoodBuffer extends AbstractDataBuffer implements Result {
    public static class zza {
        static int zzgO(int v) {
            switch(v) {
                case 100: 
                case 101: 
                case 102: 
                case 103: 
                case 104: 
                case 105: {
                    return v;
                }
                default: {
                    throw new IllegalArgumentException("invalid source: " + v);
                }
            }
        }
    }

    private final Context mContext;
    private final Status zzOt;
    private final String zzazB;
    private final int zzazG;

    public PlaceLikelihoodBuffer(DataHolder dataHolder, int source, Context context) {
        super(dataHolder);
        this.mContext = context;
        this.zzOt = PlacesStatusCodes.zzgU(dataHolder.getStatusCode());
        this.zzazG = zza.zzgO(source);
        if(dataHolder.zznb() != null) {
            this.zzazB = dataHolder.zznb().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
            return;
        }
        this.zzazB = null;
    }

    public PlaceLikelihood get(int position) {
        return new zzm(this.zzWu, position, this.mContext);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }

    public CharSequence getAttributions() {
        return this.zzazB;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.getStatus()).zzg("attributions", this.zzazB).toString();
    }
}

