package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppVisibleCustomProperties implements SafeParcelable, Iterable {
    public static class zza {
        private final Map zzagF;

        public zza() {
            this.zzagF = new HashMap();
        }

        public zza zza(CustomPropertyKey customPropertyKey0, String s) {
            zzu.zzb(customPropertyKey0, "key");
            CustomProperty customProperty0 = new CustomProperty(customPropertyKey0, s);
            this.zzagF.put(customPropertyKey0, customProperty0);
            return this;
        }

        public AppVisibleCustomProperties zzpU() {
            return new AppVisibleCustomProperties(this.zzagF.values(), null);
        }
    }

    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    public static final AppVisibleCustomProperties zzagD;
    final List zzagE;

    static {
        AppVisibleCustomProperties.CREATOR = new com.google.android.gms.drive.metadata.internal.zza();
        AppVisibleCustomProperties.zzagD = new zza().zzpU();
    }

    AppVisibleCustomProperties(int versionCode, Collection collection0) {
        this.zzCY = versionCode;
        zzu.zzu(collection0);
        this.zzagE = new ArrayList(collection0);
    }

    private AppVisibleCustomProperties(Collection collection0) {
        this(1, collection0);
    }

    AppVisibleCustomProperties(Collection x0, com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.1 x1) {
        this(x0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return this.zzagE.iterator();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        com.google.android.gms.drive.metadata.internal.zza.zza(this, dest, flags);
    }

    public Map zzpT() {
        HashMap hashMap0 = new HashMap(this.zzagE.size());
        for(Object object0: this.zzagE) {
            hashMap0.put(((CustomProperty)object0).zzpV(), ((CustomProperty)object0).getValue());
        }
        return Collections.unmodifiableMap(hashMap0);
    }

    class com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.1 {
    }

}

