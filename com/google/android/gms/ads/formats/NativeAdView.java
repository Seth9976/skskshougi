package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcm;

public abstract class NativeAdView extends FrameLayout {
    private final FrameLayout zznV;
    private final zzcm zznW;

    public NativeAdView(Context context) {
        super(context);
        this.zznV = this.zzm(context);
        this.zznW = this.zzaI();
    }

    public NativeAdView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.zznV = this.zzm(context);
        this.zznW = this.zzaI();
    }

    public NativeAdView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.zznV = this.zzm(context);
        this.zznW = this.zzaI();
    }

    public NativeAdView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.zznV = this.zzm(context);
        this.zznW = this.zzaI();
    }

    @Override  // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        super.bringChildToFront(this.zznV);
    }

    @Override  // android.view.ViewGroup
    public void bringChildToFront(View child) {
        super.bringChildToFront(child);
        if(this.zznV != child) {
            super.bringChildToFront(this.zznV);
        }
    }

    @Override  // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zznV);
    }

    @Override  // android.view.ViewGroup
    public void removeView(View child) {
        if(this.zznV == child) {
            return;
        }
        super.removeView(child);
    }

    public void setNativeAd(NativeAd ad) {
        try {
            zzd zzd0 = (zzd)ad.zzaH();
            this.zznW.zzb(zzd0);
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Unable to call setNativeAd on delegate", remoteException0);
        }
    }

    protected void zza(String s, View view0) {
        try {
            zzd zzd0 = zze.zzw(view0);
            this.zznW.zza(s, zzd0);
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Unable to call setAssetView on delegate", remoteException0);
        }
    }

    private zzcm zzaI() {
        zzu.zzb(this.zznV, "createDelegate must be called after mOverlayFrame has been created");
        return zzk.zzcE().zza(this.zznV.getContext(), this, this.zznV);
    }

    private FrameLayout zzm(Context context0) {
        FrameLayout frameLayout0 = this.zzn(context0);
        frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.addView(frameLayout0);
        return frameLayout0;
    }

    protected View zzm(String s) {
        try {
            zzd zzd0 = this.zznW.zzS(s);
            if(zzd0 != null) {
                return (View)zze.zzn(zzd0);
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Unable to call getAssetView on delegate", remoteException0);
        }
        return null;
    }

    FrameLayout zzn(Context context0) {
        return new FrameLayout(context0);
    }
}

