package com.google.android.gms.internal;

import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;

@zzgd
public final class zzik extends zzii {
    public zzik(zzid zzid0) {
        super(zzid0);
    }

    @Override  // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int requestedOrientation, WebChromeClient.CustomViewCallback customViewCallback) {
        this.zza(view, requestedOrientation, customViewCallback);
    }
}

