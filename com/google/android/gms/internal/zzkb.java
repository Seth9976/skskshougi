package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzi;

public class zzkb extends zzi implements IBinder.DeathRecipient {
    private CastDevice zzQH;
    private static final zzl zzQW;
    private CastRemoteDisplaySessionCallbacks zzVB;

    static {
        zzkb.zzQW = new zzl("CastRemoteDisplayClientImpl");
    }

    public zzkb(Context context0, Looper looper0, CastDevice castDevice0, CastRemoteDisplaySessionCallbacks castRemoteDisplay$CastRemoteDisplaySessionCallbacks0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 83, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.zzVB = castRemoteDisplay$CastRemoteDisplaySessionCallbacks0;
        this.zzQH = castDevice0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public void binderDied() {
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        try {
            ((zzkd)this.zznM()).disconnect();
        }
        catch(RemoteException unused_ex) {
        }
        finally {
            super.disconnect();
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public IInterface zzT(IBinder iBinder0) {
        return this.zzay(iBinder0);
    }

    public void zza(zzkc zzkc0) throws RemoteException {
        zzkb.zzQW.zzb("stopRemoteDisplay", new Object[0]);
        ((zzkd)this.zznM()).zza(zzkc0);
    }

    public void zza(zzkc zzkc0, int v) throws RemoteException {
        ((zzkd)this.zznM()).zza(zzkc0, v);
    }

    public void zza(zzkc zzkc0, zzke zzke0, String s) throws RemoteException {
        zzkb.zzQW.zzb("startRemoteDisplay", new Object[0]);
        com.google.android.gms.internal.zzkb.1 zzkb$10 = new zza() {
            @Override  // com.google.android.gms.internal.zzke
            public void zzaR(int v) throws RemoteException {
                zzkb.zzQW.zzb("onRemoteDisplayEnded", new Object[0]);
                if(zzke0 != null) {
                    zzke0.zzaR(v);
                }
                if(zzkb.this.zzVB != null) {
                    zzkb.this.zzVB.onRemoteDisplayEnded(new Status(v));
                }
            }
        };
        ((zzkd)this.zznM()).zza(zzkc0, zzkb$10, this.zzQH.getDeviceId(), s);
    }

    public zzkd zzay(IBinder iBinder0) {
        return com.google.android.gms.internal.zzkd.zza.zzaA(iBinder0);
    }
}

