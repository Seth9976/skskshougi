package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {
    static class zza implements MapLifecycleDelegate {
        private final Fragment zzZX;
        private final IMapFragmentDelegate zzaBW;

        public zza(Fragment fragment0, IMapFragmentDelegate iMapFragmentDelegate0) {
            this.zzaBW = (IMapFragmentDelegate)zzu.zzu(iMapFragmentDelegate0);
            this.zzZX = (Fragment)zzu.zzu(fragment0);
        }

        @Override  // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public void getMapAsync(OnMapReadyCallback callback) {
            try {
                com.google.android.gms.maps.SupportMapFragment.zza.1 supportMapFragment$zza$10 = new com.google.android.gms.maps.internal.zzm.zza() {
                    @Override  // com.google.android.gms.maps.internal.zzm
                    public void zza(IGoogleMapDelegate iGoogleMapDelegate0) throws RemoteException {
                        GoogleMap googleMap0 = new GoogleMap(iGoogleMapDelegate0);
                        callback.onMapReady(googleMap0);
                    }
                };
                this.zzaBW.getMapAsync(supportMapFragment$zza$10);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onCreate(Bundle savedInstanceState) {
            try {
                if(savedInstanceState == null) {
                    savedInstanceState = new Bundle();
                }
                Bundle bundle1 = this.zzZX.getArguments();
                if(bundle1 != null && bundle1.containsKey("MapOptions")) {
                    zzx.zza(savedInstanceState, "MapOptions", bundle1.getParcelable("MapOptions"));
                }
                this.zzaBW.onCreate(savedInstanceState);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            try {
                zzd zzd0 = zze.zzw(inflater);
                zzd zzd1 = zze.zzw(container);
                return (View)zze.zzn(this.zzaBW.onCreateView(zzd0, zzd1, savedInstanceState));
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.zzaBW.onDestroy();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroyView() {
            try {
                this.zzaBW.onDestroyView();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            GoogleMapOptions googleMapOptions0 = (GoogleMapOptions)attrs.getParcelable("MapOptions");
            try {
                zzd zzd0 = zze.zzw(activity);
                this.zzaBW.onInflate(zzd0, googleMapOptions0, savedInstanceState);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.zzaBW.onLowMemory();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.zzaBW.onPause();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                this.zzaBW.onResume();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle outState) {
            try {
                this.zzaBW.onSaveInstanceState(outState);
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

        public IMapFragmentDelegate zzvt() {
            return this.zzaBW;
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza {
        private Activity mActivity;
        private final Fragment zzZX;
        protected zzf zzaBZ;
        private final List zzaCa;

        zzb(Fragment fragment0) {
            this.zzaCa = new ArrayList();
            this.zzZX = fragment0;
        }

        public void getMapAsync(OnMapReadyCallback callback) {
            if(this.zzqj() != null) {
                ((zza)this.zzqj()).getMapAsync(callback);
                return;
            }
            this.zzaCa.add(callback);
        }

        private void setActivity(Activity activity) {
            this.mActivity = activity;
            this.zzvu();
        }

        @Override  // com.google.android.gms.dynamic.zza
        protected void zza(zzf zzf0) {
            this.zzaBZ = zzf0;
            this.zzvu();
        }

        public void zzvu() {
            if(this.mActivity == null || this.zzaBZ == null || this.zzqj() != null) {
                return;
            }
            else {
                try {
                    MapsInitializer.initialize(this.mActivity);
                    IMapFragmentDelegate iMapFragmentDelegate0 = zzy.zzay(this.mActivity).zzr(zze.zzw(this.mActivity));
                    if(iMapFragmentDelegate0 != null) {
                        this.zzaBZ.zza(new zza(this.zzZX, iMapFragmentDelegate0));
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
    private final zzb zzaCH;

    public SupportMapFragment() {
        this.zzaCH = new zzb(this);
    }

    @Deprecated
    public final GoogleMap getMap() {
        IGoogleMapDelegate iGoogleMapDelegate0;
        IMapFragmentDelegate iMapFragmentDelegate0 = this.zzvt();
        if(iMapFragmentDelegate0 != null) {
            try {
                iGoogleMapDelegate0 = iMapFragmentDelegate0.getMap();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
            if(iGoogleMapDelegate0 != null) {
                if(this.zzaBV == null || this.zzaBV.zzvi().asBinder() != iGoogleMapDelegate0.asBinder()) {
                    this.zzaBV = new GoogleMap(iGoogleMapDelegate0);
                }
                return this.zzaBV;
            }
        }
        return null;
    }

    public void getMapAsync(OnMapReadyCallback callback) {
        zzu.zzbY("getMapAsync must be called on the main thread.");
        this.zzaCH.getMapAsync(callback);
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions options) {
        SupportMapFragment supportMapFragment0 = new SupportMapFragment();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("MapOptions", options);
        supportMapFragment0.setArguments(bundle0);
        return supportMapFragment0;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            savedInstanceState.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(savedInstanceState);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.zzaCH.setActivity(activity);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.zzaCH.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view0 = this.zzaCH.onCreateView(inflater, container, savedInstanceState);
        view0.setClickable(true);
        return view0;
    }

    public void onDestroy() {
        this.zzaCH.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zzaCH.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        this.zzaCH.setActivity(activity);
        GoogleMapOptions googleMapOptions0 = GoogleMapOptions.createFromAttributes(activity, attrs);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", googleMapOptions0);
        this.zzaCH.onInflate(activity, bundle1, savedInstanceState);
    }

    public void onLowMemory() {
        this.zzaCH.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.zzaCH.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzaCH.onResume();
    }

    public void onSaveInstanceState(Bundle outState) {
        if(outState != null) {
            outState.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(outState);
        this.zzaCH.onSaveInstanceState(outState);
    }

    public void setArguments(Bundle args) {
        super.setArguments(args);
    }

    protected IMapFragmentDelegate zzvt() {
        this.zzaCH.zzvu();
        return this.zzaCH.zzqj() == null ? null : ((zza)this.zzaCH.zzqj()).zzvt();
    }
}

