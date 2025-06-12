package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

public class zzne implements SensorsApi {
    interface zza {
        void zzqR();
    }

    static class zzb extends com.google.android.gms.internal.zzmg.zza {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        private zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, com.google.android.gms.internal.zzne.1 zzne$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzmg
        public void zza(DataSourcesResult dataSourcesResult0) {
            this.zzOs.zzm(dataSourcesResult0);
        }
    }

    static class zzc extends com.google.android.gms.internal.zzmu.zza {
        private final com.google.android.gms.common.api.zza.zzb zzOs;
        private final zza zzalA;

        private zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, zza zzne$zza0) {
            this.zzOs = zza$zzb0;
            this.zzalA = zzne$zza0;
        }

        zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, zza zzne$zza0, com.google.android.gms.internal.zzne.1 zzne$10) {
            this(zza$zzb0, zzne$zza0);
        }

        @Override  // com.google.android.gms.internal.zzmu
        public void zzm(Status status0) {
            if(this.zzalA != null && status0.isSuccess()) {
                this.zzalA.zzqR();
            }
            this.zzOs.zzm(status0);
        }
    }

    @Override  // com.google.android.gms.fitness.SensorsApi
    public PendingResult add(GoogleApiClient client, SensorRequest request, PendingIntent intent) {
        return this.zza(client, request, null, intent);
    }

    @Override  // com.google.android.gms.fitness.SensorsApi
    public PendingResult add(GoogleApiClient client, SensorRequest request, OnDataPointListener listener) {
        return this.zza(client, request, com.google.android.gms.fitness.data.zzk.zza.zzqH().zza(listener), null);
    }

    @Override  // com.google.android.gms.fitness.SensorsApi
    public PendingResult findDataSources(GoogleApiClient client, DataSourcesRequest request) {
        return client.zza(new com.google.android.gms.internal.zzmc.zza(client) {
            protected DataSourcesResult zzG(Status status0) {
                return DataSourcesResult.zzL(status0);
            }

            protected void zza(zzmc zzmc0) throws RemoteException {
                zzb zzne$zzb0 = new zzb(this, null);
                ((zzmn)zzmc0.zznM()).zza(new DataSourcesRequest(request, zzne$zzb0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.SensorsApi
    public PendingResult remove(GoogleApiClient client, PendingIntent pendingIntent) {
        return this.zza(client, null, pendingIntent, null);
    }

    @Override  // com.google.android.gms.fitness.SensorsApi
    public PendingResult remove(GoogleApiClient client, OnDataPointListener listener) {
        zzk zzk0 = com.google.android.gms.fitness.data.zzk.zza.zzqH().zzb(listener);
        return zzk0 == null ? new zzmw(Status.zzXP) : this.zza(client, zzk0, null, new zza() {
            @Override  // com.google.android.gms.internal.zzne$zza
            public void zzqR() {
                com.google.android.gms.fitness.data.zzk.zza.zzqH().zzc(listener);
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, zzj zzj0, PendingIntent pendingIntent0, zza zzne$zza0) {
        return googleApiClient0.zzb(new com.google.android.gms.internal.zzmc.zzc(googleApiClient0) {
            protected void zza(zzmc zzmc0) throws RemoteException {
                zzc zzne$zzc0 = new zzc(this, zzne$zza0, null);
                ((zzmn)zzmc0.zznM()).zza(new SensorUnregistrationRequest(zzj0, pendingIntent0, zzne$zzc0, "org.dyndns.vivi.SkskShogi"));
            }

            @Override  // com.google.android.gms.internal.zzmc$zzc
            protected Status zzb(Status status0) [...] // Inlined contents
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, SensorRequest sensorRequest0, zzj zzj0, PendingIntent pendingIntent0) {
        return googleApiClient0.zza(new com.google.android.gms.internal.zzmc.zzc(googleApiClient0) {
            protected void zza(zzmc zzmc0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmn)zzmc0.zznM()).zza(new SensorRegistrationRequest(sensorRequest0, zzj0, pendingIntent0, zzng0, "org.dyndns.vivi.SkskShogi"));
            }

            @Override  // com.google.android.gms.internal.zzmc$zzc
            protected Status zzb(Status status0) [...] // Inlined contents
        });
    }
}

