package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.MessageApi;

public final class zzav implements MessageApi {
    static final class zza extends zzf {
        private MessageListener zzaUF;
        private IntentFilter[] zzaUk;

        private zza(GoogleApiClient googleApiClient0, MessageListener messageApi$MessageListener0, IntentFilter[] arr_intentFilter) {
            super(googleApiClient0);
            this.zzaUF = messageApi$MessageListener0;
            this.zzaUk = arr_intentFilter;
        }

        zza(GoogleApiClient googleApiClient0, MessageListener messageApi$MessageListener0, IntentFilter[] arr_intentFilter, com.google.android.gms.wearable.internal.zzav.1 zzav$10) {
            this(googleApiClient0, messageApi$MessageListener0, arr_intentFilter);
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
            zzbk0.zza(this, this.zzaUF, this.zzaUk);
            this.zzaUF = null;
            this.zzaUk = null;
        }

        public Status zzb(Status status0) {
            this.zzaUF = null;
            this.zzaUk = null;
            return status0;
        }
    }

    public static class zzb implements SendMessageResult {
        private final Status zzOt;
        private final int zzacR;

        public zzb(Status status0, int v) {
            this.zzOt = status0;
            this.zzacR = v;
        }

        @Override  // com.google.android.gms.wearable.MessageApi$SendMessageResult
        public int getRequestId() {
            return this.zzacR;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    @Override  // com.google.android.gms.wearable.MessageApi
    public PendingResult addListener(GoogleApiClient client, MessageListener listener) {
        return this.zza(client, listener, null);
    }

    @Override  // com.google.android.gms.wearable.MessageApi
    public PendingResult removeListener(GoogleApiClient client, MessageListener listener) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, listener);
            }

            public Status zzb(Status status0) [...] // Inlined contents
        });
    }

    @Override  // com.google.android.gms.wearable.MessageApi
    public PendingResult sendMessage(GoogleApiClient client, String nodeId, String action, byte[] data) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, nodeId, action, data);
            }

            protected SendMessageResult zzbh(Status status0) {
                return new zzb(status0, -1);
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, MessageListener messageApi$MessageListener0, IntentFilter[] arr_intentFilter) {
        return googleApiClient0.zza(new zza(googleApiClient0, messageApi$MessageListener0, arr_intentFilter, null));
    }
}

