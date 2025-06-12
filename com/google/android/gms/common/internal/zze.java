package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.zzpt;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zze {
    public static final class zza {
        public final Set zzWJ;
        public final boolean zzZW;

        public zza(Set set0, boolean z) {
            zzu.zzu(set0);
            this.zzWJ = Collections.unmodifiableSet(set0);
            this.zzZW = z;
        }
    }

    private final Account zzMY;
    private final String zzOd;
    private final String zzOe;
    private final Set zzWv;
    private final int zzWw;
    private final View zzWx;
    private final Set zzZS;
    private final Map zzZT;
    private final zzpt zzZU;
    private Integer zzZV;

    public zze(Account account0, Collection collection0, Map map0, int v, View view0, String s, String s1, zzpt zzpt0) {
        this.zzMY = account0;
        this.zzWv = collection0 == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(new HashSet(collection0));
        if(map0 == null) {
            map0 = Collections.EMPTY_MAP;
        }
        this.zzZT = map0;
        this.zzWx = view0;
        this.zzWw = v;
        this.zzOe = s;
        this.zzOd = s1;
        this.zzZU = zzpt0;
        HashSet hashSet0 = new HashSet(this.zzWv);
        for(Object object0: this.zzZT.values()) {
            hashSet0.addAll(((zza)object0).zzWJ);
        }
        this.zzZS = Collections.unmodifiableSet(hashSet0);
    }

    public Account getAccount() {
        return this.zzMY;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzMY == null ? null : this.zzMY.name;
    }

    public void zza(Integer integer0) {
        this.zzZV = integer0;
    }

    public Set zzb(Api api0) {
        zza zze$zza0 = (zza)this.zzZT.get(api0);
        if(zze$zza0 == null || zze$zza0.zzWJ.isEmpty()) {
            return this.zzWv;
        }
        HashSet hashSet0 = new HashSet(this.zzWv);
        hashSet0.addAll(zze$zza0.zzWJ);
        return hashSet0;
    }

    public View zznA() {
        return this.zzWx;
    }

    public zzpt zznB() {
        return this.zzZU;
    }

    public Integer zznC() {
        return this.zzZV;
    }

    @Deprecated
    public String zzns() {
        return this.zznt().name;
    }

    public Account zznt() {
        return this.zzMY == null ? new Account("<<default account>>", "com.google") : this.zzMY;
    }

    public int zznu() {
        return this.zzWw;
    }

    public Set zznv() {
        return this.zzWv;
    }

    public Set zznw() {
        return this.zzZS;
    }

    public Map zznx() {
        return this.zzZT;
    }

    public String zzny() {
        return this.zzOe;
    }

    public String zznz() {
        return this.zzOd;
    }
}

