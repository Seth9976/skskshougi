package com.google.android.gms.location.places;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.internal.zzh.zza;

public class zzm extends zza {
    public static abstract class com.google.android.gms.location.places.zzm.zza extends zzb {
        public com.google.android.gms.location.places.zzm.zza(ClientKey api$ClientKey0, GoogleApiClient googleApiClient0) {
            super(api$ClientKey0, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzaG(x0);
        }

        protected AutocompletePredictionBuffer zzaG(Status status0) {
            return new AutocompletePredictionBuffer(DataHolder.zzbi(status0.getStatusCode()));
        }
    }

    public static abstract class zzb extends com.google.android.gms.common.api.zza.zza {
        public zzb(ClientKey api$ClientKey0, GoogleApiClient googleApiClient0) {
            super(api$ClientKey0, googleApiClient0);
        }
    }

    public static abstract class zzc extends zzb {
        public zzc(ClientKey api$ClientKey0, GoogleApiClient googleApiClient0) {
            super(api$ClientKey0, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzaH(x0);
        }

        protected PlaceBuffer zzaH(Status status0) {
            return new PlaceBuffer(DataHolder.zzbi(status0.getStatusCode()), null);
        }
    }

    public static abstract class zzd extends zzb {
        public zzd(ClientKey api$ClientKey0, GoogleApiClient googleApiClient0) {
            super(api$ClientKey0, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzaI(x0);
        }

        protected PlaceLikelihoodBuffer zzaI(Status status0) {
            return new PlaceLikelihoodBuffer(DataHolder.zzbi(status0.getStatusCode()), 100, null);
        }
    }

    public static abstract class zze extends zzb {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzaJ(x0);
        }

        protected com.google.android.gms.location.places.personalized.zzd zzaJ(Status status0) {
            return com.google.android.gms.location.places.personalized.zzd.zzaK(status0);
        }
    }

    public static abstract class zzf extends zzb {
        public zzf(ClientKey api$ClientKey0, GoogleApiClient googleApiClient0) {
            super(api$ClientKey0, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return x0;
        }

        protected Status zzb(Status status0) [...] // Inlined contents
    }

    private static final String TAG;
    private final Context mContext;
    private final zzd zzazS;
    private final com.google.android.gms.location.places.zzm.zza zzazT;
    private final zze zzazU;
    private final zzf zzazV;
    private final zzc zzazW;

    static {
        zzm.TAG = "zzm";
    }

    public zzm(com.google.android.gms.location.places.zzm.zza zzm$zza0) {
        this.zzazS = null;
        this.zzazT = zzm$zza0;
        this.zzazU = null;
        this.zzazV = null;
        this.zzazW = null;
        this.mContext = null;
    }

    public zzm(zzc zzm$zzc0, Context context0) {
        this.zzazS = null;
        this.zzazT = null;
        this.zzazU = null;
        this.zzazV = null;
        this.zzazW = zzm$zzc0;
        this.mContext = context0;
    }

    public zzm(zzd zzm$zzd0, Context context0) {
        this.zzazS = zzm$zzd0;
        this.zzazT = null;
        this.zzazU = null;
        this.zzazV = null;
        this.zzazW = null;
        this.mContext = context0;
    }

    public zzm(zzf zzm$zzf0) {
        this.zzazS = null;
        this.zzazT = null;
        this.zzazU = null;
        this.zzazV = zzm$zzf0;
        this.zzazW = null;
        this.mContext = null;
    }

    @Override  // com.google.android.gms.location.places.internal.zzh
    public void zzY(DataHolder dataHolder0) throws RemoteException {
        zzu.zza(this.zzazS != null, "placeEstimator cannot be null");
        if(dataHolder0 == null) {
            if(Log.isLoggable("zzm", 6)) {
                Log.e("zzm", "onPlaceEstimated received null DataHolder: Async stack trace:\n\tat com.google.android.gms.internal.zzlm.zzpa(Unknown Source)\n\tat com.google.android.gms.location.places.zzm.zzY(Unknown Source)");
            }
            this.zzazS.zzr(Status.zzXR);
            return;
        }
        PlaceLikelihoodBuffer placeLikelihoodBuffer0 = new PlaceLikelihoodBuffer(dataHolder0, 100, this.mContext);
        this.zzazS.setResult(placeLikelihoodBuffer0);
    }

    @Override  // com.google.android.gms.location.places.internal.zzh
    public void zzZ(DataHolder dataHolder0) throws RemoteException {
        if(dataHolder0 == null) {
            if(Log.isLoggable("zzm", 6)) {
                Log.e("zzm", "onAutocompletePrediction received null DataHolder: Async stack trace:\n\tat com.google.android.gms.internal.zzlm.zzpa(Unknown Source)\n\tat com.google.android.gms.location.places.zzm.zzZ(Unknown Source)");
            }
            this.zzazT.zzr(Status.zzXR);
            return;
        }
        AutocompletePredictionBuffer autocompletePredictionBuffer0 = new AutocompletePredictionBuffer(dataHolder0);
        this.zzazT.setResult(autocompletePredictionBuffer0);
    }

    @Override  // com.google.android.gms.location.places.internal.zzh
    public void zzaF(Status status0) throws RemoteException {
        this.zzazV.setResult(status0);
    }

    @Override  // com.google.android.gms.location.places.internal.zzh
    public void zzaa(DataHolder dataHolder0) throws RemoteException {
        if(dataHolder0 == null) {
            if(Log.isLoggable("zzm", 6)) {
                Log.e("zzm", "onPlaceUserDataFetched received null DataHolder: Async stack trace:\n\tat com.google.android.gms.internal.zzlm.zzpa(Unknown Source)\n\tat com.google.android.gms.location.places.zzm.zzaa(Unknown Source)");
            }
            this.zzazU.zzr(Status.zzXR);
            return;
        }
        com.google.android.gms.location.places.personalized.zzd zzd0 = new com.google.android.gms.location.places.personalized.zzd(dataHolder0);
        this.zzazU.setResult(zzd0);
    }

    @Override  // com.google.android.gms.location.places.internal.zzh
    public void zzab(DataHolder dataHolder0) throws RemoteException {
        PlaceBuffer placeBuffer0 = new PlaceBuffer(dataHolder0, this.mContext);
        this.zzazW.setResult(placeBuffer0);
    }
}

