package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

class zzib extends zzic implements ViewTreeObserver.OnScrollChangedListener {
    private final WeakReference zzGZ;

    public zzib(View view0, ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0) {
        super(view0);
        this.zzGZ = new WeakReference(viewTreeObserver$OnScrollChangedListener0);
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0 = (ViewTreeObserver.OnScrollChangedListener)this.zzGZ.get();
        if(viewTreeObserver$OnScrollChangedListener0 != null) {
            viewTreeObserver$OnScrollChangedListener0.onScrollChanged();
            return;
        }
        this.detach();
    }

    @Override  // com.google.android.gms.internal.zzic
    protected void zza(ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.addOnScrollChangedListener(this);
    }

    @Override  // com.google.android.gms.internal.zzic
    protected void zzb(ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.removeOnScrollChangedListener(this);
    }
}

