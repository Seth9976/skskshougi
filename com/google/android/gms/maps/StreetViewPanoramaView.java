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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {
    static class zza implements StreetViewLifecycleDelegate {
        private final IStreetViewPanoramaViewDelegate zzaCD;
        private View zzaCE;
        private final ViewGroup zzaCc;

        public zza(ViewGroup viewGroup0, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate0) {
            this.zzaCD = (IStreetViewPanoramaViewDelegate)zzu.zzu(iStreetViewPanoramaViewDelegate0);
            this.zzaCc = (ViewGroup)zzu.zzu(viewGroup0);
        }

        @Override  // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback callback) {
            try {
                com.google.android.gms.maps.StreetViewPanoramaView.zza.1 streetViewPanoramaView$zza$10 = new com.google.android.gms.maps.internal.zzv.zza() {
                    @Override  // com.google.android.gms.maps.internal.zzv
                    public void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate0) throws RemoteException {
                        StreetViewPanorama streetViewPanorama0 = new StreetViewPanorama(iStreetViewPanoramaDelegate0);
                        callback.onStreetViewPanoramaReady(streetViewPanorama0);
                    }
                };
                this.zzaCD.getStreetViewPanoramaAsync(streetViewPanoramaView$zza$10);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onCreate(Bundle savedInstanceState) {
            try {
                this.zzaCD.onCreate(savedInstanceState);
                this.zzaCE = (View)zze.zzn(this.zzaCD.getView());
                this.zzaCc.removeAllViews();
                this.zzaCc.addView(this.zzaCE);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.zzaCD.onDestroy();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.zzaCD.onLowMemory();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.zzaCD.onPause();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                this.zzaCD.onResume();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeRemoteException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle outState) {
            try {
                this.zzaCD.onSaveInstanceState(outState);
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

        public IStreetViewPanoramaViewDelegate zzvB() {
            return this.zzaCD;
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza {
        private final Context mContext;
        protected zzf zzaBZ;
        private final StreetViewPanoramaOptions zzaCG;
        private final ViewGroup zzaCg;
        private final List zzaCu;

        zzb(ViewGroup viewGroup0, Context context0, StreetViewPanoramaOptions streetViewPanoramaOptions0) {
            this.zzaCu = new ArrayList();
            this.zzaCg = viewGroup0;
            this.mContext = context0;
            this.zzaCG = streetViewPanoramaOptions0;
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback callback) {
            if(this.zzqj() != null) {
                ((zza)this.zzqj()).getStreetViewPanoramaAsync(callback);
                return;
            }
            this.zzaCu.add(callback);
        }

        @Override  // com.google.android.gms.dynamic.zza
        protected void zza(zzf zzf0) {
            this.zzaBZ = zzf0;
            this.zzvu();
        }

        public void zzvu() {
            if(this.zzaBZ != null && this.zzqj() == null) {
                try {
                    IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate0 = zzy.zzay(this.mContext).zza(zze.zzw(this.mContext), this.zzaCG);
                    this.zzaBZ.zza(new zza(this.zzaCg, iStreetViewPanoramaViewDelegate0));
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

    private final zzb zzaCC;
    private StreetViewPanorama zzaCq;

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.zzaCC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.zzaCC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.zzaCC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions options) {
        super(context);
        this.zzaCC = new zzb(this, context, options);
    }

    @Deprecated
    public final StreetViewPanorama getStreetViewPanorama() {
        if(this.zzaCq != null) {
            return this.zzaCq;
        }
        this.zzaCC.zzvu();
        if(this.zzaCC.zzqj() == null) {
            return null;
        }
        try {
            this.zzaCq = new StreetViewPanorama(((zza)this.zzaCC.zzqj()).zzvB().getStreetViewPanorama());
            return this.zzaCq;
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback callback) {
        zzu.zzbY("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzaCC.getStreetViewPanoramaAsync(callback);
    }

    public final void onCreate(Bundle savedInstanceState) {
        this.zzaCC.onCreate(savedInstanceState);
        if(this.zzaCC.zzqj() == null) {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy() {
        this.zzaCC.onDestroy();
    }

    public final void onLowMemory() {
        this.zzaCC.onLowMemory();
    }

    public final void onPause() {
        this.zzaCC.onPause();
    }

    public final void onResume() {
        this.zzaCC.onResume();
    }

    public final void onSaveInstanceState(Bundle outState) {
        this.zzaCC.onSaveInstanceState(outState);
    }
}

