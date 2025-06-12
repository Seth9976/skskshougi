package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;

public class AuthAccountRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final IBinder zzZO;
    final Scope[] zzZP;

    static {
        AuthAccountRequest.CREATOR = new zzc();
    }

    AuthAccountRequest(int versionCode, IBinder accountAccessorBinder, Scope[] scopes) {
        this.zzCY = versionCode;
        this.zzZO = accountAccessorBinder;
        this.zzZP = scopes;
    }

    public AuthAccountRequest(IAccountAccessor accountAccessor, Set set0) {
        this(1, accountAccessor.asBinder(), ((Scope[])set0.toArray(new Scope[set0.size()])));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }
}

