package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;

public class zznb implements HistoryApi {
    static class zza extends com.google.android.gms.internal.zzmf.zza {
        private final zzb zzOs;
        private int zzalm;
        private DataReadResult zzaln;

        private zza(zzb zza$zzb0) {
            this.zzalm = 0;
            this.zzaln = null;
            this.zzOs = zza$zzb0;
        }

        zza(zzb zza$zzb0, com.google.android.gms.internal.zznb.1 zznb$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzmf
        public void zza(DataReadResult dataReadResult0) {
            synchronized(this) {
                Log.v("Fitness", "Received batch result");
                if(this.zzaln == null) {
                    this.zzaln = dataReadResult0;
                }
                else {
                    this.zzaln.zzb(dataReadResult0);
                }
                ++this.zzalm;
                if(this.zzalm == this.zzaln.zzrt()) {
                    this.zzOs.zzm(this.zzaln);
                }
            }
        }
    }

    @Override  // com.google.android.gms.fitness.HistoryApi
    public PendingResult deleteData(GoogleApiClient client, DataDeleteRequest request) {
        return client.zza(new zzc(client) {
            protected void zza(zzlz zzlz0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmk)zzlz0.zznM()).zza(new DataDeleteRequest(request, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.HistoryApi
    public PendingResult insertData(GoogleApiClient client, DataSet dataSet) {
        return this.zza(client, dataSet, false);
    }

    @Override  // com.google.android.gms.fitness.HistoryApi
    public PendingResult readDailyTotal(GoogleApiClient client, DataType dataType) {
        return client.zza(new com.google.android.gms.internal.zzlz.zza(client) {
            protected DailyTotalResult zzE(Status status0) {
                return DailyTotalResult.zzK(status0);
            }

            protected void zza(zzlz zzlz0) throws RemoteException {
                DailyTotalRequest dailyTotalRequest0 = new DailyTotalRequest(new com.google.android.gms.internal.zzme.zza() {
                    @Override  // com.google.android.gms.internal.zzme
                    public void zza(DailyTotalResult dailyTotalResult0) throws RemoteException {
                        com.google.android.gms.internal.zznb.4.this.setResult(dailyTotalResult0);
                    }
                }, dataType, "org.dyndns.vivi.SkskShogi");
                ((zzmk)zzlz0.zznM()).zza(dailyTotalRequest0);
            }
        });
    }

    @Override  // com.google.android.gms.fitness.HistoryApi
    public PendingResult readData(GoogleApiClient client, DataReadRequest request) {
        return client.zza(new com.google.android.gms.internal.zzlz.zza(client) {
            protected DataReadResult zzD(Status status0) {
                return DataReadResult.zza(status0, request);
            }

            protected void zza(zzlz zzlz0) throws RemoteException {
                zza zznb$zza0 = new zza(this, null);
                ((zzmk)zzlz0.zznM()).zza(new DataReadRequest(request, zznb$zza0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, DataSet dataSet0, boolean z) {
        zzu.zzb(dataSet0, "Must set the data set");
        zzu.zza(!dataSet0.getDataPoints().isEmpty(), "Cannot use an empty data set");
        zzu.zzb(dataSet0.getDataSource().zzqB(), "Must set the app package name for the data source");
        return googleApiClient0.zza(new zzc(googleApiClient0) {
            protected void zza(zzlz zzlz0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmk)zzlz0.zznM()).zza(new DataInsertRequest(dataSet0, zzng0, "org.dyndns.vivi.SkskShogi", z));
            }
        });
    }
}

