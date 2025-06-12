package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzh;

public final class IndoorLevel {
    private final zzh zzaDm;

    public IndoorLevel(zzh delegate) {
        this.zzaDm = (zzh)zzu.zzu(delegate);
    }

    public void activate() {
        try {
            this.zzaDm.activate();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.zzaDm.zza(((IndoorLevel)other).zzaDm);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getName() {
        try {
            return this.zzaDm.getName();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getShortName() {
        try {
            return this.zzaDm.getShortName();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public int hashCode() {
        try {
            return this.zzaDm.hashCodeRemote();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

