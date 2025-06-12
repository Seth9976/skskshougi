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
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions.Builder;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public class zzd extends zzi {
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
            return this.zza(context0, looper0, zze0, ((PlacesOptions)object0), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }

        public zzd zza(Context context0, Looper looper0, zze zze0, PlacesOptions placesOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            String s = this.zzaAn == null ? "org.dyndns.vivi.SkskShogi" : this.zzaAn;
            if(this.zzaAo != null) {
                return placesOptions0 == null ? new zzd(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, this.zzaAo, new Builder().build()) : new zzd(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, this.zzaAo, placesOptions0);
            }
            return placesOptions0 == null ? new zzd(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, "org.dyndns.vivi.SkskShogi", new Builder().build()) : new zzd(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, s, "org.dyndns.vivi.SkskShogi", placesOptions0);
        }
    }

    private final PlacesParams zzaAl;
    private final Locale zzaAm;

    public zzd(Context context0, Looper looper0, zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s, String s1, PlacesOptions placesOptions0) {
        super(context0, looper0, 65, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzaAm = Locale.getDefault();
        this.zzaAl = new PlacesParams(s, this.zzaAm, (zze0.getAccount() == null ? null : zze0.getAccount().name), placesOptions0.zzazX, s1);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzbY(iBinder0);
    }

    public void zza(zzm zzm0, AddPlaceRequest addPlaceRequest0) throws RemoteException {
        zzu.zzb(addPlaceRequest0, "userAddedPlace == null");
        ((zzf)this.zznM()).zza(addPlaceRequest0, this.zzaAl, zzm0);
    }

    public void zza(zzm zzm0, String s, LatLngBounds latLngBounds0, AutocompleteFilter autocompleteFilter0) throws RemoteException {
        zzu.zzb(s, "query == null");
        zzu.zzb(latLngBounds0, "bounds == null");
        zzu.zzb(zzm0, "callback == null");
        AutocompleteFilter autocompleteFilter1 = autocompleteFilter0 == null ? AutocompleteFilter.create(null) : autocompleteFilter0;
        ((zzf)this.zznM()).zza(s, latLngBounds0, autocompleteFilter1, this.zzaAl, zzm0);
    }

    public void zza(zzm zzm0, List list0) throws RemoteException {
        ((zzf)this.zznM()).zzb(list0, this.zzaAl, zzm0);
    }

    protected zzf zzbY(IBinder iBinder0) {
        return com.google.android.gms.location.places.internal.zzf.zza.zzca(iBinder0);
    }
}

