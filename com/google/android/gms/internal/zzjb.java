package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.AppStateManager.StateConflictResult;
import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.appstate.AppStateManager.StateLoadedResult;
import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import java.util.Set;

public final class zzjb extends zzi {
    static final class zza extends zzja {
        private final zzb zzOs;

        public zza(zzb zza$zzb0) {
            this.zzOs = (zzb)zzu.zzb(zza$zzb0, "Result holder must not be null");
        }

        @Override  // com.google.android.gms.internal.zzja
        public void zzg(int v, int v1) {
            com.google.android.gms.internal.zzjb.zzb zzjb$zzb0 = new com.google.android.gms.internal.zzjb.zzb(new Status(v), v1);
            this.zzOs.zzm(zzjb$zzb0);
        }
    }

    static final class com.google.android.gms.internal.zzjb.zzb implements StateDeletedResult {
        private final Status zzOt;
        private final int zzOu;

        public com.google.android.gms.internal.zzjb.zzb(Status status0, int v) {
            this.zzOt = status0;
            this.zzOu = v;
        }

        @Override  // com.google.android.gms.appstate.AppStateManager$StateDeletedResult
        public int getStateKey() {
            return this.zzOu;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class zzc extends zzja {
        private final zzb zzOs;

        public zzc(zzb zza$zzb0) {
            this.zzOs = (zzb)zzu.zzb(zza$zzb0, "Result holder must not be null");
        }

        @Override  // com.google.android.gms.internal.zzja
        public void zza(DataHolder dataHolder0) {
            zzd zzjb$zzd0 = new zzd(dataHolder0);
            this.zzOs.zzm(zzjb$zzd0);
        }
    }

    static final class zzd extends com.google.android.gms.common.api.zzc implements StateListResult {
        private final AppStateBuffer zzOv;

        public zzd(DataHolder dataHolder0) {
            super(dataHolder0);
            this.zzOv = new AppStateBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.appstate.AppStateManager$StateListResult
        public AppStateBuffer getStateBuffer() {
            return this.zzOv;
        }
    }

    static final class zze extends zzja {
        private final zzb zzOs;

        public zze(zzb zza$zzb0) {
            this.zzOs = (zzb)zzu.zzb(zza$zzb0, "Result holder must not be null");
        }

        @Override  // com.google.android.gms.internal.zzja
        public void zza(int v, DataHolder dataHolder0) {
            zzf zzjb$zzf0 = new zzf(v, dataHolder0);
            this.zzOs.zzm(zzjb$zzf0);
        }
    }

    static final class zzf extends com.google.android.gms.common.api.zzc implements StateConflictResult, StateLoadedResult, StateResult {
        private final int zzOu;
        private final AppStateBuffer zzOv;

        public zzf(int v, DataHolder dataHolder0) {
            super(dataHolder0);
            this.zzOu = v;
            this.zzOv = new AppStateBuffer(dataHolder0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.appstate.AppStateManager$StateResult
        public StateConflictResult getConflictResult() {
            return this.zzkX() ? this : null;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.appstate.AppStateManager$StateResult
        public StateLoadedResult getLoadedResult() {
            return this.zzkX() ? null : this;
        }

        @Override  // com.google.android.gms.appstate.AppStateManager$StateConflictResult, com.google.android.gms.appstate.AppStateManager$StateLoadedResult
        public byte[] getLocalData() {
            return this.zzOv.getCount() == 0 ? null : this.zzOv.get(0).getLocalData();
        }

        @Override  // com.google.android.gms.appstate.AppStateManager$StateConflictResult
        public String getResolvedVersion() {
            return this.zzOv.getCount() == 0 ? null : this.zzOv.get(0).getConflictVersion();
        }

        @Override  // com.google.android.gms.appstate.AppStateManager$StateConflictResult
        public byte[] getServerData() {
            return this.zzOv.getCount() == 0 ? null : this.zzOv.get(0).getConflictData();
        }

        @Override  // com.google.android.gms.appstate.AppStateManager$StateConflictResult, com.google.android.gms.appstate.AppStateManager$StateLoadedResult
        public int getStateKey() {
            return this.zzOu;
        }

        @Override  // com.google.android.gms.common.api.zzc, com.google.android.gms.common.api.Releasable
        public void release() {
            this.zzOv.release();
        }

        private boolean zzkX() {
            return this.zzOt.getStatusCode() == 2000;
        }
    }

    static final class zzg extends zzja {
        private final zzb zzOs;

        public zzg(zzb zza$zzb0) {
            this.zzOs = (zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.internal.zzja
        public void zzkU() {
            Status status0 = new Status(0);
            this.zzOs.zzm(status0);
        }
    }

    public zzjb(Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 7, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.appstate.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresSignIn() {
        return true;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzaj(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Set zza(Set set0) {
        zzu.zza(set0.contains(new Scope("https://www.googleapis.com/auth/appstate")), "App State APIs requires https://www.googleapis.com/auth/appstate to function.");
        return set0;
    }

    public void zza(zzb zza$zzb0) throws RemoteException {
        ((zzjd)this.zznM()).zza(new zzc(zza$zzb0));
    }

    public void zza(zzb zza$zzb0, int v) throws RemoteException {
        ((zzjd)this.zznM()).zzb(new zza(zza$zzb0), v);
    }

    public void zza(zzb zza$zzb0, int v, String s, byte[] arr_b) throws RemoteException {
        ((zzjd)this.zznM()).zza(new zze(zza$zzb0), v, s, arr_b);
    }

    public void zza(zzb zza$zzb0, int v, byte[] arr_b) throws RemoteException {
        zze zzjb$zze0 = zza$zzb0 == null ? null : new zze(zza$zzb0);
        ((zzjd)this.zznM()).zza(zzjb$zze0, v, arr_b);
    }

    protected zzjd zzaj(IBinder iBinder0) {
        return com.google.android.gms.internal.zzjd.zza.zzal(iBinder0);
    }

    public void zzb(zzb zza$zzb0) throws RemoteException {
        ((zzjd)this.zznM()).zzb(new zzg(zza$zzb0));
    }

    public void zzb(zzb zza$zzb0, int v) throws RemoteException {
        ((zzjd)this.zznM()).zza(new zze(zza$zzb0), v);
    }

    public int zzkV() {
        try {
            return ((zzjd)this.zznM()).zzkV();
        }
        catch(RemoteException unused_ex) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }

    public int zzkW() {
        try {
            return ((zzjd)this.zznM()).zzkW();
        }
        catch(RemoteException unused_ex) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }
}

