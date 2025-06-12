package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.fitness.zza;
import java.util.Set;

public abstract class zzlw extends zzi {
    protected zzlw(Context context0, Looper looper0, int v, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, zze zze0) {
        super(context0, looper0, v, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresAccount() {
        return true;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresSignIn() {
        return !zzlv.zzam(this.getContext());
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Set zza(Set set0) {
        return zza.zzd(set0);
    }
}

