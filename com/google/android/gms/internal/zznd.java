package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

public class zznd implements RecordingApi {
    static class zza extends com.google.android.gms.internal.zzmp.zza {
        private final zzb zzOs;

        private zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        zza(zzb zza$zzb0, com.google.android.gms.internal.zznd.1 zznd$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzmp
        public void zza(ListSubscriptionsResult listSubscriptionsResult0) {
            this.zzOs.zzm(listSubscriptionsResult0);
        }
    }

    @Override  // com.google.android.gms.fitness.RecordingApi
    public PendingResult listSubscriptions(GoogleApiClient client) {
        return client.zza(new com.google.android.gms.internal.zzmb.zza(client) {
            protected ListSubscriptionsResult zzF(Status status0) {
                return ListSubscriptionsResult.zzN(status0);
            }

            protected void zza(zzmb zzmb0) throws RemoteException {
                zza zznd$zza0 = new zza(this, null);
                ((zzmm)zzmb0.zznM()).zza(new ListSubscriptionsRequest(null, zznd$zza0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.RecordingApi
    public PendingResult listSubscriptions(GoogleApiClient client, DataType dataType) {
        return client.zza(new com.google.android.gms.internal.zzmb.zza(client) {
            protected ListSubscriptionsResult zzF(Status status0) {
                return ListSubscriptionsResult.zzN(status0);
            }

            protected void zza(zzmb zzmb0) throws RemoteException {
                zza zznd$zza0 = new zza(this, null);
                ((zzmm)zzmb0.zznM()).zza(new ListSubscriptionsRequest(dataType, zznd$zza0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.RecordingApi
    public PendingResult subscribe(GoogleApiClient client, DataSource dataSource) {
        return this.zza(client, new com.google.android.gms.fitness.data.Subscription.zza().zzb(dataSource).zzqN());
    }

    @Override  // com.google.android.gms.fitness.RecordingApi
    public PendingResult subscribe(GoogleApiClient client, DataType dataType) {
        return this.zza(client, new com.google.android.gms.fitness.data.Subscription.zza().zzb(dataType).zzqN());
    }

    @Override  // com.google.android.gms.fitness.RecordingApi
    public PendingResult unsubscribe(GoogleApiClient client, DataSource dataSource) {
        return client.zzb(new zzc(client) {
            protected void zza(zzmb zzmb0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmm)zzmb0.zznM()).zza(new UnsubscribeRequest(null, dataSource, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.RecordingApi
    public PendingResult unsubscribe(GoogleApiClient client, DataType dataType) {
        return client.zzb(new zzc(client) {
            protected void zza(zzmb zzmb0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmm)zzmb0.zznM()).zza(new UnsubscribeRequest(dataType, null, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.RecordingApi
    public PendingResult unsubscribe(GoogleApiClient client, Subscription subscription) {
        return subscription.getDataType() == null ? this.unsubscribe(client, subscription.getDataSource()) : this.unsubscribe(client, subscription.getDataType());
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, Subscription subscription0) {
        return googleApiClient0.zza(new zzc(googleApiClient0) {
            protected void zza(zzmb zzmb0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmm)zzmb0.zznM()).zza(new SubscribeRequest(subscription0, false, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }
}

