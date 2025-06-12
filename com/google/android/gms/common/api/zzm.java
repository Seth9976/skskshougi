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
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzm extends Fragment implements DialogInterface.OnCancelListener {
    class zza implements OnConnectionFailedListener {
        public final int zzYa;
        public final GoogleApiClient zzYb;
        public final OnConnectionFailedListener zzYc;
        final zzm zzYd;

        public zza(int v, GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            this.zzYa = v;
            this.zzYb = googleApiClient0;
            this.zzYc = googleApiClient$OnConnectionFailedListener0;
            googleApiClient0.registerConnectionFailedListener(this);
        }

        public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            writer.append(prefix).append("GoogleApiClient #").print(this.zzYa);
            writer.println(":");
            this.zzYb.dump(prefix + "  ", fd, writer, args);
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult result) {
            zzm.this.zzXY.post(new zzb(zzm.this, this.zzYa, result));
        }

        public void zzmW() {
            this.zzYb.unregisterConnectionFailedListener(this);
            this.zzYb.disconnect();
        }
    }

    class zzb implements Runnable {
        final zzm zzYd;
        private final int zzYe;
        private final ConnectionResult zzYf;

        public zzb(int v, ConnectionResult connectionResult0) {
            this.zzYe = v;
            this.zzYf = connectionResult0;
        }

        @Override
        public void run() {
            if(!zzm.this.mStarted || zzm.this.zzXV) {
                return;
            }
            zzm.this.zzXV = true;
            zzm.this.zzXW = this.zzYe;
            zzm.this.zzXX = this.zzYf;
            if(this.zzYf.hasResolution()) {
                try {
                    int v = zzm.this.getActivity().getSupportFragmentManager().getFragments().indexOf(zzm.this);
                    FragmentActivity fragmentActivity0 = zzm.this.getActivity();
                    this.zzYf.startResolutionForResult(((Activity)fragmentActivity0), (v + 1 << 16) + 1);
                }
                catch(IntentSender.SendIntentException unused_ex) {
                    zzm.this.zzmV();
                }
                return;
            }
            if(GooglePlayServicesUtil.isUserRecoverableError(this.zzYf.getErrorCode())) {
                FragmentActivity fragmentActivity1 = zzm.this.getActivity();
                GooglePlayServicesUtil.showErrorDialogFragment(this.zzYf.getErrorCode(), ((Activity)fragmentActivity1), zzm.this, 2, zzm.this);
                return;
            }
            zzm.this.zza(this.zzYe, this.zzYf);
        }
    }

    private boolean mStarted;
    private boolean zzXV;
    private int zzXW;
    private ConnectionResult zzXX;
    private final Handler zzXY;
    private final SparseArray zzXZ;

    public zzm() {
        this.zzXW = -1;
        this.zzXY = new Handler(Looper.getMainLooper());
        this.zzXZ = new SparseArray();
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        for(int v = 0; v < this.zzXZ.size(); ++v) {
            ((zza)this.zzXZ.valueAt(v)).dump(prefix, fd, writer, args);
        }
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
        this.mStarted = true;
        if(!this.zzXV) {
            for(int v = 0; v < this.zzXZ.size(); ++v) {
                ((zza)this.zzXZ.valueAt(v)).zzYb.connect();
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.mStarted = false;
        for(int v = 0; v < this.zzXZ.size(); ++v) {
            ((zza)this.zzXZ.valueAt(v)).zzYb.disconnect();
        }
    }

    public static zzm zza(FragmentActivity fragmentActivity0) {
        zzm zzm0;
        zzu.zzbY("Must be called from main thread of process");
        FragmentManager fragmentManager0 = fragmentActivity0.getSupportFragmentManager();
        try {
            zzm0 = (zzm)fragmentManager0.findFragmentByTag("GmsSupportLifecycleFragment");
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", classCastException0);
        }
        if(zzm0 == null || zzm0.isRemoving()) {
            zzm0 = new zzm();
            fragmentManager0.beginTransaction().add(zzm0, "GmsSupportLifecycleFragment").commit();
            fragmentManager0.executePendingTransactions();
        }
        return zzm0;
    }

    private void zza(int v, ConnectionResult connectionResult0) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        zza zzm$zza0 = (zza)this.zzXZ.get(v);
        if(zzm$zza0 != null) {
            this.zzbb(v);
            OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = zzm$zza0.zzYc;
            if(googleApiClient$OnConnectionFailedListener0 != null) {
                googleApiClient$OnConnectionFailedListener0.onConnectionFailed(connectionResult0);
            }
        }
        this.zzmV();
    }

    public void zza(int v, GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        zzu.zzb(googleApiClient0, "GoogleApiClient instance cannot be null");
        zzu.zza(this.zzXZ.indexOfKey(v) < 0, "Already managing a GoogleApiClient with id " + v);
        zza zzm$zza0 = new zza(this, v, googleApiClient0, googleApiClient$OnConnectionFailedListener0);
        this.zzXZ.put(v, zzm$zza0);
        if(this.mStarted && !this.zzXV) {
            googleApiClient0.connect();
        }
    }

    public void zzbb(int v) {
        zza zzm$zza0 = (zza)this.zzXZ.get(v);
        this.zzXZ.remove(v);
        if(zzm$zza0 != null) {
            zzm$zza0.zzmW();
        }
    }

    private void zzmV() {
        this.zzXV = false;
        this.zzXW = -1;
        this.zzXX = null;
        for(int v = 0; v < this.zzXZ.size(); ++v) {
            ((zza)this.zzXZ.valueAt(v)).zzYb.connect();
        }
    }
}

