package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class zzb {
    private static int zzF(Parcel parcel0, int v) {
        parcel0.writeInt(0xFFFF0000 | v);
        parcel0.writeInt(0);
        return parcel0.dataPosition();
    }

    private static void zzG(Parcel parcel0, int v) {
        int v1 = parcel0.dataPosition();
        parcel0.setDataPosition(v - 4);
        parcel0.writeInt(v1 - v);
        parcel0.setDataPosition(v1);
    }

    public static void zzH(Parcel parcel0, int v) {
        zzb.zzG(parcel0, v);
    }

    public static void zza(Parcel parcel0, int v, byte b) {
        zzb.zzb(parcel0, v, 4);
        parcel0.writeInt(((int)b));
    }

    public static void zza(Parcel parcel0, int v, double f) {
        zzb.zzb(parcel0, v, 8);
        parcel0.writeDouble(f);
    }

    public static void zza(Parcel parcel0, int v, float f) {
        zzb.zzb(parcel0, v, 4);
        parcel0.writeFloat(f);
    }

    public static void zza(Parcel parcel0, int v, long v1) {
        zzb.zzb(parcel0, v, 8);
        parcel0.writeLong(v1);
    }

    public static void zza(Parcel parcel0, int v, Bundle bundle0, boolean z) {
        if(bundle0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeBundle(bundle0);
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, IBinder iBinder0, boolean z) {
        if(iBinder0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeStrongBinder(iBinder0);
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, Parcel parcel1, boolean z) {
        if(parcel1 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.appendFrom(parcel1, 0, parcel1.dataSize());
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, Parcelable parcelable0, int v1, boolean z) {
        if(parcelable0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v2 = zzb.zzF(parcel0, v);
        parcelable0.writeToParcel(parcel0, v1);
        zzb.zzG(parcel0, v2);
    }

    public static void zza(Parcel parcel0, int v, Boolean boolean0, boolean z) {
        int v1 = 0;
        if(boolean0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        zzb.zzb(parcel0, v, 4);
        if(boolean0.booleanValue()) {
            v1 = 1;
        }
        parcel0.writeInt(v1);
    }

    public static void zza(Parcel parcel0, int v, Integer integer0, boolean z) {
        if(integer0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        zzb.zzb(parcel0, v, 4);
        parcel0.writeInt(((int)integer0));
    }

    public static void zza(Parcel parcel0, int v, Long long0, boolean z) {
        if(long0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        zzb.zzb(parcel0, v, 8);
        parcel0.writeLong(((long)long0));
    }

    public static void zza(Parcel parcel0, int v, String s, boolean z) {
        if(s == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeString(s);
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        int v2 = list0.size();
        parcel0.writeInt(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            parcel0.writeInt(((int)(((Integer)list0.get(v3)))));
        }
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, short v1) {
        zzb.zzb(parcel0, v, 4);
        parcel0.writeInt(((int)v1));
    }

    public static void zza(Parcel parcel0, int v, boolean z) {
        zzb.zzb(parcel0, v, 4);
        parcel0.writeInt((z ? 1 : 0));
    }

    public static void zza(Parcel parcel0, int v, byte[] arr_b, boolean z) {
        if(arr_b == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeByteArray(arr_b);
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, int[] arr_v, boolean z) {
        if(arr_v == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeIntArray(arr_v);
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, Parcelable[] arr_parcelable, int v1, boolean z) {
        if(arr_parcelable == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v2 = zzb.zzF(parcel0, v);
        parcel0.writeInt(arr_parcelable.length);
        for(int v3 = 0; v3 < arr_parcelable.length; ++v3) {
            Parcelable parcelable0 = arr_parcelable[v3];
            if(parcelable0 == null) {
                parcel0.writeInt(0);
            }
            else {
                zzb.zza(parcel0, parcelable0, v1);
            }
        }
        zzb.zzG(parcel0, v2);
    }

    public static void zza(Parcel parcel0, int v, String[] arr_s, boolean z) {
        if(arr_s == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeStringArray(arr_s);
        zzb.zzG(parcel0, v1);
    }

    public static void zza(Parcel parcel0, int v, byte[][] arr2_b, boolean z) {
        if(arr2_b == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v2 = zzb.zzF(parcel0, v);
        parcel0.writeInt(arr2_b.length);
        for(int v1 = 0; v1 < arr2_b.length; ++v1) {
            parcel0.writeByteArray(arr2_b[v1]);
        }
        zzb.zzG(parcel0, v2);
    }

    private static void zza(Parcel parcel0, Parcelable parcelable0, int v) {
        int v1 = parcel0.dataPosition();
        parcel0.writeInt(1);
        int v2 = parcel0.dataPosition();
        parcelable0.writeToParcel(parcel0, v);
        int v3 = parcel0.dataPosition();
        parcel0.setDataPosition(v1);
        parcel0.writeInt(v3 - v2);
        parcel0.setDataPosition(v3);
    }

    public static int zzac(Parcel parcel0) {
        return zzb.zzF(parcel0, 0x4F45);
    }

    private static void zzb(Parcel parcel0, int v, int v1) {
        if(v1 >= 0xFFFF) {
            parcel0.writeInt(0xFFFF0000 | v);
            parcel0.writeInt(v1);
            return;
        }
        parcel0.writeInt(v1 << 16 | v);
    }

    public static void zzb(Parcel parcel0, int v, List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeStringList(list0);
        zzb.zzG(parcel0, v1);
    }

    public static void zzc(Parcel parcel0, int v, int v1) {
        zzb.zzb(parcel0, v, 4);
        parcel0.writeInt(v1);
    }

    public static void zzc(Parcel parcel0, int v, List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        int v2 = list0.size();
        parcel0.writeInt(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            Parcelable parcelable0 = (Parcelable)list0.get(v3);
            if(parcelable0 == null) {
                parcel0.writeInt(0);
            }
            else {
                zzb.zza(parcel0, parcelable0, 0);
            }
        }
        zzb.zzG(parcel0, v1);
    }

    public static void zzd(Parcel parcel0, int v, List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                zzb.zzb(parcel0, v, 0);
            }
            return;
        }
        int v1 = zzb.zzF(parcel0, v);
        parcel0.writeList(list0);
        zzb.zzG(parcel0, v1);
    }
}

