package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

public final class zzrg {
    public static class zza extends IOException {
        zza(int v, int v1) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + v + " limit " + v1 + ").");
        }
    }

    private final ByteBuffer zzaVT;

    private zzrg(ByteBuffer byteBuffer0) {
        this.zzaVT = byteBuffer0;
    }

    private zzrg(byte[] arr_b, int v, int v1) {
        this(ByteBuffer.wrap(arr_b, v, v1));
    }

    public static int zzA(int v, int v1) {
        return zzrg.zzkM(v) + zzrg.zzkJ(v1);
    }

    public static zzrg zzA(byte[] arr_b) {
        return zzrg.zzb(arr_b, 0, arr_b.length);
    }

    public static int zzB(int v, int v1) {
        return zzrg.zzkM(v) + zzrg.zzkK(v1);
    }

    public void zzB(byte[] arr_b) throws IOException {
        this.zzkN(arr_b.length);
        this.zzD(arr_b);
    }

    public int zzBG() {
        return this.zzaVT.remaining();
    }

    public void zzBH() {
        if(this.zzBG() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int zzC(byte[] arr_b) {
        return zzrg.zzkO(arr_b.length) + arr_b.length;
    }

    public void zzC(int v, int v1) throws IOException {
        this.zzkN(zzrq.zzD(v, v1));
    }

    public void zzD(byte[] arr_b) throws IOException {
        this.zzc(arr_b, 0, arr_b.length);
    }

    public void zzW(long v) throws IOException {
        this.zzaa(v);
    }

    public void zzX(long v) throws IOException {
        this.zzaa(zzrg.zzad(v));
    }

    public static int zzY(long v) {
        return zzrg.zzab(v);
    }

    public static int zzZ(long v) {
        return zzrg.zzab(zzrg.zzad(v));
    }

    private static int zza(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1;
        for(v1 = 0; v1 < v && charSequence0.charAt(v1) < 0x80; ++v1) {
        }
        int v2 = v1;
        int v3 = v;
        while(v2 < v) {
            int v4 = charSequence0.charAt(v2);
            if(v4 < 0x800) {
                ++v2;
                v3 = (0x7F - v4 >>> 0x1F) + v3;
            }
            else {
                v3 += zzrg.zza(charSequence0, v2);
                if(true) {
                    break;
                }
            }
        }
        if(v3 < v) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long)v3) + 0x100000000L));
        }
        return v3;
    }

    private static int zza(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        int v2 = 0;
        for(int v3 = v; v3 < v1; ++v3) {
            int v4 = charSequence0.charAt(v3);
            if(v4 < 0x800) {
                v2 += 0x7F - v4 >>> 0x1F;
            }
            else {
                v2 += 2;
                if(0xD800 <= v4 && v4 <= 0xDFFF) {
                    if(Character.codePointAt(charSequence0, v3) < 0x10000) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + v3);
                    }
                    ++v3;
                }
            }
        }
        return v2;
    }

    private static int zza(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
        int v8;
        int v2 = charSequence0.length();
        int v3 = 0;
        int v4 = v + v1;
        while(v3 < v2 && v3 + v < v4) {
            int v5 = charSequence0.charAt(v3);
            if(v5 >= 0x80) {
                break;
            }
            arr_b[v + v3] = (byte)v5;
            ++v3;
        }
        if(v3 == v2) {
            return v + v2;
        }
        int v6;
        for(v6 = v + v3; v3 < v2; v6 = v8) {
            int v7 = charSequence0.charAt(v3);
            if(v7 < 0x80 && v6 < v4) {
                v8 = v6 + 1;
                arr_b[v6] = (byte)v7;
            }
            else if(v7 < 0x800 && v6 <= v4 - 2) {
                arr_b[v6] = (byte)(v7 >>> 6 | 960);
                v8 = v6 + 2;
                arr_b[v6 + 1] = (byte)(v7 & 0x3F | 0x80);
            }
            else if(v7 >= 0xD800 && 0xDFFF >= v7 || v6 > v4 - 3) {
                if(v6 > v4 - 4) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v6);
                }
                if(v3 + 1 == charSequence0.length()) {
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (v3 - 1));
                }
                ++v3;
                int v9 = charSequence0.charAt(v3);
                if(!Character.isSurrogatePair(((char)v7), ((char)v9))) {
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (v3 - 1));
                }
                int v10 = Character.toCodePoint(((char)v7), ((char)v9));
                arr_b[v6] = (byte)(v10 >>> 18 | 0xF0);
                arr_b[v6 + 1] = (byte)(v10 >>> 12 & 0x3F | 0x80);
                arr_b[v6 + 2] = (byte)(v10 >>> 6 & 0x3F | 0x80);
                v8 = v6 + 4;
                arr_b[v6 + 3] = (byte)(v10 & 0x3F | 0x80);
            }
            else {
                arr_b[v6] = (byte)(v7 >>> 12 | 480);
                arr_b[v6 + 1] = (byte)(v7 >>> 6 & 0x3F | 0x80);
                v8 = v6 + 3;
                arr_b[v6 + 2] = (byte)(v7 & 0x3F | 0x80);
            }
            ++v3;
        }
        return v6;
    }

    private static void zza(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        if(byteBuffer0.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if(byteBuffer0.hasArray()) {
            try {
                byteBuffer0.position(zzrg.zza(charSequence0, byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining()) - byteBuffer0.arrayOffset());
                return;
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                BufferOverflowException bufferOverflowException0 = new BufferOverflowException();
                bufferOverflowException0.initCause(arrayIndexOutOfBoundsException0);
                throw bufferOverflowException0;
            }
        }
        zzrg.zzb(charSequence0, byteBuffer0);
    }

    public void zza(int v, double f) throws IOException {
        this.zzC(v, 1);
        this.zzh(f);
    }

    public void zza(int v, zzrn zzrn0) throws IOException {
        this.zzC(v, 2);
        this.zzc(zzrn0);
    }

    public void zza(int v, byte[] arr_b) throws IOException {
        this.zzC(v, 2);
        this.zzB(arr_b);
    }

    public void zzaa(long v) throws IOException {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.zzkL(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.zzkL(((int)v));
    }

    public static int zzab(long v) {
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if((0xFFFFFFFFFFFFC000L & v) == 0L) {
            return 2;
        }
        if((0xFFFFFFFFFFE00000L & v) == 0L) {
            return 3;
        }
        if((0xFFFFFFFFF0000000L & v) == 0L) {
            return 4;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            return 5;
        }
        if((0xFFFFFC0000000000L & v) == 0L) {
            return 6;
        }
        if((0xFFFE000000000000L & v) == 0L) {
            return 7;
        }
        if((0xFF00000000000000L & v) == 0L) {
            return 8;
        }
        return (0x8000000000000000L & v) == 0L ? 9 : 10;
    }

    public void zzac(long v) throws IOException {
        this.zzkL(((int)v) & 0xFF);
        this.zzkL(((int)(v >> 8)) & 0xFF);
        this.zzkL(((int)(v >> 16)) & 0xFF);
        this.zzkL(((int)(v >> 24)) & 0xFF);
        this.zzkL(((int)(v >> 0x20)) & 0xFF);
        this.zzkL(((int)(v >> 40)) & 0xFF);
        this.zzkL(((int)(v >> 0x30)) & 0xFF);
        this.zzkL(((int)(v >> 56)) & 0xFF);
    }

    public static long zzad(long v) {
        return v << 1 ^ v >> 0x3F;
    }

    public void zzar(boolean z) throws IOException {
        this.zzkL((z ? 1 : 0));
    }

    public static int zzas(boolean z) [...] // Inlined contents

    public static int zzb(int v, double f) {
        return zzrg.zzkM(v) + 8;
    }

    public static int zzb(int v, zzrn zzrn0) {
        return zzrg.zzkM(v) * 2 + zzrg.zzd(zzrn0);
    }

    public static int zzb(int v, byte[] arr_b) {
        return zzrg.zzkM(v) + zzrg.zzC(arr_b);
    }

    public static zzrg zzb(byte[] arr_b, int v, int v1) {
        return new zzrg(arr_b, v, v1);
    }

    private static void zzb(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = charSequence0.charAt(v1);
            if(v2 < 0x80) {
                byteBuffer0.put(((byte)v2));
            }
            else if(v2 < 0x800) {
                byteBuffer0.put(((byte)(v2 >>> 6 | 960)));
                byteBuffer0.put(((byte)(v2 & 0x3F | 0x80)));
            }
            else if(v2 >= 0xD800 && 0xDFFF >= v2) {
                if(v1 + 1 == charSequence0.length()) {
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (v1 - 1));
                }
                ++v1;
                int v3 = charSequence0.charAt(v1);
                if(!Character.isSurrogatePair(((char)v2), ((char)v3))) {
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (v1 - 1));
                }
                int v4 = Character.toCodePoint(((char)v2), ((char)v3));
                byteBuffer0.put(((byte)(v4 >>> 18 | 0xF0)));
                byteBuffer0.put(((byte)(v4 >>> 12 & 0x3F | 0x80)));
                byteBuffer0.put(((byte)(v4 >>> 6 & 0x3F | 0x80)));
                byteBuffer0.put(((byte)(v4 & 0x3F | 0x80)));
            }
            else {
                byteBuffer0.put(((byte)(v2 >>> 12 | 480)));
                byteBuffer0.put(((byte)(v2 >>> 6 & 0x3F | 0x80)));
                byteBuffer0.put(((byte)(v2 & 0x3F | 0x80)));
            }
        }
    }

    public void zzb(byte b) throws IOException {
        if(!this.zzaVT.hasRemaining()) {
            throw new zza(this.zzaVT.position(), this.zzaVT.limit());
        }
        this.zzaVT.put(b);
    }

    public void zzb(int v, float f) throws IOException {
        this.zzC(v, 5);
        this.zzi(f);
    }

    public void zzb(int v, long v1) throws IOException {
        this.zzC(v, 0);
        this.zzW(v1);
    }

    public void zzb(int v, String s) throws IOException {
        this.zzC(v, 2);
        this.zzfi(s);
    }

    public void zzb(int v, boolean z) throws IOException {
        this.zzC(v, 0);
        this.zzar(z);
    }

    public void zzb(zzrn zzrn0) throws IOException {
        zzrn0.zza(this);
    }

    public static int zzc(int v, float f) {
        return zzrg.zzkM(v) + 4;
    }

    public static int zzc(int v, zzrn zzrn0) {
        return zzrg.zzkM(v) + zzrg.zze(zzrn0);
    }

    public static int zzc(int v, boolean z) {
        return zzrg.zzkM(v) + 1;
    }

    public void zzc(int v, long v1) throws IOException {
        this.zzC(v, 0);
        this.zzX(v1);
    }

    public void zzc(zzrn zzrn0) throws IOException {
        this.zzkN(zzrn0.zzBU());
        zzrn0.zza(this);
    }

    public void zzc(byte[] arr_b, int v, int v1) throws IOException {
        if(this.zzaVT.remaining() < v1) {
            throw new zza(this.zzaVT.position(), this.zzaVT.limit());
        }
        this.zzaVT.put(arr_b, v, v1);
    }

    public static int zzd(int v, long v1) {
        return zzrg.zzkM(v) + zzrg.zzY(v1);
    }

    public static int zzd(zzrn zzrn0) {
        return zzrn0.zzBV();
    }

    public static int zze(int v, long v1) {
        return zzrg.zzkM(v) + zzrg.zzZ(v1);
    }

    public static int zze(zzrn zzrn0) {
        int v = zzrn0.zzBV();
        return v + zzrg.zzkO(v);
    }

    public void zzfi(String s) throws IOException {
        try {
            int v = zzrg.zzkO(s.length());
            if(v == zzrg.zzkO(s.length() * 3)) {
                int v1 = this.zzaVT.position();
                this.zzaVT.position(v1 + v);
                zzrg.zza(s, this.zzaVT);
                int v2 = this.zzaVT.position();
                this.zzaVT.position(v1);
                this.zzkN(v2 - v1 - v);
                this.zzaVT.position(v2);
                return;
            }
            this.zzkN(zzrg.zza(s));
            zzrg.zza(s, this.zzaVT);
        }
        catch(BufferOverflowException unused_ex) {
            throw new zza(this.zzaVT.position(), this.zzaVT.limit());
        }
    }

    public static int zzfj(String s) {
        int v = zzrg.zza(s);
        return v + zzrg.zzkO(v);
    }

    public void zzh(double f) throws IOException {
        this.zzac(Double.doubleToLongBits(f));
    }

    public static int zzi(double f) [...] // Inlined contents

    public void zzi(float f) throws IOException {
        this.zzkP(Float.floatToIntBits(f));
    }

    public static int zzj(float f) [...] // Inlined contents

    public static int zzk(int v, String s) {
        return zzrg.zzkM(v) + zzrg.zzfj(s);
    }

    public void zzkH(int v) throws IOException {
        if(v >= 0) {
            this.zzkN(v);
            return;
        }
        this.zzaa(((long)v));
    }

    public void zzkI(int v) throws IOException {
        this.zzkN(zzrg.zzkQ(v));
    }

    public static int zzkJ(int v) {
        return v < 0 ? 10 : zzrg.zzkO(v);
    }

    public static int zzkK(int v) {
        return zzrg.zzkO(zzrg.zzkQ(v));
    }

    public void zzkL(int v) throws IOException {
        this.zzb(((byte)v));
    }

    public static int zzkM(int v) {
        return zzrg.zzkO(zzrq.zzD(v, 0));
    }

    public void zzkN(int v) throws IOException {
        while((v & 0xFFFFFF80) != 0) {
            this.zzkL(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.zzkL(v);
    }

    public static int zzkO(int v) {
        if((v & 0xFFFFFF80) == 0) {
            return 1;
        }
        if((v & 0xFFFFC000) == 0) {
            return 2;
        }
        if((0xFFE00000 & v) == 0) {
            return 3;
        }
        return (0xF0000000 & v) == 0 ? 4 : 5;
    }

    public void zzkP(int v) throws IOException {
        this.zzkL(v & 0xFF);
        this.zzkL(v >> 8 & 0xFF);
        this.zzkL(v >> 16 & 0xFF);
        this.zzkL(v >> 24 & 0xFF);
    }

    public static int zzkQ(int v) {
        return v << 1 ^ v >> 0x1F;
    }

    public void zzy(int v, int v1) throws IOException {
        this.zzC(v, 0);
        this.zzkH(v1);
    }

    public void zzz(int v, int v1) throws IOException {
        this.zzC(v, 0);
        this.zzkI(v1);
    }
}

