package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConverterWrapper implements SafeParcelable {
    public static final zza CREATOR;
    private final int zzCY;
    private final StringToIntConverter zzabA;

    static {
        ConverterWrapper.CREATOR = new zza();
    }

    ConverterWrapper(int versionCode, StringToIntConverter stringToIntConverter) {
        this.zzCY = versionCode;
        this.zzabA = stringToIntConverter;
    }

    private ConverterWrapper(StringToIntConverter stringToIntConverter) {
        this.zzCY = 1;
        this.zzabA = stringToIntConverter;
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
        zza.zza(this, out, flags);
    }

    public static ConverterWrapper zza(com.google.android.gms.common.server.response.FastJsonResponse.zza fastJsonResponse$zza0) {
        if(!(fastJsonResponse$zza0 instanceof StringToIntConverter)) {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
        return new ConverterWrapper(((StringToIntConverter)fastJsonResponse$zza0));
    }

    StringToIntConverter zzoh() {
        return this.zzabA;
    }

    public com.google.android.gms.common.server.response.FastJsonResponse.zza zzoi() {
        if(this.zzabA == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        return this.zzabA;
    }
}

