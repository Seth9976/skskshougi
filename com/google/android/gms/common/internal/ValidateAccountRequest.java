package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValidateAccountRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final IBinder zzZO;
    private final Scope[] zzZP;
    private final int zzabg;
    private final Bundle zzabh;
    private final String zzabi;

    static {
        ValidateAccountRequest.CREATOR = new zzaa();
    }

    ValidateAccountRequest(int versionCode, int clientVersion, IBinder accountAccessorBinder, Scope[] scopes, Bundle extraArgs, String callingPackage) {
        this.zzCY = versionCode;
        this.zzabg = clientVersion;
        this.zzZO = accountAccessorBinder;
        this.zzZP = scopes;
        this.zzabh = extraArgs;
        this.zzabi = callingPackage;
    }

    public ValidateAccountRequest(IAccountAccessor accountAccessor, Scope[] scopes, String callingPackage, Bundle extraArgs) {
        IBinder iBinder0 = accountAccessor == null ? null : accountAccessor.asBinder();
        this(1, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, iBinder0, scopes, extraArgs, callingPackage);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCallingPackage() {
        return this.zzabi;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzaa.zza(this, dest, flags);
    }

    public int zzod() {
        return this.zzabg;
    }

    public Scope[] zzoe() {
        return this.zzZP;
    }

    public Bundle zzof() {
        return this.zzabh;
    }
}

