package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzkl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class zzg implements GoogleApiClient {
    final class zza extends Handler {
        final zzg zzXE;

        zza(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            switch(msg.what) {
                case 1: {
                    zzg.this.zzmP();
                    return;
                }
                case 2: {
                    zzg.this.resume();
                    return;
                }
                default: {
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + msg.what);
                }
            }
        }
    }

    static class zzb extends BroadcastReceiver {
        private WeakReference zzXK;

        zzb(zzg zzg0) {
            this.zzXK = new WeakReference(zzg0);
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Uri uri0 = intent.getData();
            String s = uri0 == null ? null : uri0.getSchemeSpecificPart();
            if(s != null && s.equals("com.google.android.gms")) {
                zzg zzg0 = (zzg)this.zzXK.get();
                if(zzg0 != null) {
                    zzg0.resume();
                }
            }
        }
    }

    interface zzc {
        void zzc(zze arg1);
    }

    public abstract class zzd implements ConnectionCallbacks {
        final zzg zzXE;

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
        public void onConnectionSuspended(int cause) {
            zzg.this.zzWL.lock();
            try {
                zzg.this.zzXx.onConnectionSuspended(cause);
            }
            finally {
                zzg.this.zzWL.unlock();
            }
        }
    }

    interface zze {
        void cancel();

        void forceFailureUnlessReady(Status arg1);

        void zza(zzc arg1);

        void zzb(Client arg1) throws DeadObjectException;

        ClientKey zzms();

        int zzmv();

        void zzr(Status arg1);
    }

    private final Context mContext;
    private final int zzWB;
    private final int zzWC;
    final com.google.android.gms.common.api.Api.zza zzWE;
    private final Lock zzWL;
    private final Looper zzWt;
    final Set zzXA;
    private final zzc zzXB;
    private final ConnectionCallbacks zzXC;
    private final com.google.android.gms.common.internal.zzj.zza zzXD;
    final com.google.android.gms.common.internal.zze zzXa;
    final Map zzXb;
    private final Condition zzXm;
    final zzj zzXn;
    final Queue zzXo;
    private volatile boolean zzXp;
    private long zzXq;
    private long zzXr;
    final zza zzXs;
    BroadcastReceiver zzXt;
    final Map zzXu;
    final Map zzXv;
    Set zzXw;
    private volatile zzh zzXx;
    private ConnectionResult zzXy;
    private final Set zzXz;

    public zzg(Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, com.google.android.gms.common.api.Api.zza api$zza0, Map map0, Set set0, Set set1, int v, int v1) {
        Client api$Client0;
        int v2;
        this.zzWL = new ReentrantLock();
        this.zzXo = new LinkedList();
        this.zzXq = 120000L;
        this.zzXr = 5000L;
        this.zzXu = new HashMap();
        this.zzXv = new HashMap();
        this.zzXw = new HashSet();
        this.zzXy = null;
        this.zzXz = Collections.newSetFromMap(new WeakHashMap());
        this.zzXA = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75f, 2));
        this.zzXB = new zzc() {
            @Override  // com.google.android.gms.common.api.zzg$zzc
            public void zzc(zze zzg$zze0) {
                zzg.this.zzXA.remove(zzg$zze0);
            }
        };
        this.zzXC = new zzd() {
            @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
            public void onConnected(Bundle connectionHint) {
                zzg.this.zzXx.onConnected(connectionHint);
            }
        };
        this.zzXD = new com.google.android.gms.common.internal.zzj.zza() {
            @Override  // com.google.android.gms.common.internal.zzj$zza
            public boolean isConnected() {
                return zzg.this.isConnected();
            }

            @Override  // com.google.android.gms.common.internal.zzj$zza
            public Bundle zzlM() {
                return null;
            }
        };
        this.mContext = context0;
        this.zzXn = new zzj(looper0, this.zzXD);
        this.zzWt = looper0;
        this.zzXs = new zza(this, looper0);
        this.zzWB = v;
        this.zzWC = v1;
        this.zzXb = new HashMap();
        this.zzXm = this.zzWL.newCondition();
        this.zzXx = new zzf(this);
        for(Object object0: set0) {
            this.zzXn.registerConnectionCallbacks(((ConnectionCallbacks)object0));
        }
        for(Object object1: set1) {
            this.zzXn.registerConnectionFailedListener(((OnConnectionFailedListener)object1));
        }
        Map map1 = zze0.zznx();
        for(Object object2: map0.keySet()) {
            Api api0 = (Api)object2;
            Object object3 = map0.get(api0);
            if(map1.get(api0) == null) {
                v2 = 0;
            }
            else {
                v2 = ((com.google.android.gms.common.internal.zze.zza)map1.get(api0)).zzZW ? 1 : 2;
            }
            this.zzXb.put(api0, v2);
            if(api0.zzmt()) {
                com.google.android.gms.common.api.Api.zzc api$zzc0 = api0.zzmq();
                OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = this.zza(api0, v2);
                api$Client0 = zzg.zza(api$zzc0, object3, context0, looper0, zze0, this.zzXC, googleApiClient$OnConnectionFailedListener0);
            }
            else {
                com.google.android.gms.common.api.Api.zza api$zza1 = api0.zzmp();
                OnConnectionFailedListener googleApiClient$OnConnectionFailedListener1 = this.zza(api0, v2);
                api$Client0 = zzg.zza(api$zza1, object3, context0, looper0, zze0, this.zzXC, googleApiClient$OnConnectionFailedListener1);
            }
            ClientKey api$ClientKey0 = api0.zzms();
            this.zzXu.put(api$ClientKey0, api$Client0);
        }
        this.zzXa = zze0;
        this.zzWE = api$zza0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public ConnectionResult blockingConnect() {
        zzu.zza(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zzWL.lock();
        try {
            this.connect();
            while(this.isConnecting()) {
                try {
                    this.zzXm.await();
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            if(this.isConnected()) {
                return ConnectionResult.zzVG;
            }
            return this.zzXy != null ? this.zzXy : new ConnectionResult(13, null);
        }
        finally {
            this.zzWL.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public ConnectionResult blockingConnect(long timeout, TimeUnit unit) {
        zzu.zza(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zzWL.lock();
        try {
            this.connect();
            long v2 = unit.toNanos(timeout);
            while(this.isConnecting()) {
                try {
                    v2 = this.zzXm.awaitNanos(v2);
                    if(v2 <= 0L) {
                        return new ConnectionResult(14, null);
                    }
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
                if(false) {
                    break;
                }
            }
            if(this.isConnected()) {
                return ConnectionResult.zzVG;
            }
            return this.zzXy != null ? this.zzXy : new ConnectionResult(13, null);
        }
        finally {
            this.zzWL.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public PendingResult clearDefaultAccountAndReconnect() {
        zzu.zza(this.isConnected(), "GoogleApiClient is not connected yet.");
        PendingResult pendingResult0 = new zzl(this.zzWt);
        if(this.zzXu.containsKey(zzkl.zzNX)) {
            this.zza(this, ((zzl)pendingResult0), false);
            return pendingResult0;
        }
        AtomicReference atomicReference0 = new AtomicReference();
        com.google.android.gms.common.api.zzg.5 zzg$50 = new ConnectionCallbacks() {
            @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
            public void onConnected(Bundle connectionHint) {
                GoogleApiClient googleApiClient0 = (GoogleApiClient)atomicReference0.get();
                zzg.this.zza(googleApiClient0, ((zzl)pendingResult0), true);
            }

            @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
            public void onConnectionSuspended(int cause) {
            }
        };
        com.google.android.gms.common.api.zzg.6 zzg$60 = new OnConnectionFailedListener() {
            @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
            public void onConnectionFailed(ConnectionResult result) {
                Status status0 = new Status(8);
                ((zzl)pendingResult0).setResult(status0);
            }
        };
        GoogleApiClient googleApiClient0 = new Builder(this.mContext).addApi(zzkl.API).addConnectionCallbacks(zzg$50).addOnConnectionFailedListener(zzg$60).setHandler(this.zzXs).build();
        atomicReference0.set(googleApiClient0);
        googleApiClient0.connect();
        return pendingResult0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void connect() {
        this.zzWL.lock();
        try {
            this.zzXx.connect();
        }
        finally {
            this.zzWL.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void disconnect() {
        this.zzmR();
        this.zzaY(-1);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.append(prefix).append("mState=").append(this.zzXx.getName());
        writer.append(" mResuming=").print(this.zzXp);
        writer.append(" mWorkQueue.size()=").print(this.zzXo.size());
        writer.append(" mUnconsumedRunners.size()=").println(this.zzXA.size());
        for(Object object0: this.zzXb.keySet()) {
            writer.append(prefix).append(((Api)object0).getName()).println(":");
            ClientKey api$ClientKey0 = ((Api)object0).zzms();
            ((Client)this.zzXu.get(api$ClientKey0)).dump(prefix + "  ", fd, writer, args);
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public ConnectionResult getConnectionResult(Api api0) {
        ClientKey api$ClientKey0 = api0.zzms();
        this.zzWL.lock();
        try {
            if(!this.isConnected() && !this.zzmO()) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if(this.zzXu.containsKey(api$ClientKey0)) {
                if(((Client)this.zzXu.get(api$ClientKey0)).isConnected()) {
                    return ConnectionResult.zzVG;
                }
                if(this.zzXv.containsKey(api$ClientKey0)) {
                    return (ConnectionResult)this.zzXv.get(api$ClientKey0);
                }
                Log.wtf("GoogleApiClientImpl", api0.getName() + " requested in getConnectionResult" + " is not connected but is not present in the failed connections map");
                return new ConnectionResult(8, null);
            }
        }
        finally {
            this.zzWL.unlock();
        }
        throw new IllegalArgumentException(api0.getName() + " was never registered with GoogleApiClient");
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public Context getContext() {
        return this.mContext;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public Looper getLooper() {
        return this.zzWt;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public int getSessionId() [...] // Potential decryptor

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public boolean hasConnectedApi(Api api0) {
        ClientKey api$ClientKey0 = api0.zzms();
        Client api$Client0 = (Client)this.zzXu.get(api$ClientKey0);
        return api$Client0 == null ? false : api$Client0.isConnected();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public boolean isConnected() {
        return this.zzXx instanceof com.google.android.gms.common.api.zzd;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public boolean isConnecting() {
        return this.zzXx instanceof com.google.android.gms.common.api.zze;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks listener) {
        return this.zzXn.isConnectionCallbacksRegistered(listener);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener listener) {
        return this.zzXn.isConnectionFailedListenerRegistered(listener);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void reconnect() {
        this.disconnect();
        this.connect();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void registerConnectionCallbacks(ConnectionCallbacks listener) {
        this.zzXn.registerConnectionCallbacks(listener);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void registerConnectionFailedListener(OnConnectionFailedListener listener) {
        this.zzXn.registerConnectionFailedListener(listener);
    }

    private void resume() {
        this.zzWL.lock();
        try {
            if(this.zzmO()) {
                this.connect();
            }
        }
        finally {
            this.zzWL.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void stopAutoManage(FragmentActivity lifecycleActivity) {
        if(this.zzWB >= 0) {
            zzm.zza(lifecycleActivity).zzbb(this.zzWB);
            return;
        }
        if(this.zzWC < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zzn.zzb(lifecycleActivity).zzbb(this.zzWC);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void unregisterConnectionCallbacks(ConnectionCallbacks listener) {
        this.zzXn.unregisterConnectionCallbacks(listener);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public void unregisterConnectionFailedListener(OnConnectionFailedListener listener) {
        this.zzXn.unregisterConnectionFailedListener(listener);
    }

    private static Client zza(com.google.android.gms.common.api.Api.zza api$zza0, Object object0, Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        return api$zza0.zza(context0, looper0, zze0, object0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
    }

    private final OnConnectionFailedListener zza(Api api0, int v) {
        return new OnConnectionFailedListener() {
            @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
            public void onConnectionFailed(ConnectionResult result) {
                zzg.this.zzXx.zza(result, api0, v);
            }
        };
    }

    private static zzz zza(com.google.android.gms.common.api.Api.zzc api$zzc0, Object object0, Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        return new zzz(context0, looper0, api$zzc0.zzmu(), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0, api$zzc0.zzl(object0));
    }

    private void zza(GoogleApiClient googleApiClient0, zzl zzl0, boolean z) {
        zzkl.zzabj.zzc(googleApiClient0).setResultCallback(new ResultCallback() {
            public void zzm(Status status0) {
                if(status0.isSuccess() && zzg.this.isConnected()) {
                    zzg.this.reconnect();
                }
                zzl0.setResult(status0);
                if(z) {
                    googleApiClient0.disconnect();
                }
            }
        });
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public Client zza(ClientKey api$ClientKey0) {
        Client api$Client0 = (Client)this.zzXu.get(api$ClientKey0);
        zzu.zzb(api$Client0, "Appropriate Api was not requested.");
        return api$Client0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public com.google.android.gms.common.api.zza.zza zza(com.google.android.gms.common.api.zza.zza zza$zza0) {
        zzu.zzb(zza$zza0.zzms() != null, "This task can not be enqueued (it\'s probably a Batch or malformed)");
        zzu.zzb(this.zzXu.containsKey(zza$zza0.zzms()), "GoogleApiClient is not configured to use the API required for this call.");
        this.zzWL.lock();
        try {
            return this.zzXx.zza(zza$zza0);
        }
        finally {
            this.zzWL.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public boolean zza(Api api0) {
        ClientKey api$ClientKey0 = api0.zzms();
        return this.zzXu.containsKey(api$ClientKey0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public boolean zza(Scope scope0) {
        this.zzWL.lock();
        try {
            return this.isConnected() && this.zzXw.contains(scope0);
        }
        finally {
            this.zzWL.unlock();
        }
    }

    private void zzaY(int v) {
        this.zzWL.lock();
        try {
            this.zzXx.zzaV(v);
        }
        finally {
            this.zzWL.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public com.google.android.gms.common.api.zza.zza zzb(com.google.android.gms.common.api.zza.zza zza$zza0) {
        zzu.zzb(zza$zza0.zzms() != null, "This task can not be executed (it\'s probably a Batch or malformed)");
        this.zzWL.lock();
        try {
            if(this.zzmO()) {
                this.zzXo.add(zza$zza0);
                while(!this.zzXo.isEmpty()) {
                    zze zzg$zze0 = (zze)this.zzXo.remove();
                    this.zzb(zzg$zze0);
                    zzg$zze0.zzr(Status.zzXR);
                }
                return zza$zza0;
            }
            return this.zzXx.zzb(zza$zza0);
        }
        finally {
            this.zzWL.unlock();
        }
    }

    void zzb(zze zzg$zze0) {
        this.zzXA.add(zzg$zze0);
        zzg$zze0.zza(this.zzXB);
    }

    void zze(ConnectionResult connectionResult0) {
        this.zzWL.lock();
        try {
            this.zzXy = connectionResult0;
            this.zzXx = new zzf(this);
            this.zzXx.begin();
            this.zzXm.signalAll();
        }
        finally {
            this.zzWL.unlock();
        }
    }

    void zzmK() {
        for(Object object0: this.zzXA) {
            ((zze)object0).zza(null);
            ((zze)object0).cancel();
        }
        this.zzXA.clear();
        for(Object object1: this.zzXz) {
            ((zzi)object1).clear();
        }
        this.zzXz.clear();
        this.zzXw.clear();
    }

    void zzmL() {
        for(Object object0: this.zzXu.values()) {
            ((Client)object0).disconnect();
        }
    }

    void zzmM() {
        this.zzWL.lock();
        try {
            this.zzXx = new com.google.android.gms.common.api.zze(this, this.zzXa, this.zzXb, this.zzWE, this.zzWL, this.mContext);
            this.zzXx.begin();
            this.zzXm.signalAll();
        }
        finally {
            this.zzWL.unlock();
        }
    }

    void zzmN() {
        this.zzWL.lock();
        try {
            this.zzmR();
            this.zzXx = new com.google.android.gms.common.api.zzd(this);
            this.zzXx.begin();
            this.zzXm.signalAll();
        }
        finally {
            this.zzWL.unlock();
        }
    }

    boolean zzmO() {
        return this.zzXp;
    }

    private void zzmP() {
        this.zzWL.lock();
        try {
            if(this.zzmR()) {
                this.connect();
            }
        }
        finally {
            this.zzWL.unlock();
        }
    }

    void zzmQ() {
        if(this.zzmO()) {
            return;
        }
        this.zzXp = true;
        if(this.zzXt == null) {
            this.zzXt = new zzb(this);
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter0.addDataScheme("package");
            this.mContext.getApplicationContext().registerReceiver(this.zzXt, intentFilter0);
        }
        Message message0 = this.zzXs.obtainMessage(1);
        this.zzXs.sendMessageDelayed(message0, this.zzXq);
        Message message1 = this.zzXs.obtainMessage(2);
        this.zzXs.sendMessageDelayed(message1, this.zzXr);
    }

    boolean zzmR() {
        this.zzWL.lock();
        try {
            if(!this.zzmO()) {
                return false;
            }
            this.zzXp = false;
            this.zzXs.removeMessages(2);
            this.zzXs.removeMessages(1);
            if(this.zzXt != null) {
                this.mContext.getApplicationContext().unregisterReceiver(this.zzXt);
                this.zzXt = null;
            }
            return true;
        }
        finally {
            this.zzWL.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public zzi zzo(Object object0) {
        zzu.zzb(object0, "Listener must not be null");
        this.zzWL.lock();
        try {
            zzi zzi0 = new zzi(this.zzWt, object0);
            this.zzXz.add(zzi0);
            return zzi0;
        }
        finally {
            this.zzWL.unlock();
        }
    }
}

