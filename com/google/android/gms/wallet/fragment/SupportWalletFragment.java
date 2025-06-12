package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
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
import com.google.android.gms.dynamic.zzh;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqy;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class SupportWalletFragment extends Fragment {
    public interface OnStateChangedListener {
        void onStateChanged(SupportWalletFragment arg1, int arg2, int arg3, Bundle arg4);
    }

    static class zza extends com.google.android.gms.internal.zzqr.zza {
        private OnStateChangedListener zzaRX;
        private final SupportWalletFragment zzaRY;

        zza(SupportWalletFragment supportWalletFragment0) {
            this.zzaRY = supportWalletFragment0;
        }

        @Override  // com.google.android.gms.internal.zzqr
        public void zza(int v, int v1, Bundle bundle0) {
            if(this.zzaRX != null) {
                this.zzaRX.onStateChanged(this.zzaRY, v, v1, bundle0);
            }
        }

        public void zza(OnStateChangedListener supportWalletFragment$OnStateChangedListener0) {
            this.zzaRX = supportWalletFragment$OnStateChangedListener0;
        }
    }

    static class zzb implements LifecycleDelegate {
        private final zzqq zzaRZ;

        private zzb(zzqq zzqq0) {
            this.zzaRZ = zzqq0;
        }

        zzb(zzqq zzqq0, com.google.android.gms.wallet.fragment.SupportWalletFragment.1 supportWalletFragment$10) {
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
        final SupportWalletFragment zzaSa;

        private zzc() {
        }

        zzc(com.google.android.gms.wallet.fragment.SupportWalletFragment.1 supportWalletFragment$10) {
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view) {
            FragmentActivity fragmentActivity0 = SupportWalletFragment.this.zzZX.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(((Context)fragmentActivity0)), ((Activity)fragmentActivity0), -1);
        }

        @Override  // com.google.android.gms.dynamic.zza
        protected void zza(FrameLayout frameLayout0) {
            Button button0 = new Button(((Context)SupportWalletFragment.this.zzZX.getActivity()));
            button0.setText(string.wallet_buy_button_place_holder);
            int v = -1;
            int v1 = -2;
            if(SupportWalletFragment.this.zzaRS != null) {
                WalletFragmentStyle walletFragmentStyle0 = SupportWalletFragment.this.zzaRS.getFragmentStyle();
                if(walletFragmentStyle0 != null) {
                    DisplayMetrics displayMetrics0 = SupportWalletFragment.this.zzZX.getResources().getDisplayMetrics();
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
            FragmentActivity fragmentActivity0 = SupportWalletFragment.this.zzZX.getActivity();
            if(SupportWalletFragment.this.zzaRO == null && SupportWalletFragment.this.mCreated && fragmentActivity0 != null) {
                try {
                    zzb supportWalletFragment$zzb0 = new zzb(zzqy.zza(((Activity)fragmentActivity0), SupportWalletFragment.this.zzaRP, SupportWalletFragment.this.zzaRS, SupportWalletFragment.this.zzaRR), null);
                    SupportWalletFragment.this.zzaRO = supportWalletFragment$zzb0;
                    SupportWalletFragment.this.zzaRS = null;
                }
                catch(GooglePlayServicesNotAvailableException unused_ex) {
                    return;
                }
                zzf0.zza(SupportWalletFragment.this.zzaRO);
                if(SupportWalletFragment.this.zzaRT != null) {
                    SupportWalletFragment.this.zzaRO.initialize(SupportWalletFragment.this.zzaRT);
                    SupportWalletFragment.this.zzaRT = null;
                }
                if(SupportWalletFragment.this.zzaRU != null) {
                    SupportWalletFragment.this.zzaRO.updateMaskedWalletRequest(SupportWalletFragment.this.zzaRU);
                    SupportWalletFragment.this.zzaRU = null;
                }
                if(SupportWalletFragment.this.zzaRV != null) {
                    SupportWalletFragment.this.zzaRO.updateMaskedWallet(SupportWalletFragment.this.zzaRV);
                    SupportWalletFragment.this.zzaRV = null;
                }
                if(SupportWalletFragment.this.zzaRW != null) {
                    SupportWalletFragment.this.zzaRO.setEnabled(SupportWalletFragment.this.zzaRW.booleanValue());
                    SupportWalletFragment.this.zzaRW = null;
                }
            }
        }
    }

    private boolean mCreated;
    private final Fragment zzZX;
    private zzb zzaRO;
    private final zzh zzaRP;
    private final zzc zzaRQ;
    private zza zzaRR;
    private WalletFragmentOptions zzaRS;
    private WalletFragmentInitParams zzaRT;
    private MaskedWalletRequest zzaRU;
    private MaskedWallet zzaRV;
    private Boolean zzaRW;

    public SupportWalletFragment() {
        this.mCreated = false;
        this.zzaRP = zzh.zza(this);
        this.zzaRQ = new zzc(this, null);
        this.zzaRR = new zza(this);
        this.zzZX = this;
    }

    public int getState() {
        return this.zzaRO == null ? 0 : this.zzaRO.getState();
    }

    public void initialize(WalletFragmentInitParams initParams) {
        if(this.zzaRO != null) {
            this.zzaRO.initialize(initParams);
            this.zzaRT = null;
            return;
        }
        if(this.zzaRT == null) {
            this.zzaRT = initParams;
            if(this.zzaRU != null) {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if(this.zzaRV != null) {
                Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
            return;
        }
        Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions options) {
        SupportWalletFragment supportWalletFragment0 = new SupportWalletFragment();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("extraWalletFragmentOptions", options);
        supportWalletFragment0.zzZX.setArguments(bundle0);
        return supportWalletFragment0;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(this.zzaRO != null) {
            this.zzaRO.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null) {
            savedInstanceState.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams0 = (WalletFragmentInitParams)savedInstanceState.getParcelable("walletFragmentInitParams");
            if(walletFragmentInitParams0 != null) {
                if(this.zzaRT != null) {
                    Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        else if(this.zzZX.getArguments() != null) {
            WalletFragmentOptions walletFragmentOptions0 = (WalletFragmentOptions)this.zzZX.getArguments().getParcelable("extraWalletFragmentOptions");
            if(walletFragmentOptions0 != null) {
                walletFragmentOptions0.zzaL(((Context)this.zzZX.getActivity()));
                this.zzaRS = walletFragmentOptions0;
            }
        }
        this.mCreated = true;
        this.zzaRQ.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return this.zzaRQ.onCreateView(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        if(this.zzaRS == null) {
            this.zzaRS = WalletFragmentOptions.zza(activity, attrs);
        }
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("attrKeyWalletFragmentOptions", this.zzaRS);
        this.zzaRQ.onInflate(activity, bundle1, savedInstanceState);
    }

    public void onPause() {
        super.onPause();
        this.zzaRQ.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzaRQ.onResume();
        FragmentManager fragmentManager0 = this.zzZX.getActivity().getSupportFragmentManager();
        Fragment fragment0 = fragmentManager0.findFragmentByTag("GooglePlayServicesErrorDialog");
        if(fragment0 != null) {
            fragmentManager0.beginTransaction().remove(fragment0).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(((Context)this.zzZX.getActivity())), ((Activity)this.zzZX.getActivity()), -1);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.zzaRQ.onSaveInstanceState(outState);
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

    public void onStart() {
        super.onStart();
        this.zzaRQ.onStart();
    }

    public void onStop() {
        super.onStop();
        this.zzaRQ.onStop();
    }

    public void setEnabled(boolean enabled) {
        if(this.zzaRO != null) {
            this.zzaRO.setEnabled(enabled);
            this.zzaRW = null;
            return;
        }
        this.zzaRW = Boolean.valueOf(enabled);
    }

    public void setOnStateChangedListener(OnStateChangedListener listener) {
        this.zzaRR.zza(listener);
    }

    public void updateMaskedWallet(MaskedWallet maskedWallet) {
        if(this.zzaRO != null) {
            this.zzaRO.updateMaskedWallet(maskedWallet);
            this.zzaRV = null;
            return;
        }
        this.zzaRV = maskedWallet;
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest request) {
        if(this.zzaRO != null) {
            this.zzaRO.updateMaskedWalletRequest(request);
            this.zzaRU = null;
            return;
        }
        this.zzaRU = request;
    }

    class com.google.android.gms.wallet.fragment.SupportWalletFragment.1 {
    }

}

