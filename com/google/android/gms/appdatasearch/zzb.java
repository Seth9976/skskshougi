package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzr(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzac(x0);
    }

    static void zza(DocumentContents documentContents0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, documentContents0.zzMS, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, documentContents0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, documentContents0.zzMT, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, documentContents0.zzMU);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, documentContents0.account, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public DocumentContents[] zzac(int v) {
        return new DocumentContents[v];
    }

    public DocumentContents zzr(Parcel parcel0) {
        boolean z = false;
        Account account0 = null;
        int v = zza.zzab(parcel0);
        String s = null;
        DocumentSection[] arr_documentSection = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arr_documentSection = (DocumentSection[])zza.zzb(parcel0, v2, DocumentSection.CREATOR);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 4: {
                    account0 = (Account)zza.zza(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new DocumentContents(v1, arr_documentSection, s, z, account0);
    }
}

