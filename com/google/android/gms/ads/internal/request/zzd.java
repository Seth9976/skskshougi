package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzhh;

@zzgd
public abstract class zzd extends zzhh implements zza {
    @zzgd
    public static final class com.google.android.gms.ads.internal.request.zzd.zza extends zzd {
        private final Context mContext;

        public com.google.android.gms.ads.internal.request.zzd.zza(Context context0, AdRequestInfoParcel adRequestInfoParcel0, zza zzc$zza0) {
            super(adRequestInfoParcel0, zzc$zza0);
            this.mContext = context0;
        }

        @Override  // com.google.android.gms.ads.internal.request.zzd
        public void zzfv() {
        }

        @Override  // com.google.android.gms.ads.internal.request.zzd
        public zzi zzfw() {
            zzbr zzbr0 = new zzbr(((String)zzbz.zztD.get()));
            zzge zzge0 = zzge.zzfC();
            return zzgf.zza(this.mContext, zzbr0, zzge0);
        }
    }

    @zzgd
    public static class zzb extends zzd implements ConnectionCallbacks, OnConnectionFailedListener {
        private Context mContext;
        private final zza zzCi;
        protected zze zzCj;
        private final Object zzqt;
        private AdRequestInfoParcel zzxm;

        public zzb(Context context0, AdRequestInfoParcel adRequestInfoParcel0, zza zzc$zza0) {
            super(adRequestInfoParcel0, zzc$zza0);
            this.zzqt = new Object();
            this.mContext = context0;
            this.zzxm = adRequestInfoParcel0;
            this.zzCi = zzc$zza0;
            this.zzCj = new zze(context0, this, this, adRequestInfoParcel0.zzpJ.zzGI);
            this.connect();
        }

        protected void connect() {
            this.zzCj.zznJ();
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
        public void onConnected(Bundle connectionHint) {
            this.zzgi();
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult result) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Cannot connect to remote service, fallback to local instance.");
            this.zzfx().zzgi();
            Bundle bundle0 = new Bundle();
            bundle0.putString("action", "gms_connection_failed_fallback_to_local");
            zzo.zzbv().zza(this.mContext, this.zzxm.zzpJ.zzGG, "gmob-apps", bundle0, true);
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
        public void onConnectionSuspended(int cause) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Disconnected from remote ad request service.");
        }

        @Override  // com.google.android.gms.ads.internal.request.zzd
        public void zzfv() {
            synchronized(this.zzqt) {
                if(this.zzCj.isConnected() || this.zzCj.isConnecting()) {
                    this.zzCj.disconnect();
                }
                Binder.flushPendingCommands();
            }
        }

        @Override  // com.google.android.gms.ads.internal.request.zzd
        public zzi zzfw() {
            synchronized(this.zzqt) {
                try {
                    return this.zzCj.zzfy();
                }
                catch(IllegalStateException | DeadObjectException unused_ex) {
                    return null;
                }
            }
        }

        zzhh zzfx() {
            return new com.google.android.gms.ads.internal.request.zzd.zza(this.mContext, this.zzxm, this.zzCi);
        }
    }

    private AdResponseParcel zzBt;
    private final zza zzCi;
    private final Object zzqt;
    private final AdRequestInfoParcel zzxm;

    public zzd(AdRequestInfoParcel adRequestInfoParcel0, zza zzc$zza0) {
        this.zzqt = new Object();
        this.zzxm = adRequestInfoParcel0;
        this.zzCi = zzc$zza0;
    }

    @Override  // com.google.android.gms.internal.zzhh
    public final void onStop() {
        this.zzfv();
    }

    boolean zza(zzi zzi0, AdRequestInfoParcel adRequestInfoParcel0) {
        try {
            zzi0.zza(adRequestInfoParcel0, new zzg(this));
            return true;
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service.", remoteException0);
            zzo.zzby().zzc(remoteException0, true);
        }
        catch(NullPointerException nullPointerException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", nullPointerException0);
            zzo.zzby().zzc(nullPointerException0, true);
        }
        catch(SecurityException securityException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", securityException0);
            zzo.zzby().zzc(securityException0, true);
        }
        catch(Throwable throwable0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", throwable0);
            zzo.zzby().zzc(throwable0, true);
        }
        AdResponseParcel adResponseParcel0 = new AdResponseParcel(0);
        this.zzCi.zzb(adResponseParcel0);
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.request.zzc$zza
    public void zzb(AdResponseParcel adResponseParcel0) {
        synchronized(this.zzqt) {
            this.zzBt = adResponseParcel0;
            this.zzqt.notify();
        }
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        try {
            zzi zzi0 = this.zzfw();
            if(zzi0 == null) {
                AdResponseParcel adResponseParcel0 = new AdResponseParcel(0);
                this.zzCi.zzb(adResponseParcel0);
            }
            else if(this.zza(zzi0, this.zzxm)) {
                this.zzi(zzo.zzbz().elapsedRealtime());
            }
        }
        finally {
            this.zzfv();
        }
    }

    protected boolean zze(long v) {
        long v1 = 60000L - (zzo.zzbz().elapsedRealtime() - v);
        if(v1 <= 0L) {
            return false;
        }
        try {
            this.zzqt.wait(v1);
            return true;
        }
        catch(InterruptedException unused_ex) {
            return false;
        }
    }

    public abstract void zzfv();

    public abstract zzi zzfw();

    protected void zzi(long v) {
        synchronized(this.zzqt) {
            do {
                if(this.zzBt != null) {
                    this.zzCi.zzb(this.zzBt);
                    return;
                }
            }
            while(this.zze(v));
            if(this.zzBt == null) {
                AdResponseParcel adResponseParcel0 = new AdResponseParcel(0);
                this.zzCi.zzb(adResponseParcel0);
            }
            else {
                this.zzCi.zzb(this.zzBt);
            }
        }
    }
}

