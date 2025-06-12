package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.NodeApi;
import java.util.ArrayList;
import java.util.List;

public final class zzax implements NodeApi {
    static final class zza extends zzf {
        private NodeListener zzaUI;

        private zza(GoogleApiClient googleApiClient0, NodeListener nodeApi$NodeListener0) {
            super(googleApiClient0);
            this.zzaUI = nodeApi$NodeListener0;
        }

        zza(GoogleApiClient googleApiClient0, NodeListener nodeApi$NodeListener0, com.google.android.gms.wearable.internal.zzax.1 zzax$10) {
            this(googleApiClient0, nodeApi$NodeListener0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzb(x0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((zzbk)api$Client0));
        }

        protected void zza(zzbk zzbk0) throws RemoteException {
            zzbk0.zza(this, this.zzaUI);
            this.zzaUI = null;
        }

        public Status zzb(Status status0) {
            this.zzaUI = null;
            return status0;
        }
    }

    public static class zzb implements GetConnectedNodesResult {
        private final Status zzOt;
        private final List zzaUJ;

        public zzb(Status status0, List list0) {
            this.zzOt = status0;
            this.zzaUJ = list0;
        }

        @Override  // com.google.android.gms.wearable.NodeApi$GetConnectedNodesResult
        public List getNodes() {
            return this.zzaUJ;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    public static class zzc implements GetLocalNodeResult {
        private final Status zzOt;
        private final Node zzaUK;

        public zzc(Status status0, Node node0) {
            this.zzOt = status0;
            this.zzaUK = node0;
        }

        @Override  // com.google.android.gms.wearable.NodeApi$GetLocalNodeResult
        public Node getNode() {
            return this.zzaUK;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    @Override  // com.google.android.gms.wearable.NodeApi
    public PendingResult addListener(GoogleApiClient client, NodeListener listener) {
        return client.zza(new zza(client, listener, null));
    }

    @Override  // com.google.android.gms.wearable.NodeApi
    public PendingResult getConnectedNodes(GoogleApiClient client) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzn(this);
            }

            protected GetConnectedNodesResult zzbj(Status status0) {
                return new zzb(status0, new ArrayList());
            }
        });
    }

    @Override  // com.google.android.gms.wearable.NodeApi
    public PendingResult getLocalNode(GoogleApiClient client) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzm(this);
            }

            protected GetLocalNodeResult zzbi(Status status0) {
                return new zzc(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.NodeApi
    public PendingResult removeListener(GoogleApiClient client, NodeListener listener) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzb(this, listener);
            }

            public Status zzb(Status status0) [...] // Inlined contents
        });
    }
}

