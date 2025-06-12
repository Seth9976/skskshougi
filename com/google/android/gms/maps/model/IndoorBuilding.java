package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzh.zza;
import java.util.ArrayList;
import java.util.List;

public final class IndoorBuilding {
    private final zzg zzaDl;

    public IndoorBuilding(zzg delegate) {
        this.zzaDl = (zzg)zzu.zzu(delegate);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.zzaDl.zzb(((IndoorBuilding)other).zzaDl);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public int getActiveLevelIndex() {
        try {
            return this.zzaDl.getActiveLevelIndex();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public int getDefaultLevelIndex() {
        try {
            return this.zzaDl.getActiveLevelIndex();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public List getLevels() {
        try {
            List list0 = this.zzaDl.getLevels();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                list1.add(new IndoorLevel(zza.zzcO(((IBinder)object0))));
            }
            return list1;
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public int hashCode() {
        try {
            return this.zzaDl.hashCodeRemote();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isUnderground() {
        try {
            return this.zzaDl.isUnderground();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

