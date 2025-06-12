package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class RegisterSectionInfo implements SafeParcelable {
    public static final class zza {
        private final String mName;
        private boolean zzNA;
        private int zzNB;
        private boolean zzNC;
        private String zzND;
        private final List zzNE;
        private BitSet zzNF;
        private String zzNG;
        private String zzNz;

        public zza(String s) {
            this.mName = s;
            this.zzNB = 1;
            this.zzNE = new ArrayList();
        }

        public zza zzJ(boolean z) {
            this.zzNA = z;
            return this;
        }

        public zza zzK(boolean z) {
            this.zzNC = z;
            return this;
        }

        public zza zzaj(int v) {
            if(this.zzNF == null) {
                this.zzNF = new BitSet();
            }
            this.zzNF.set(v);
            return this;
        }

        public zza zzbr(String s) {
            this.zzNz = s;
            return this;
        }

        public zza zzbs(String s) {
            this.zzNG = s;
            return this;
        }

        public RegisterSectionInfo zzkM() {
            int[] arr_v = null;
            if(this.zzNF != null) {
                arr_v = new int[this.zzNF.cardinality()];
                int v1 = this.zzNF.nextSetBit(0);
                for(int v = 0; v1 >= 0; ++v) {
                    arr_v[v] = v1;
                    v1 = this.zzNF.nextSetBit(v1 + 1);
                }
            }
            String s = this.zzNz;
            boolean z = this.zzNA;
            int v2 = this.zzNB;
            boolean z1 = this.zzNC;
            String s1 = this.zzND;
            Feature[] arr_feature = (Feature[])this.zzNE.toArray(new Feature[this.zzNE.size()]);
            return new RegisterSectionInfo(this.mName, s, z, v2, z1, s1, arr_feature, arr_v, this.zzNG);
        }
    }

    public static final zzi CREATOR;
    public final String name;
    public final int weight;
    final int zzCY;
    public final String zzNs;
    public final boolean zzNt;
    public final boolean zzNu;
    public final String zzNv;
    public final Feature[] zzNw;
    final int[] zzNx;
    public final String zzNy;

    static {
        RegisterSectionInfo.CREATOR = new zzi();
    }

    RegisterSectionInfo(int versionCode, String name, String format, boolean noIndex, int weight, boolean indexPrefixes, String subsectionSeparator, Feature[] features, int[] semanticLabels, String schemaOrgProperty) {
        this.zzCY = versionCode;
        this.name = name;
        this.zzNs = format;
        this.zzNt = noIndex;
        this.weight = weight;
        this.zzNu = indexPrefixes;
        this.zzNv = subsectionSeparator;
        this.zzNw = features;
        this.zzNx = semanticLabels;
        this.zzNy = schemaOrgProperty;
    }

    RegisterSectionInfo(String name, String format, boolean noIndex, int weight, boolean indexPrefixes, String subsectionSeparator, Feature[] features, int[] semanticLabels, String schemaOrgProperty) {
        this(2, name, format, noIndex, weight, indexPrefixes, subsectionSeparator, features, semanticLabels, schemaOrgProperty);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzi.zza(this, out, flags);
    }
}

