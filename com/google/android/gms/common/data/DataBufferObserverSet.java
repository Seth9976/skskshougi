package com.google.android.gms.common.data;

import java.util.HashSet;

public final class DataBufferObserverSet implements Observable, DataBufferObserver {
    private HashSet zzYr;

    public DataBufferObserverSet() {
        this.zzYr = new HashSet();
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver$Observable
    public void addObserver(DataBufferObserver observer) {
        this.zzYr.add(observer);
    }

    public void clear() {
        this.zzYr.clear();
    }

    public boolean hasObservers() {
        return !this.zzYr.isEmpty();
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
        for(Object object0: this.zzYr) {
            ((DataBufferObserver)object0).onDataChanged();
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int position, int count) {
        for(Object object0: this.zzYr) {
            ((DataBufferObserver)object0).onDataRangeChanged(position, count);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int position, int count) {
        for(Object object0: this.zzYr) {
            ((DataBufferObserver)object0).onDataRangeInserted(position, count);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int fromPosition, int toPosition, int count) {
        for(Object object0: this.zzYr) {
            ((DataBufferObserver)object0).onDataRangeMoved(fromPosition, toPosition, count);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int position, int count) {
        for(Object object0: this.zzYr) {
            ((DataBufferObserver)object0).onDataRangeRemoved(position, count);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver$Observable
    public void removeObserver(DataBufferObserver observer) {
        this.zzYr.remove(observer);
    }
}

