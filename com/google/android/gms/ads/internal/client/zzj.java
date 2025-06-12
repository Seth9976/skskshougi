package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class zzj {
    private final String zzoL;
    private final AdSize[] zzsr;

    public zzj(Context context0, AttributeSet attributeSet0) {
        boolean z = true;
        super();
        TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.AdsAttrs);
        String s = typedArray0.getString(styleable.AdsAttrs_adSize);
        String s1 = typedArray0.getString(styleable.AdsAttrs_adSizes);
        boolean z1 = !TextUtils.isEmpty(s);
        if(TextUtils.isEmpty(s1)) {
            z = false;
        }
        if(z1 && !z) {
            this.zzsr = zzj.zzD(s);
        }
        else if(!z1 && z) {
            this.zzsr = zzj.zzD(s1);
        }
        else {
            throw !z1 || !z ? new IllegalArgumentException("Required XML attribute \"adSize\" was missing.") : new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        }
        this.zzoL = typedArray0.getString(styleable.AdsAttrs_adUnitId);
        if(TextUtils.isEmpty(this.zzoL)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    public String getAdUnitId() {
        return this.zzoL;
    }

    private static AdSize[] zzD(String s) {
        int v2;
        int v1;
        String[] arr_s = s.split("\\s*,\\s*");
        AdSize[] arr_adSize = new AdSize[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v].trim();
            if(s1.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] arr_s1 = s1.split("[xX]");
                arr_s1[0] = arr_s1[0].trim();
                arr_s1[1] = arr_s1[1].trim();
                try {
                    v1 = "FULL_WIDTH".equals(arr_s1[0]) ? -1 : Integer.parseInt(arr_s1[0]);
                    v2 = "AUTO_HEIGHT".equals(arr_s1[1]) ? -2 : Integer.parseInt(arr_s1[1]);
                }
                catch(NumberFormatException unused_ex) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + s1);
                }
                arr_adSize[v] = new AdSize(v1, v2);
            }
            else if("BANNER".equals(s1)) {
                arr_adSize[v] = AdSize.BANNER;
            }
            else if("LARGE_BANNER".equals(s1)) {
                arr_adSize[v] = AdSize.LARGE_BANNER;
            }
            else if("FULL_BANNER".equals(s1)) {
                arr_adSize[v] = AdSize.FULL_BANNER;
            }
            else if("LEADERBOARD".equals(s1)) {
                arr_adSize[v] = AdSize.LEADERBOARD;
            }
            else if("MEDIUM_RECTANGLE".equals(s1)) {
                arr_adSize[v] = AdSize.MEDIUM_RECTANGLE;
            }
            else if("SMART_BANNER".equals(s1)) {
                arr_adSize[v] = AdSize.SMART_BANNER;
            }
            else {
                if(!"WIDE_SKYSCRAPER".equals(s1)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + s1);
                }
                arr_adSize[v] = AdSize.WIDE_SKYSCRAPER;
            }
        }
        if(arr_adSize.length == 0) {
            throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + s);
        }
        return arr_adSize;
    }

    public AdSize[] zzi(boolean z) {
        if(!z && this.zzsr.length != 1) {
            throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
        }
        return this.zzsr;
    }
}

