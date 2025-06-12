package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;
import java.lang.ref.WeakReference;

public class zzqx extends zzi {
    static class zza extends com.google.android.gms.internal.zzqv.zza {
        private zza() {
        }

        zza(com.google.android.gms.internal.zzqx.1 zzqx$10) {
        }

        @Override  // com.google.android.gms.internal.zzqv
        public void zza(int v, FullWallet fullWallet0, Bundle bundle0) {
        }

        @Override  // com.google.android.gms.internal.zzqv
        public void zza(int v, MaskedWallet maskedWallet0, Bundle bundle0) {
        }

        @Override  // com.google.android.gms.internal.zzqv
        public void zza(int v, boolean z, Bundle bundle0) {
        }

        @Override  // com.google.android.gms.internal.zzqv
        public void zza(Status status0, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse0, Bundle bundle0) {
        }

        @Override  // com.google.android.gms.internal.zzqv
        public void zza(Status status0, GetInstrumentsResponse getInstrumentsResponse0, Bundle bundle0) {
        }

        @Override  // com.google.android.gms.internal.zzqv
        public void zzb(int v, boolean z, Bundle bundle0) {
        }

        @Override  // com.google.android.gms.internal.zzqv
        public void zzj(int v, Bundle bundle0) {
        }
    }

    static final class zzb extends zza {
        private final int zzZY;
        private final WeakReference zzaSu;

        public zzb(Activity activity0, int v) {
            super(null);
            this.zzaSu = new WeakReference(activity0);
            this.zzZY = v;
        }

        @Override  // com.google.android.gms.internal.zzqx$zza
        public void zza(int v, FullWallet fullWallet0, Bundle bundle0) {
            int v1;
            PendingIntent pendingIntent0 = null;
            Activity activity0 = (Activity)this.zzaSu.get();
            if(activity0 == null) {
                Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
                return;
            }
            if(bundle0 != null) {
                pendingIntent0 = (PendingIntent)bundle0.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult0 = new ConnectionResult(v, pendingIntent0);
            if(connectionResult0.hasResolution()) {
                try {
                    connectionResult0.startResolutionForResult(activity0, this.zzZY);
                }
                catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", intentSender$SendIntentException0);
                }
                return;
            }
            Intent intent0 = new Intent();
            if(connectionResult0.isSuccess()) {
                v1 = -1;
                intent0.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet0);
            }
            else {
                v1 = v == 408 ? 0 : 1;
                intent0.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", v);
            }
            PendingIntent pendingIntent1 = activity0.createPendingResult(this.zzZY, intent0, 0x40000000);
            if(pendingIntent1 == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                return;
            }
            try {
                pendingIntent1.send(v1);
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                Log.w("WalletClientImpl", "Exception setting pending result", pendingIntent$CanceledException0);
            }
        }

        @Override  // com.google.android.gms.internal.zzqx$zza
        public void zza(int v, MaskedWallet maskedWallet0, Bundle bundle0) {
            int v1;
            PendingIntent pendingIntent0 = null;
            Activity activity0 = (Activity)this.zzaSu.get();
            if(activity0 == null) {
                Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
                return;
            }
            if(bundle0 != null) {
                pendingIntent0 = (PendingIntent)bundle0.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult0 = new ConnectionResult(v, pendingIntent0);
            if(connectionResult0.hasResolution()) {
                try {
                    connectionResult0.startResolutionForResult(activity0, this.zzZY);
                }
                catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", intentSender$SendIntentException0);
                }
                return;
            }
            Intent intent0 = new Intent();
            if(connectionResult0.isSuccess()) {
                v1 = -1;
                intent0.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet0);
            }
            else {
                v1 = v == 408 ? 0 : 1;
                intent0.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", v);
            }
            PendingIntent pendingIntent1 = activity0.createPendingResult(this.zzZY, intent0, 0x40000000);
            if(pendingIntent1 == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                return;
            }
            try {
                pendingIntent1.send(v1);
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                Log.w("WalletClientImpl", "Exception setting pending result", pendingIntent$CanceledException0);
            }
        }

        @Override  // com.google.android.gms.internal.zzqx$zza
        public void zza(int v, boolean z, Bundle bundle0) {
            Activity activity0 = (Activity)this.zzaSu.get();
            if(activity0 == null) {
                Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
                return;
            }
            Intent intent0 = new Intent();
            intent0.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", z);
            PendingIntent pendingIntent0 = activity0.createPendingResult(this.zzZY, intent0, 0x40000000);
            if(pendingIntent0 == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
                return;
            }
            try {
                pendingIntent0.send(-1);
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                Log.w("WalletClientImpl", "Exception setting pending result", pendingIntent$CanceledException0);
            }
        }

        @Override  // com.google.android.gms.internal.zzqx$zza
        public void zzb(int v, boolean z, Bundle bundle0) {
            Activity activity0 = (Activity)this.zzaSu.get();
            if(activity0 == null) {
                Log.d("WalletClientImpl", "Ignoring onIsNewUserDetermined, Activity has gone");
                return;
            }
            Intent intent0 = new Intent();
            intent0.putExtra("com.google.android.gms.wallet.EXTRA_IS_NEW_USER", z);
            PendingIntent pendingIntent0 = activity0.createPendingResult(this.zzZY, intent0, 0x40000000);
            if(pendingIntent0 == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onIsNewUserDetermined");
                return;
            }
            try {
                pendingIntent0.send(-1);
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                Log.w("WalletClientImpl", "Exception setting pending result", pendingIntent$CanceledException0);
            }
        }

        @Override  // com.google.android.gms.internal.zzqx$zza
        public void zzj(int v, Bundle bundle0) {
            zzu.zzb(bundle0, "Bundle should not be null");
            Activity activity0 = (Activity)this.zzaSu.get();
            if(activity0 == null) {
                Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
                return;
            }
            ConnectionResult connectionResult0 = new ConnectionResult(v, ((PendingIntent)bundle0.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT")));
            if(connectionResult0.hasResolution()) {
                try {
                    connectionResult0.startResolutionForResult(activity0, this.zzZY);
                }
                catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", intentSender$SendIntentException0);
                }
                return;
            }
            Log.e("WalletClientImpl", "Create Wallet Objects confirmation UI will not be shown connection result: " + connectionResult0);
            Intent intent0 = new Intent();
            intent0.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
            PendingIntent pendingIntent0 = activity0.createPendingResult(this.zzZY, intent0, 0x40000000);
            if(pendingIntent0 == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
                return;
            }
            try {
                pendingIntent0.send(1);
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                Log.w("WalletClientImpl", "Exception setting pending result", pendingIntent$CanceledException0);
            }
        }
    }

    private final Activity mActivity;
    private final int mTheme;
    private final String zzOx;
    private final int zzaRH;

    public zzqx(Activity activity0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, int v, String s, int v1) {
        super(activity0, looper0, 4, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.mActivity = activity0;
        this.zzaRH = v;
        this.zzOx = s;
        this.mTheme = v1;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresAccount() {
        return true;
    }

    private Bundle zzAL() {
        return zzqx.zza(this.zzaRH, "org.dyndns.vivi.SkskShogi", this.zzOx, this.mTheme);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdL(iBinder0);
    }

    public static Bundle zza(int v, String s, String s1, int v1) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", v);
        bundle0.putString("androidPackageName", s);
        if(!TextUtils.isEmpty(s1)) {
            bundle0.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(s1, "com.google"));
        }
        bundle0.putInt("com.google.android.gms.wallet.EXTRA_THEME", v1);
        return bundle0;
    }

    public void zza(FullWalletRequest fullWalletRequest0, int v) {
        zzb zzqx$zzb0 = new zzb(this.mActivity, v);
        Bundle bundle0 = this.zzAL();
        try {
            ((zzqs)this.zznM()).zza(fullWalletRequest0, bundle0, zzqx$zzb0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", remoteException0);
            zzqx$zzb0.zza(8, null, Bundle.EMPTY);
        }
    }

    public void zza(MaskedWalletRequest maskedWalletRequest0, int v) {
        Bundle bundle0 = this.zzAL();
        zzb zzqx$zzb0 = new zzb(this.mActivity, v);
        try {
            ((zzqs)this.zznM()).zza(maskedWalletRequest0, bundle0, zzqx$zzb0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", remoteException0);
            zzqx$zzb0.zza(8, null, Bundle.EMPTY);
        }
    }

    public void zza(NotifyTransactionStatusRequest notifyTransactionStatusRequest0) {
        Bundle bundle0 = this.zzAL();
        try {
            ((zzqs)this.zznM()).zza(notifyTransactionStatusRequest0, bundle0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    protected zzqs zzdL(IBinder iBinder0) {
        return com.google.android.gms.internal.zzqs.zza.zzdH(iBinder0);
    }

    public void zze(String s, String s1, int v) {
        Bundle bundle0 = this.zzAL();
        zzb zzqx$zzb0 = new zzb(this.mActivity, v);
        try {
            ((zzqs)this.zznM()).zza(s, s1, bundle0, zzqx$zzb0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", remoteException0);
            zzqx$zzb0.zza(8, null, Bundle.EMPTY);
        }
    }

    public void zzjB(int v) {
        Bundle bundle0 = this.zzAL();
        zzb zzqx$zzb0 = new zzb(this.mActivity, v);
        try {
            ((zzqs)this.zznM()).zza(bundle0, zzqx$zzb0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", remoteException0);
            zzqx$zzb0.zza(8, false, Bundle.EMPTY);
        }
    }

    public void zzjC(int v) {
        Bundle bundle0 = this.zzAL();
        zzb zzqx$zzb0 = new zzb(this.mActivity, v);
        try {
            ((zzqs)this.zznM()).zzb(bundle0, zzqx$zzb0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WalletClientImpl", "RemoteException during isNewUser", remoteException0);
            zzqx$zzb0.zzb(8, false, Bundle.EMPTY);
        }
    }

    class com.google.android.gms.internal.zzqx.1 {
    }

}

