package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbZ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdP(x0);
    }

    static void zza(ParcelableEvent parcelableEvent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, parcelableEvent0.zzCY);
        zzb.zza(parcel0, 2, parcelableEvent0.zzFE, false);
        zzb.zza(parcel0, 3, parcelableEvent0.zzEO, false);
        zzb.zzb(parcel0, 4, parcelableEvent0.zzaiC, false);
        zzb.zza(parcel0, 5, parcelableEvent0.zzaiD);
        zzb.zza(parcel0, 6, parcelableEvent0.zzaiw, false);
        zzb.zza(parcel0, 7, parcelableEvent0.zzaiG, false);
        zzb.zza(parcel0, 8, parcelableEvent0.zzaiH, v, false);
        zzb.zza(parcel0, 9, parcelableEvent0.zzaiI, v, false);
        zzb.zza(parcel0, 10, parcelableEvent0.zzaiJ, v, false);
        zzb.zza(parcel0, 11, parcelableEvent0.zzaiK, v, false);
        zzb.zza(parcel0, 12, parcelableEvent0.zzaiL, v, false);
        zzb.zza(parcel0, 13, parcelableEvent0.zzaiM, v, false);
        zzb.zza(parcel0, 14, parcelableEvent0.zzaiN, v, false);
        zzb.zza(parcel0, 15, parcelableEvent0.zzaiO, v, false);
        zzb.zza(parcel0, 17, parcelableEvent0.zzaiF);
        zzb.zza(parcel0, 16, parcelableEvent0.zzaiE);
        zzb.zza(parcel0, 18, parcelableEvent0.zzaiP, v, false);
        zzb.zzH(parcel0, v1);
    }

    public ParcelableEvent zzbZ(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        ArrayList arrayList0 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        String s2 = null;
        String s3 = null;
        TextInsertedDetails textInsertedDetails0 = null;
        TextDeletedDetails textDeletedDetails0 = null;
        ValuesAddedDetails valuesAddedDetails0 = null;
        ValuesRemovedDetails valuesRemovedDetails0 = null;
        ValuesSetDetails valuesSetDetails0 = null;
        ValueChangedDetails valueChangedDetails0 = null;
        ReferenceShiftedDetails referenceShiftedDetails0 = null;
        ObjectChangedDetails objectChangedDetails0 = null;
        FieldChangedDetails fieldChangedDetails0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzC(parcel0, v2);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 8: {
                    textInsertedDetails0 = (TextInsertedDetails)zza.zza(parcel0, v2, TextInsertedDetails.CREATOR);
                    break;
                }
                case 9: {
                    textDeletedDetails0 = (TextDeletedDetails)zza.zza(parcel0, v2, TextDeletedDetails.CREATOR);
                    break;
                }
                case 10: {
                    valuesAddedDetails0 = (ValuesAddedDetails)zza.zza(parcel0, v2, ValuesAddedDetails.CREATOR);
                    break;
                }
                case 11: {
                    valuesRemovedDetails0 = (ValuesRemovedDetails)zza.zza(parcel0, v2, ValuesRemovedDetails.CREATOR);
                    break;
                }
                case 12: {
                    valuesSetDetails0 = (ValuesSetDetails)zza.zza(parcel0, v2, ValuesSetDetails.CREATOR);
                    break;
                }
                case 13: {
                    valueChangedDetails0 = (ValueChangedDetails)zza.zza(parcel0, v2, ValueChangedDetails.CREATOR);
                    break;
                }
                case 14: {
                    referenceShiftedDetails0 = (ReferenceShiftedDetails)zza.zza(parcel0, v2, ReferenceShiftedDetails.CREATOR);
                    break;
                }
                case 15: {
                    objectChangedDetails0 = (ObjectChangedDetails)zza.zza(parcel0, v2, ObjectChangedDetails.CREATOR);
                    break;
                }
                case 16: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 17: {
                    z2 = zza.zzc(parcel0, v2);
                    break;
                }
                case 18: {
                    fieldChangedDetails0 = (FieldChangedDetails)zza.zza(parcel0, v2, FieldChangedDetails.CREATOR);
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
        return new ParcelableEvent(v1, s, s1, arrayList0, z, z1, z2, s2, s3, textInsertedDetails0, textDeletedDetails0, valuesAddedDetails0, valuesRemovedDetails0, valuesSetDetails0, valueChangedDetails0, referenceShiftedDetails0, objectChangedDetails0, fieldChangedDetails0);
    }

    public ParcelableEvent[] zzdP(int v) {
        return new ParcelableEvent[v];
    }
}

