package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.zzgd;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@zzgd
public final class zzx {
    public static final class zza {
        private Date zzaQ;
        private Location zzaU;
        private String zzsB;
        private int zzsC;
        private boolean zzsD;
        private final Bundle zzsE;
        private String zzsG;
        private String zzsH;
        private int zzsJ;
        private final Bundle zzsL;
        private final HashSet zzsN;
        private final HashMap zzsO;
        private final HashSet zzsP;
        private final HashSet zzsQ;

        public zza() {
            this.zzsN = new HashSet();
            this.zzsE = new Bundle();
            this.zzsO = new HashMap();
            this.zzsP = new HashSet();
            this.zzsL = new Bundle();
            this.zzsQ = new HashSet();
            this.zzsC = -1;
            this.zzsD = false;
            this.zzsJ = -1;
        }

        public void zzE(String s) {
            this.zzsN.add(s);
        }

        public void zzF(String s) {
            this.zzsP.add(s);
        }

        public void zzG(String s) {
            this.zzsP.remove(s);
        }

        public void zzH(String s) {
            this.zzsB = s;
        }

        public void zzI(String s) {
            this.zzsG = s;
        }

        public void zzJ(String s) {
            this.zzsH = s;
        }

        public void zzK(String s) {
            this.zzsQ.add(s);
        }

        public void zza(Location location0) {
            this.zzaU = location0;
        }

        @Deprecated
        public void zza(NetworkExtras networkExtras0) {
            if(networkExtras0 instanceof AdMobExtras) {
                Bundle bundle0 = ((AdMobExtras)networkExtras0).getExtras();
                this.zza(AdMobAdapter.class, bundle0);
                return;
            }
            Class class0 = networkExtras0.getClass();
            this.zzsO.put(class0, networkExtras0);
        }

        public void zza(Class class0, Bundle bundle0) {
            this.zzsE.putBundle(class0.getName(), bundle0);
        }

        public void zza(Date date0) {
            this.zzaQ = date0;
        }

        public void zzb(Class class0, Bundle bundle0) {
            if(this.zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
                Bundle bundle1 = new Bundle();
                this.zzsE.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", bundle1);
            }
            this.zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class0.getName(), bundle0);
        }

        public void zzb(String s, String s1) {
            this.zzsL.putString(s, s1);
        }

        public void zzj(boolean z) {
            this.zzsD = z;
        }

        public void zzk(boolean z) {
            this.zzsJ = z ? 1 : 0;
        }

        public void zzm(int v) {
            this.zzsC = v;
        }
    }

    public static final String DEVICE_ID_EMULATOR;
    private final Date zzaQ;
    private final Set zzaS;
    private final Location zzaU;
    private final String zzsB;
    private final int zzsC;
    private final boolean zzsD;
    private final Bundle zzsE;
    private final Map zzsF;
    private final String zzsG;
    private final String zzsH;
    private final SearchAdRequest zzsI;
    private final int zzsJ;
    private final Set zzsK;
    private final Bundle zzsL;
    private final Set zzsM;

    static {
        zzx.DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    }

    public zzx(zza zzx$zza0) {
        this(zzx$zza0, null);
    }

    public zzx(zza zzx$zza0, SearchAdRequest searchAdRequest0) {
        this.zzaQ = zzx$zza0.zzaQ;
        this.zzsB = zzx$zza0.zzsB;
        this.zzsC = zzx$zza0.zzsC;
        this.zzaS = Collections.unmodifiableSet(zzx$zza0.zzsN);
        this.zzaU = zzx$zza0.zzaU;
        this.zzsD = zzx$zza0.zzsD;
        this.zzsE = zzx$zza0.zzsE;
        this.zzsF = Collections.unmodifiableMap(zzx$zza0.zzsO);
        this.zzsG = zzx$zza0.zzsG;
        this.zzsH = zzx$zza0.zzsH;
        this.zzsI = searchAdRequest0;
        this.zzsJ = zzx$zza0.zzsJ;
        this.zzsK = Collections.unmodifiableSet(zzx$zza0.zzsP);
        this.zzsL = zzx$zza0.zzsL;
        this.zzsM = Collections.unmodifiableSet(zzx$zza0.zzsQ);
    }

    public Date getBirthday() {
        return this.zzaQ;
    }

    public String getContentUrl() {
        return this.zzsB;
    }

    public Bundle getCustomEventExtrasBundle(Class class0) {
        Bundle bundle0 = this.zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle0 == null ? null : bundle0.getBundle(class0.getClass().getName());
    }

    public Bundle getCustomTargeting() {
        return this.zzsL;
    }

    public int getGender() {
        return this.zzsC;
    }

    public Set getKeywords() {
        return this.zzaS;
    }

    public Location getLocation() {
        return this.zzaU;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zzsD;
    }

    @Deprecated
    public NetworkExtras getNetworkExtras(Class class0) {
        return (NetworkExtras)this.zzsF.get(class0);
    }

    public Bundle getNetworkExtrasBundle(Class class0) {
        return this.zzsE.getBundle(class0.getName());
    }

    public String getPublisherProvidedId() {
        return this.zzsG;
    }

    public boolean isTestDevice(Context context) {
        String s = zzk.zzcA().zzO(context);
        return this.zzsK.contains(s);
    }

    public static void updateCorrelator() {
        zzk.zzcC().zzcG();
    }

    public String zzcH() {
        return this.zzsH;
    }

    public SearchAdRequest zzcI() {
        return this.zzsI;
    }

    public Map zzcJ() {
        return this.zzsF;
    }

    public Bundle zzcK() {
        return this.zzsE;
    }

    public int zzcL() {
        return this.zzsJ;
    }

    public Set zzcM() {
        return this.zzsM;
    }
}

