package com.google.ads;

import android.content.Context;

@Deprecated
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = null;
    public static final int FULL_WIDTH = -1;
    public static final AdSize IAB_BANNER = null;
    public static final AdSize IAB_LEADERBOARD = null;
    public static final AdSize IAB_MRECT = null;
    public static final AdSize IAB_WIDE_SKYSCRAPER = null;
    public static final int LANDSCAPE_AD_HEIGHT = 0x20;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    public static final AdSize SMART_BANNER;
    private final com.google.android.gms.ads.AdSize zzaK;

    static {
        AdSize.SMART_BANNER = new AdSize(-1, -2, "mb");
        AdSize.BANNER = new AdSize(320, 50, "mb");
        AdSize.IAB_MRECT = new AdSize(300, 0xFA, "as");
        AdSize.IAB_BANNER = new AdSize(468, 60, "as");
        AdSize.IAB_LEADERBOARD = new AdSize(728, 90, "as");
        AdSize.IAB_WIDE_SKYSCRAPER = new AdSize(0xA0, 600, "as");
    }

    public AdSize(int width, int height) {
        this(new com.google.android.gms.ads.AdSize(width, height));
    }

    private AdSize(int width, int height, String type) {
        this(new com.google.android.gms.ads.AdSize(width, height));
    }

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zzaK = adSize;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof AdSize ? this.zzaK.equals(((AdSize)other).zzaK) : false;
    }

    public AdSize findBestSize(AdSize[] options) {
        AdSize adSize2;
        float f1;
        AdSize adSize0 = null;
        if(options != null) {
            int v = this.getWidth();
            int v1 = this.getHeight();
            int v2 = 0;
            for(float f = 0.0f; v2 < options.length; f = f1) {
                AdSize adSize1 = options[v2];
                int v3 = adSize1.getWidth();
                int v4 = adSize1.getHeight();
                if(this.isSizeAppropriate(v3, v4)) {
                    f1 = ((float)(v3 * v4)) / ((float)(v * v1));
                    if(f1 > 1.0f) {
                        f1 = 1.0f / f1;
                    }
                    if(f1 > f) {
                        adSize2 = adSize1;
                    }
                }
                else {
                    f1 = f;
                    adSize2 = adSize0;
                }
                ++v2;
                adSize0 = adSize2;
            }
        }
        return adSize0;
    }

    public int getHeight() {
        return this.zzaK.getHeight();
    }

    public int getHeightInPixels(Context context) {
        return this.zzaK.getHeightInPixels(context);
    }

    public int getWidth() {
        return this.zzaK.getWidth();
    }

    public int getWidthInPixels(Context context) {
        return this.zzaK.getWidthInPixels(context);
    }

    @Override
    public int hashCode() {
        return this.zzaK.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzaK.isAutoHeight();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.zzaK.isFullWidth();
    }

    public boolean isSizeAppropriate(int width, int height) {
        int v2 = this.getWidth();
        int v3 = this.getHeight();
        return ((float)width) <= ((float)v2) * 1.25f && ((float)width) >= ((float)v2) * 0.8f && ((float)height) <= ((float)v3) * 1.25f && ((float)height) >= ((float)v3) * 0.8f;
    }

    @Override
    public String toString() {
        return this.zzaK.toString();
    }
}

