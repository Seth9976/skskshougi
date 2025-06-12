package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzgd;
import java.util.Collections;
import java.util.List;

@zzgd
public final class AdRequestInfoParcel implements SafeParcelable {
    @zzgd
    public static final class zza {
        public final ApplicationInfo applicationInfo;
        public final boolean zzCA;
        public final int zzCB;
        public final long zzCD;
        public final String zzCE;
        public final List zzCF;
        public final List zzCG;
        public final Bundle zzCl;
        public final AdRequestParcel zzCm;
        public final PackageInfo zzCn;
        public final String zzCp;
        public final String zzCq;
        public final Bundle zzCr;
        public final int zzCs;
        public final Bundle zzCt;
        public final boolean zzCu;
        public final Messenger zzCv;
        public final int zzCw;
        public final int zzCx;
        public final float zzCy;
        public final String zzCz;
        public final String zzpF;
        public final String zzpG;
        public final VersionInfoParcel zzpJ;
        public final AdSizeParcel zzpN;
        public final NativeAdOptionsParcel zzqb;
        public final List zzqd;

        public zza(Bundle bundle0, AdRequestParcel adRequestParcel0, AdSizeParcel adSizeParcel0, String s, ApplicationInfo applicationInfo0, PackageInfo packageInfo0, String s1, String s2, VersionInfoParcel versionInfoParcel0, Bundle bundle1, List list0, List list1, Bundle bundle2, boolean z, Messenger messenger0, int v, int v1, float f, String s3, boolean z1, int v2, long v3, String s4, List list2, String s5, NativeAdOptionsParcel nativeAdOptionsParcel0) {
            this.zzCl = bundle0;
            this.zzCm = adRequestParcel0;
            this.zzpN = adSizeParcel0;
            this.zzpG = s;
            this.applicationInfo = applicationInfo0;
            this.zzCn = packageInfo0;
            this.zzCp = s1;
            this.zzCq = s2;
            this.zzpJ = versionInfoParcel0;
            this.zzCr = bundle1;
            this.zzCu = z;
            this.zzCv = messenger0;
            this.zzCw = v;
            this.zzCx = v1;
            this.zzCy = f;
            if(list0 == null || list0.size() <= 0) {
                this.zzCs = 0;
                this.zzqd = null;
                this.zzCG = null;
            }
            else {
                this.zzCs = 3;
                this.zzqd = list0;
                this.zzCG = list1;
            }
            this.zzCt = bundle2;
            this.zzCz = s3;
            this.zzCA = z1;
            this.zzCB = v2;
            this.zzCD = v3;
            this.zzCE = s4;
            this.zzCF = list2;
            this.zzpF = s5;
            this.zzqb = nativeAdOptionsParcel0;
        }
    }

    public static final zzf CREATOR;
    public final ApplicationInfo applicationInfo;
    public final int versionCode;
    public final boolean zzCA;
    public final int zzCB;
    public final String zzCC;
    public final long zzCD;
    public final String zzCE;
    public final List zzCF;
    public final List zzCG;
    public final Bundle zzCl;
    public final AdRequestParcel zzCm;
    public final PackageInfo zzCn;
    public final String zzCo;
    public final String zzCp;
    public final String zzCq;
    public final Bundle zzCr;
    public final int zzCs;
    public final Bundle zzCt;
    public final boolean zzCu;
    public final Messenger zzCv;
    public final int zzCw;
    public final int zzCx;
    public final float zzCy;
    public final String zzCz;
    public final String zzpF;
    public final String zzpG;
    public final VersionInfoParcel zzpJ;
    public final AdSizeParcel zzpN;
    public final NativeAdOptionsParcel zzqb;
    public final List zzqd;

    static {
        AdRequestInfoParcel.CREATOR = new zzf();
    }

    AdRequestInfoParcel(int versionCode, Bundle adPositionBundle, AdRequestParcel adRequest, AdSizeParcel adSize, String adUnitId, ApplicationInfo applicationInfo, PackageInfo packageInfo, String querySpamSignals, String sequenceNumber, String sessionId, VersionInfoParcel versionInfo, Bundle stats, int nativeVersion, List list0, Bundle contentInfo, boolean useHTTPS, Messenger prefetchMessenger, int screenWidth, int screenHeight, float screenDensity, String viewHierarchy, boolean isAnalyticsInitialized, int screenId, String analyticsClientId, long correlationId, String requestId, List list1, String slotId, NativeAdOptionsParcel nativeAdOptions, List list2) {
        this.versionCode = versionCode;
        this.zzCl = adPositionBundle;
        this.zzCm = adRequest;
        this.zzpN = adSize;
        this.zzpG = adUnitId;
        this.applicationInfo = applicationInfo;
        this.zzCn = packageInfo;
        this.zzCo = querySpamSignals;
        this.zzCp = sequenceNumber;
        this.zzCq = sessionId;
        this.zzpJ = versionInfo;
        this.zzCr = stats;
        this.zzCs = nativeVersion;
        this.zzqd = list0;
        this.zzCG = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzCt = contentInfo;
        this.zzCu = useHTTPS;
        this.zzCv = prefetchMessenger;
        this.zzCw = screenWidth;
        this.zzCx = screenHeight;
        this.zzCy = screenDensity;
        this.zzCz = viewHierarchy;
        this.zzCA = isAnalyticsInitialized;
        this.zzCB = screenId;
        this.zzCC = analyticsClientId;
        this.zzCD = correlationId;
        this.zzCE = requestId;
        this.zzCF = list1 == null ? Collections.emptyList() : Collections.unmodifiableList(list1);
        this.zzpF = slotId;
        this.zzqb = nativeAdOptions;
    }

    public AdRequestInfoParcel(Bundle adPositionBundle, AdRequestParcel adRequest, AdSizeParcel adSize, String adUnitId, ApplicationInfo applicationInfo, PackageInfo packageInfo, String querySpamSignals, String sequenceNumber, String sessionId, VersionInfoParcel versionInfo, Bundle stats, int nativeVersion, List list0, List list1, Bundle contentInfo, boolean useHTTPS, Messenger prefetchMessenger, int screenWidth, int screenHeight, float screenDensity, String viewHierarchy, boolean isAnalyticsInitialized, int screenId, String analyticsClientId, long correlationId, String requestId, List list2, String slotId, NativeAdOptionsParcel nativeAdOptionsParcel) {
        this(10, adPositionBundle, adRequest, adSize, adUnitId, applicationInfo, packageInfo, querySpamSignals, sequenceNumber, sessionId, versionInfo, stats, nativeVersion, list0, contentInfo, useHTTPS, prefetchMessenger, screenWidth, screenHeight, screenDensity, viewHierarchy, isAnalyticsInitialized, screenId, analyticsClientId, correlationId, requestId, list2, slotId, nativeAdOptionsParcel, list1);
    }

    public AdRequestInfoParcel(zza partialAdRequestInfo, String querySpamSignals, String analyticsClientId) {
        this(partialAdRequestInfo.zzCl, partialAdRequestInfo.zzCm, partialAdRequestInfo.zzpN, partialAdRequestInfo.zzpG, partialAdRequestInfo.applicationInfo, partialAdRequestInfo.zzCn, querySpamSignals, partialAdRequestInfo.zzCp, partialAdRequestInfo.zzCq, partialAdRequestInfo.zzpJ, partialAdRequestInfo.zzCr, partialAdRequestInfo.zzCs, partialAdRequestInfo.zzqd, partialAdRequestInfo.zzCG, partialAdRequestInfo.zzCt, partialAdRequestInfo.zzCu, partialAdRequestInfo.zzCv, partialAdRequestInfo.zzCw, partialAdRequestInfo.zzCx, partialAdRequestInfo.zzCy, partialAdRequestInfo.zzCz, partialAdRequestInfo.zzCA, partialAdRequestInfo.zzCB, analyticsClientId, partialAdRequestInfo.zzCD, partialAdRequestInfo.zzCE, partialAdRequestInfo.zzCF, partialAdRequestInfo.zzpF, partialAdRequestInfo.zzqb);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzf.zza(this, out, flags);
    }
}

