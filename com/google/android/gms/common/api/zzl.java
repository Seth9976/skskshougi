package com.google.android.gms.common.api;

import android.os.Looper;

public class zzl extends AbstractPendingResult {
    public zzl(Looper looper0) {
        super(looper0);
    }

    @Override  // com.google.android.gms.common.api.AbstractPendingResult
    protected Result createFailedResult(Status x0) {
        return x0;
    }

    protected Status zzb(Status status0) [...] // Inlined contents
}

