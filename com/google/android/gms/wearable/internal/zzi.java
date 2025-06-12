package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;
import com.google.android.gms.wearable.ChannelApi;

public final class zzi implements ChannelApi {
    static final class zza extends zzf {
        private final String zzaTK;
        private ChannelListener zzaTL;

        zza(GoogleApiClient googleApiClient0, ChannelListener channelApi$ChannelListener0, String s) {
            super(googleApiClient0);
            this.zzaTL = (ChannelListener)zzu.zzu(channelApi$ChannelListener0);
            this.zzaTK = s;
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
            zzbk0.zza(this, this.zzaTL, this.zzaTK);
            this.zzaTL = null;
        }

        public Status zzb(Status status0) {
            this.zzaTL = null;
            return status0;
        }
    }

    static final class zzb implements OpenChannelResult {
        private final Status zzOt;
        private final Channel zzaTM;

        zzb(Status status0, Channel channel0) {
            this.zzOt = (Status)zzu.zzu(status0);
            this.zzaTM = channel0;
        }

        @Override  // com.google.android.gms.wearable.ChannelApi$OpenChannelResult
        public Channel getChannel() {
            return this.zzaTM;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class zzc extends zzf {
        private final String zzaTK;
        private ChannelListener zzaTL;

        zzc(GoogleApiClient googleApiClient0, ChannelListener channelApi$ChannelListener0, String s) {
            super(googleApiClient0);
            this.zzaTL = (ChannelListener)zzu.zzu(channelApi$ChannelListener0);
            this.zzaTK = s;
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
            zzbk0.zzb(this, this.zzaTL, this.zzaTK);
            this.zzaTL = null;
        }

        public Status zzb(Status status0) {
            this.zzaTL = null;
            return status0;
        }
    }

    @Override  // com.google.android.gms.wearable.ChannelApi
    public PendingResult addListener(GoogleApiClient client, ChannelListener listener) {
        zzu.zzb(client, "client is null");
        zzu.zzb(listener, "listener is null");
        return client.zza(new zza(client, listener, null));
    }

    @Override  // com.google.android.gms.wearable.ChannelApi
    public PendingResult openChannel(GoogleApiClient client, String nodeId, String path) {
        zzu.zzb(client, "client is null");
        zzu.zzb(nodeId, "nodeId is null");
        zzu.zzb(path, "path is null");
        return client.zzb(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zze(this, nodeId, path);
            }

            public OpenChannelResult zzba(Status status0) {
                return new zzb(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.ChannelApi
    public PendingResult removeListener(GoogleApiClient client, ChannelListener listener) {
        zzu.zzb(client, "client is null");
        zzu.zzb(listener, "listener is null");
        return client.zza(new zzc(client, listener, null));
    }
}

