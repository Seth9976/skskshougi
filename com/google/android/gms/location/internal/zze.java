package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest.Builder;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.zze.zzb;
import java.util.List;

public class zze implements GeofencingApi {
    static abstract class zza extends com.google.android.gms.location.LocationServices.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    @Override  // com.google.android.gms.location.GeofencingApi
    public PendingResult addGeofences(GoogleApiClient client, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                com.google.android.gms.location.internal.zze.1.1 zze$1$10 = new com.google.android.gms.location.zze.zza() {
                    @Override  // com.google.android.gms.location.zze$zza
                    public void zza(int v, String[] arr_s) {
                        Status status0 = LocationStatusCodes.zzgB(v);
                        com.google.android.gms.location.internal.zze.1.this.setResult(status0);
                    }
                };
                zzj0.zza(geofencingRequest, pendingIntent, zze$1$10);
            }
        });
    }

    @Override  // com.google.android.gms.location.GeofencingApi
    @Deprecated
    public PendingResult addGeofences(GoogleApiClient client, List list0, PendingIntent pendingIntent) {
        Builder geofencingRequest$Builder0 = new Builder();
        geofencingRequest$Builder0.addGeofences(list0);
        geofencingRequest$Builder0.setInitialTrigger(5);
        return this.addGeofences(client, geofencingRequest$Builder0.build(), pendingIntent);
    }

    @Override  // com.google.android.gms.location.GeofencingApi
    public PendingResult removeGeofences(GoogleApiClient client, PendingIntent pendingIntent) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                com.google.android.gms.location.internal.zze.2.1 zze$2$10 = new zzb() {
                    @Override  // com.google.android.gms.location.zze$zzb
                    public void zza(int v, PendingIntent pendingIntent0) {
                        Status status0 = LocationStatusCodes.zzgB(v);
                        com.google.android.gms.location.internal.zze.2.this.setResult(status0);
                    }

                    @Override  // com.google.android.gms.location.zze$zzb
                    public void zzb(int v, String[] arr_s) {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn\'t have been called");
                    }
                };
                zzj0.zza(pendingIntent, zze$2$10);
            }
        });
    }

    @Override  // com.google.android.gms.location.GeofencingApi
    public PendingResult removeGeofences(GoogleApiClient client, List list0) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                com.google.android.gms.location.internal.zze.3.1 zze$3$10 = new zzb() {
                    @Override  // com.google.android.gms.location.zze$zzb
                    public void zza(int v, PendingIntent pendingIntent0) {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn\'t have been called");
                    }

                    @Override  // com.google.android.gms.location.zze$zzb
                    public void zzb(int v, String[] arr_s) {
                        Status status0 = LocationStatusCodes.zzgB(v);
                        com.google.android.gms.location.internal.zze.3.this.setResult(status0);
                    }
                };
                zzj0.zza(list0, zze$3$10);
            }
        });
    }
}

