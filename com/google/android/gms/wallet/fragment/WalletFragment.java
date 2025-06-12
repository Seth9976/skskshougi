package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R.string;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqy;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragment extends Fragment {
    public interface OnStateChangedListener {
        void onStateChanged(WalletFragment arg1, int arg2, int arg3, Bundle arg4);
    }

    static class zza extends com.google.android.gms.internal.zzqr.zza {
        private OnStateChangedListener zzaSf;
        private final WalletFragment zzaSg;

        zza(WalletFragment walletFragment0) {
            this.zzaSg = walletFragment0;
        }

        @Override  // com.google.android.gms.internal.zzqr
        public void zza(int v, int v1, Bundle bundle0) {
            if(this.zzaSf != null) {
                this.zzaSf.onStateChanged(this.zzaSg, v, v1, bundle0);
            }
        }

        public void zza(OnStateChangedListener walletFragment$OnStateChangedListener0) {
            this.zzaSf = walletFragment$OnStateChangedListener0;
        }
    }

    static class zzb implements LifecycleDelegate {
        private final zzqq zzaRZ;

        private zzb(zzqq zzqq0) {
            this.zzaRZ = zzqq0;
        }

        zzb(zzqq zzqq0, com.google.android.gms.wallet.fragment.WalletFragment.1 walletFragment$10) {
            this(zzqq0);
        }

        private int getState() {
            try {
                return this.zzaRZ.getState();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        private void initialize(WalletFragmentInitParams startParams) {
            try {
                this.zzaRZ.initialize(startParams);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        private void onActivityResult(int requestCode, int resultCode, Intent data) {
            try {
                this.zzaRZ.onActivityResult(requestCode, resultCode, data);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onCreate(Bundle savedInstanceState) {
            try {
                this.zzaRZ.onCreate(savedInstanceState);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            try {
                zzd zzd0 = zze.zzw(inflater);
                zzd zzd1 = zze.zzw(container);
                return (View)zze.zzn(this.zzaRZ.onCreateView(zzd0, zzd1, savedInstanceState));
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroy() {
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroyView() {
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            WalletFragmentOptions walletFragmentOptions0 = (WalletFragmentOptions)attrs.getParcelable("extraWalletFragmentOptions");
            try {
                zzd zzd0 = zze.zzw(activity);
                this.zzaRZ.zza(zzd0, walletFragmentOptions0, savedInstanceState);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onLowMemory() {
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.zzaRZ.onPause();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                this.zzaRZ.onResume();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle outState) {
            try {
                this.zzaRZ.onSaveInstanceState(outState);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onStart() {
            try {
                this.zzaRZ.onStart();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        @Override  // com.google.android.gms.dynamic.LifecycleDelegate
        public void onStop() {
            try {
                this.zzaRZ.onStop();
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        private void setEnabled(boolean enabled) {
            try {
                this.zzaRZ.setEnabled(enabled);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        private void updateMaskedWallet(MaskedWallet maskedWallet) {
            try {
                this.zzaRZ.updateMaskedWallet(maskedWallet);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }

        private void updateMaskedWalletRequest(MaskedWalletRequest request) {
            try {
                this.zzaRZ.updateMaskedWalletRequest(request);
            }
            catch(RemoteException remoteException0) {
                throw new RuntimeException(remoteException0);
            }
        }
    }

    class zzc extends com.google.android.gms.dynamic.zza implements View.OnClickListener {
        final WalletFragment zzaSh;

        private zzc() {
        }

        zzc(com.google.android.gms.wallet.fragment.WalletFragment.1 walletFragment$10) {
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view) {
            Activity activity0 = WalletFragment.this.zzajt.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity0), activity0, -1);
        }

        @Override  // com.google.android.gms.dynamic.zza
        protected void zza(FrameLayout frameLayout0) {
            Button button0 = new Button(WalletFragment.this.zzajt.getActivity());
            button0.setText(string.wallet_buy_button_place_holder);
            int v = -1;
            int v1 = -2;
            if(WalletFragment.this.zzaRS != null) {
                WalletFragmentStyle walletFragmentStyle0 = WalletFragment.this.zzaRS.getFragmentStyle();
                if(walletFragmentStyle0 != null) {
                    DisplayMetrics displayMetrics0 = WalletFragment.this.zzajt.getResources().getDisplayMetrics();
                    v = walletFragmentStyle0.zza("buyButtonWidth", displayMetrics0, -1);
                    v1 = walletFragmentStyle0.zza("buyButtonHeight", displayMetrics0, -2);
                }
            }
            button0.setLayoutParams(new ViewGroup.LayoutParams(v, v1));
            button0.setOnClickListener(this);
            frameLayout0.addView(button0);
        }

        @Override  // com.google.android.gms.dynamic.zza
        protected void zza(zzf zzf0) {
            Activity activity0 = WalletFragment.this.zzajt.getActivity();
            if(WalletFragment.this.zzaSb == null && WalletFragment.this.mCreated && activity0 != null) {
                try {
                    zzb walletFragment$zzb0 = new zzb(zzqy.zza(activity0, WalletFragment.this.zzaSc, WalletFragment.this.zzaRS, WalletFragment.this.zzaSe), null);
                    WalletFragment.this.zzaSb = walletFragment$zzb0;
                    WalletFragment.this.zzaRS = null;
                }
                catch(GooglePlayServicesNotAvailableException unused_ex) {
                    return;
                }
                zzf0.zza(WalletFragment.this.zzaSb);
                if(WalletFragment.this.zzaRT != null) {
                    WalletFragment.this.zzaSb.initialize(WalletFragment.this.zzaRT);
                    WalletFragment.this.zzaRT = null;
                }
                if(WalletFragment.this.zzaRU != null) {
                    WalletFragment.this.zzaSb.updateMaskedWalletRequest(WalletFragment.this.zzaRU);
                    WalletFragment.this.zzaRU = null;
                }
                if(WalletFragment.this.zzaRV != null) {
                    WalletFragment.this.zzaSb.updateMaskedWallet(WalletFragment.this.zzaRV);
                    WalletFragment.this.zzaRV = null;
                }
                if(WalletFragment.this.zzaRW != null) {
                    WalletFragment.this.zzaSb.setEnabled(WalletFragment.this.zzaRW.booleanValue());
                    WalletFragment.this.zzaRW = null;
                }
            }
        }
    }

    private boolean mCreated;
    private WalletFragmentOptions zzaRS;
    private WalletFragmentInitParams zzaRT;
    private MaskedWalletRequest zzaRU;
    private MaskedWallet zzaRV;
    private Boolean zzaRW;
    private zzb zzaSb;
    private final com.google.android.gms.dynamic.zzb zzaSc;
    private final zzc zzaSd;
    private zza zzaSe;
    private final Fragment zzajt;

    public WalletFragment() {
        this.mCreated = false;
        this.zzaSc = com.google.android.gms.dynamic.zzb.zza(this);
        this.zzaSd = new zzc(this, null);
        this.zzaSe = new zza(this);
        this.zzajt = this;
    }

    public int getState() {
        return this.zzaSb == null ? 0 : this.zzaSb.getState();
    }

    public void initialize(WalletFragmentInitParams initParams) {
        if(this.zzaSb != null) {
            this.zzaSb.initialize(initParams);
            this.zzaRT = null;
            return;
        }
        if(this.zzaRT == null) {
            this.zzaRT = initParams;
            if(this.zzaRU != null) {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if(this.zzaRV != null) {
                Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
            return;
        }
        Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
    }

    public static WalletFragment newInstance(WalletFragmentOptions options) {
        WalletFragment walletFragment0 = new WalletFragment();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("extraWalletFragmentOptions", options);
        walletFragment0.zzajt.setArguments(bundle0);
        return walletFragment0;
    }

    @Override  // android.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(this.zzaSb != null) {
            this.zzaSb.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override  // android.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null) {
            savedInstanceState.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams0 = (WalletFragmentInitParams)savedInstanceState.getParcelable("walletFragmentInitParams");
            if(walletFragmentInitParams0 != null) {
                if(this.zzaRT != null) {
                    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.zzaRT = walletFragmentInitParams0;
            }
            if(this.zzaRU == null) {
                this.zzaRU = (MaskedWalletRequest)savedInstanceState.getParcelable("maskedWalletRequest");
            }
            if(this.zzaRV == null) {
                this.zzaRV = (MaskedWallet)savedInstanceState.getParcelable("maskedWallet");
            }
            if(savedInstanceState.containsKey("walletFragmentOptions")) {
                this.zzaRS = (WalletFragmentOptions)savedInstanceState.getParcelable("walletFragmentOptions");
            }
            if(savedInstanceState.containsKey("enabled")) {
                this.zzaRW = Boolean.valueOf(savedInstanceState.getBoolean("enabled"));
            }
        }
        else if(this.zzajt.getArguments() != null) {
            WalletFragmentOptions walletFragmentOptions0 = (WalletFragmentOptions)this.zzajt.getArguments().getParcelable("extraWalletFragmentOptions");
            if(walletFragmentOptions0 != null) {
                walletFragmentOptions0.zzaL(this.zzajt.getActivity());
                this.zzaRS = walletFragmentOptions0;
            }
        }
        this.mCreated = true;
        this.zzaSd.onCreate(savedInstanceState);
    }

    @Override  // android.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return this.zzaSd.onCreateView(inflater, container, savedInstanceState);
    }

    @Override  // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCreated = false;
    }

    @Override  // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        if(this.zzaRS == null) {
            this.zzaRS = WalletFragmentOptions.zza(activity, attrs);
        }
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("attrKeyWalletFragmentOptions", this.zzaRS);
        this.zzaSd.onInflate(activity, bundle1, savedInstanceState);
    }

    @Override  // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.zzaSd.onPause();
    }

    @Override  // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.zzaSd.onResume();
        FragmentManager fragmentManager0 = this.zzajt.getActivity().getFragmentManager();
        Fragment fragment0 = fragmentManager0.findFragmentByTag("GooglePlayServicesErrorDialog");
        if(fragment0 != null) {
            fragmentManager0.beginTransaction().remove(fragment0).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.zzajt.getActivity()), this.zzajt.getActivity(), -1);
        }
    }

    @Override  // android.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.zzaSd.onSaveInstanceState(outState);
        if(this.zzaRT != null) {
            outState.putParcelable("walletFragmentInitParams", this.zzaRT);
            this.zzaRT = null;
        }
        if(this.zzaRU != null) {
            outState.putParcelable("maskedWalletRequest", this.zzaRU);
            this.zzaRU = null;
        }
        if(this.zzaRV != null) {
            outState.putParcelable("maskedWallet", this.zzaRV);
            this.zzaRV = null;
        }
        if(this.zzaRS != null) {
            outState.putParcelable("walletFragmentOptions", this.zzaRS);
            this.zzaRS = null;
        }
        if(this.zzaRW != null) {
            outState.putBoolean("enabled", this.zzaRW.booleanValue());
            this.zzaRW = null;
        }
    }

    @Override  // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.zzaSd.onStart();
    }

    @Override  // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.zzaSd.onStop();
    }

    public void setEnabled(boolean enabled) {
        if(this.zzaSb != null) {
            this.zzaSb.setEnabled(enabled);
            this.zzaRW = null;
            return;
        }
        this.zzaRW = Boolean.valueOf(enabled);
    }

    public void setOnStateChangedListener(OnStateChangedListener listener) {
        this.zzaSe.zza(listener);
    }

    public void updateMaskedWallet(MaskedWallet maskedWallet) {
        if(this.zzaSb != null) {
            this.zzaSb.updateMaskedWallet(maskedWallet);
            this.zzaRV = null;
            return;
        }
        this.zzaRV = maskedWallet;
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest request) {
        if(this.zzaSb != null) {
            this.zzaSb.updateMaskedWalletRequest(request);
            this.zzaRU = null;
            return;
        }
        this.zzaRU = request;
    }

    class com.google.android.gms.wallet.fragment.WalletFragment.1 {
    }

}

