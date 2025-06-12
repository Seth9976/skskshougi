package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmq.zza;
import com.google.android.gms.internal.zzmq;
import java.util.List;

public class ReadRawRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzMZ;
    private final boolean zzalZ;
    private final boolean zzama;
    private final zzmq zzamo;
    private final List zzamp;

    static {
        ReadRawRequest.CREATOR = new zzq();
    }

    ReadRawRequest(int versionCode, IBinder callback, String packageName, List list0, boolean flushBufferBeforeRead, boolean serverQueriesEnabled) {
        this.zzCY = versionCode;
        this.zzamo = zza.zzbB(callback);
        this.zzamp = list0;
        this.zzMZ = packageName;
        this.zzalZ = flushBufferBeforeRead;
        this.zzama = serverQueriesEnabled;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.zzMZ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzq.zza(this, parcel, flags);
    }

    public IBinder zzqU() {
        return this.zzamo == null ? null : this.zzamo.asBinder();
    }

    public boolean zzqZ() {
        return this.zzama;
    }

    public boolean zzra() {
        return this.zzalZ;
    }

    public List zzrf() {
        return this.zzamp;
    }
}

