package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.zzgd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzgd
public class zzg {
    public static final zzg zzsl;

    static {
        zzg.zzsl = new zzg();
    }

    public AdRequestParcel zza(Context context0, zzx zzx0) {
        Date date0 = zzx0.getBirthday();
        long v = date0 == null ? -1L : date0.getTime();
        String s = zzx0.getContentUrl();
        int v1 = zzx0.getGender();
        Set set0 = zzx0.getKeywords();
        List list0 = set0.isEmpty() ? null : Collections.unmodifiableList(new ArrayList(set0));
        boolean z = zzx0.isTestDevice(context0);
        int v2 = zzx0.zzcL();
        Location location0 = zzx0.getLocation();
        Bundle bundle0 = zzx0.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean z1 = zzx0.getManualImpressionsEnabled();
        String s1 = zzx0.getPublisherProvidedId();
        SearchAdRequest searchAdRequest0 = zzx0.zzcI();
        return searchAdRequest0 == null ? new AdRequestParcel(5, v, bundle0, v1, list0, z, v2, z1, s1, null, location0, s, zzx0.zzcK(), zzx0.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzx0.zzcM())), zzx0.zzcH()) : new AdRequestParcel(5, v, bundle0, v1, list0, z, v2, z1, s1, new SearchAdRequestParcel(searchAdRequest0), location0, s, zzx0.zzcK(), zzx0.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzx0.zzcM())), zzx0.zzcH());
    }

    public RewardedVideoAdRequestParcel zza(Context context0, zzx zzx0, String s) {
        return new RewardedVideoAdRequestParcel(this.zza(context0, zzx0), s);
    }

    public static zzg zzcw() {
        return zzg.zzsl;
    }
}

