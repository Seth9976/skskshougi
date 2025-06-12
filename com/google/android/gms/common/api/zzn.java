package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzn extends Fragment implements DialogInterface.OnCancelListener, LoaderManager.LoaderCallbacks {
    static class zza extends Loader implements ConnectionCallbacks, OnConnectionFailedListener {
        public final GoogleApiClient zzYb;
        private boolean zzYg;
        private ConnectionResult zzYh;

        public zza(Context context0, GoogleApiClient googleApiClient0) {
            super(context0);
            this.zzYb = googleApiClient0;
        }

        public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            super.dump(prefix, fd, writer, args);
            this.zzYb.dump(prefix, fd, writer, args);
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
        public void onConnected(Bundle connectionHint) {
            this.zzYg = false;
            this.zzf(ConnectionResult.zzVG);
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult result) {
            this.zzYg = true;
            this.zzf(result);
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
        public void onConnectionSuspended(int cause) {
        }

        protected void onReset() {
            this.zzYh = null;
            this.zzYg = false;
            this.zzYb.unregisterConnectionCallbacks(this);
            this.zzYb.unregisterConnectionFailedListener(this);
            this.zzYb.disconnect();
        }

        protected void onStartLoading() {
            super.onStartLoading();
            this.zzYb.registerConnectionCallbacks(this);
            this.zzYb.registerConnectionFailedListener(this);
            if(this.zzYh != null) {
                this.deliverResult(this.zzYh);
            }
            if(!this.zzYb.isConnected() && !this.zzYb.isConnecting() && !this.zzYg) {
                this.zzYb.connect();
            }
        }

        protected void onStopLoading() {
            this.zzYb.disconnect();
        }

        private void zzf(ConnectionResult connectionResult0) {
            this.zzYh = connectionResult0;
            if(this.isStarted() && !this.isAbandoned()) {
                this.deliverResult(connectionResult0);
            }
        }

        public boolean zzmX() {
            return this.zzYg;
        }
    }

    static class zzb {
        public final GoogleApiClient zzYb;
        public final OnConnectionFailedListener zzYc;

        private zzb(GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            this.zzYb = googleApiClient0;
            this.zzYc = googleApiClient$OnConnectionFailedListener0;
        }

        zzb(GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, com.google.android.gms.common.api.zzn.1 zzn$10) {
            this(googleApiClient0, googleApiClient$OnConnectionFailedListener0);
        }
    }

    class zzc implements Runnable {
        private final int zzYe;
        private final ConnectionResult zzYf;
        final zzn zzYi;

        public zzc(int v, ConnectionResult connectionResult0) {
            this.zzYe = v;
            this.zzYf = connectionResult0;
        }

        @Override
        public void run() {
            if(this.zzYf.hasResolution()) {
                try {
                    int v = zzn.this.getActivity().getSupportFragmentManager().getFragments().indexOf(zzn.this);
                    FragmentActivity fragmentActivity0 = zzn.this.getActivity();
                    this.zzYf.startResolutionForResult(((Activity)fragmentActivity0), (v + 1 << 16) + 1);
                }
                catch(IntentSender.SendIntentException unused_ex) {
                    zzn.this.zzmV();
                }
                return;
            }
            if(GooglePlayServicesUtil.isUserRecoverableError(this.zzYf.getErrorCode())) {
                FragmentActivity fragmentActivity1 = zzn.this.getActivity();
                GooglePlayServicesUtil.showErrorDialogFragment(this.zzYf.getErrorCode(), ((Activity)fragmentActivity1), zzn.this, 2, zzn.this);
                return;
            }
            zzn.this.zza(this.zzYe, this.zzYf);
        }
    }

    private boolean zzXV;
    private int zzXW;
    private ConnectionResult zzXX;
    private final Handler zzXY;
    private final SparseArray zzXZ;

    public zzn() {
        this.zzXW = -1;
        this.zzXY = new Handler(Looper.getMainLooper());
        this.zzXZ = new SparseArray();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        boolean z = true;
        switch(requestCode) {
            case 1: {
                if(resultCode != -1) {
                    z = false;
                }
                break;
            }
            case 2: {
                if(GooglePlayServicesUtil.isGooglePlayServicesAvailable(((Context)this.getActivity())) != 0) {
                    z = false;
                }
                break;
            }
            default: {
                z = false;
            }
        }
        if(z) {
            this.zzmV();
            return;
        }
        this.zza(this.zzXW, this.zzXX);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        for(int v = 0; v < this.zzXZ.size(); ++v) {
            int v1 = this.zzXZ.keyAt(v);
            zza zzn$zza0 = this.zzbd(v1);
            if(zzn$zza0 == null || ((zzb)this.zzXZ.valueAt(v)).zzYb == zzn$zza0.zzYb) {
                this.getLoaderManager().initLoader(v1, null, this);
            }
            else {
                this.getLoaderManager().restartLoader(v1, null, this);
            }
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.zza(this.zzXW, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null) {
            this.zzXV = savedInstanceState.getBoolean("resolving_error", false);
            this.zzXW = savedInstanceState.getInt("failed_client_id", -1);
            if(this.zzXW >= 0) {
                this.zzXX = new ConnectionResult(savedInstanceState.getInt("failed_status"), ((PendingIntent)savedInstanceState.getParcelable("failed_resolution")));
            }
        }
    }

    public Loader onCreateLoader(int id, Bundle args) {
        return new zza(((Context)this.getActivity()), ((zzb)this.zzXZ.get(id)).zzYb);
    }

    public void onLoadFinished(Loader x0, Object x1) {
        this.zza(x0, ((ConnectionResult)x1));
    }

    public void onLoaderReset(Loader loader0) {
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("resolving_error", this.zzXV);
        if(this.zzXW >= 0) {
            outState.putInt("failed_client_id", this.zzXW);
            outState.putInt("failed_status", this.zzXX.getErrorCode());
            outState.putParcelable("failed_resolution", this.zzXX.getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        if(!this.zzXV) {
            for(int v = 0; v < this.zzXZ.size(); ++v) {
                this.getLoaderManager().initLoader(this.zzXZ.keyAt(v), null, this);
            }
        }
    }

    private void zza(int v, ConnectionResult connectionResult0) {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        zzb zzn$zzb0 = (zzb)this.zzXZ.get(v);
        if(zzn$zzb0 != null) {
            this.zzbb(v);
            OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = zzn$zzb0.zzYc;
            if(googleApiClient$OnConnectionFailedListener0 != null) {
                googleApiClient$OnConnectionFailedListener0.onConnectionFailed(connectionResult0);
            }
        }
        this.zzmV();
    }

    public void zza(int v, GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        zzu.zzb(googleApiClient0, "GoogleApiClient instance cannot be null");
        zzu.zza(this.zzXZ.indexOfKey(v) < 0, "Already managing a GoogleApiClient with id " + v);
        zzb zzn$zzb0 = new zzb(googleApiClient0, googleApiClient$OnConnectionFailedListener0, null);
        this.zzXZ.put(v, zzn$zzb0);
        if(this.getActivity() != null) {
            LoaderManager.enableDebugLogging(false);
            this.getLoaderManager().initLoader(v, null, this);
        }
    }

    public void zza(Loader loader0, ConnectionResult connectionResult0) {
        if(!connectionResult0.isSuccess()) {
            this.zzb(loader0.getId(), connectionResult0);
        }
    }

    public static zzn zzb(FragmentActivity fragmentActivity0) {
        zzn zzn0;
        zzu.zzbY("Must be called from main thread of process");
        FragmentManager fragmentManager0 = fragmentActivity0.getSupportFragmentManager();
        try {
            zzn0 = (zzn)fragmentManager0.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", classCastException0);
        }
        if(zzn0 == null || zzn0.isRemoving()) {
            zzn0 = new zzn();
            fragmentManager0.beginTransaction().add(zzn0, "GmsSupportLoaderLifecycleFragment").commit();
            fragmentManager0.executePendingTransactions();
        }
        return zzn0;
    }

    private void zzb(int v, ConnectionResult connectionResult0) {
        if(!this.zzXV) {
            this.zzXV = true;
            this.zzXW = v;
            this.zzXX = connectionResult0;
            zzc zzn$zzc0 = new zzc(this, v, connectionResult0);
            this.zzXY.post(zzn$zzc0);
        }
    }

    public void zzbb(int v) {
        this.zzXZ.remove(v);
        this.getLoaderManager().destroyLoader(v);
    }

    public GoogleApiClient zzbc(int v) {
        if(this.getActivity() != null) {
            zza zzn$zza0 = this.zzbd(v);
            return zzn$zza0 == null ? null : zzn$zza0.zzYb;
        }
        return null;
    }

    zza zzbd(int v) {
        try {
            return (zza)this.getLoaderManager().getLoader(v);
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classCastException0);
        }
    }

    private void zzmV() {
        this.zzXV = false;
        this.zzXW = -1;
        this.zzXX = null;
        LoaderManager loaderManager0 = this.getLoaderManager();
        for(int v = 0; v < this.zzXZ.size(); ++v) {
            int v1 = this.zzXZ.keyAt(v);
            zza zzn$zza0 = this.zzbd(v1);
            if(zzn$zza0 != null && zzn$zza0.zzmX()) {
                loaderManager0.destroyLoader(v1);
                loaderManager0.initLoader(v1, null, this);
            }
        }
    }

    class com.google.android.gms.common.api.zzn.1 {
    }

}

