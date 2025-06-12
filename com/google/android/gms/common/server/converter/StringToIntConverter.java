package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.zza;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter implements SafeParcelable, zza {
    public static final class Entry implements SafeParcelable {
        public static final zzc CREATOR;
        final int versionCode;
        final String zzabE;
        final int zzabF;

        static {
            Entry.CREATOR = new zzc();
        }

        Entry(int versionCode, String stringValue, int intValue) {
            this.versionCode = versionCode;
            this.zzabE = stringValue;
            this.zzabF = intValue;
        }

        Entry(String stringValue, int intValue) {
            this.versionCode = 1;
            this.zzabE = stringValue;
            this.zzabF = intValue;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzc.zza(this, out, flags);
        }
    }

    public static final zzb CREATOR;
    private final int zzCY;
    private final HashMap zzabB;
    private final HashMap zzabC;
    private final ArrayList zzabD;

    static {
        StringToIntConverter.CREATOR = new zzb();
    }

    public StringToIntConverter() {
        this.zzCY = 1;
        this.zzabB = new HashMap();
        this.zzabC = new HashMap();
        this.zzabD = null;
    }

    StringToIntConverter(int versionCode, ArrayList arrayList0) {
        this.zzCY = versionCode;
        this.zzabB = new HashMap();
        this.zzabC = new HashMap();
        this.zzabD = null;
        this.zzb(arrayList0);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$zza
    public Object convertBack(Object x0) {
        return this.zzb(((Integer)x0));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }

    private void zzb(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            this.zzh(((Entry)object0).zzabE, ((Entry)object0).zzabF);
        }
    }

    public String zzb(Integer integer0) {
        String s = (String)this.zzabC.get(integer0);
        return s != null || !this.zzabB.containsKey("gms_unknown") ? s : "gms_unknown";
    }

    public StringToIntConverter zzh(String s, int v) {
        this.zzabB.put(s, v);
        this.zzabC.put(v, s);
        return this;
    }

    ArrayList zzoj() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zzabB.keySet()) {
            arrayList0.add(new Entry(((String)object0), ((int)(((Integer)this.zzabB.get(((String)object0)))))));
        }
        return arrayList0;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$zza
    public int zzok() {
        return 7;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$zza
    public int zzol() {
        return 0;
    }
}

