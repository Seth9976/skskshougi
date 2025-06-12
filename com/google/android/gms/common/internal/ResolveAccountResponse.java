package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private boolean zzWY;
    private ConnectionResult zzYh;
    IBinder zzZO;
    private boolean zzabd;

    static {
        ResolveAccountResponse.CREATOR = new zzw();
    }

    public ResolveAccountResponse(int connectionResultStatusCode) {
        this(new ConnectionResult(connectionResultStatusCode, null));
    }

    ResolveAccountResponse(int versionCode, IBinder accountAccessorBinder, ConnectionResult connectionResult, boolean saveDefaultAccount, boolean isFromCrossClientAuth) {
        this.zzCY = versionCode;
        this.zzZO = accountAccessorBinder;
        this.zzYh = connectionResult;
        this.zzWY = saveDefaultAccount;
        this.zzabd = isFromCrossClientAuth;
    }

    public ResolveAccountResponse(ConnectionResult result) {
        this(1, null, result, false, false);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof ResolveAccountResponse ? this.zzYh.equals(((ResolveAccountResponse)o).zzYh) && this.zznZ().equals(((ResolveAccountResponse)o).zznZ()) : false;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzw.zza(this, dest, flags);
    }

    public IAccountAccessor zznZ() {
        return zza.zzaD(this.zzZO);
    }

    public ConnectionResult zzoa() {
        return this.zzYh;
    }

    public boolean zzob() {
        return this.zzWY;
    }

    public boolean zzoc() {
        return this.zzabd;
    }
}

