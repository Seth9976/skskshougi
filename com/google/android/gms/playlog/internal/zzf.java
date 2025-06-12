package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzrn;
import java.util.ArrayList;

public class zzf extends zzi {
    private final String zzMZ;
    private final zzd zzaGW;
    private final zzb zzaGX;
    private boolean zzaGY;
    private final Object zzqt;

    public zzf(Context context0, Looper looper0, zzd zzd0, zze zze0) {
        super(context0, looper0, 24, zzd0, zzd0, zze0);
        this.zzMZ = "org.dyndns.vivi.SkskShogi";
        this.zzaGW = (zzd)zzu.zzu(zzd0);
        this.zzaGW.zza(this);
        this.zzaGX = new zzb();
        this.zzqt = new Object();
        this.zzaGY = true;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.playlog.service.START";
    }

    public void start() {
        synchronized(this.zzqt) {
            if(this.isConnecting() || this.isConnected()) {
                return;
            }
            this.zzaGW.zzaj(true);
            this.zznJ();
        }
    }

    public void stop() {
        synchronized(this.zzqt) {
            this.zzaGW.zzaj(false);
            this.disconnect();
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdq(iBinder0);
    }

    void zzak(boolean z) {
        synchronized(this.zzqt) {
            boolean z1 = this.zzaGY;
            this.zzaGY = z;
            if(z1 && !this.zzaGY) {
                this.zzxp();
            }
        }
    }

    public void zzb(PlayLoggerContext playLoggerContext0, LogEvent logEvent0) {
        synchronized(this.zzqt) {
            if(this.zzaGY) {
                this.zzc(playLoggerContext0, logEvent0);
            }
            else {
                this.zzd(playLoggerContext0, logEvent0);
            }
        }
    }

    private void zzc(PlayLoggerContext playLoggerContext0, LogEvent logEvent0) {
        this.zzaGX.zza(playLoggerContext0, logEvent0);
    }

    private void zzd(PlayLoggerContext playLoggerContext0, LogEvent logEvent0) {
        try {
            this.zzxp();
            ((zza)this.zznM()).zza(this.zzMZ, playLoggerContext0, logEvent0);
        }
        catch(RemoteException unused_ex) {
            Log.e("PlayLoggerImpl", "Couldn\'t send log event.  Will try caching.");
            this.zzc(playLoggerContext0, logEvent0);
        }
        catch(IllegalStateException unused_ex) {
            Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
            this.zzc(playLoggerContext0, logEvent0);
        }
    }

    protected zza zzdq(IBinder iBinder0) {
        return com.google.android.gms.playlog.internal.zza.zza.zzdp(iBinder0);
    }

    private void zzxp() {
        PlayLoggerContext playLoggerContext1;
        com.google.android.gms.common.internal.zzb.zzU(!this.zzaGY);
        if(!this.zzaGX.isEmpty()) {
            try {
                PlayLoggerContext playLoggerContext0 = null;
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: this.zzaGX.zzxn()) {
                    com.google.android.gms.playlog.internal.zzb.zza zzb$zza0 = (com.google.android.gms.playlog.internal.zzb.zza)object0;
                    if(zzb$zza0.zzaGM == null) {
                        if(zzb$zza0.zzaGK.equals(playLoggerContext0)) {
                            arrayList0.add(zzb$zza0.zzaGL);
                            playLoggerContext1 = playLoggerContext0;
                        }
                        else {
                            if(!arrayList0.isEmpty()) {
                                ((zza)this.zznM()).zza(this.zzMZ, playLoggerContext0, arrayList0);
                                arrayList0.clear();
                            }
                            arrayList0.add(zzb$zza0.zzaGL);
                            playLoggerContext1 = zzb$zza0.zzaGK;
                        }
                        playLoggerContext0 = playLoggerContext1;
                    }
                    else {
                        zza zza0 = (zza)this.zznM();
                        byte[] arr_b = zzrn.zzf(zzb$zza0.zzaGM);
                        zza0.zza(this.zzMZ, zzb$zza0.zzaGK, arr_b);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    ((zza)this.zznM()).zza(this.zzMZ, playLoggerContext0, arrayList0);
                }
                this.zzaGX.clear();
            }
            catch(RemoteException unused_ex) {
                Log.e("PlayLoggerImpl", "Couldn\'t send cached log events to AndroidLog service.  Retaining in memory cache.");
            }
        }
    }
}

