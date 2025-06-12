package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.zzg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzs extends zzi {
    private final String zzOe;
    final ConnectionCallbacks zzaar;
    private final Bundle zzaeM;
    private final boolean zzaeN;
    private DriveId zzaeO;
    private DriveId zzaeP;
    final Map zzaeQ;
    final Map zzaeR;
    final Map zzaeS;
    final Map zzaeT;

    public zzs(Context context0, Looper looper0, zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, Bundle bundle0) {
        super(context0, looper0, 11, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzaeQ = new HashMap();
        this.zzaeR = new HashMap();
        this.zzaeS = new HashMap();
        this.zzaeT = new HashMap();
        this.zzOe = zze0.zzny();
        this.zzaar = googleApiClient$ConnectionCallbacks0;
        this.zzaeM = bundle0;
        Intent intent0 = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        intent0.setPackage("org.dyndns.vivi.SkskShogi");
        List list0 = context0.getPackageManager().queryIntentServices(intent0, 0);
        switch(list0.size()) {
            case 0: {
                this.zzaeN = false;
                return;
            }
            case 1: {
                ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                if(!serviceInfo0.exported) {
                    throw new IllegalStateException("Drive event service " + serviceInfo0.name + " must be exported in AndroidManifest.xml");
                }
                this.zzaeN = true;
                return;
            }
            default: {
                throw new IllegalStateException("AndroidManifest.xml can only define one service that handles the " + intent0.getAction() + " action");
            }
        }
    }

    PendingResult cancelPendingActions(GoogleApiClient apiClient, List list0) {
        boolean z = true;
        zzu.zzV(list0 != null);
        if(list0.isEmpty()) {
            z = false;
        }
        zzu.zzV(z);
        zzu.zza(this.isConnected(), "Client must be connected");
        return apiClient.zzb(new zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new CancelPendingActionsRequest(list0), new zzbq(this));
            }
        });
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        if(this.isConnected()) {
            try {
                ((zzak)this.zznM()).zza(new DisconnectRequest());
            }
            catch(RemoteException unused_ex) {
            }
        }
        super.disconnect();
        synchronized(this.zzaeQ) {
            this.zzaeQ.clear();
        }
        synchronized(this.zzaeR) {
            this.zzaeR.clear();
        }
        synchronized(this.zzaeS) {
            this.zzaeS.clear();
        }
        synchronized(this.zzaeT) {
            this.zzaeT.clear();
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresSignIn() {
        return true;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzaN(iBinder0);
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, int v, DriveId driveId0) {
        zzu.zzb(zzg.zza(v, driveId0), "id");
        zzu.zza(this.isConnected(), "Client must be connected");
        return googleApiClient0.zzb(new zza(googleApiClient0) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new RemoveEventListenerRequest(driveId0, v), null, null, new zzbq(this));
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, int v, DriveId driveId0, ChangesAvailableOptions changesAvailableOptions0) {
        zzu.zzb(zzg.zza(v, driveId0), "id");
        zzu.zza(this.isConnected(), "Client must be connected");
        if(!this.zzaeN) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        }
        return googleApiClient0.zzb(new zza(googleApiClient0) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new AddEventListenerRequest(driveId0, v, changesAvailableOptions0), null, null, new zzbq(this));
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, int v, DriveId driveId0, zzac zzac0) {
        return googleApiClient0.zzb(new zza(googleApiClient0) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzak zzak0 = zzs0.zzpB();
                RemoveEventListenerRequest removeEventListenerRequest0 = new RemoveEventListenerRequest(driveId0, v);
                zzbq zzbq0 = new zzbq(this);
                zzak0.zza(removeEventListenerRequest0, zzac0, null, zzbq0);
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, int v, DriveId driveId0, zzac zzac0, ChangesAvailableOptions changesAvailableOptions0) {
        return googleApiClient0.zzb(new zza(googleApiClient0) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzak zzak0 = zzs0.zzpB();
                AddEventListenerRequest addEventListenerRequest0 = new AddEventListenerRequest(driveId0, v, changesAvailableOptions0);
                zzbq zzbq0 = new zzbq(this);
                zzak0.zza(addEventListenerRequest0, zzac0, null, zzbq0);
            }
        });
    }

    PendingResult zza(GoogleApiClient googleApiClient0, DriveId driveId0) {
        return this.zza(googleApiClient0, 1, driveId0, null);
    }

    PendingResult zza(GoogleApiClient googleApiClient0, DriveId driveId0, ChangeListener changeListener0) {
        zzac zzac1;
        Map map2;
        zzu.zzb(zzg.zza(1, driveId0), "id");
        zzu.zzb(changeListener0, "listener");
        zzu.zza(this.isConnected(), "Client must be connected");
        synchronized(this.zzaeQ) {
            Map map1 = (Map)this.zzaeQ.get(driveId0);
            if(map1 == null) {
                HashMap hashMap0 = new HashMap();
                this.zzaeQ.put(driveId0, hashMap0);
                map2 = hashMap0;
            }
            else {
                map2 = map1;
            }
            zzac zzac0 = (zzac)map2.get(changeListener0);
            if(zzac0 == null) {
                zzac1 = new zzac(this.getLooper(), this.getContext(), 1, changeListener0);
                map2.put(changeListener0, zzac1);
            }
            else {
                if(zzac0.zzcB(1)) {
                    return new zzj(googleApiClient0, Status.zzXP);
                }
                zzac1 = zzac0;
            }
            zzac1.zzcA(1);
            return this.zza(googleApiClient0, 1, driveId0, zzac1, null);
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected void zza(int v, IBinder iBinder0, Bundle bundle0, int v1) {
        if(bundle0 != null) {
            bundle0.setClassLoader(this.getClass().getClassLoader());
            this.zzaeO = (DriveId)bundle0.getParcelable("com.google.android.gms.drive.root_id");
            this.zzaeP = (DriveId)bundle0.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.zza(v, iBinder0, bundle0, v1);
    }

    protected zzak zzaN(IBinder iBinder0) {
        return com.google.android.gms.drive.internal.zzak.zza.zzaO(iBinder0);
    }

    PendingResult zzb(GoogleApiClient googleApiClient0, DriveId driveId0) {
        return this.zza(googleApiClient0, 1, driveId0);
    }

    PendingResult zzb(GoogleApiClient googleApiClient0, DriveId driveId0, ChangeListener changeListener0) {
        zzu.zzb(zzg.zza(1, driveId0), "id");
        zzu.zza(this.isConnected(), "Client must be connected");
        zzu.zzb(changeListener0, "listener");
        synchronized(this.zzaeQ) {
            Map map1 = (Map)this.zzaeQ.get(driveId0);
            if(map1 == null) {
                return new zzj(googleApiClient0, Status.zzXP);
            }
            zzac zzac0 = (zzac)map1.remove(changeListener0);
            if(zzac0 == null) {
                return new zzj(googleApiClient0, Status.zzXP);
            }
            if(map1.isEmpty()) {
                this.zzaeQ.remove(driveId0);
            }
            return this.zza(googleApiClient0, 1, driveId0, zzac0);
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        zzu.zzu("org.dyndns.vivi.SkskShogi");
        zzu.zzU(!this.zznK().zznw().isEmpty());
        Bundle bundle0 = new Bundle();
        if(!"org.dyndns.vivi.SkskShogi".equals(this.zzOe)) {
            bundle0.putString("proxy_package_name", this.zzOe);
        }
        bundle0.putAll(this.zzaeM);
        return bundle0;
    }

    public zzak zzpB() throws DeadObjectException {
        return (zzak)this.zznM();
    }

    public DriveId zzpC() {
        return this.zzaeO;
    }

    public DriveId zzpD() {
        return this.zzaeP;
    }

    public boolean zzpE() {
        return this.zzaeN;
    }
}

