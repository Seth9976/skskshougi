package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzgd;
import java.util.Collections;
import java.util.List;

@zzgd
public final class AdResponseParcel implements SafeParcelable {
    public static final zzh CREATOR;
    public final int errorCode;
    public final int orientation;
    public final int versionCode;
    public String zzCI;
    public final long zzCJ;
    public final boolean zzCK;
    public final long zzCL;
    public final List zzCM;
    public final String zzCN;
    public final long zzCO;
    public final String zzCP;
    public final boolean zzCQ;
    public final String zzCR;
    public final String zzCS;
    public final boolean zzCT;
    public final boolean zzCU;
    public final boolean zzCV;
    public final int zzCW;
    public LargeParcelTeleporter zzCX;
    public final boolean zzCu;
    public final boolean zzsp;
    public final List zzxF;
    public final List zzxG;
    public final long zzxJ;
    private AdRequestInfoParcel zzxm;
    public final String zzzG;

    static {
        AdResponseParcel.CREATOR = new zzh();
    }

    public AdResponseParcel(int errorCode) {
        this(12, null, null, null, errorCode, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null);
    }

    public AdResponseParcel(int errorCode, long refreshIntervalInMillis) {
        this(12, null, null, null, errorCode, null, -1L, false, -1L, null, refreshIntervalInMillis, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null);
    }

    AdResponseParcel(int versionCode, String baseUrl, String body, List list0, int errorCode, List list1, long interstitialTimeoutInMillis, boolean isMediation, long mediationConfigCacheTimeInMillis, List list2, long refreshIntervalInMillis, int orientation, String adSizeString, long fetchTime, String debugDialog, boolean isJavascriptTag, String passbackUrl, String activeViewJSON, boolean isCustomRenderAllowed, boolean isNative, boolean useHTTPS, boolean contentUrlOptedOut, boolean isPrefetched, int panTokenStatus, LargeParcelTeleporter bodyTeleporter) {
        this.versionCode = versionCode;
        this.zzzG = baseUrl;
        this.zzCI = body;
        this.zzxF = list0 == null ? null : Collections.unmodifiableList(list0);
        this.errorCode = errorCode;
        this.zzxG = list1 == null ? null : Collections.unmodifiableList(list1);
        this.zzCJ = interstitialTimeoutInMillis;
        this.zzCK = isMediation;
        this.zzCL = mediationConfigCacheTimeInMillis;
        this.zzCM = list2 == null ? null : Collections.unmodifiableList(list2);
        this.zzxJ = refreshIntervalInMillis;
        this.orientation = orientation;
        this.zzCN = adSizeString;
        this.zzCO = fetchTime;
        this.zzCP = debugDialog;
        this.zzCQ = isJavascriptTag;
        this.zzCR = passbackUrl;
        this.zzCS = activeViewJSON;
        this.zzCT = isCustomRenderAllowed;
        this.zzsp = isNative;
        this.zzCu = useHTTPS;
        this.zzCU = contentUrlOptedOut;
        this.zzCV = isPrefetched;
        this.zzCW = panTokenStatus;
        this.zzCX = bodyTeleporter;
        if(this.zzCI == null && this.zzCX != null) {
            StringParcel stringParcel0 = (StringParcel)this.zzCX.zza(StringParcel.CREATOR);
            if(stringParcel0 != null && !TextUtils.isEmpty(stringParcel0.zzfB())) {
                this.zzCI = stringParcel0.zzfB();
            }
        }
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfo, String baseUrl, String body, List list0, List list1, long interstitialTimeoutInMillis, boolean isMediation, long mediationConfigCacheTimeInMillis, List list2, long refreshIntervalInMillis, int orientation, String adSizeString, long fetchTime, String debugDialog, String activeViewJSON, boolean isCustomRenderAllowed, boolean isNative, boolean useHTTPS, boolean contentUrlOptedOut, boolean isPrefetched, int panTokenStatus) {
        this(12, baseUrl, body, list0, -2, list1, interstitialTimeoutInMillis, isMediation, mediationConfigCacheTimeInMillis, list2, refreshIntervalInMillis, orientation, adSizeString, fetchTime, debugDialog, false, null, activeViewJSON, isCustomRenderAllowed, isNative, useHTTPS, contentUrlOptedOut, isPrefetched, panTokenStatus, null);
        this.zzxm = adRequestInfo;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfo, String baseUrl, String body, List list0, List list1, long interstitialTimeoutInMillis, boolean isMediation, long mediationConfigCacheTimeInMillis, List list2, long refreshIntervalInMillis, int orientation, String adSizeString, long fetchTime, String debugDialog, boolean isJavascriptTag, String passbackUrl, String activeViewJSON, boolean isCustomRenderAllowed, boolean isNative, boolean useHTTPS, boolean contentUrlOptedOut, boolean isPrefetched, int panTokenStatus) {
        this(12, baseUrl, body, list0, -2, list1, interstitialTimeoutInMillis, isMediation, mediationConfigCacheTimeInMillis, list2, refreshIntervalInMillis, orientation, adSizeString, fetchTime, debugDialog, isJavascriptTag, passbackUrl, activeViewJSON, isCustomRenderAllowed, isNative, useHTTPS, contentUrlOptedOut, isPrefetched, panTokenStatus, null);
        this.zzxm = adRequestInfo;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        if(this.zzxm != null && this.zzxm.versionCode >= 9 && !TextUtils.isEmpty(this.zzCI) && this.zzCI.length() > 76800) {
            this.zzCX = new LargeParcelTeleporter(new StringParcel(this.zzCI));
            this.zzCI = null;
        }
        zzh.zza(this, out, flags);
    }
}

