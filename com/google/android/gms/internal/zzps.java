package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.signin.internal.zze;
import java.util.Set;

public interface zzps extends Client {
    void connect();

    void zza(IAccountAccessor arg1, Set arg2, zze arg3);

    void zza(IAccountAccessor arg1, boolean arg2);

    void zza(zzq arg1);

    void zzxY();
}

