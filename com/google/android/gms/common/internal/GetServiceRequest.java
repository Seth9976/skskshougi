package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;

public class GetServiceRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int version;
    final int zzaad;
    int zzaae;
    String zzaaf;
    IBinder zzaag;
    Scope[] zzaah;
    Bundle zzaai;
    Account zzaaj;

    static {
        GetServiceRequest.CREATOR = new zzh();
    }

    public GetServiceRequest(int serviceId) {
        this.version = 2;
        this.zzaae = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzaad = serviceId;
    }

    GetServiceRequest(int version, int serviceId, int clientVersion, String callingPackage, IBinder accountAccessorBinder, Scope[] scopes, Bundle extraArgs, Account clientRequestedAccount) {
        this.version = version;
        this.zzaad = serviceId;
        this.zzaae = clientVersion;
        this.zzaaf = callingPackage;
        if(version < 2) {
            this.zzaaj = this.zzaC(accountAccessorBinder);
        }
        else {
            this.zzaag = accountAccessorBinder;
            this.zzaaj = clientRequestedAccount;
        }
        this.zzaah = scopes;
        this.zzaai = extraArgs;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }

    private Account zzaC(IBinder iBinder0) {
        return iBinder0 == null ? null : zza.zza(com.google.android.gms.common.internal.IAccountAccessor.zza.zzaD(iBinder0));
    }

    public GetServiceRequest zzb(Account account0) {
        this.zzaaj = account0;
        return this;
    }

    public GetServiceRequest zzb(IAccountAccessor iAccountAccessor0) {
        if(iAccountAccessor0 != null) {
            this.zzaag = iAccountAccessor0.asBinder();
        }
        return this;
    }

    public GetServiceRequest zzb(Collection collection0) {
        this.zzaah = (Scope[])collection0.toArray(new Scope[collection0.size()]);
        return this;
    }

    public GetServiceRequest zzcb(String s) {
        this.zzaaf = s;
        return this;
    }

    public GetServiceRequest zzf(Bundle bundle0) {
        this.zzaai = bundle0;
        return this;
    }
}

