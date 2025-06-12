package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;

public class MessengerCompat implements Parcelable {
    final class zza extends com.google.android.gms.iid.zzb.zza {
        Handler handler;
        final MessengerCompat zzaxc;

        zza(Handler handler0) {
            this.handler = handler0;
        }

        @Override  // com.google.android.gms.iid.zzb
        public void send(Message msg) throws RemoteException {
            msg.arg2 = Binder.getCallingUid();
            this.handler.dispatchMessage(msg);
        }
    }

    public static final Parcelable.Creator CREATOR;
    Messenger zzaxa;
    zzb zzaxb;

    static {
        MessengerCompat.CREATOR = new Parcelable.Creator() {
            public MessengerCompat zzeb(Parcel parcel0) {
                IBinder iBinder0 = parcel0.readStrongBinder();
                return iBinder0 == null ? null : new MessengerCompat(iBinder0);
            }

            public MessengerCompat[] zzgo(int v) {
                return new MessengerCompat[v];
            }
        };
    }

    public MessengerCompat(Handler handler) {
        if(Build.VERSION.SDK_INT >= 21) {
            this.zzaxa = new Messenger(handler);
            return;
        }
        this.zzaxb = new zza(this, handler);
    }

    public MessengerCompat(IBinder target) {
        if(Build.VERSION.SDK_INT >= 21) {
            this.zzaxa = new Messenger(target);
            return;
        }
        this.zzaxb = com.google.android.gms.iid.zzb.zza.zzbR(target);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object otherObj) {
        if(otherObj == null) {
            return false;
        }
        try {
            return this.getBinder().equals(((MessengerCompat)otherObj).getBinder());
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }

    public IBinder getBinder() {
        return this.zzaxa == null ? this.zzaxb.asBinder() : this.zzaxa.getBinder();
    }

    @Override
    public int hashCode() {
        return this.getBinder().hashCode();
    }

    public void send(Message message) throws RemoteException {
        if(this.zzaxa != null) {
            this.zzaxa.send(message);
            return;
        }
        this.zzaxb.send(message);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        if(this.zzaxa != null) {
            out.writeStrongBinder(this.zzaxa.getBinder());
            return;
        }
        out.writeStrongBinder(this.zzaxb.asBinder());
    }

    public static int zzc(Message message0) {
        return Build.VERSION.SDK_INT < 21 ? message0.arg2 : MessengerCompat.zzd(message0);
    }

    private static int zzd(Message message0) {
        return message0.sendingUid;
    }
}

