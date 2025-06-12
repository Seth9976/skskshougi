package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldMappingDictionary implements SafeParcelable {
    public static class Entry implements SafeParcelable {
        public static final zzd CREATOR;
        final String className;
        final int versionCode;
        final ArrayList zzabT;

        static {
            Entry.CREATOR = new zzd();
        }

        Entry(int versionCode, String className, ArrayList arrayList0) {
            this.versionCode = versionCode;
            this.className = className;
            this.zzabT = arrayList0;
        }

        Entry(String className, Map map0) {
            this.versionCode = 1;
            this.className = className;
            this.zzabT = Entry.zzB(map0);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzd.zza(this, out, flags);
        }

        private static ArrayList zzB(Map map0) {
            if(map0 == null) {
                return null;
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: map0.keySet()) {
                arrayList0.add(new FieldMapPair(((String)object0), ((Field)map0.get(((String)object0)))));
            }
            return arrayList0;
        }

        HashMap zzoD() {
            HashMap hashMap0 = new HashMap();
            int v = this.zzabT.size();
            for(int v1 = 0; v1 < v; ++v1) {
                FieldMapPair fieldMappingDictionary$FieldMapPair0 = (FieldMapPair)this.zzabT.get(v1);
                hashMap0.put(fieldMappingDictionary$FieldMapPair0.zzaC, fieldMappingDictionary$FieldMapPair0.zzabU);
            }
            return hashMap0;
        }
    }

    public static class FieldMapPair implements SafeParcelable {
        public static final zzb CREATOR;
        final int versionCode;
        final String zzaC;
        final Field zzabU;

        static {
            FieldMapPair.CREATOR = new zzb();
        }

        FieldMapPair(int versionCode, String key, Field fastJsonResponse$Field0) {
            this.versionCode = versionCode;
            this.zzaC = key;
            this.zzabU = fastJsonResponse$Field0;
        }

        FieldMapPair(String key, Field fastJsonResponse$Field0) {
            this.versionCode = 1;
            this.zzaC = key;
            this.zzabU = fastJsonResponse$Field0;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzb.zza(this, out, flags);
        }
    }

    public static final zzc CREATOR;
    private final int zzCY;
    private final HashMap zzabQ;
    private final ArrayList zzabR;
    private final String zzabS;

    static {
        FieldMappingDictionary.CREATOR = new zzc();
    }

    FieldMappingDictionary(int versionCode, ArrayList arrayList0, String rootClassName) {
        this.zzCY = versionCode;
        this.zzabR = null;
        this.zzabQ = FieldMappingDictionary.zzc(arrayList0);
        this.zzabS = (String)zzu.zzu(rootClassName);
        this.zzoz();
    }

    public FieldMappingDictionary(Class class0) {
        this.zzCY = 1;
        this.zzabR = null;
        this.zzabQ = new HashMap();
        this.zzabS = class0.getCanonicalName();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.zzabQ.keySet()) {
            stringBuilder0.append(((String)object0)).append(":\n");
            Map map0 = (Map)this.zzabQ.get(((String)object0));
            for(Object object1: map0.keySet()) {
                stringBuilder0.append("  ").append(((String)object1)).append(": ");
                stringBuilder0.append(map0.get(((String)object1)));
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzc.zza(this, out, flags);
    }

    public void zza(Class class0, Map map0) {
        this.zzabQ.put(class0.getCanonicalName(), map0);
    }

    public boolean zzb(Class class0) {
        return this.zzabQ.containsKey(class0.getCanonicalName());
    }

    private static HashMap zzc(ArrayList arrayList0) {
        HashMap hashMap0 = new HashMap();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Entry fieldMappingDictionary$Entry0 = (Entry)arrayList0.get(v1);
            HashMap hashMap1 = fieldMappingDictionary$Entry0.zzoD();
            hashMap0.put(fieldMappingDictionary$Entry0.className, hashMap1);
        }
        return hashMap0;
    }

    public Map zzco(String s) {
        return (Map)this.zzabQ.get(s);
    }

    public void zzoA() {
        for(Object object0: this.zzabQ.keySet()) {
            Map map0 = (Map)this.zzabQ.get(((String)object0));
            HashMap hashMap0 = new HashMap();
            for(Object object1: map0.keySet()) {
                hashMap0.put(((String)object1), ((Field)map0.get(((String)object1))).zzop());
            }
            this.zzabQ.put(((String)object0), hashMap0);
        }
    }

    ArrayList zzoB() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zzabQ.keySet()) {
            arrayList0.add(new Entry(((String)object0), ((Map)this.zzabQ.get(((String)object0)))));
        }
        return arrayList0;
    }

    public String zzoC() {
        return this.zzabS;
    }

    public void zzoz() {
        for(Object object0: this.zzabQ.keySet()) {
            Map map0 = (Map)this.zzabQ.get(((String)object0));
            for(Object object1: map0.keySet()) {
                ((Field)map0.get(((String)object1))).zza(this);
            }
        }
    }
}

