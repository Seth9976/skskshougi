package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgI(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjN(x0);
    }

    static void zza(ConnectionConfiguration connectionConfiguration0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, connectionConfiguration0.zzCY);
        zzb.zza(parcel0, 2, connectionConfiguration0.getName(), false);
        zzb.zza(parcel0, 3, connectionConfiguration0.getAddress(), false);
        zzb.zzc(parcel0, 4, connectionConfiguration0.getType());
        zzb.zzc(parcel0, 5, connectionConfiguration0.getRole());
        zzb.zza(parcel0, 6, connectionConfiguration0.isEnabled());
        zzb.zza(parcel0, 7, connectionConfiguration0.isConnected());
        zzb.zza(parcel0, 8, connectionConfiguration0.zzAP(), false);
        zzb.zza(parcel0, 9, connectionConfiguration0.zzAQ());
        zzb.zza(parcel0, 10, connectionConfiguration0.getNodeId(), false);
        zzb.zzH(parcel0, v1);
    }

    public ConnectionConfiguration zzgI(Parcel parcel0) {
        String s = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        String s1 = null;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        int v2 = 0;
        String s2 = null;
        String s3 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 5: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 6: {
                    z2 = zza.zzc(parcel0, v4);
                    break;
                }
                case 7: {
                    z1 = zza.zzc(parcel0, v4);
                    break;
                }
                case 8: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 9: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 10: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ConnectionConfiguration(v3, s3, s2, v2, v1, z2, z1, s1, z, s);
    }

    public ConnectionConfiguration[] zzjN(int v) {
        return new ConnectionConfiguration[v];
    }
}

