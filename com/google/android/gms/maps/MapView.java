package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {
    static class zza implements MapLifecycleDelegate {
        private final ViewGroup zzaCc;
        private final IMapViewDelegate zzaCd;
        private View zzaCe;

        public zza(ViewGroup viewGroup0, IMapViewDelegate iMapViewDelegate0) {
            this.zzaCd = (IMapViewDelegate)zzu.zzu(iMapViewDelegate0);
            this.zzaCc = (ViewGroup)zzu.zzu(viewGroup0);
        }

        @Override  // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public void getMapAsync(OnMapReadyCallback callback) {
            try {
                com.google.android.gms.maps.MapView.zza.1 mapView$zza$10 = new com.google.android.gms.maps.internal.zzm.zza() {
                    @Override  // com.google.android.gms.maps.internal.zzm
                    public void zza(IGoogleMapDelegate iGoogleMapDelegate0) throws RemoteException {
                        GoogleMap googleMap0 = new GoogleMap(iGoogleMapDelegate0);
                        callback.onMapReady(googleMap0);
                    }
                };
                this.zzaCd.getMapAsync(mapView$zza$10);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onCreate(Bundle savedInstanceState) {
            try {
                this.zzaCd.onCreate(savedInstanceState);
                this.zzaCe = (View)zze.zzn(this.zzaCd.getView());
                this.zzaCc.removeAllViews();
                this.zzaCc.addView(this.zzaCe);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.zzaCd.onDestroy();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.zzaCd.onLowMemory();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.zzaCd.onPause();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                this.zzaCd.onResume();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle outState) {
            try {
                this.zzaCd.onSaveInstanceState(outState);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onStart() {
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onStop() {
        }

        public IMapViewDelegate zzvv() {
            return this.zzaCd;
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza {
        private final Context mContext;
        protected zzf zzaBZ;
        private final List zzaCa;
        private final ViewGroup zzaCg;
        private final GoogleMapOptions zzaCh;

        zzb(ViewGroup viewGroup0, Context context0, GoogleMapOptions googleMapOptions0) {
            this.zzaCa = new ArrayList();
            this.zzaCg = viewGroup0;
            this.mContext = context0;
            this.zzaCh = googleMapOptions0;
        }

        public void getMapAsync(OnMapReadyCallback callback) {
            if(this.zzqj() != null) {
                ((zza)this.zzqj()).getMapAsync(callback);
                return;
            }
            this.zzaCa.add(callback);
        }

        @Override  // com.google.android.gms.dynamic.zza
        protected void zza(zzf zzf0) {
            this.zzaBZ = zzf0;
            this.zzvu();
        }

        public void zzvu() {
            if(this.zzaBZ == null || this.zzqj() != null) {
                return;
            }
            else {
                try {
                    MapsInitializer.initialize(this.mContext);
                    IMapViewDelegate iMapViewDelegate0 = zzy.zzay(this.mContext).zza(zze.zzw(this.mContext), this.zzaCh);
                    if(iMapViewDelegate0 != null) {
                        this.zzaBZ.zza(new zza(this.zzaCg, iMapViewDelegate0));
                        for(Object object0: this.zzaCa) {
                            ((zza)this.zzqj()).getMapAsync(((OnMapReadyCallback)object0));
                        }
                        this.zzaCa.clear();
                        return;
                    }
                    return;
                }
                catch(RemoteException remoteException0) {
                }
                catch(GooglePlayServicesNotAvailableException unused_ex) {
                    return;
                }
            }
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    private GoogleMap zzaBV;
    private final zzb zzaCb;

    public MapView(Context context) {
        super(context);
        this.zzaCb = new zzb(this, context, null);
        this.init();
    }

    public MapView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.zzaCb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attrs));
        this.init();
    }

    public MapView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.zzaCb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attrs));
        this.init();
    }

    public MapView(Context context, GoogleMapOptions options) {
        super(context);
        this.zzaCb = new zzb(this, context, options);
        this.init();
    }

    @Deprecated
    public final GoogleMap getMap() {
        if(this.zzaBV != null) {
            return this.zzaBV;
        }
        this.zzaCb.zzvu();
        if(this.zzaCb.zzqj() == null) {
            return null;
        }
        try {
            this.zzaBV = new GoogleMap(((zza)this.zzaCb.zzqj()).zzvv().getMap());
            return this.zzaBV;
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void getMapAsync(OnMapReadyCallback callback) {
        zzu.zzbY("getMapAsync() must be called on the main thread");
        this.zzaCb.getMapAsync(callback);
    }

    private void init() {
        this.setClickable(true);
    }

    public final void onCreate(Bundle savedInstanceState) {
        this.zzaCb.onCreate(savedInstanceState);
        if(this.zzaCb.zzqj() == null) {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy() {
        this.zzaCb.onDestroy();
    }

    public final void onLowMemory() {
        this.zzaCb.onLowMemory();
    }

    public final void onPause() {
        this.zzaCb.onPause();
    }

    public final void onResume() {
        this.zzaCb.onResume();
    }

    public final void onSaveInstanceState(Bundle outState) {
        this.zzaCb.onSaveInstanceState(outState);
    }
}

