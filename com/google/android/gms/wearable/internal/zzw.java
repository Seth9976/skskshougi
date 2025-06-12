package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class zzw extends zzc implements DataEvent {
    private final int zzaoG;

    public zzw(DataHolder dataHolder0, int v, int v1) {
        super(dataHolder0, v);
        this.zzaoG = v1;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzBc();
    }

    @Override  // com.google.android.gms.wearable.DataEvent
    public DataItem getDataItem() {
        return new zzac(this.zzWu, this.zzYs, this.zzaoG);
    }

    @Override  // com.google.android.gms.wearable.DataEvent
    public int getType() {
        return this.getInteger("event_type");
    }

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        switch(this.getType()) {
            case 1: {
                return "DataEventRef{ type=changed, dataitem=" + this.getDataItem() + " }";
            }
            case 2: {
                return "DataEventRef{ type=deleted, dataitem=" + this.getDataItem() + " }";
            }
            default: {
                return "DataEventRef{ type=unknown, dataitem=" + this.getDataItem() + " }";
            }
        }
    }

    public DataEvent zzBc() {
        return new zzv(this);
    }
}

