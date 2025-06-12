package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

public class zzna implements ConfigApi {
    static class zza extends com.google.android.gms.internal.zzmh.zza {
        private final zzb zzOs;

        private zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        zza(zzb zza$zzb0, com.google.android.gms.internal.zzna.1 zzna$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzmh
        public void zza(DataTypeResult dataTypeResult0) {
            this.zzOs.zzm(dataTypeResult0);
        }
    }

    @Override  // com.google.android.gms.fitness.ConfigApi
    public PendingResult createCustomDataType(GoogleApiClient client, DataTypeCreateRequest request) {
        return client.zzb(new com.google.android.gms.internal.zzly.zza(client) {
            protected DataTypeResult zzC(Status status0) {
                return DataTypeResult.zzM(status0);
            }

            protected void zza(zzly zzly0) throws RemoteException {
                zza zzna$zza0 = new zza(this, null);
                ((zzmj)zzly0.zznM()).zza(new DataTypeCreateRequest(request, zzna$zza0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.ConfigApi
    public PendingResult disableFit(GoogleApiClient client) {
        return client.zzb(new zzc(client) {
            protected void zza(zzly zzly0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmj)zzly0.zznM()).zza(new DisableFitRequest(zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.ConfigApi
    public PendingResult readDataType(GoogleApiClient client, String dataTypeName) {
        return client.zza(new com.google.android.gms.internal.zzly.zza(client) {
            protected DataTypeResult zzC(Status status0) {
                return DataTypeResult.zzM(status0);
            }

            protected void zza(zzly zzly0) throws RemoteException {
                zza zzna$zza0 = new zza(this, null);
                ((zzmj)zzly0.zznM()).zza(new DataTypeReadRequest(dataTypeName, zzna$zza0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }
}

