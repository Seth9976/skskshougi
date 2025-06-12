package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult;
import com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzps;
import com.google.android.gms.internal.zzpt;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class zzh extends zzi implements zzps {
    static class zza extends com.google.android.gms.signin.internal.zzd.zza {
        private final zzpt zzZU;
        private final ExecutorService zzaKb;

        public zza(zzpt zzpt0, ExecutorService executorService0) {
            this.zzZU = zzpt0;
            this.zzaKb = executorService0;
        }

        @Override  // com.google.android.gms.signin.internal.zzd
        public void zza(String s, String s1, zzf zzf0) throws RemoteException {
            com.google.android.gms.signin.internal.zzh.zza.2 zzh$zza$20 = new Runnable() {
                @Override
                public void run() {
                    try {
                        boolean z = zza.this.zzyb().onUploadServerAuthCode(s, s1);
                        zzf0.zzal(z);
                    }
                    catch(RemoteException remoteException0) {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteException0);
                    }
                }
            };
            this.zzaKb.submit(zzh$zza$20);
        }

        @Override  // com.google.android.gms.signin.internal.zzd
        public void zza(String s, List list0, zzf zzf0) throws RemoteException {
            com.google.android.gms.signin.internal.zzh.zza.1 zzh$zza$10 = new Runnable() {
                @Override
                public void run() {
                    try {
                        ServerAuthCodeCallbacks googleApiClient$ServerAuthCodeCallbacks0 = zza.this.zzyb();
                        Set set0 = Collections.unmodifiableSet(new HashSet(list0));
                        CheckResult googleApiClient$ServerAuthCodeCallbacks$CheckResult0 = googleApiClient$ServerAuthCodeCallbacks0.onCheckServerAuthorization(s, set0);
                        CheckServerAuthResult checkServerAuthResult0 = new CheckServerAuthResult(googleApiClient$ServerAuthCodeCallbacks$CheckResult0.zzmA(), googleApiClient$ServerAuthCodeCallbacks$CheckResult0.zzmB());
                        zzf0.zza(checkServerAuthResult0);
                    }
                    catch(RemoteException remoteException0) {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteException0);
                    }
                }
            };
            this.zzaKb.submit(zzh$zza$10);
        }

        private ServerAuthCodeCallbacks zzyb() throws RemoteException {
            return this.zzZU.zzyb();
        }
    }

    private final zze zzXa;
    private final zzpt zzZU;
    private Integer zzZV;
    private final boolean zzaKa;
    private final ExecutorService zzaKb;

    public zzh(Context context0, Looper looper0, boolean z, zze zze0, zzpt zzpt0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, ExecutorService executorService0) {
        super(context0, looper0, 44, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzaKa = z;
        this.zzXa = zze0;
        this.zzZU = zzpt0;
        this.zzZV = zze0.zznC();
        this.zzaKb = executorService0;
    }

    @Override  // com.google.android.gms.internal.zzps
    public void connect() {
        this.connect(new com.google.android.gms.common.internal.zzi.zzf(this));
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi, com.google.android.gms.common.api.Api$Client
    public boolean requiresSignIn() {
        return this.zzaKa;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdE(iBinder0);
    }

    public static Bundle zza(zzpt zzpt0, Integer integer0, ExecutorService executorService0) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zzpt0.zzxZ());
        bundle0.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zzpt0.zzya());
        bundle0.putString("com.google.android.gms.signin.internal.serverClientId", zzpt0.zzxt());
        if(zzpt0.zzyb() != null) {
            bundle0.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper(new zza(zzpt0, executorService0).asBinder()));
        }
        if(integer0 != null) {
            bundle0.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", ((int)integer0));
        }
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.zzps
    public void zza(IAccountAccessor iAccountAccessor0, Set set0, com.google.android.gms.signin.internal.zze zze0) {
        zzu.zzb(zze0, "Expecting a valid ISignInCallbacks");
        try {
            ((zzf)this.zznM()).zza(new AuthAccountRequest(iAccountAccessor0, set0), zze0);
        }
        catch(RemoteException unused_ex) {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
            try {
                zze0.zza(new ConnectionResult(8, null), new AuthAccountResult());
            }
            catch(RemoteException unused_ex) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzps
    public void zza(IAccountAccessor iAccountAccessor0, boolean z) {
        try {
            ((zzf)this.zznM()).zza(iAccountAccessor0, ((int)this.zzZV), z);
        }
        catch(RemoteException unused_ex) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override  // com.google.android.gms.internal.zzps
    public void zza(zzq zzq0) {
        zzu.zzb(zzq0, "Expecting a valid IResolveAccountCallbacks");
        try {
            Account account0 = this.zzXa.zznt();
            ((zzf)this.zznM()).zza(new ResolveAccountRequest(account0, ((int)this.zzZV)), zzq0);
        }
        catch(RemoteException unused_ex) {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try {
                zzq0.zzb(new ResolveAccountResponse(8));
            }
            catch(RemoteException unused_ex) {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
            }
        }
    }

    protected zzf zzdE(IBinder iBinder0) {
        return com.google.android.gms.signin.internal.zzf.zza.zzdD(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        Bundle bundle0 = zzh.zza(this.zzZU, this.zzXa.zznC(), this.zzaKb);
        if(!"org.dyndns.vivi.SkskShogi".equals(this.zzXa.zzny())) {
            bundle0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zzXa.zzny());
        }
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.zzps
    public void zzxY() {
        try {
            ((zzf)this.zznM()).zziQ(((int)this.zzZV));
        }
        catch(RemoteException unused_ex) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
}

