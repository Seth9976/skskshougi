package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzrd;
import com.google.android.gms.internal.zzrm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzt extends zzc {
    private final String TAG;

    public zzt(DataHolder dataHolder0, int v) {
        super(dataHolder0, v);
        this.TAG = "SafeDataBufferRef";
    }

    // 去混淆评级： 低(20)
    protected String zzB(String s, String s1) {
        return !this.zzbV(s) || this.zzbX(s) ? s1 : this.getString(s);
    }

    protected SafeParcelable zza(String s, Parcelable.Creator parcelable$Creator0) {
        byte[] arr_b = this.zzc(s, null);
        return arr_b == null ? null : com.google.android.gms.common.internal.safeparcel.zzc.zza(arr_b, parcelable$Creator0);
    }

    protected List zza(String s, Parcelable.Creator parcelable$Creator0, List list0) {
        byte[] arr_b = this.zzc(s, null);
        if(arr_b != null) {
            try {
                zzrd zzrd0 = zzrd.zzx(arr_b);
                if(zzrd0.zzaVG != null) {
                    ArrayList arrayList0 = new ArrayList(zzrd0.zzaVG.length);
                    byte[][] arr2_b = zzrd0.zzaVG;
                    for(int v = 0; v < arr2_b.length; ++v) {
                        arrayList0.add(com.google.android.gms.common.internal.safeparcel.zzc.zza(arr2_b[v], parcelable$Creator0));
                    }
                    return arrayList0;
                }
            }
            catch(zzrm zzrm0) {
                if(Log.isLoggable("SafeDataBufferRef", 6)) {
                    Log.e("SafeDataBufferRef", "Cannot parse byte[]", zzrm0);
                    return list0;
                }
            }
        }
        return list0;
    }

    protected List zza(String s, List list0) {
        byte[] arr_b = this.zzc(s, null);
        if(arr_b != null) {
            try {
                zzrd zzrd0 = zzrd.zzx(arr_b);
                if(zzrd0.zzaVF != null) {
                    ArrayList arrayList0 = new ArrayList(zzrd0.zzaVF.length);
                    for(int v = 0; v < zzrd0.zzaVF.length; ++v) {
                        arrayList0.add(((int)zzrd0.zzaVF[v]));
                    }
                    return arrayList0;
                }
            }
            catch(zzrm zzrm0) {
                if(Log.isLoggable("SafeDataBufferRef", 6)) {
                    Log.e("SafeDataBufferRef", "Cannot parse byte[]", zzrm0);
                    return list0;
                }
            }
        }
        return list0;
    }

    // 去混淆评级： 低(20)
    protected float zzb(String s, float f) {
        return !this.zzbV(s) || this.zzbX(s) ? f : this.getFloat(s);
    }

    protected List zzb(String s, List list0) {
        byte[] arr_b = this.zzc(s, null);
        if(arr_b != null) {
            try {
                zzrd zzrd0 = zzrd.zzx(arr_b);
                if(zzrd0.zzaVE != null) {
                    return Arrays.asList(zzrd0.zzaVE);
                }
            }
            catch(zzrm zzrm0) {
                if(Log.isLoggable("SafeDataBufferRef", 6)) {
                    Log.e("SafeDataBufferRef", "Cannot parse byte[]", zzrm0);
                    return list0;
                }
            }
        }
        return list0;
    }

    // 去混淆评级： 低(20)
    protected byte[] zzc(String s, byte[] arr_b) {
        return !this.zzbV(s) || this.zzbX(s) ? arr_b : this.getByteArray(s);
    }

    // 去混淆评级： 低(20)
    protected boolean zzh(String s, boolean z) {
        return !this.zzbV(s) || this.zzbX(s) ? z : this.getBoolean(s);
    }

    // 去混淆评级： 低(20)
    protected int zzz(String s, int v) {
        return !this.zzbV(s) || this.zzbX(s) ? v : this.getInteger(s);
    }
}

