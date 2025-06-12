package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzy;

public final class PublisherAdView extends ViewGroup {
    private final zzy zznP;

    public PublisherAdView(Context context) {
        super(context);
        this.zznP = new zzy(this);
    }

    public PublisherAdView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.zznP = new zzy(this, attrs, true);
    }

    public PublisherAdView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.zznP = new zzy(this, attrs, true);
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

    public AdSize[] getAdSizes() {
        return this.zznP.getAdSizes();
    }

    public String getAdUnitId() {
        return this.zznP.getAdUnitId();
    }

    public AppEventListener getAppEventListener() {
        return this.zznP.getAppEventListener();
    }

    public String getMediationAdapterClassName() {
        return this.zznP.getMediationAdapterClassName();
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zznP.getOnCustomRenderedAdLoadedListener();
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zznP.zza(publisherAdRequest.zzaF());
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

    public void recordManualImpression() {
        this.zznP.recordManualImpression();
    }

    public void resume() {
        this.zznP.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.zznP.setAdListener(adListener);
    }

    public void setAdSizes(AdSize[] adSizes) {
        if(adSizes == null || adSizes.length < 1) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zznP.zza(adSizes);
    }

    public void setAdUnitId(String adUnitId) {
        this.zznP.setAdUnitId(adUnitId);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zznP.setAppEventListener(appEventListener);
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zznP.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }
}

