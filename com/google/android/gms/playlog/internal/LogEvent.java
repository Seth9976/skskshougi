package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LogEvent implements SafeParcelable {
    public static final zzc CREATOR;
    public final String tag;
    public final int versionCode;
    public final long zzaGF;
    public final byte[] zzaGG;
    public final Bundle zzaGH;

    static {
        LogEvent.CREATOR = new zzc();
    }

    LogEvent(int versionCode, long eventTime, String tag, byte[] sourceExtensionBytes, Bundle keyValuePairs) {
        this.versionCode = versionCode;
        this.zzaGF = eventTime;
        this.tag = tag;
        this.zzaGG = sourceExtensionBytes;
        this.zzaGH = keyValuePairs;
    }

    public LogEvent(long eventTime, String tag, byte[] sourceExtensionBytes, String[] extras) {
        this.versionCode = 1;
        this.zzaGF = eventTime;
        this.tag = tag;
        this.zzaGG = sourceExtensionBytes;
        this.zzaGH = LogEvent.zzd(extras);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("tag=").append(this.tag).append(",");
        stringBuilder0.append("eventTime=").append(this.zzaGF).append(",");
        if(this.zzaGH != null && !this.zzaGH.isEmpty()) {
            stringBuilder0.append("keyValues=");
            for(Object object0: this.zzaGH.keySet()) {
                stringBuilder0.append("(").append(((String)object0)).append(",");
                stringBuilder0.append(this.zzaGH.getString(((String)object0))).append(")");
                stringBuilder0.append(" ");
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzc.zza(this, out, flags);
    }

    private static Bundle zzd(String[] arr_s) {
        Bundle bundle0 = null;
        if(arr_s != null) {
            if(arr_s.length % 2 != 0) {
                throw new IllegalArgumentException("extras must have an even number of elements");
            }
            int v = arr_s.length / 2;
            if(v != 0) {
                bundle0 = new Bundle(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    bundle0.putString(arr_s[v1 * 2], arr_s[v1 * 2 + 1]);
                }
            }
        }
        return bundle0;
    }
}

