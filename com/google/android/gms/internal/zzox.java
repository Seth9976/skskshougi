package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

class zzox implements PanoramaResult {
    private final Status zzOt;
    private final Intent zzaGA;

    public zzox(Status status0, Intent intent0) {
        this.zzOt = (Status)zzu.zzu(status0);
        this.zzaGA = intent0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    @Override  // com.google.android.gms.panorama.PanoramaApi$PanoramaResult
    public Intent getViewerIntent() {
        return this.zzaGA;
    }
}

