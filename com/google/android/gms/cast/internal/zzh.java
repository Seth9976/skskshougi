package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public abstract class zzh extends zzb {
    public zzh(GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.AbstractPendingResult
    public Result createFailedResult(Status x0) {
        return x0;
    }

    public Status zzb(Status status0) [...] // Inlined contents
}

