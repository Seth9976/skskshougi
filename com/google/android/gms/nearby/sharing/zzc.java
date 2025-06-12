package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzip(x0);
    }

    static void zza(SharedContent sharedContent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, sharedContent0.getVersionCode());
        zzb.zza(parcel0, 3, sharedContent0.getUri(), false);
        zzb.zza(parcel0, 8, sharedContent0.zzxe(), v, false);
        zzb.zza(parcel0, 9, sharedContent0.zzxf(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public SharedContent zzfA(Parcel parcel0) {
        int v3;
        String s1;
        ViewableItem[] arr_viewableItem1;
        LocalContent[] arr_localContent1;
        LocalContent[] arr_localContent = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ViewableItem[] arr_viewableItem = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arr_viewableItem1 = arr_viewableItem;
                    s1 = s;
                    v3 = zza.zzg(parcel0, v2);
                    arr_localContent1 = arr_localContent;
                    break;
                }
                case 3: {
                    v3 = v1;
                    s1 = zza.zzo(parcel0, v2);
                    arr_localContent1 = arr_localContent;
                    arr_viewableItem1 = arr_viewableItem;
                    break;
                }
                case 8: {
                    s1 = s;
                    v3 = v1;
                    arr_viewableItem1 = (ViewableItem[])zza.zzb(parcel0, v2, ViewableItem.CREATOR);
                    arr_localContent1 = arr_localContent;
                    break;
                }
                case 9: {
                    arr_localContent1 = (LocalContent[])zza.zzb(parcel0, v2, LocalContent.CREATOR);
                    arr_viewableItem1 = arr_viewableItem;
                    s1 = s;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    arr_localContent1 = arr_localContent;
                    arr_viewableItem1 = arr_viewableItem;
                    s1 = s;
                    v3 = v1;
                }
            }
            v1 = v3;
            s = s1;
            arr_viewableItem = arr_viewableItem1;
            arr_localContent = arr_localContent1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SharedContent(v1, s, arr_viewableItem, arr_localContent);
    }

    public SharedContent[] zzip(int v) {
        return new SharedContent[v];
    }
}

