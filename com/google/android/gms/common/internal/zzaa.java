package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzZ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbz(x0);
    }

    public ValidateAccountRequest zzZ(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        Bundle bundle0 = null;
        Scope[] arr_scope = null;
        IBinder iBinder0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_scope = (Scope[])zza.zzb(parcel0, v3, Scope.CREATOR);
                    break;
                }
                case 5: {
                    bundle0 = zza.zzq(parcel0, v3);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ValidateAccountRequest(v2, v, iBinder0, arr_scope, bundle0, s);
    }

    static void zza(ValidateAccountRequest validateAccountRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, validateAccountRequest0.zzCY);
        zzb.zzc(parcel0, 2, validateAccountRequest0.zzod());
        zzb.zza(parcel0, 3, validateAccountRequest0.zzZO, false);
        zzb.zza(parcel0, 4, validateAccountRequest0.zzoe(), v, false);
        zzb.zza(parcel0, 5, validateAccountRequest0.zzof(), false);
        zzb.zza(parcel0, 6, validateAccountRequest0.getCallingPackage(), false);
        zzb.zzH(parcel0, v1);
    }

    public ValidateAccountRequest[] zzbz(int v) {
        return new ValidateAccountRequest[v];
    }
}

