package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzo;
import java.lang.ref.WeakReference;

class zzia extends zzic implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference zzGZ;

    public zzia(View view0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        super(view0);
        this.zzGZ = new WeakReference(viewTreeObserver$OnGlobalLayoutListener0);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = (ViewTreeObserver.OnGlobalLayoutListener)this.zzGZ.get();
        if(viewTreeObserver$OnGlobalLayoutListener0 != null) {
            viewTreeObserver$OnGlobalLayoutListener0.onGlobalLayout();
            return;
        }
        this.detach();
    }

    @Override  // com.google.android.gms.internal.zzic
    protected void zza(ViewTreeObserver viewTreeObserver0) {
        viewTreeObserver0.addOnGlobalLayoutListener(this);
    }

    @Override  // com.google.android.gms.internal.zzic
    protected void zzb(ViewTreeObserver viewTreeObserver0) {
        zzo.zzbx().zza(viewTreeObserver0, this);
    }
}

