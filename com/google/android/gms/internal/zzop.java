package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

public final class zzop extends zzi {
    static final class zza extends zzb {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, com.google.android.gms.common.api.zzi zzi0) {
            super(zzi0);
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void zzia(int v) throws RemoteException {
            Status status0 = new Status(v);
            this.zzOs.zzm(status0);
        }
    }

    static class zzb extends zzoo {
        private final com.google.android.gms.common.api.zzi zzaFr;

        zzb(com.google.android.gms.common.api.zzi zzi0) {
            this.zzaFr = zzi0;
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void onDisconnected(String remoteEndpointId) throws RemoteException {
            com.google.android.gms.internal.zzop.zzb.2 zzop$zzb$20 = new com.google.android.gms.common.api.zzi.zzb() {
                public void zza(MessageListener connections$MessageListener0) {
                    connections$MessageListener0.onDisconnected(remoteEndpointId);
                }

                @Override  // com.google.android.gms.common.api.zzi$zzb
                public void zzmw() {
                }
            };
            this.zzaFr.zza(zzop$zzb$20);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void onMessageReceived(String remoteEndpointId, byte[] payload, boolean isReliable) throws RemoteException {
            com.google.android.gms.internal.zzop.zzb.1 zzop$zzb$10 = new com.google.android.gms.common.api.zzi.zzb() {
                public void zza(MessageListener connections$MessageListener0) {
                    connections$MessageListener0.onMessageReceived(remoteEndpointId, payload, isReliable);
                }

                @Override  // com.google.android.gms.common.api.zzi$zzb
                public void zzmw() {
                }
            };
            this.zzaFr.zza(zzop$zzb$10);
        }
    }

    static final class zzc extends zzb {
        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final com.google.android.gms.common.api.zzi zzaFv;

        public zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, com.google.android.gms.common.api.zzi zzi0, com.google.android.gms.common.api.zzi zzi1) {
            super(zzi1);
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zza$zzb0);
            this.zzaFv = (com.google.android.gms.common.api.zzi)zzu.zzu(zzi0);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void zza(String s, int v, byte[] arr_b) throws RemoteException {
            com.google.android.gms.internal.zzop.zzc.1 zzop$zzc$10 = new com.google.android.gms.common.api.zzi.zzb() {
                public void zza(ConnectionResponseCallback connections$ConnectionResponseCallback0) {
                    Status status0 = new Status(v);
                    connections$ConnectionResponseCallback0.onConnectionResponse(s, status0, arr_b);
                }

                @Override  // com.google.android.gms.common.api.zzi$zzb
                public void zzmw() {
                }
            };
            this.zzaFv.zza(zzop$zzc$10);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void zzhZ(int v) throws RemoteException {
            Status status0 = new Status(v);
            this.zzOs.zzm(status0);
        }
    }

    static final class zzd extends zzoo {
        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final com.google.android.gms.common.api.zzi zzaFx;

        zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, com.google.android.gms.common.api.zzi zzi0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zza$zzb0);
            this.zzaFx = (com.google.android.gms.common.api.zzi)zzu.zzu(zzi0);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void onConnectionRequest(String remoteEndpointId, String remoteDeviceId, String remoteEndpointName, byte[] payload) throws RemoteException {
            com.google.android.gms.internal.zzop.zzd.1 zzop$zzd$10 = new com.google.android.gms.common.api.zzi.zzb() {
                public void zza(ConnectionRequestListener connections$ConnectionRequestListener0) {
                    connections$ConnectionRequestListener0.onConnectionRequest(remoteEndpointId, remoteDeviceId, remoteEndpointName, payload);
                }

                @Override  // com.google.android.gms.common.api.zzi$zzb
                public void zzmw() {
                }
            };
            this.zzaFx.zza(zzop$zzd$10);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void zzj(int v, String s) throws RemoteException {
            zze zzop$zze0 = new zze(new Status(v), s);
            this.zzOs.zzm(zzop$zze0);
        }
    }

    static final class zze implements StartAdvertisingResult {
        private final Status zzOt;
        private final String zzaFB;

        zze(Status status0, String s) {
            this.zzOt = status0;
            this.zzaFB = s;
        }

        @Override  // com.google.android.gms.nearby.connection.Connections$StartAdvertisingResult
        public String getLocalEndpointName() {
            return this.zzaFB;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class zzf extends zzoo {
        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final com.google.android.gms.common.api.zzi zzaFx;

        zzf(com.google.android.gms.common.api.zza.zzb zza$zzb0, com.google.android.gms.common.api.zzi zzi0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzu(zza$zzb0);
            this.zzaFx = (com.google.android.gms.common.api.zzi)zzu.zzu(zzi0);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void onEndpointFound(String endpointId, String deviceId, String serviceId, String name) throws RemoteException {
            com.google.android.gms.internal.zzop.zzf.1 zzop$zzf$10 = new com.google.android.gms.common.api.zzi.zzb() {
                public void zza(EndpointDiscoveryListener connections$EndpointDiscoveryListener0) {
                    connections$EndpointDiscoveryListener0.onEndpointFound(endpointId, deviceId, serviceId, name);
                }

                @Override  // com.google.android.gms.common.api.zzi$zzb
                public void zzmw() {
                }
            };
            this.zzaFx.zza(zzop$zzf$10);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void onEndpointLost(String endpointId) throws RemoteException {
            com.google.android.gms.internal.zzop.zzf.2 zzop$zzf$20 = new com.google.android.gms.common.api.zzi.zzb() {
                public void zza(EndpointDiscoveryListener connections$EndpointDiscoveryListener0) {
                    connections$EndpointDiscoveryListener0.onEndpointLost(endpointId);
                }

                @Override  // com.google.android.gms.common.api.zzi$zzb
                public void zzmw() {
                }
            };
            this.zzaFx.zza(zzop$zzf$20);
        }

        @Override  // com.google.android.gms.internal.zzoo
        public void zzhX(int v) throws RemoteException {
            Status status0 = new Status(v);
            this.zzOs.zzm(status0);
        }
    }

    private final long zzaoX;

    public zzop(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 54, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.zzaoX = (long)this.hashCode();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        if(this.isConnected()) {
            try {
                ((zzos)this.zznM()).zzE(this.zzaoX);
            }
            catch(RemoteException remoteException0) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", remoteException0);
            }
        }
        super.disconnect();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzda(iBinder0);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, long v, com.google.android.gms.common.api.zzi zzi0) throws RemoteException {
        ((zzos)this.zznM()).zza(new zzf(zza$zzb0, zzi0), s, v, this.zzaoX);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, AppMetadata appMetadata0, long v, com.google.android.gms.common.api.zzi zzi0) throws RemoteException {
        ((zzos)this.zznM()).zza(new zzd(zza$zzb0, zzi0), s, appMetadata0, v, this.zzaoX);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, byte[] arr_b, com.google.android.gms.common.api.zzi zzi0, com.google.android.gms.common.api.zzi zzi1) throws RemoteException {
        ((zzos)this.zznM()).zza(new zzc(zza$zzb0, zzi0, zzi1), s, s1, arr_b, this.zzaoX);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, byte[] arr_b, com.google.android.gms.common.api.zzi zzi0) throws RemoteException {
        ((zzos)this.zznM()).zza(new zza(zza$zzb0, zzi0), s, arr_b, this.zzaoX);
    }

    public void zza(String[] arr_s, byte[] arr_b) {
        try {
            ((zzos)this.zznM()).zza(arr_s, arr_b, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Couldn\'t send reliable message", remoteException0);
        }
    }

    public void zzb(String[] arr_s, byte[] arr_b) {
        try {
            ((zzos)this.zznM()).zzb(arr_s, arr_b, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Couldn\'t send unreliable message", remoteException0);
        }
    }

    public void zzdQ(String s) {
        try {
            ((zzos)this.zznM()).zzf(s, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Couldn\'t stop discovery", remoteException0);
        }
    }

    public void zzdR(String s) {
        try {
            ((zzos)this.zznM()).zzg(s, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Couldn\'t disconnect from endpoint", remoteException0);
        }
    }

    protected zzos zzda(IBinder iBinder0) {
        return com.google.android.gms.internal.zzos.zza.zzdc(iBinder0);
    }

    public void zzp(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((zzos)this.zznM()).zza(new zzoo() {
            @Override  // com.google.android.gms.internal.zzoo
            public void zzib(int v) throws RemoteException {
                Status status0 = new Status(v);
                zza$zzb0.zzm(status0);
            }
        }, s, this.zzaoX);
    }

    public String zzwR() {
        try {
            return ((zzos)this.zznM()).zzQ(this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
    }

    public String zzwS() {
        try {
            return ((zzos)this.zznM()).zzwS();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
    }

    public void zzwT() {
        try {
            ((zzos)this.zznM()).zzN(this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Couldn\'t stop advertising", remoteException0);
        }
    }

    public void zzwU() {
        try {
            ((zzos)this.zznM()).zzP(this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnectionsClient", "Couldn\'t stop all endpoints", remoteException0);
        }
    }
}

