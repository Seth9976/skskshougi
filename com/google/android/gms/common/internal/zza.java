package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class zza extends com.google.android.gms.common.internal.IAccountAccessor.zza {
    private Context mContext;
    private Account zzMY;
    int zzZN;

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof zza ? this.zzMY.equals(((zza)o).zzMY) : false;
    }

    @Override  // com.google.android.gms.common.internal.IAccountAccessor
    public Account getAccount() {
        int v = Binder.getCallingUid();
        if(v == this.zzZN) {
            return this.zzMY;
        }
        if(!GooglePlayServicesUtil.zzd(this.mContext, v)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.zzZN = v;
        return this.zzMY;
    }

    public static Account zza(IAccountAccessor iAccountAccessor0) {
        Account account0 = null;
        if(iAccountAccessor0 != null) {
            long v = Binder.clearCallingIdentity();
            try {
                account0 = iAccountAccessor0.getAccount();
            }
            catch(RemoteException unused_ex) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
                return null;
            }
            finally {
                Binder.restoreCallingIdentity(v);
            }
        }
        return account0;
    }
}

