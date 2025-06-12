package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions.Builder;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import java.util.Locale;

public class zzj extends zzi {
    public static class zza implements com.google.android.gms.common.api.Api.zza {
        private final String zzaAn;
        private final String zzaAo;

        public zza(String s, String s1) {
            this.zzaAn = s;
            this.zzaAo = s1;
        }

        @Override  // com.google.android.gms.common.api.Api$zza
        public int getPriority() {
            return 0x7FFFFFFF;
        }

        @Override  // com.google.android.gms.common.api.Api$zza
        public Client zza(Context context0, Looper looper0, zze zze0, Object object0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return this.zzb(context0, looper0, zze0, ((PlacesOptions)object0), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }

        public zzj zzb(Context context0, Looper looper0, zze zze0, PlacesOptions placesOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            String s = this.zzaAn == null ? "org.dyndns.vivi.SkskShogi" : this.zzaAn;
            if(this.zzaAo != null) {
                return placesOptions0 == null ? new zzj(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, this.zzaAo, new Builder().build()) : new zzj(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, this.zzaAo, placesOptions0);
            }
            return placesOptions0 == null ? new zzj(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, "org.dyndns.vivi.SkskShogi", new Builder().build()) : new zzj(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, "org.dyndns.vivi.SkskShogi", placesOptions0);
        }
    }

    private final PlacesParams zzaAl;
    private final Locale zzaAm;

    public zzj(Context context0, Looper looper0, zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s, String s1, PlacesOptions placesOptions0) {
        super(context0, looper0, 67, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzaAm = Locale.getDefault();
        this.zzaAl = new PlacesParams(s, this.zzaAm, (zze0.getAccount() == null ? null : zze0.getAccount().name), placesOptions0.zzazX, s1);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzcd(iBinder0);
    }

    public void zza(zzm zzm0, PlaceFilter placeFilter0) throws RemoteException {
        if(placeFilter0 == null) {
            placeFilter0 = PlaceFilter.zzuJ();
        }
        ((com.google.android.gms.location.places.internal.zze)this.zznM()).zza(placeFilter0, this.zzaAl, zzm0);
    }

    public void zza(zzm zzm0, PlaceReport placeReport0) throws RemoteException {
        zzu.zzu(placeReport0);
        ((com.google.android.gms.location.places.internal.zze)this.zznM()).zza(placeReport0, this.zzaAl, zzm0);
    }

    protected com.google.android.gms.location.places.internal.zze zzcd(IBinder iBinder0) {
        return com.google.android.gms.location.places.internal.zze.zza.zzbZ(iBinder0);
    }
}

