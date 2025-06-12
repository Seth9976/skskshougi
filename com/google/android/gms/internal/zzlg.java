package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzlg {
    public static long zza(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        return zzlg.zza(inputStream0, outputStream0, false);
    }

    public static long zza(InputStream inputStream0, OutputStream outputStream0, boolean z) throws IOException {
        return zzlg.zza(inputStream0, outputStream0, z, 0x400);
    }

    public static long zza(InputStream inputStream0, OutputStream outputStream0, boolean z, int v) throws IOException {
        byte[] arr_b = new byte[v];
        long v1 = 0L;
        try {
            int v3;
            while((v3 = inputStream0.read(arr_b, 0, arr_b.length)) != -1) {
                v1 += (long)v3;
                outputStream0.write(arr_b, 0, v3);
            }
            return v1;
        }
        finally {
            if(z) {
                zzlg.zzb(inputStream0);
                zzlg.zzb(outputStream0);
            }
        }
    }

    public static void zza(ParcelFileDescriptor parcelFileDescriptor0) {
        if(parcelFileDescriptor0 != null) {
            try {
                parcelFileDescriptor0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public static byte[] zza(InputStream inputStream0, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        zzlg.zza(inputStream0, byteArrayOutputStream0, z);
        return byteArrayOutputStream0.toByteArray();
    }

    public static void zzb(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public static byte[] zzk(InputStream inputStream0) throws IOException {
        return zzlg.zza(inputStream0, true);
    }
}

