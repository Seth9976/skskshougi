package com.google.android.gms.ads.internal.formats;

import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcm.zza;
import com.google.android.gms.internal.zzhz;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class zzi extends zza implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final FrameLayout zznV;
    private final Object zzqt;
    private final FrameLayout zzvF;
    private final Map zzvG;
    private zzb zzvH;
    private zzg zzvq;

    public zzi(FrameLayout frameLayout0, FrameLayout frameLayout1) {
        this.zzqt = new Object();
        this.zzvG = new HashMap();
        this.zzvF = frameLayout0;
        this.zznV = frameLayout1;
        zzhz.zza(this.zzvF, this);
        zzhz.zza(this.zzvF, this);
        this.zzvF.setOnTouchListener(this);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view) {
        synchronized(this.zzqt) {
            if(this.zzvq == null) {
                return;
            }
            String s = this.zzi(view);
            if(s != null) {
                this.zzvq.performClick(s);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        synchronized(this.zzqt) {
            if(this.zzvq != null) {
                this.zzvq.zzh(this.zzvF);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public void onScrollChanged() {
        synchronized(this.zzqt) {
            if(this.zzvq != null) {
                this.zzvq.zzh(this.zzvF);
            }
        }
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized(this.zzqt) {
            if(this.zzvq == null) {
                return false;
            }
            this.zzvq.zzb(motionEvent);
            return true;
        }
    }

    @Override  // com.google.android.gms.internal.zzcm
    public zzd zzS(String s) {
        View view0;
        synchronized(this.zzqt) {
            WeakReference weakReference0 = (WeakReference)this.zzvG.get(s);
            view0 = weakReference0 == null ? null : ((View)weakReference0.get());
        }
        return zze.zzw(view0);
    }

    @Override  // com.google.android.gms.internal.zzcm
    public void zza(String s, zzd zzd0) {
        View view0 = (View)zze.zzn(zzd0);
        synchronized(this.zzqt) {
            if(view0 == null) {
                this.zzvG.remove(s);
            }
            else {
                WeakReference weakReference0 = new WeakReference(view0);
                this.zzvG.put(s, weakReference0);
                view0.setOnClickListener(this);
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzcm
    public void zzb(zzd zzd0) {
        synchronized(this.zzqt) {
            this.zzvq = (zzg)zze.zzn(zzd0);
            this.zznV.removeAllViews();
            this.zzvH = this.zzdI();
            if(this.zzvH != null) {
                this.zznV.addView(this.zzvH);
            }
        }
    }

    zzb zzdI() {
        return this.zzvq.zza(this);
    }

    private String zzi(View view0) {
        synchronized(this.zzqt) {
            if(this.zzvH != null && this.zzvH.zzdv().equals(view0)) {
                return "1007";
            }
            for(Object object1: this.zzvG.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(view0.equals(((View)((WeakReference)map$Entry0.getValue()).get()))) {
                    return (String)map$Entry0.getKey();
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }
}

