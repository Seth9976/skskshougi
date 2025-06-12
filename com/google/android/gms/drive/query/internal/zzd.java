package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbK(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdz(x0);
    }

    static void zza(FilterHolder filterHolder0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, filterHolder0.zzahU, v, false);
        zzb.zzc(parcel0, 1000, filterHolder0.zzCY);
        zzb.zza(parcel0, 2, filterHolder0.zzahV, v, false);
        zzb.zza(parcel0, 3, filterHolder0.zzahW, v, false);
        zzb.zza(parcel0, 4, filterHolder0.zzahX, v, false);
        zzb.zza(parcel0, 5, filterHolder0.zzahY, v, false);
        zzb.zza(parcel0, 6, filterHolder0.zzahZ, v, false);
        zzb.zza(parcel0, 7, filterHolder0.zzaia, v, false);
        zzb.zza(parcel0, 8, filterHolder0.zzaib, v, false);
        zzb.zza(parcel0, 9, filterHolder0.zzaic, v, false);
        zzb.zzH(parcel0, v1);
    }

    public FilterHolder zzbK(Parcel parcel0) {
        OwnedByMeFilter ownedByMeFilter0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        FullTextSearchFilter fullTextSearchFilter0 = null;
        HasFilter hasFilter0 = null;
        MatchAllFilter matchAllFilter0 = null;
        InFilter inFilter0 = null;
        NotFilter notFilter0 = null;
        LogicalFilter logicalFilter0 = null;
        FieldOnlyFilter fieldOnlyFilter0 = null;
        ComparisonFilter comparisonFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    comparisonFilter0 = (ComparisonFilter)zza.zza(parcel0, v2, ComparisonFilter.CREATOR);
                    break;
                }
                case 2: {
                    fieldOnlyFilter0 = (FieldOnlyFilter)zza.zza(parcel0, v2, FieldOnlyFilter.CREATOR);
                    break;
                }
                case 3: {
                    logicalFilter0 = (LogicalFilter)zza.zza(parcel0, v2, LogicalFilter.CREATOR);
                    break;
                }
                case 4: {
                    notFilter0 = (NotFilter)zza.zza(parcel0, v2, NotFilter.CREATOR);
                    break;
                }
                case 5: {
                    inFilter0 = (InFilter)zza.zza(parcel0, v2, InFilter.CREATOR);
                    break;
                }
                case 6: {
                    matchAllFilter0 = (MatchAllFilter)zza.zza(parcel0, v2, MatchAllFilter.CREATOR);
                    break;
                }
                case 7: {
                    hasFilter0 = (HasFilter)zza.zza(parcel0, v2, HasFilter.CREATOR);
                    break;
                }
                case 8: {
                    fullTextSearchFilter0 = (FullTextSearchFilter)zza.zza(parcel0, v2, FullTextSearchFilter.CREATOR);
                    break;
                }
                case 9: {
                    ownedByMeFilter0 = (OwnedByMeFilter)zza.zza(parcel0, v2, OwnedByMeFilter.CREATOR);
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
        return new FilterHolder(v1, comparisonFilter0, fieldOnlyFilter0, logicalFilter0, notFilter0, inFilter0, matchAllFilter0, hasFilter0, fullTextSearchFilter0, ownedByMeFilter0);
    }

    public FilterHolder[] zzdz(int v) {
        return new FilterHolder[v];
    }
}

