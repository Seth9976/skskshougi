package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaFragment extends Fragment {
    static class zza implements StreetViewLifecycleDelegate {
        private final IStreetViewPanoramaFragmentDelegate zzaCr;
        private final Fragment zzajt;

        public zza(Fragment fragment0, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate0) {
            this.zzaCr = (IStreetViewPanoramaFragmentDelegate)zzu.zzu(iStreetViewPanoramaFragmentDelegate0);
            this.zzajt = (Fragment)zzu.zzu(fragment0);
        }

        @Override  // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback callback) {
            try {
                com.google.android.gms.maps.StreetViewPanoramaFragment.zza.1 streetViewPanoramaFragment$zza$10 = new com.google.android.gms.maps.internal.zzv.zza() {
                    @Override  // com.google.android.gms.maps.internal.zzv
                    public void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate0) throws RemoteException {
                        StreetViewPanorama streetViewPanorama0 = new StreetViewPanorama(iStreetViewPanoramaDelegate0);
                        callback.onStreetViewPanoramaReady(streetViewPanorama0);
                    }
                };
                this.zzaCr.getStreetViewPanoramaAsync(streetViewPanoramaFragment$zza$10);
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
                Bundle bundle1 = this.zzajt.getArguments();
                if(bundle1 != null && bundle1.containsKey("StreetViewPanoramaOptions")) {
                    zzx.zza(savedInstanceState, "StreetViewPanoramaOptions", bundle1.getParcelable("StreetViewPanoramaOptions"));
                }
                this.zzaCr.onCreate(savedInstanceState);
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
                return (View)zze.zzn(this.zzaCr.onCreateView(zzd0, zzd1, savedInstanceState));
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.zzaCr.onDestroy();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroyView() {
            try {
                this.zzaCr.onDestroyView();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            try {
                zzd zzd0 = zze.zzw(activity);
                this.zzaCr.onInflate(zzd0, null, savedInstanceState);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.zzaCr.onLowMemory();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.zzaCr.onPause();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                this.zzaCr.onResume();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle outState) {
            try {
                this.zzaCr.onSaveInstanceState(outState);
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

        public IStreetViewPanoramaFragmentDelegate zzvx() {
            return this.zzaCr;
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza {
        private Activity mActivity;
        protected zzf zzaBZ;
        private final List zzaCu;
        private final Fragment zzajt;

        zzb(Fragment fragment0) {
            this.zzaCu = new ArrayList();
            this.zzajt = fragment0;
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback callback) {
            if(this.zzqj() != null) {
                ((zza)this.zzqj()).getStreetViewPanoramaAsync(callback);
                return;
            }
            this.zzaCu.add(callback);
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
            if(this.mActivity != null && this.zzaBZ != null && this.zzqj() == null) {
                try {
                    MapsInitializer.initialize(this.mActivity);
                    IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate0 = zzy.zzay(this.mActivity).zzs(zze.zzw(this.mActivity));
                    this.zzaBZ.zza(new zza(this.zzajt, iStreetViewPanoramaFragmentDelegate0));
                    for(Object object0: this.zzaCu) {
                        ((zza)this.zzqj()).getStreetViewPanoramaAsync(((OnStreetViewPanoramaReadyCallback)object0));
                    }
                    this.zzaCu.clear();
                }
                catch(RemoteException remoteException0) {
                    throw new RuntimeRemoteException(remoteException0);
                }
                catch(GooglePlayServicesNotAvailableException unused_ex) {
                }
            }
        }
    }

    private final zzb zzaCp;
    private StreetViewPanorama zzaCq;

    public StreetViewPanoramaFragment() {
        this.zzaCp = new zzb(this);
    }

    @Deprecated
    public final StreetViewPanorama getStreetViewPanorama() {
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate0;
        IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate0 = this.zzvx();
        if(iStreetViewPanoramaFragmentDelegate0 != null) {
            try {
                iStreetViewPanoramaDelegate0 = iStreetViewPanoramaFragmentDelegate0.getStreetViewPanorama();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
            if(iStreetViewPanoramaDelegate0 != null) {
                if(this.zzaCq == null || this.zzaCq.zzvw().asBinder() != iStreetViewPanoramaDelegate0.asBinder()) {
                    this.zzaCq = new StreetViewPanorama(iStreetViewPanoramaDelegate0);
                }
                return this.zzaCq;
            }
        }
        return null;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback callback) {
        zzu.zzbY("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzaCp.getStreetViewPanoramaAsync(callback);
    }

    public static StreetViewPanoramaFragment newInstance() {
        return new StreetViewPanoramaFragment();
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions options) {
        StreetViewPanoramaFragment streetViewPanoramaFragment0 = new StreetViewPanoramaFragment();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("StreetViewPanoramaOptions", options);
        streetViewPanoramaFragment0.setArguments(bundle0);
        return streetViewPanoramaFragment0;
    }

    @Override  // android.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            savedInstanceState.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(savedInstanceState);
    }

    @Override  // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.zzaCp.setActivity(activity);
    }

    @Override  // android.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.zzaCp.onCreate(savedInstanceState);
    }

    @Override  // android.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return this.zzaCp.onCreateView(inflater, container, savedInstanceState);
    }

    @Override  // android.app.Fragment
    public void onDestroy() {
        this.zzaCp.onDestroy();
        super.onDestroy();
    }

    @Override  // android.app.Fragment
    public void onDestroyView() {
        this.zzaCp.onDestroyView();
        super.onDestroyView();
    }

    @Override  // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        this.zzaCp.setActivity(activity);
        Bundle bundle1 = new Bundle();
        this.zzaCp.onInflate(activity, bundle1, savedInstanceState);
    }

    @Override  // android.app.Fragment
    public void onLowMemory() {
        this.zzaCp.onLowMemory();
        super.onLowMemory();
    }

    @Override  // android.app.Fragment
    public void onPause() {
        this.zzaCp.onPause();
        super.onPause();
    }

    @Override  // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.zzaCp.onResume();
    }

    @Override  // android.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        if(outState != null) {
            outState.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(outState);
        this.zzaCp.onSaveInstanceState(outState);
    }

    @Override  // android.app.Fragment
    public void setArguments(Bundle args) {
        super.setArguments(args);
    }

    protected IStreetViewPanoramaFragmentDelegate zzvx() {
        this.zzaCp.zzvu();
        return this.zzaCp.zzqj() == null ? null : ((zza)this.zzaCp.zzqj()).zzvx();
    }
}

