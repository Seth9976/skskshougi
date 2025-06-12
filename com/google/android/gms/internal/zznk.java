package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.identity.intents.UserAddressRequest;

public class zznk extends zzi {
    public static final class zza extends com.google.android.gms.internal.zznl.zza {
        private Activity mActivity;
        private final int zzZY;

        public zza(int v, Activity activity0) {
            this.zzZY = v;
            this.mActivity = activity0;
        }

        private void setActivity(Activity activity) {
            this.mActivity = activity;
        }

        @Override  // com.google.android.gms.internal.zznl
        public void zzh(int v, Bundle bundle0) {
            PendingIntent pendingIntent0 = null;
            if(v == 1) {
                Intent intent0 = new Intent();
                intent0.putExtras(bundle0);
                PendingIntent pendingIntent1 = this.mActivity.createPendingResult(this.zzZY, intent0, 0x40000000);
                if(pendingIntent1 != null) {
                    try {
                        pendingIntent1.send(1);
                    }
                    catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                        Log.w("AddressClientImpl", "Exception settng pending result", pendingIntent$CanceledException0);
                    }
                }
            }
            else {
                if(bundle0 != null) {
                    pendingIntent0 = (PendingIntent)bundle0.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
                }
                ConnectionResult connectionResult0 = new ConnectionResult(v, pendingIntent0);
                if(connectionResult0.hasResolution()) {
                    try {
                        connectionResult0.startResolutionForResult(this.mActivity, this.zzZY);
                    }
                    catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                        Log.w("AddressClientImpl", "Exception starting pending intent", intentSender$SendIntentException0);
                    }
                    return;
                }
                try {
                    Activity activity0 = this.mActivity;
                    Intent intent1 = new Intent();
                    PendingIntent pendingIntent2 = activity0.createPendingResult(this.zzZY, intent1, 0x40000000);
                    if(pendingIntent2 != null) {
                        pendingIntent2.send(1);
                    }
                }
                catch(PendingIntent.CanceledException pendingIntent$CanceledException1) {
                    Log.w("AddressClientImpl", "Exception setting pending result", pendingIntent$CanceledException1);
                }
            }
        }
    }

    private Activity mActivity;
    private final int mTheme;
    private final String zzOx;
    private zza zzawz;

    public zznk(Activity activity0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s, int v) {
        super(activity0, looper0, 12, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.zzOx = s;
        this.mActivity = activity0;
        this.mTheme = v;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        super.disconnect();
        if(this.zzawz != null) {
            this.zzawz.setActivity(null);
            this.zzawz = null;
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresAccount() {
        return true;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzbO(iBinder0);
    }

    public void zza(UserAddressRequest userAddressRequest0, int v) {
        this.zzuc();
        this.zzawz = new zza(v, this.mActivity);
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", "org.dyndns.vivi.SkskShogi");
            if(!TextUtils.isEmpty(this.zzOx)) {
                bundle0.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.zzOx, "com.google"));
            }
            bundle0.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.mTheme);
            this.zzub().zza(this.zzawz, userAddressRequest0, bundle0);
        }
        catch(RemoteException remoteException0) {
            Log.e("AddressClientImpl", "Exception requesting user address", remoteException0);
            Bundle bundle1 = new Bundle();
            bundle1.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
            this.zzawz.zzh(1, bundle1);
        }
    }

    protected zznm zzbO(IBinder iBinder0) {
        return com.google.android.gms.internal.zznm.zza.zzbQ(iBinder0);
    }

    protected zznm zzub() throws DeadObjectException {
        return (zznm)super.zznM();
    }

    protected void zzuc() {
        super.zznL();
    }
}

