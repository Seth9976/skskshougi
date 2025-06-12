package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

public final class AdView extends ViewGroup {
    private final zzy zznP;

    public AdView(Context context) {
        super(context);
        this.zznP = new zzy(this);
    }

    public AdView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.zznP = new zzy(this, attrs, false);
    }

    public AdView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.zznP = new zzy(this, attrs, false);
    }

    public void destroy() {
        this.zznP.destroy();
    }

    public AdListener getAdListener() {
        return this.zznP.getAdListener();
    }

    public AdSize getAdSize() {
        return this.zznP.getAdSize();
    }

    public String getAdUnitId() {
        return this.zznP.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.zznP.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName() {
        return this.zznP.getMediationAdapterClassName();
    }

    public void loadAd(AdRequest adRequest) {
        this.zznP.zza(adRequest.zzaF());
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View view0 = this.getChildAt(0);
        if(view0 != null && view0.getVisibility() != 8) {
            int v4 = view0.getMeasuredWidth();
            int v5 = view0.getMeasuredHeight();
            int v6 = (right - left - v4) / 2;
            int v7 = (bottom - top - v5) / 2;
            view0.layout(v6, v7, v4 + v6, v5 + v7);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int v3;
        int v2 = 0;
        View view0 = this.getChildAt(0);
        if(view0 == null || view0.getVisibility() == 8) {
            AdSize adSize0 = this.getAdSize();
            if(adSize0 == null) {
                v3 = 0;
            }
            else {
                Context context0 = this.getContext();
                v3 = adSize0.getWidthInPixels(context0);
                v2 = adSize0.getHeightInPixels(context0);
            }
        }
        else {
            this.measureChild(view0, widthMeasureSpec, heightMeasureSpec);
            v3 = view0.getMeasuredWidth();
            v2 = view0.getMeasuredHeight();
        }
        int v4 = Math.max(v3, this.getSuggestedMinimumWidth());
        int v5 = Math.max(v2, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSize(v4, widthMeasureSpec), View.resolveSize(v5, heightMeasureSpec));
    }

    public void pause() {
        this.zznP.pause();
    }

    public void resume() {
        this.zznP.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.zznP.setAdListener(adListener);
        if(adListener != null && adListener instanceof zza) {
            this.zznP.zza(((zza)adListener));
            return;
        }
        if(adListener == null) {
            this.zznP.zza(null);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zznP.setAdSizes(new AdSize[]{adSize});
    }

    public void setAdUnitId(String adUnitId) {
        this.zznP.setAdUnitId(adUnitId);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        this.zznP.setInAppPurchaseListener(inAppPurchaseListener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String publicKey) {
        this.zznP.setPlayStorePurchaseParams(playStorePurchaseListener, publicKey);
    }
}

