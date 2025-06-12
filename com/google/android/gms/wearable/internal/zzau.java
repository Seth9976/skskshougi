package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;

final class zzau {
    static class zza extends zzb {
        private WeakReference zzaUA;
        private WeakReference zzaUB;

        zza(Map map0, Object object0, com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
            this.zzaUA = new WeakReference(map0);
            this.zzaUB = new WeakReference(object0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(Status status0) {
            Map map0 = (Map)this.zzaUA.get();
            Object object0 = this.zzaUB.get();
            if(!status0.isSuccess() && map0 != null && object0 != null) {
                synchronized(map0) {
                    zzbl zzbl0 = (zzbl)map0.remove(object0);
                    if(zzbl0 != null) {
                        zzbl0.clear();
                    }
                }
            }
            this.zzP(status0);
        }
    }

    static class com.google.android.gms.wearable.internal.zzau.zzb extends zzb {
        private WeakReference zzaUA;
        private WeakReference zzaUB;

        com.google.android.gms.wearable.internal.zzau.zzb(Map map0, Object object0, com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
            this.zzaUA = new WeakReference(map0);
            this.zzaUB = new WeakReference(object0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(Status status0) {
            Map map0 = (Map)this.zzaUA.get();
            Object object0 = this.zzaUB.get();
            if(status0.getStatusCode() == 4002 && map0 != null && object0 != null) {
                synchronized(map0) {
                    zzbl zzbl0 = (zzbl)map0.remove(object0);
                    if(zzbl0 != null) {
                        zzbl0.clear();
                    }
                }
            }
            this.zzP(status0);
        }
    }

    private final Map zzakE;

    zzau() {
        this.zzakE = new HashMap();
    }

    public boolean isEmpty() {
        synchronized(this.zzakE) {
        }
        return this.zzakE.isEmpty();
    }

    public void zza(zzbk zzbk0, com.google.android.gms.common.api.zza.zzb zza$zzb0, Object object0) throws RemoteException {
        synchronized(this.zzakE) {
            zzbl zzbl0 = (zzbl)this.zzakE.remove(object0);
            if(zzbl0 == null) {
                zza$zzb0.zzm(new Status(4002));
                return;
            }
            zzbl0.clear();
            ((zzat)zzbk0.zznM()).zza(new com.google.android.gms.wearable.internal.zzau.zzb(this.zzakE, object0, zza$zzb0), new RemoveListenerRequest(zzbl0));
        }
    }

    public void zza(zzbk zzbk0, com.google.android.gms.common.api.zza.zzb zza$zzb0, Object object0, zzbl zzbl0) throws RemoteException {
        Map map0 = this.zzakE;
        __monitor_enter(map0);
        int v = FIN.finallyOpen$NT();
        if(this.zzakE.get(object0) != null) {
            zza$zzb0.zzm(new Status(4001));
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(map0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        this.zzakE.put(object0, zzbl0);
        try {
            ((zzat)zzbk0.zznM()).zza(new zza(this.zzakE, object0, zza$zzb0), new AddListenerRequest(zzbl0));
            FIN.finallyExec$NT(v);
        }
        catch(RemoteException remoteException0) {
            this.zzakE.remove(object0);
            FIN.finallyExec$NT(v);
            throw remoteException0;
        }
    }

    public void zzb(zzbk zzbk0) {
        synchronized(this.zzakE) {
            zzo zzbj$zzo0 = new zzo();
            for(Object object0: this.zzakE.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                zzbl zzbl0 = (zzbl)map$Entry0.getValue();
                if(zzbl0 != null) {
                    zzbl0.clear();
                    if(zzbk0.isConnected()) {
                        try {
                            ((zzat)zzbk0.zznM()).zza(zzbj$zzo0, new RemoveListenerRequest(zzbl0));
                            if(!Log.isLoggable("WearableClient", 2)) {
                                continue;
                            }
                            Log.d("WearableClient", "disconnect: removed: " + map$Entry0.getKey() + "/" + zzbl0);
                        }
                        catch(RemoteException unused_ex) {
                            Log.w("WearableClient", "disconnect: Didn\'t remove: " + map$Entry0.getKey() + "/" + zzbl0);
                        }
                    }
                }
            }
            this.zzakE.clear();
        }
    }

    public void zzdR(IBinder iBinder0) {
        synchronized(this.zzakE) {
            zzat zzat0 = com.google.android.gms.wearable.internal.zzat.zza.zzdQ(iBinder0);
            zzo zzbj$zzo0 = new zzo();
            for(Object object0: this.zzakE.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                zzbl zzbl0 = (zzbl)map$Entry0.getValue();
                try {
                    zzat0.zza(zzbj$zzo0, new AddListenerRequest(zzbl0));
                    if(!Log.isLoggable("WearableClient", 2)) {
                        continue;
                    }
                    Log.d("WearableClient", "onPostInitHandler: added: " + map$Entry0.getKey() + "/" + zzbl0);
                }
                catch(RemoteException unused_ex) {
                    Log.d("WearableClient", "onPostInitHandler: Didn\'t add: " + map$Entry0.getKey() + "/" + zzbl0);
                }
            }
        }
    }
}

