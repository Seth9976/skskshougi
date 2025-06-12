package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbV(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdL(x0);
    }

    static void zza(ParcelableCollaborator parcelableCollaborator0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, parcelableCollaborator0.zzCY);
        zzb.zza(parcel0, 2, parcelableCollaborator0.zzais);
        zzb.zza(parcel0, 3, parcelableCollaborator0.zzait);
        zzb.zza(parcel0, 4, parcelableCollaborator0.zzFE, false);
        zzb.zza(parcel0, 5, parcelableCollaborator0.zzEO, false);
        zzb.zza(parcel0, 6, parcelableCollaborator0.zzadI, false);
        zzb.zza(parcel0, 7, parcelableCollaborator0.zzaiu, false);
        zzb.zza(parcel0, 8, parcelableCollaborator0.zzaiv, false);
        zzb.zzH(parcel0, v1);
    }

    public ParcelableCollaborator zzbV(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        boolean z1 = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    s4 = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ParcelableCollaborator(v1, z1, z, s4, s3, s2, s1, s);
    }

    public ParcelableCollaborator[] zzdL(int v) {
        return new ParcelableCollaborator[v];
    }
}

