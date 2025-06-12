package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.HashMap;
import java.util.Map;

public class zzi {
    static class zza extends com.google.android.gms.location.zzc.zza {
        private Handler zzayO;

        zza(LocationCallback locationCallback0, Looper looper0) {
            if(looper0 == null) {
                looper0 = Looper.myLooper();
                zzu.zza(looper0 != null, "Can\'t create handler inside thread that has not called Looper.prepare()");
            }
            this.zzayO = new Handler(looper0) {
                @Override  // android.os.Handler
                public void handleMessage(Message msg) {
                    switch(msg.what) {
                        case 0: {
                            return;
                        }
                        case 1: {
                        }
                    }
                }
            };
        }

        @Override  // com.google.android.gms.location.zzc
        public void onLocationAvailability(LocationAvailability state) {
            this.zzb(1, state);
        }

        @Override  // com.google.android.gms.location.zzc
        public void onLocationResult(LocationResult locationResult) {
            this.zzb(0, locationResult);
        }

        public void release() {
            this.zzayO = null;
        }

        private void zzb(int v, Object object0) {
            if(this.zzayO == null) {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            }
            Message message0 = Message.obtain();
            message0.what = v;
            message0.obj = object0;
            this.zzayO.sendMessage(message0);
        }
    }

    static class zzb extends Handler {
        private final LocationListener zzayQ;

        public zzb(LocationListener locationListener0) {
            this.zzayQ = locationListener0;
        }

        public zzb(LocationListener locationListener0, Looper looper0) {
            super(looper0);
            this.zzayQ = locationListener0;
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            if(msg.what != 1) {
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                return;
            }
            Location location0 = new Location(((Location)msg.obj));
            this.zzayQ.onLocationChanged(location0);
        }
    }

    static class zzc extends com.google.android.gms.location.zzd.zza {
        private Handler zzayO;

        zzc(LocationListener locationListener0, Looper looper0) {
            if(looper0 == null) {
                zzu.zza(Looper.myLooper() != null, "Can\'t create handler inside thread that has not called Looper.prepare()");
            }
            this.zzayO = looper0 == null ? new zzb(locationListener0) : new zzb(locationListener0, looper0);
        }

        @Override  // com.google.android.gms.location.zzd
        public void onLocationChanged(Location location) {
            if(this.zzayO == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message message0 = Message.obtain();
            message0.what = 1;
            message0.obj = location;
            this.zzayO.sendMessage(message0);
        }

        public void release() {
            this.zzayO = null;
        }
    }

    private final Context mContext;
    private Map zzakE;
    private ContentProviderClient zzayL;
    private boolean zzayM;
    private Map zzayN;
    private final zzn zzayq;

    public zzi(Context context0, zzn zzn0) {
        this.zzayL = null;
        this.zzayM = false;
        this.zzakE = new HashMap();
        this.zzayN = new HashMap();
        this.mContext = context0;
        this.zzayq = zzn0;
    }

    public Location getLastLocation() {
        this.zzayq.zznL();
        try {
            return ((zzg)this.zzayq.zznM()).zzdl("org.dyndns.vivi.SkskShogi");
        }
        catch(RemoteException remoteException0) {
            throw new IllegalStateException(remoteException0);
        }
    }

    public void removeAllListeners() {
        try {
            Map map0 = this.zzakE;
            synchronized(map0) {
                for(Object object0: this.zzakE.values()) {
                    zzc zzi$zzc0 = (zzc)object0;
                    if(zzi$zzc0 != null) {
                        ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zzb(zzi$zzc0));
                    }
                }
                this.zzakE.clear();
                for(Object object1: this.zzayN.values()) {
                    zza zzi$zza0 = (zza)object1;
                    if(zzi$zza0 != null) {
                        ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zza(zzi$zza0));
                    }
                }
                this.zzayN.clear();
            }
        }
        catch(RemoteException remoteException0) {
            throw new IllegalStateException(remoteException0);
        }
    }

    private zza zza(LocationCallback locationCallback0, Looper looper0) {
        synchronized(this.zzakE) {
            zza zzi$zza0 = (zza)this.zzayN.get(locationCallback0);
            if(zzi$zza0 == null) {
                zzi$zza0 = new zza(locationCallback0, looper0);
            }
            this.zzayN.put(locationCallback0, zzi$zza0);
            return zzi$zza0;
        }
    }

    private zzc zza(LocationListener locationListener0, Looper looper0) {
        synchronized(this.zzakE) {
            zzc zzi$zzc0 = (zzc)this.zzakE.get(locationListener0);
            if(zzi$zzc0 == null) {
                zzi$zzc0 = new zzc(locationListener0, looper0);
            }
            this.zzakE.put(locationListener0, zzi$zzc0);
            return zzi$zzc0;
        }
    }

    public void zza(LocationCallback locationCallback0) throws RemoteException {
        this.zzayq.zznL();
        zzu.zzb(locationCallback0, "Invalid null callback");
        synchronized(this.zzayN) {
            zza zzi$zza0 = (zza)this.zzayN.remove(locationCallback0);
            if(zzi$zza0 != null) {
                zzi$zza0.release();
                ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zza(zzi$zza0));
            }
        }
    }

    public void zza(LocationListener locationListener0) throws RemoteException {
        this.zzayq.zznL();
        zzu.zzb(locationListener0, "Invalid null listener");
        synchronized(this.zzakE) {
            zzc zzi$zzc0 = (zzc)this.zzakE.remove(locationListener0);
            if(this.zzayL != null && this.zzakE.isEmpty()) {
                this.zzayL.release();
                this.zzayL = null;
            }
            if(zzi$zzc0 != null) {
                zzi$zzc0.release();
                ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zzb(zzi$zzc0));
            }
        }
    }

    public void zza(LocationRequest locationRequest0, LocationListener locationListener0, Looper looper0) throws RemoteException {
        this.zzayq.zznL();
        zzc zzi$zzc0 = this.zza(locationListener0, looper0);
        ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationRequest0), zzi$zzc0));
    }

    public void zza(LocationRequestInternal locationRequestInternal0, LocationCallback locationCallback0, Looper looper0) throws RemoteException {
        this.zzayq.zznL();
        zza zzi$zza0 = this.zza(locationCallback0, looper0);
        ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zza(locationRequestInternal0, zzi$zza0));
    }

    public void zzac(boolean z) throws RemoteException {
        this.zzayq.zznL();
        ((zzg)this.zzayq.zznM()).zzac(z);
        this.zzayM = z;
    }

    public void zzb(Location location0) throws RemoteException {
        this.zzayq.zznL();
        ((zzg)this.zzayq.zznM()).zzb(location0);
    }

    public void zzb(LocationRequest locationRequest0, PendingIntent pendingIntent0) throws RemoteException {
        this.zzayq.zznL();
        ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationRequest0), pendingIntent0));
    }

    public void zzd(PendingIntent pendingIntent0) throws RemoteException {
        this.zzayq.zznL();
        ((zzg)this.zzayq.zznM()).zza(LocationRequestUpdateData.zze(pendingIntent0));
    }

    public LocationAvailability zzuw() {
        this.zzayq.zznL();
        try {
            return ((zzg)this.zzayq.zznM()).zzdm("org.dyndns.vivi.SkskShogi");
        }
        catch(RemoteException remoteException0) {
            throw new IllegalStateException(remoteException0);
        }
    }

    public void zzux() {
        if(this.zzayM) {
            try {
                this.zzac(false);
            }
            catch(RemoteException remoteException0) {
                throw new IllegalStateException(remoteException0);
            }
        }
    }
}

