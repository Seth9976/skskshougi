package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public class DocumentSection implements SafeParcelable {
    public static final zzd CREATOR;
    final int zzCY;
    public static final int zzNc;
    private static final RegisterSectionInfo zzNd;
    public final String zzNe;
    final RegisterSectionInfo zzNf;
    public final int zzNg;
    public final byte[] zzNh;

    static {
        DocumentSection.zzNc = -1;
        DocumentSection.CREATOR = new zzd();
        DocumentSection.zzNd = new zza("SsbContext").zzJ(true).zzbr("blob").zzkM();
    }

    DocumentSection(int versionCode, String content, RegisterSectionInfo sectionInfo, int globalSearchSectionType, byte[] blobContent) {
        zzu.zzb(globalSearchSectionType == DocumentSection.zzNc || zzh.zzai(globalSearchSectionType) != null, "Invalid section type " + globalSearchSectionType);
        this.zzCY = versionCode;
        this.zzNe = content;
        this.zzNf = sectionInfo;
        this.zzNg = globalSearchSectionType;
        this.zzNh = blobContent;
        String s1 = this.zzkK();
        if(s1 != null) {
            throw new IllegalArgumentException(s1);
        }
    }

    public DocumentSection(String content, RegisterSectionInfo sectionInfo) {
        this(1, content, sectionInfo, DocumentSection.zzNc, null);
    }

    public DocumentSection(String content, RegisterSectionInfo sectionInfo, String globalSearchSectionType) {
        this(1, content, sectionInfo, zzh.zzbq(globalSearchSectionType), null);
    }

    public DocumentSection(byte[] blobContent, RegisterSectionInfo sectionInfo) {
        this(1, null, sectionInfo, DocumentSection.zzNc, blobContent);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzd.zza(this, dest, flags);
    }

    public static DocumentSection zzh(byte[] arr_b) {
        return new DocumentSection(arr_b, DocumentSection.zzNd);
    }

    public String zzkK() {
        if(this.zzNg != DocumentSection.zzNc && zzh.zzai(this.zzNg) == null) {
            return "Invalid section type " + this.zzNg;
        }
        return this.zzNe == null || this.zzNh == null ? null : "Both content and blobContent set";
    }
}

