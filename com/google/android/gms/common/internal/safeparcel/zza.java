package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class zza {
    public static class com.google.android.gms.common.internal.safeparcel.zza.zza extends RuntimeException {
        public com.google.android.gms.common.internal.safeparcel.zza.zza(String s, Parcel parcel0) {
            super(s + " Parcel: pos=" + parcel0.dataPosition() + " size=" + parcel0.dataSize());
        }
    }

    public static String[] zzA(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        String[] arr_s = parcel0.createStringArray();
        parcel0.setDataPosition(v1 + v2);
        return arr_s;
    }

    public static ArrayList zzB(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            arrayList0.add(parcel0.readInt());
        }
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    public static ArrayList zzC(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = parcel0.createStringArrayList();
        parcel0.setDataPosition(v1 + v2);
        return arrayList0;
    }

    public static Parcel zzD(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Parcel parcel1 = Parcel.obtain();
        parcel1.appendFrom(parcel0, v2, v1);
        parcel0.setDataPosition(v1 + v2);
        return parcel1;
    }

    public static Parcel[] zzE(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        Parcel[] arr_parcel = new Parcel[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = parcel0.readInt();
            if(v5 == 0) {
                arr_parcel[v4] = null;
            }
            else {
                int v6 = parcel0.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel0, v6, v5);
                arr_parcel[v4] = parcel1;
                parcel0.setDataPosition(v5 + v6);
            }
        }
        parcel0.setDataPosition(v2 + v1);
        return arr_parcel;
    }

    public static int zza(Parcel parcel0, int v) {
        return (v & 0xFFFF0000) == 0xFFFF0000 ? parcel0.readInt() : v >> 16 & 0xFFFF;
    }

    public static Parcelable zza(Parcel parcel0, int v, Parcelable.Creator parcelable$Creator0) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Parcelable parcelable0 = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        parcel0.setDataPosition(v1 + v2);
        return parcelable0;
    }

    private static void zza(Parcel parcel0, int v, int v1) {
        int v2 = zza.zza(parcel0, v);
        if(v2 != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Expected size " + v1 + " got " + v2 + " (0x" + Integer.toHexString(v2) + ")", parcel0);
        }
    }

    private static void zza(Parcel parcel0, int v, int v1, int v2) {
        if(v1 != v2) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Expected size " + v2 + " got " + v1 + " (0x" + Integer.toHexString(v1) + ")", parcel0);
        }
    }

    public static void zza(Parcel parcel0, int v, List list0, ClassLoader classLoader0) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return;
        }
        parcel0.readList(list0, classLoader0);
        parcel0.setDataPosition(v1 + v2);
    }

    public static int zzaa(Parcel parcel0) {
        return parcel0.readInt();
    }

    public static int zzab(Parcel parcel0) {
        int v = zza.zzaa(parcel0);
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if((0xFFFF & v) != 0x4F45) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Expected object header. Got 0x" + Integer.toHexString(v), parcel0);
        }
        int v3 = v2 + v1;
        if(v3 < v2 || v3 > parcel0.dataSize()) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Size read is invalid start=" + v2 + " end=" + v3, parcel0);
        }
        return v3;
    }

    public static void zzb(Parcel parcel0, int v) {
        parcel0.setDataPosition(zza.zza(parcel0, v) + parcel0.dataPosition());
    }

    public static Object[] zzb(Parcel parcel0, int v, Parcelable.Creator parcelable$Creator0) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Object[] arr_object = parcel0.createTypedArray(parcelable$Creator0);
        parcel0.setDataPosition(v1 + v2);
        return arr_object;
    }

    public static int zzbA(int v) [...] // Inlined contents

    public static ArrayList zzc(Parcel parcel0, int v, Parcelable.Creator parcelable$Creator0) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = parcel0.createTypedArrayList(parcelable$Creator0);
        parcel0.setDataPosition(v1 + v2);
        return arrayList0;
    }

    public static boolean zzc(Parcel parcel0, int v) {
        zza.zza(parcel0, v, 4);
        return parcel0.readInt() != 0;
    }

    public static Boolean zzd(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        zza.zza(parcel0, v, v1, 4);
        return parcel0.readInt() == 0 ? false : true;
    }

    public static byte zze(Parcel parcel0, int v) {
        zza.zza(parcel0, v, 4);
        return (byte)parcel0.readInt();
    }

    public static short zzf(Parcel parcel0, int v) {
        zza.zza(parcel0, v, 4);
        return (short)parcel0.readInt();
    }

    public static int zzg(Parcel parcel0, int v) {
        zza.zza(parcel0, v, 4);
        return parcel0.readInt();
    }

    public static Integer zzh(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        zza.zza(parcel0, v, v1, 4);
        return parcel0.readInt();
    }

    public static long zzi(Parcel parcel0, int v) {
        zza.zza(parcel0, v, 8);
        return parcel0.readLong();
    }

    public static Long zzj(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        zza.zza(parcel0, v, v1, 8);
        return parcel0.readLong();
    }

    public static BigInteger zzk(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        byte[] arr_b = parcel0.createByteArray();
        parcel0.setDataPosition(v1 + v2);
        return new BigInteger(arr_b);
    }

    public static float zzl(Parcel parcel0, int v) {
        zza.zza(parcel0, v, 4);
        return parcel0.readFloat();
    }

    public static double zzm(Parcel parcel0, int v) {
        zza.zza(parcel0, v, 8);
        return parcel0.readDouble();
    }

    public static BigDecimal zzn(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        byte[] arr_b = parcel0.createByteArray();
        int v3 = parcel0.readInt();
        parcel0.setDataPosition(v1 + v2);
        return new BigDecimal(new BigInteger(arr_b), v3);
    }

    public static String zzo(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        String s = parcel0.readString();
        parcel0.setDataPosition(v1 + v2);
        return s;
    }

    public static IBinder zzp(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        IBinder iBinder0 = parcel0.readStrongBinder();
        parcel0.setDataPosition(v1 + v2);
        return iBinder0;
    }

    public static Bundle zzq(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Bundle bundle0 = parcel0.readBundle();
        parcel0.setDataPosition(v1 + v2);
        return bundle0;
    }

    public static byte[] zzr(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        byte[] arr_b = parcel0.createByteArray();
        parcel0.setDataPosition(v1 + v2);
        return arr_b;
    }

    public static byte[][] zzs(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        byte[][] arr2_b = new byte[v3][];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr2_b[v4] = parcel0.createByteArray();
        }
        parcel0.setDataPosition(v2 + v1);
        return arr2_b;
    }

    public static boolean[] zzt(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        boolean[] arr_z = parcel0.createBooleanArray();
        parcel0.setDataPosition(v1 + v2);
        return arr_z;
    }

    public static int[] zzu(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int[] arr_v = parcel0.createIntArray();
        parcel0.setDataPosition(v1 + v2);
        return arr_v;
    }

    public static long[] zzv(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        long[] arr_v = parcel0.createLongArray();
        parcel0.setDataPosition(v1 + v2);
        return arr_v;
    }

    public static BigInteger[] zzw(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        BigInteger[] arr_bigInteger = new BigInteger[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_bigInteger[v4] = new BigInteger(parcel0.createByteArray());
        }
        parcel0.setDataPosition(v2 + v1);
        return arr_bigInteger;
    }

    public static float[] zzx(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        float[] arr_f = parcel0.createFloatArray();
        parcel0.setDataPosition(v1 + v2);
        return arr_f;
    }

    public static double[] zzy(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        double[] arr_f = parcel0.createDoubleArray();
        parcel0.setDataPosition(v1 + v2);
        return arr_f;
    }

    public static BigDecimal[] zzz(Parcel parcel0, int v) {
        int v1 = zza.zza(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        BigDecimal[] arr_bigDecimal = new BigDecimal[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            byte[] arr_b = parcel0.createByteArray();
            int v5 = parcel0.readInt();
            arr_bigDecimal[v4] = new BigDecimal(new BigInteger(arr_b), v5);
        }
        parcel0.setDataPosition(v2 + v1);
        return arr_bigDecimal;
    }
}

