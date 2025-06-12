package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzv implements DataEvent {
    private int zzSq;
    private DataItem zzaUl;

    public zzv(DataEvent dataEvent0) {
        this.zzSq = dataEvent0.getType();
        this.zzaUl = (DataItem)dataEvent0.getDataItem().freeze();
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.wearable.DataEvent
    public DataItem getDataItem() {
        return this.zzaUl;
    }

    @Override  // com.google.android.gms.wearable.DataEvent
    public int getType() {
        return this.zzSq;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        switch(this.getType()) {
            case 1: {
                return "DataEventEntity{ type=changed, dataitem=" + this.getDataItem() + " }";
            }
            case 2: {
                return "DataEventEntity{ type=deleted, dataitem=" + this.getDataItem() + " }";
            }
            default: {
                return "DataEventEntity{ type=unknown, dataitem=" + this.getDataItem() + " }";
            }
        }
    }

    public DataEvent zzBc() [...] // Inlined contents
}

