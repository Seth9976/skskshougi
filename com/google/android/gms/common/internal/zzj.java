package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzj implements Handler.Callback {
    public interface zza {
        boolean isConnected();

        Bundle zzlM();
    }

    private final Handler mHandler;
    private final zza zzaaC;
    private final ArrayList zzaaD;
    final ArrayList zzaaE;
    private final ArrayList zzaaF;
    private volatile boolean zzaaG;
    private final AtomicInteger zzaaH;
    private boolean zzaaI;
    private final Object zzqt;

    public zzj(Looper looper0, zza zzj$zza0) {
        this.zzaaD = new ArrayList();
        this.zzaaE = new ArrayList();
        this.zzaaF = new ArrayList();
        this.zzaaG = false;
        this.zzaaH = new AtomicInteger(0);
        this.zzaaI = false;
        this.zzqt = new Object();
        this.zzaaC = zzj$zza0;
        this.mHandler = new Handler(looper0, this);
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message msg) {
        if(msg.what == 1) {
            ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)msg.obj;
            Object object0 = this.zzqt;
            synchronized(object0) {
                if(this.zzaaG && this.zzaaC.isConnected() && this.zzaaD.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnected(this.zzaaC.zzlM());
                }
                return true;
            }
        }
        Log.wtf("GmsClientEvents", "Don\'t know how to handle this message.");
        return false;
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        zzu.zzu(listener);
        synchronized(this.zzqt) {
        }
        return this.zzaaD.contains(listener);
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        zzu.zzu(listener);
        synchronized(this.zzqt) {
        }
        return this.zzaaF.contains(listener);
    }

    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        zzu.zzu(listener);
        synchronized(this.zzqt) {
            if(this.zzaaD.contains(listener)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + listener + " is already registered");
            }
            else {
                this.zzaaD.add(listener);
            }
        }
        if(this.zzaaC.isConnected()) {
            Message message0 = this.mHandler.obtainMessage(1, listener);
            this.mHandler.sendMessage(message0);
        }
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        zzu.zzu(listener);
        synchronized(this.zzqt) {
            if(this.zzaaF.contains(listener)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + listener + " is already registered");
            }
            else {
                this.zzaaF.add(listener);
            }
        }
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        zzu.zzu(listener);
        synchronized(this.zzqt) {
            if(!this.zzaaD.remove(listener)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + listener + " not found");
            }
            else if(this.zzaaI) {
                this.zzaaE.add(listener);
            }
        }
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        zzu.zzu(listener);
        synchronized(this.zzqt) {
            if(!this.zzaaF.remove(listener)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + listener + " not found");
            }
        }
    }

    public void zzbu(int v) {
        this.mHandler.removeMessages(1);
        synchronized(this.zzqt) {
            this.zzaaI = true;
            ArrayList arrayList0 = new ArrayList(this.zzaaD);
            int v2 = this.zzaaH.get();
            for(Object object1: arrayList0) {
                ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)object1;
                if(!this.zzaaG || this.zzaaH.get() != v2) {
                    break;
                }
                if(this.zzaaD.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnectionSuspended(v);
                }
            }
            this.zzaaE.clear();
            this.zzaaI = false;
        }
    }

    public void zzg(Bundle bundle0) {
        boolean z = true;
        synchronized(this.zzqt) {
            zzu.zzU(!this.zzaaI);
            this.mHandler.removeMessages(1);
            this.zzaaI = true;
            if(this.zzaaE.size() != 0) {
                z = false;
            }
            zzu.zzU(z);
            ArrayList arrayList0 = new ArrayList(this.zzaaD);
            int v1 = this.zzaaH.get();
            for(Object object1: arrayList0) {
                ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)object1;
                if(!this.zzaaG || !this.zzaaC.isConnected() || this.zzaaH.get() != v1) {
                    break;
                }
                if(!this.zzaaE.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnected(bundle0);
                }
            }
            this.zzaaE.clear();
            this.zzaaI = false;
        }
    }

    public void zzh(ConnectionResult connectionResult0) {
        this.mHandler.removeMessages(1);
        synchronized(this.zzqt) {
            ArrayList arrayList0 = new ArrayList(this.zzaaF);
            int v1 = this.zzaaH.get();
            for(Object object1: arrayList0) {
                OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = (OnConnectionFailedListener)object1;
                if(!this.zzaaG || this.zzaaH.get() != v1) {
                    return;
                }
                if(this.zzaaF.contains(googleApiClient$OnConnectionFailedListener0)) {
                    googleApiClient$OnConnectionFailedListener0.onConnectionFailed(connectionResult0);
                }
            }
        }
    }

    public void zznT() {
        this.zzaaG = false;
        this.zzaaH.incrementAndGet();
    }

    public void zznU() {
        this.zzaaG = true;
    }
}

