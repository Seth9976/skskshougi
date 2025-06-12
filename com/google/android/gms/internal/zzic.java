package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzic {
    private final WeakReference zzHa;

    public zzic(View view0) {
        this.zzHa = new WeakReference(view0);
    }

    public final void detach() {
        ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
        if(viewTreeObserver0 != null) {
            this.zzb(viewTreeObserver0);
        }
    }

    protected ViewTreeObserver getViewTreeObserver() {
        View view0 = (View)this.zzHa.get();
        if(view0 == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        return viewTreeObserver0 != null && viewTreeObserver0.isAlive() ? viewTreeObserver0 : null;
    }

    protected abstract void zza(ViewTreeObserver arg1);

    protected abstract void zzb(ViewTreeObserver arg1);

    public final void zzgz() {
        ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
        if(viewTreeObserver0 != null) {
            this.zza(viewTreeObserver0);
        }
    }
}

