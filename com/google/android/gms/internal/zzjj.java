package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth.zza;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

public final class zzjj extends zzi {
    private final Bundle zzOR;

    public zzjj(Context context0, Looper looper0, zze zze0, zza auth$zza0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 16, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzOR = auth$zza0 == null ? new Bundle() : auth$zza0.zzkY();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresSignIn() {
        zze zze0 = this.zznK();
        return !TextUtils.isEmpty(zze0.getAccountName()) && !zze0.zzb(Auth.zzOL).isEmpty();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzar(iBinder0);
    }

    protected zzjl zzar(IBinder iBinder0) {
        return com.google.android.gms.internal.zzjl.zza.zzat(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        return this.zzOR;
    }
}

