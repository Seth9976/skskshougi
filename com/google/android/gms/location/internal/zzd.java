package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class zzd implements FusedLocationProviderApi {
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

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public Location getLastLocation(GoogleApiClient client) {
        zzj zzj0 = LocationServices.zze(client);
        try {
            return zzj0.getLastLocation();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public LocationAvailability getLocationAvailability(GoogleApiClient client) {
        zzj zzj0 = LocationServices.zze(client);
        try {
            return zzj0.zzuw();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult removeLocationUpdates(GoogleApiClient client, PendingIntent callbackIntent) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zzd(callbackIntent);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult removeLocationUpdates(GoogleApiClient client, LocationCallback callback) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(callback);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult removeLocationUpdates(GoogleApiClient client, LocationListener listener) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(listener);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult requestLocationUpdates(GoogleApiClient client, LocationRequest request, PendingIntent callbackIntent) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zzb(request, callbackIntent);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult requestLocationUpdates(GoogleApiClient client, LocationRequest request, LocationCallback callback, Looper looper) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(LocationRequestInternal.zzb(request), callback, looper);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult requestLocationUpdates(GoogleApiClient client, LocationRequest request, LocationListener listener) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(request, listener, null);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult requestLocationUpdates(GoogleApiClient client, LocationRequest request, LocationListener listener, Looper looper) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(request, listener, looper);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult setMockLocation(GoogleApiClient client, Location mockLocation) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zzb(mockLocation);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public PendingResult setMockMode(GoogleApiClient client, boolean isMockMode) {
        return client.zzb(new zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zzac(isMockMode);
                this.setResult(Status.zzXP);
            }
        });
    }
}

