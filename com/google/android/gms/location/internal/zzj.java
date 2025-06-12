package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import java.util.List;

public class zzj extends zzb {
    final class zza extends zzc {
        private final int zzTS;
        private final String[] zzayT;
        final zzj zzayU;

        public zza(com.google.android.gms.location.zze.zza zze$zza0, int v, String[] arr_s) {
            super(zze$zza0);
            this.zzTS = LocationStatusCodes.zzgA(v);
            this.zzayT = arr_s;
        }

        protected void zza(com.google.android.gms.location.zze.zza zze$zza0) {
            if(zze$zza0 != null) {
                zze$zza0.zza(this.zzTS, this.zzayT);
            }
        }

        @Override  // com.google.android.gms.common.internal.zzi$zzc
        protected void zznP() {
        }

        @Override  // com.google.android.gms.common.internal.zzi$zzc
        protected void zzr(Object object0) {
            this.zza(((com.google.android.gms.location.zze.zza)object0));
        }
    }

    static final class com.google.android.gms.location.internal.zzj.zzb extends com.google.android.gms.location.internal.zzf.zza {
        private com.google.android.gms.location.zze.zza zzayV;
        private com.google.android.gms.location.zze.zzb zzayW;
        private zzj zzayX;

        public com.google.android.gms.location.internal.zzj.zzb(com.google.android.gms.location.zze.zza zze$zza0, zzj zzj0) {
            this.zzayV = zze$zza0;
            this.zzayW = null;
            this.zzayX = zzj0;
        }

        public com.google.android.gms.location.internal.zzj.zzb(com.google.android.gms.location.zze.zzb zze$zzb0, zzj zzj0) {
            this.zzayW = zze$zzb0;
            this.zzayV = null;
            this.zzayX = zzj0;
        }

        @Override  // com.google.android.gms.location.internal.zzf
        public void zza(int v, PendingIntent pendingIntent0) {
            if(this.zzayX == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            }
            zzj zzj0 = this.zzayX;
            zzj zzj1 = this.zzayX;
            zzj1.getClass();
            zzj0.zza(new com.google.android.gms.location.internal.zzj.zzc(zzj1, 1, this.zzayW, v, pendingIntent0));
            this.zzayX = null;
            this.zzayV = null;
            this.zzayW = null;
        }

        @Override  // com.google.android.gms.location.internal.zzf
        public void zza(int v, String[] arr_s) throws RemoteException {
            if(this.zzayX == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            zzj zzj0 = this.zzayX;
            zzj zzj1 = this.zzayX;
            zzj1.getClass();
            zzj0.zza(new zza(zzj1, this.zzayV, v, arr_s));
            this.zzayX = null;
            this.zzayV = null;
            this.zzayW = null;
        }

        @Override  // com.google.android.gms.location.internal.zzf
        public void zzb(int v, String[] arr_s) {
            if(this.zzayX == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            }
            zzj zzj0 = this.zzayX;
            zzj zzj1 = this.zzayX;
            zzj1.getClass();
            zzj0.zza(new com.google.android.gms.location.internal.zzj.zzc(zzj1, 2, this.zzayW, v, arr_s));
            this.zzayX = null;
            this.zzayV = null;
            this.zzayW = null;
        }
    }

    final class com.google.android.gms.location.internal.zzj.zzc extends zzc {
        private final PendingIntent mPendingIntent;
        private final int zzTS;
        private final String[] zzayT;
        final zzj zzayU;
        private final int zzayY;

        public com.google.android.gms.location.internal.zzj.zzc(int v, com.google.android.gms.location.zze.zzb zze$zzb0, int v1, PendingIntent pendingIntent0) {
            boolean z = true;
            zzj.this = zzj0;
            super(zze$zzb0);
            if(v != 1) {
                z = false;
            }
            com.google.android.gms.common.internal.zzb.zzU(z);
            this.zzayY = v;
            this.zzTS = LocationStatusCodes.zzgA(v1);
            this.mPendingIntent = pendingIntent0;
            this.zzayT = null;
        }

        public com.google.android.gms.location.internal.zzj.zzc(int v, com.google.android.gms.location.zze.zzb zze$zzb0, int v1, String[] arr_s) {
            super(zze$zzb0);
            com.google.android.gms.common.internal.zzb.zzU(v == 2);
            this.zzayY = v;
            this.zzTS = LocationStatusCodes.zzgA(v1);
            this.zzayT = arr_s;
            this.mPendingIntent = null;
        }

        protected void zza(com.google.android.gms.location.zze.zzb zze$zzb0) {
            if(zze$zzb0 != null) {
                switch(this.zzayY) {
                    case 1: {
                        zze$zzb0.zza(this.zzTS, this.mPendingIntent);
                        return;
                    }
                    case 2: {
                        zze$zzb0.zzb(this.zzTS, this.zzayT);
                        return;
                    }
                    default: {
                        Log.wtf("LocationClientImpl", "Unsupported action: " + this.zzayY);
                        break;
                    }
                }
            }
        }

        @Override  // com.google.android.gms.common.internal.zzi$zzc
        protected void zznP() {
        }

        @Override  // com.google.android.gms.common.internal.zzi$zzc
        protected void zzr(Object object0) {
            this.zza(((com.google.android.gms.location.zze.zzb)object0));
        }
    }

    static final class zzd extends com.google.android.gms.location.internal.zzh.zza {
        private com.google.android.gms.common.api.zza.zzb zzayZ;

        public zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            zzu.zzb(zza$zzb0 != null, "listener can\'t be null.");
            this.zzayZ = zza$zzb0;
        }

        @Override  // com.google.android.gms.location.internal.zzh
        public void zza(LocationSettingsResult locationSettingsResult0) throws RemoteException {
            this.zzayZ.zzm(locationSettingsResult0);
            this.zzayZ = null;
        }
    }

    private final zzi zzayR;
    private final com.google.android.gms.location.copresence.internal.zzb zzayS;

    public zzj(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s) {
        this(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, new Builder(context0).zzmx());
    }

    public zzj(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s, zze zze0) {
        this(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, zze0, CopresenceApiOptions.zzayn);
    }

    public zzj(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s, zze zze0, CopresenceApiOptions copresenceApiOptions0) {
        super(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, zze0);
        this.zzayR = new zzi(context0, this.zzayq);
        this.zzayS = com.google.android.gms.location.copresence.internal.zzb.zza(context0, zze0.getAccountName(), zze0.zzny(), this.zzayq, copresenceApiOptions0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        synchronized(this.zzayR) {
            if(this.isConnected()) {
                try {
                    this.zzayR.removeAllListeners();
                    this.zzayR.zzux();
                }
                catch(Exception exception0) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", exception0);
                }
            }
            super.disconnect();
        }
    }

    public Location getLastLocation() {
        return this.zzayR.getLastLocation();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresAccount() {
        return true;
    }

    public void zza(long v, PendingIntent pendingIntent0) throws RemoteException {
        this.zznL();
        zzu.zzu(pendingIntent0);
        zzu.zzb(v >= 0L, "detectionIntervalMillis must be >= 0");
        ((zzg)this.zznM()).zza(v, true, pendingIntent0);
    }

    public void zza(PendingIntent pendingIntent0) throws RemoteException {
        this.zznL();
        zzu.zzu(pendingIntent0);
        ((zzg)this.zznM()).zza(pendingIntent0);
    }

    public void zza(PendingIntent pendingIntent0, com.google.android.gms.location.zze.zzb zze$zzb0) throws RemoteException {
        this.zznL();
        zzu.zzb(pendingIntent0, "PendingIntent must be specified.");
        zzu.zzb(zze$zzb0, "OnRemoveGeofencesResultListener not provided.");
        com.google.android.gms.location.internal.zzj.zzb zzj$zzb0 = zze$zzb0 == null ? null : new com.google.android.gms.location.internal.zzj.zzb(zze$zzb0, this);
        ((zzg)this.zznM()).zza(pendingIntent0, zzj$zzb0, "org.dyndns.vivi.SkskShogi");
    }

    public void zza(GeofencingRequest geofencingRequest0, PendingIntent pendingIntent0, com.google.android.gms.location.zze.zza zze$zza0) throws RemoteException {
        this.zznL();
        zzu.zzb(geofencingRequest0, "geofencingRequest can\'t be null.");
        zzu.zzb(pendingIntent0, "PendingIntent must be specified.");
        zzu.zzb(zze$zza0, "OnAddGeofencesResultListener not provided.");
        com.google.android.gms.location.internal.zzj.zzb zzj$zzb0 = zze$zza0 == null ? null : new com.google.android.gms.location.internal.zzj.zzb(zze$zza0, this);
        ((zzg)this.zznM()).zza(geofencingRequest0, pendingIntent0, zzj$zzb0);
    }

    public void zza(LocationCallback locationCallback0) throws RemoteException {
        this.zzayR.zza(locationCallback0);
    }

    public void zza(LocationListener locationListener0) throws RemoteException {
        this.zzayR.zza(locationListener0);
    }

    public void zza(LocationRequest locationRequest0, LocationListener locationListener0, Looper looper0) throws RemoteException {
        synchronized(this.zzayR) {
            this.zzayR.zza(locationRequest0, locationListener0, looper0);
        }
    }

    public void zza(LocationSettingsRequest locationSettingsRequest0, com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        boolean z = true;
        this.zznL();
        zzu.zzb(locationSettingsRequest0 != null, "locationSettingsRequest can\'t be null nor empty.");
        if(zza$zzb0 == null) {
            z = false;
        }
        zzu.zzb(z, "listener can\'t be null.");
        zzd zzj$zzd0 = new zzd(zza$zzb0);
        ((zzg)this.zznM()).zza(locationSettingsRequest0, zzj$zzd0, s);
    }

    public void zza(LocationRequestInternal locationRequestInternal0, LocationCallback locationCallback0, Looper looper0) throws RemoteException {
        synchronized(this.zzayR) {
            this.zzayR.zza(locationRequestInternal0, locationCallback0, looper0);
        }
    }

    public void zza(List list0, com.google.android.gms.location.zze.zzb zze$zzb0) throws RemoteException {
        this.zznL();
        zzu.zzb(list0 != null && list0.size() > 0, "geofenceRequestIds can\'t be null nor empty.");
        zzu.zzb(zze$zzb0, "OnRemoveGeofencesResultListener not provided.");
        String[] arr_s = (String[])list0.toArray(new String[0]);
        com.google.android.gms.location.internal.zzj.zzb zzj$zzb0 = zze$zzb0 == null ? null : new com.google.android.gms.location.internal.zzj.zzb(zze$zzb0, this);
        ((zzg)this.zznM()).zza(arr_s, zzj$zzb0, "org.dyndns.vivi.SkskShogi");
    }

    public void zzac(boolean z) throws RemoteException {
        this.zzayR.zzac(z);
    }

    public void zzb(Location location0) throws RemoteException {
        this.zzayR.zzb(location0);
    }

    public void zzb(LocationRequest locationRequest0, PendingIntent pendingIntent0) throws RemoteException {
        this.zzayR.zzb(locationRequest0, pendingIntent0);
    }

    public void zzd(PendingIntent pendingIntent0) throws RemoteException {
        this.zzayR.zzd(pendingIntent0);
    }

    public LocationAvailability zzuw() {
        return this.zzayR.zzuw();
    }
}

