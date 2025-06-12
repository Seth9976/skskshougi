package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;
import com.google.android.gms.nearby.connection.Connections;
import java.util.List;

public final class zzoq implements Connections {
    static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(zzoq.zzNX, googleApiClient0);
        }
    }

    static abstract class zzb extends zza {
        private zzb(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zzb(GoogleApiClient googleApiClient0, com.google.android.gms.internal.zzoq.1 zzoq$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaM(x0);
        }

        public StartAdvertisingResult zzaM(Status status0) {
            return new StartAdvertisingResult() {
                @Override  // com.google.android.gms.nearby.connection.Connections$StartAdvertisingResult
                public String getLocalEndpointName() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class zzc extends zza {
        private zzc(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zzc(GoogleApiClient googleApiClient0, com.google.android.gms.internal.zzoq.1 zzoq$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    public static final ClientKey zzNX;
    public static final com.google.android.gms.common.api.Api.zza zzNY;

    static {
        zzoq.zzNX = new ClientKey();
        zzoq.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzop zzq(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzop(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public PendingResult acceptConnectionRequest(GoogleApiClient apiClient, String remoteEndpointId, byte[] payload, MessageListener messageListener) {
        return apiClient.zzb(new zzc(apiClient, remoteEndpointId, payload, apiClient.zzo(messageListener)) {
            final zzoq zzaFJ;
            final zzi zzaFM;
            final String zzaFs;
            final byte[] zzarU;

            {
                zzoq.this = zzoq0;
                this.zzaFs = s;
                this.zzarU = arr_b;
                this.zzaFM = zzi0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zzop)api$Client0));
            }

            protected void zza(zzop zzop0) throws RemoteException {
                zzop0.zza(this, this.zzaFs, this.zzarU, this.zzaFM);
            }
        });
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void disconnectFromEndpoint(GoogleApiClient apiClient, String remoteEndpointId) {
        zzoq.zzd(apiClient, false).zzdR(remoteEndpointId);
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public String getLocalDeviceId(GoogleApiClient apiClient) {
        return zzoq.zzd(apiClient, true).zzwS();
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public String getLocalEndpointId(GoogleApiClient apiClient) {
        return zzoq.zzd(apiClient, true).zzwR();
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public PendingResult rejectConnectionRequest(GoogleApiClient apiClient, String remoteEndpointId) {
        return apiClient.zzb(new zzc(apiClient, remoteEndpointId) {
            final zzoq zzaFJ;
            final String zzaFs;

            {
                zzoq.this = zzoq0;
                this.zzaFs = s;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zzop)api$Client0));
            }

            protected void zza(zzop zzop0) throws RemoteException {
                zzop0.zzp(this, this.zzaFs);
            }
        });
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public PendingResult sendConnectionRequest(GoogleApiClient apiClient, String name, String remoteEndpointId, byte[] payload, ConnectionResponseCallback connectionResponseCallback, MessageListener messageListener) {
        return apiClient.zzb(new zzc(apiClient, name, remoteEndpointId, payload, apiClient.zzo(connectionResponseCallback), apiClient.zzo(messageListener)) {
            final String val$name;
            final zzoq zzaFJ;
            final zzi zzaFL;
            final zzi zzaFM;
            final String zzaFs;
            final byte[] zzarU;

            {
                zzoq.this = zzoq0;
                this.val$name = s;
                this.zzaFs = s1;
                this.zzarU = arr_b;
                this.zzaFL = zzi0;
                this.zzaFM = zzi1;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zzop)api$Client0));
            }

            protected void zza(zzop zzop0) throws RemoteException {
                zzop0.zza(this, this.val$name, this.zzaFs, this.zzarU, this.zzaFL, this.zzaFM);
            }
        });
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void sendReliableMessage(GoogleApiClient apiClient, String remoteEndpointId, byte[] payload) {
        zzoq.zzd(apiClient, false).zza(new String[]{remoteEndpointId}, payload);
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void sendReliableMessage(GoogleApiClient apiClient, List list0, byte[] payload) {
        zzoq.zzd(apiClient, false).zza(((String[])list0.toArray(new String[list0.size()])), payload);
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void sendUnreliableMessage(GoogleApiClient apiClient, String remoteEndpointId, byte[] payload) {
        zzoq.zzd(apiClient, false).zzb(new String[]{remoteEndpointId}, payload);
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void sendUnreliableMessage(GoogleApiClient apiClient, List list0, byte[] payload) {
        zzoq.zzd(apiClient, false).zzb(((String[])list0.toArray(new String[list0.size()])), payload);
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public PendingResult startAdvertising(GoogleApiClient apiClient, String name, AppMetadata appMetadata, long durationMillis, ConnectionRequestListener connectionRequestListener) {
        return apiClient.zzb(new zzb(apiClient, name, appMetadata, durationMillis, apiClient.zzo(connectionRequestListener)) {
            final String val$name;
            final AppMetadata zzaFG;
            final long zzaFH;
            final zzi zzaFI;
            final zzoq zzaFJ;

            {
                zzoq.this = zzoq0;
                this.val$name = s;
                this.zzaFG = appMetadata0;
                this.zzaFH = v;
                this.zzaFI = zzi0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zzop)api$Client0));
            }

            protected void zza(zzop zzop0) throws RemoteException {
                zzop0.zza(this, this.val$name, this.zzaFG, this.zzaFH, this.zzaFI);
            }
        });
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public PendingResult startDiscovery(GoogleApiClient apiClient, String serviceId, long durationMillis, EndpointDiscoveryListener listener) {
        return apiClient.zzb(new zzc(apiClient, serviceId, durationMillis, apiClient.zzo(listener)) {
            final String zzaFE;
            final long zzaFH;
            final zzoq zzaFJ;
            final zzi zzaFK;

            {
                zzoq.this = zzoq0;
                this.zzaFE = s;
                this.zzaFH = v;
                this.zzaFK = zzi0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zzop)api$Client0));
            }

            protected void zza(zzop zzop0) throws RemoteException {
                zzop0.zza(this, this.zzaFE, this.zzaFH, this.zzaFK);
            }
        });
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void stopAdvertising(GoogleApiClient apiClient) {
        zzoq.zzd(apiClient, false).zzwT();
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void stopAllEndpoints(GoogleApiClient apiClient) {
        zzoq.zzd(apiClient, false).zzwU();
    }

    @Override  // com.google.android.gms.nearby.connection.Connections
    public void stopDiscovery(GoogleApiClient apiClient, String serviceId) {
        zzoq.zzd(apiClient, false).zzdQ(serviceId);
    }

    public static zzop zzd(GoogleApiClient googleApiClient0, boolean z) {
        zzu.zzb(googleApiClient0 != null, "GoogleApiClient parameter is required.");
        zzu.zza(googleApiClient0.isConnected(), "GoogleApiClient must be connected.");
        return zzoq.zze(googleApiClient0, z);
    }

    public static zzop zze(GoogleApiClient googleApiClient0, boolean z) {
        zzu.zza(googleApiClient0.zza(Nearby.CONNECTIONS_API), "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean z1 = googleApiClient0.hasConnectedApi(Nearby.CONNECTIONS_API);
        if(z && !z1) {
            throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
        }
        return z1 ? ((zzop)googleApiClient0.zza(zzoq.zzNX)) : null;
    }
}

