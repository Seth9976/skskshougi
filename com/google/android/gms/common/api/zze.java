package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzps;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public class zze implements zzh {
    static class zza extends zzb {
        private final WeakReference zzXe;

        zza(zze zze0) {
            this.zzXe = new WeakReference(zze0);
        }

        @Override  // com.google.android.gms.signin.internal.zzb
        public void zza(ConnectionResult connectionResult0, AuthAccountResult authAccountResult0) {
            zze zze0 = (zze)this.zzXe.get();
            if(zze0 == null) {
                return;
            }
            com.google.android.gms.common.api.zze.zza.1 zze$zza$10 = new Runnable() {
                @Override
                public void run() {
                    zze0.zza(connectionResult0);
                }
            };
            zze0.zzWK.zzXs.post(zze$zza$10);
        }
    }

    static class com.google.android.gms.common.api.zze.zzb extends com.google.android.gms.common.internal.zzq.zza {
        private final WeakReference zzXe;

        com.google.android.gms.common.api.zze.zzb(zze zze0) {
            this.zzXe = new WeakReference(zze0);
        }

        @Override  // com.google.android.gms.common.internal.zzq
        public void zzb(ResolveAccountResponse resolveAccountResponse0) {
            zze zze0 = (zze)this.zzXe.get();
            if(zze0 == null) {
                return;
            }
            com.google.android.gms.common.api.zze.zzb.1 zze$zzb$10 = new Runnable() {
                @Override
                public void run() {
                    zze0.zza(resolveAccountResponse0);
                }
            };
            zze0.zzWK.zzXs.post(zze$zzb$10);
        }
    }

    static class zzc implements ConnectionProgressReportCallbacks {
        private final WeakReference zzXe;
        private final Api zzXk;
        private final int zzXl;

        public zzc(zze zze0, Api api0, int v) {
            this.zzXe = new WeakReference(zze0);
            this.zzXk = api0;
            this.zzXl = v;
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionProgressReportCallbacks
        public void onReportAccountValidation(ConnectionResult result) {
            boolean z = true;
            zze zze0 = (zze)this.zzXe.get();
            if(zze0 == null) {
                return;
            }
            if(Looper.myLooper() != zze0.zzWK.getLooper()) {
                z = false;
            }
            zzu.zza(z, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            zze0.zzWL.lock();
            try {
                if(!zze0.zzaW(1)) {
                    return;
                }
                if(!result.isSuccess()) {
                    zze0.zzb(result, this.zzXk, this.zzXl);
                }
                if(zze0.zzmC()) {
                    zze0.zzmF();
                }
            }
            finally {
                zze0.zzWL.unlock();
            }
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionProgressReportCallbacks
        public void onReportServiceBinding(ConnectionResult result) {
            boolean z = false;
            zze zze0 = (zze)this.zzXe.get();
            if(zze0 == null) {
                return;
            }
            if(Looper.myLooper() == zze0.zzWK.getLooper()) {
                z = true;
            }
            zzu.zza(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zze0.zzWL.lock();
            try {
                if(!zze0.zzaW(0)) {
                    return;
                }
                if(!result.isSuccess()) {
                    zze0.zzb(result, this.zzXk, this.zzXl);
                }
                if(zze0.zzmC()) {
                    zze0.zzmD();
                }
            }
            finally {
                zze0.zzWL.unlock();
            }
        }
    }

    class zzd implements ConnectionCallbacks, OnConnectionFailedListener {
        final zze zzXd;

        private zzd() {
        }

        zzd(com.google.android.gms.common.api.zze.1 zze$10) {
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
        public void onConnected(Bundle connectionHint) {
            zze.this.zzWT.zza(new com.google.android.gms.common.api.zze.zzb(zze.this));
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult result) {
            zze.this.zzWL.lock();
            try {
                if(zze.this.zzc(result)) {
                    zze.this.zzmI();
                    zze.this.zzmG();
                }
                else {
                    zze.this.zzd(result);
                }
            }
            finally {
                zze.this.zzWL.unlock();
            }
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
        public void onConnectionSuspended(int cause) {
        }
    }

    private final Context mContext;
    private final com.google.android.gms.common.api.Api.zza zzWE;
    private final zzg zzWK;
    private final Lock zzWL;
    private ConnectionResult zzWM;
    private int zzWN;
    private int zzWO;
    private boolean zzWP;
    private int zzWQ;
    private final Bundle zzWR;
    private final Set zzWS;
    private zzps zzWT;
    private int zzWU;
    private boolean zzWV;
    private boolean zzWW;
    private IAccountAccessor zzWX;
    private boolean zzWY;
    private boolean zzWZ;
    private final com.google.android.gms.common.internal.zze zzXa;
    private final Map zzXb;

    public zze(zzg zzg0, com.google.android.gms.common.internal.zze zze0, Map map0, com.google.android.gms.common.api.Api.zza api$zza0, Lock lock0, Context context0) {
        this.zzWO = 0;
        this.zzWP = false;
        this.zzWR = new Bundle();
        this.zzWS = new HashSet();
        this.zzWK = zzg0;
        this.zzXa = zze0;
        this.zzXb = map0;
        this.zzWE = api$zza0;
        this.zzWL = lock0;
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void begin() {
        this.zzWK.zzXn.zznU();
        this.zzWK.zzXv.clear();
        this.zzWP = false;
        this.zzWV = false;
        this.zzWM = null;
        this.zzWO = 0;
        this.zzWU = 2;
        this.zzWW = false;
        this.zzWY = false;
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
        if(v != 0) {
            com.google.android.gms.common.api.zze.1 zze$10 = new Runnable() {
                @Override
                public void run() {
                    zze.this.zzWL.lock();
                    try {
                        zze.this.zzd(new ConnectionResult(v, null));
                    }
                    finally {
                        zze.this.zzWL.unlock();
                    }
                }
            };
            this.zzWK.zzXs.post(zze$10);
            return;
        }
        HashMap hashMap0 = new HashMap();
        int v1 = 0;
        for(Object object0: this.zzXb.keySet()) {
            Api api0 = (Api)object0;
            ClientKey api$ClientKey0 = api0.zzms();
            Client api$Client0 = (Client)this.zzWK.zzXu.get(api$ClientKey0);
            int v2 = (int)(((Integer)this.zzXb.get(api0)));
            int v3 = api0.zzmp().getPriority() == 1 ? 1 : 0;
            if(api$Client0.requiresSignIn()) {
                this.zzWV = true;
                if(v2 < this.zzWU) {
                    this.zzWU = v2;
                }
                if(v2 != 0) {
                    ClientKey api$ClientKey1 = api0.zzms();
                    this.zzWS.add(api$ClientKey1);
                }
            }
            hashMap0.put(api$Client0, new zzc(this, api0, v2));
            v1 |= v3;
        }
        if(v1 != 0) {
            this.zzWV = false;
        }
        if(this.zzWV) {
            this.zzXa.zza(0);
            zzd zze$zzd0 = new zzd(this, null);
            this.zzWT = (zzps)this.zzWE.zza(this.mContext, this.zzWK.getLooper(), this.zzXa, this.zzXa.zznB(), zze$zzd0, zze$zzd0);
            this.zzWT.connect();
        }
        this.zzWQ = this.zzWK.zzXu.size();
        for(Object object1: this.zzWK.zzXu.values()) {
            ((Client)object1).connect(((ConnectionProgressReportCallbacks)hashMap0.get(((Client)object1))));
        }
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void connect() {
        this.zzWP = false;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public String getName() {
        return "CONNECTING";
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void onConnected(Bundle connectionHint) {
        if(this.zzaW(3)) {
            if(connectionHint != null) {
                this.zzWR.putAll(connectionHint);
            }
            if(this.zzmC()) {
                this.zzmH();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void onConnectionSuspended(int cause) {
        this.zzd(new ConnectionResult(8, null));
    }

    private void zzT(boolean z) {
        if(this.zzWT != null) {
            if(this.zzWT.isConnected()) {
                if(z) {
                    this.zzWT.zzxY();
                }
                this.zzWT.disconnect();
            }
            this.zzWX = null;
        }
    }

    private void zza(ConnectionResult connectionResult0) {
        this.zzWL.lock();
        try {
            if(!this.zzaW(2)) {
                return;
            }
            if(connectionResult0.isSuccess()) {
                this.zzmG();
            }
            else if(this.zzc(connectionResult0)) {
                this.zzmI();
                this.zzmG();
            }
            else {
                this.zzd(connectionResult0);
            }
        }
        finally {
            this.zzWL.unlock();
        }
    }

    private void zza(ResolveAccountResponse resolveAccountResponse0) {
        ConnectionResult connectionResult0 = resolveAccountResponse0.zzoa();
        this.zzWL.lock();
        try {
            if(!this.zzaW(0)) {
                return;
            }
            if(connectionResult0.isSuccess()) {
                this.zzWX = resolveAccountResponse0.zznZ();
                this.zzWW = true;
                this.zzWY = resolveAccountResponse0.zzob();
                this.zzWZ = resolveAccountResponse0.zzoc();
                this.zzmE();
            }
            else if(this.zzc(connectionResult0)) {
                this.zzmI();
                if(this.zzWQ == 0) {
                    this.zzmG();
                }
            }
            else {
                this.zzd(connectionResult0);
            }
        }
        finally {
            this.zzWL.unlock();
        }
    }

    // 去混淆评级： 低(20)
    private boolean zza(int v, int v1, ConnectionResult connectionResult0) {
        return v1 != 1 || zze.zzb(connectionResult0) ? this.zzWM == null || v < this.zzWN : false;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public com.google.android.gms.common.api.zza.zza zza(com.google.android.gms.common.api.zza.zza zza$zza0) {
        this.zzWK.zzXo.add(zza$zza0);
        return zza$zza0;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void zza(ConnectionResult connectionResult0, Api api0, int v) {
        if(this.zzaW(3)) {
            this.zzb(connectionResult0, api0, v);
            if(this.zzmC()) {
                this.zzmH();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void zzaV(int v) {
        if(v == -1) {
            Iterator iterator0 = this.zzWK.zzXo.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                com.google.android.gms.common.api.zzg.zze zzg$zze0 = (com.google.android.gms.common.api.zzg.zze)object0;
                if(zzg$zze0.zzmv() != 1) {
                    zzg$zze0.cancel();
                    iterator0.remove();
                }
            }
            this.zzWK.zzmK();
            if(this.zzWM == null && !this.zzWK.zzXo.isEmpty()) {
                this.zzWP = true;
                return;
            }
            this.zzWK.zzXv.clear();
            this.zzWM = null;
            this.zzT(true);
        }
        this.zzWK.zze(this.zzWM);
    }

    private boolean zzaW(int v) {
        if(this.zzWO != v) {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + this.zzaX(this.zzWO) + " but received callback for step " + this.zzaX(v));
            this.zzd(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    private String zzaX(int v) {
        switch(v) {
            case 0: {
                return "STEP_GETTING_SERVICE_BINDINGS";
            }
            case 1: {
                return "STEP_VALIDATING_ACCOUNT";
            }
            case 2: {
                return "STEP_AUTHENTICATING";
            }
            case 3: {
                return "STEP_GETTING_REMOTE_SERVICE";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    private void zzb(ConnectionResult connectionResult0, Api api0, int v) {
        if(v != 2) {
            int v1 = api0.zzmp().getPriority();
            if(this.zza(v1, v, connectionResult0)) {
                this.zzWM = connectionResult0;
                this.zzWN = v1;
            }
        }
        ClientKey api$ClientKey0 = api0.zzms();
        this.zzWK.zzXv.put(api$ClientKey0, connectionResult0);
    }

    // 去混淆评级： 低(20)
    private static boolean zzb(ConnectionResult connectionResult0) {
        return connectionResult0.hasResolution() ? true : GooglePlayServicesUtil.zzaT(connectionResult0.getErrorCode()) != null;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public com.google.android.gms.common.api.zza.zza zzb(com.google.android.gms.common.api.zza.zza zza$zza0) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    // 去混淆评级： 低(20)
    private boolean zzc(ConnectionResult connectionResult0) {
        return this.zzWU == 2 || this.zzWU == 1 && !connectionResult0.hasResolution();
    }

    private void zzd(ConnectionResult connectionResult0) {
        boolean z = false;
        this.zzWP = false;
        this.zzWK.zzXw.clear();
        this.zzWM = connectionResult0;
        if(!connectionResult0.hasResolution()) {
            z = true;
        }
        this.zzT(z);
        this.zzaV(3);
        if(!this.zzWK.zzmO() || !GooglePlayServicesUtil.zze(this.mContext, connectionResult0.getErrorCode())) {
            this.zzWK.zzmR();
            this.zzWK.zzXn.zzh(connectionResult0);
        }
        this.zzWK.zzXn.zznT();
    }

    private boolean zzmC() {
        --this.zzWQ;
        if(this.zzWQ > 0) {
            return false;
        }
        if(this.zzWQ < 0) {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            this.zzd(new ConnectionResult(8, null));
            return false;
        }
        if(this.zzWM != null) {
            this.zzd(this.zzWM);
            return false;
        }
        return true;
    }

    private void zzmD() {
        if(this.zzWV) {
            this.zzmE();
            return;
        }
        this.zzmG();
    }

    private void zzmE() {
        if(this.zzWW && this.zzWQ == 0) {
            this.zzWO = 1;
            this.zzWQ = this.zzWK.zzXu.size();
            for(Object object0: this.zzWK.zzXu.keySet()) {
                ClientKey api$ClientKey0 = (ClientKey)object0;
                if(!this.zzWK.zzXv.containsKey(api$ClientKey0)) {
                    ((Client)this.zzWK.zzXu.get(api$ClientKey0)).validateAccount(this.zzWX);
                }
                else if(this.zzmC()) {
                    this.zzmF();
                }
            }
        }
    }

    private void zzmF() {
        this.zzWO = 2;
        this.zzWK.zzXw = this.zzmJ();
        this.zzWT.zza(this.zzWX, this.zzWK.zzXw, new zza(this));
    }

    private void zzmG() {
        Set set0 = this.zzWK.zzXw;
        Set set1 = set0.isEmpty() ? this.zzmJ() : set0;
        this.zzWO = 3;
        this.zzWQ = this.zzWK.zzXu.size();
        for(Object object0: this.zzWK.zzXu.keySet()) {
            ClientKey api$ClientKey0 = (ClientKey)object0;
            if(!this.zzWK.zzXv.containsKey(api$ClientKey0)) {
                ((Client)this.zzWK.zzXu.get(api$ClientKey0)).getRemoteService(this.zzWX, set1);
            }
            else if(this.zzmC()) {
                this.zzmH();
            }
        }
    }

    private void zzmH() {
        this.zzWK.zzmN();
        if(this.zzWT != null) {
            if(this.zzWY) {
                this.zzWT.zza(this.zzWX, this.zzWZ);
            }
            this.zzT(false);
        }
        for(Object object0: this.zzWK.zzXv.keySet()) {
            ((Client)this.zzWK.zzXu.get(((ClientKey)object0))).disconnect();
        }
        if(this.zzWP) {
            this.zzWP = false;
            this.zzaV(-1);
            return;
        }
        this.zzWK.zzXn.zzg((this.zzWR.isEmpty() ? null : this.zzWR));
    }

    private void zzmI() {
        this.zzWV = false;
        this.zzWK.zzXw.clear();
        for(Object object0: this.zzWS) {
            ClientKey api$ClientKey0 = (ClientKey)object0;
            if(!this.zzWK.zzXv.containsKey(api$ClientKey0)) {
                ConnectionResult connectionResult0 = new ConnectionResult(17, null);
                this.zzWK.zzXv.put(api$ClientKey0, connectionResult0);
            }
        }
    }

    private Set zzmJ() {
        Set set0 = new HashSet(this.zzXa.zznv());
        Map map0 = this.zzXa.zznx();
        for(Object object0: map0.keySet()) {
            Api api0 = (Api)object0;
            ClientKey api$ClientKey0 = api0.zzms();
            if(!this.zzWK.zzXv.containsKey(api$ClientKey0)) {
                set0.addAll(((com.google.android.gms.common.internal.zze.zza)map0.get(api0)).zzWJ);
            }
        }
        return set0;
    }
}

