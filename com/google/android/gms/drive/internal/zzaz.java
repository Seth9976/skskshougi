package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;

public class zzaz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbe(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcT(x0);
    }

    static void zza(OnEventResponse onEventResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onEventResponse0.zzCY);
        zzb.zzc(parcel0, 2, onEventResponse0.zzaca);
        zzb.zza(parcel0, 3, onEventResponse0.zzagj, v, false);
        zzb.zza(parcel0, 5, onEventResponse0.zzagk, v, false);
        zzb.zza(parcel0, 6, onEventResponse0.zzagl, v, false);
        zzb.zza(parcel0, 7, onEventResponse0.zzagm, v, false);
        zzb.zza(parcel0, 8, onEventResponse0.zzagn, v, false);
        zzb.zzH(parcel0, v1);
    }

    public OnEventResponse zzbe(Parcel parcel0) {
        int v = 0;
        ProgressEvent progressEvent0 = null;
        int v1 = zza.zzab(parcel0);
        ChangesAvailableEvent changesAvailableEvent0 = null;
        QueryResultEventParcelable queryResultEventParcelable0 = null;
        CompletionEvent completionEvent0 = null;
        ChangeEvent changeEvent0 = null;
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
                    changeEvent0 = (ChangeEvent)zza.zza(parcel0, v3, ChangeEvent.CREATOR);
                    break;
                }
                case 5: {
                    completionEvent0 = (CompletionEvent)zza.zza(parcel0, v3, CompletionEvent.CREATOR);
                    break;
                }
                case 6: {
                    queryResultEventParcelable0 = (QueryResultEventParcelable)zza.zza(parcel0, v3, QueryResultEventParcelable.CREATOR);
                    break;
                }
                case 7: {
                    changesAvailableEvent0 = (ChangesAvailableEvent)zza.zza(parcel0, v3, ChangesAvailableEvent.CREATOR);
                    break;
                }
                case 8: {
                    progressEvent0 = (ProgressEvent)zza.zza(parcel0, v3, ProgressEvent.CREATOR);
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
        return new OnEventResponse(v2, v, changeEvent0, completionEvent0, queryResultEventParcelable0, changesAvailableEvent0, progressEvent0);
    }

    public OnEventResponse[] zzcT(int v) {
        return new OnEventResponse[v];
    }
}

