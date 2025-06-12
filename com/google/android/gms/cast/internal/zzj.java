package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

public interface zzj extends IInterface {
    public static abstract class zza extends Binder implements zzj {
        public zza() {
            this.attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            ApplicationMetadata applicationMetadata0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zzaM(data.readInt());
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if(data.readInt() != 0) {
                        applicationMetadata0 = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(data);
                    }
                    String s = data.readString();
                    String s1 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(applicationMetadata0, s, s1, z);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zzaN(data.readInt());
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    String s2 = data.readString();
                    double f = data.readDouble();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(s2, f, z);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zzq(data.readString(), data.readString());
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zzb(data.readString(), data.createByteArray());
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zzaP(data.readInt());
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zzaO(data.readInt());
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.onApplicationDisconnected(data.readInt());
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zza(data.readString(), data.readLong(), data.readInt());
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    this.zzd(data.readString(), data.readLong());
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if(data.readInt() != 0) {
                        applicationMetadata0 = (ApplicationStatus)ApplicationStatus.CREATOR.createFromParcel(data);
                    }
                    this.zzb(((ApplicationStatus)applicationMetadata0));
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    if(data.readInt() != 0) {
                        applicationMetadata0 = (DeviceStatus)DeviceStatus.CREATOR.createFromParcel(data);
                    }
                    this.zzb(((DeviceStatus)applicationMetadata0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }
    }

    void onApplicationDisconnected(int arg1) throws RemoteException;

    void zza(ApplicationMetadata arg1, String arg2, String arg3, boolean arg4) throws RemoteException;

    void zza(String arg1, double arg2, boolean arg3) throws RemoteException;

    void zza(String arg1, long arg2, int arg3) throws RemoteException;

    void zzaM(int arg1) throws RemoteException;

    void zzaN(int arg1) throws RemoteException;

    void zzaO(int arg1) throws RemoteException;

    void zzaP(int arg1) throws RemoteException;

    void zzb(ApplicationStatus arg1) throws RemoteException;

    void zzb(DeviceStatus arg1) throws RemoteException;

    void zzb(String arg1, byte[] arg2) throws RemoteException;

    void zzd(String arg1, long arg2) throws RemoteException;

    void zzq(String arg1, String arg2) throws RemoteException;
}

