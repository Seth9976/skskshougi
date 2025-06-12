package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public class zzv implements zzb {
    static class zza {
        public long zzaB;
        public String zzaC;
        public String zzb;
        public long zzc;
        public long zzd;
        public long zze;
        public long zzf;
        public Map zzg;

        private zza() {
        }

        public zza(String s, com.google.android.gms.internal.zzb.zza zzb$zza0) {
            this.zzaC = s;
            this.zzaB = (long)zzb$zza0.data.length;
            this.zzb = zzb$zza0.zzb;
            this.zzc = zzb$zza0.zzc;
            this.zzd = zzb$zza0.zzd;
            this.zze = zzb$zza0.zze;
            this.zzf = zzb$zza0.zzf;
            this.zzg = zzb$zza0.zzg;
        }

        public boolean zza(OutputStream outputStream0) {
            try {
                zzv.zza(outputStream0, 0x20150306);
                zzv.zza(outputStream0, this.zzaC);
                zzv.zza(outputStream0, (this.zzb == null ? "" : this.zzb));
                zzv.zza(outputStream0, this.zzc);
                zzv.zza(outputStream0, this.zzd);
                zzv.zza(outputStream0, this.zze);
                zzv.zza(outputStream0, this.zzf);
                zzv.zza(this.zzg, outputStream0);
                outputStream0.flush();
                return true;
            }
            catch(IOException iOException0) {
                zzs.zzb("%s", new Object[]{iOException0.toString()});
                return false;
            }
        }

        public com.google.android.gms.internal.zzb.zza zzb(byte[] arr_b) {
            com.google.android.gms.internal.zzb.zza zzb$zza0 = new com.google.android.gms.internal.zzb.zza();
            zzb$zza0.data = arr_b;
            zzb$zza0.zzb = this.zzb;
            zzb$zza0.zzc = this.zzc;
            zzb$zza0.zzd = this.zzd;
            zzb$zza0.zze = this.zze;
            zzb$zza0.zzf = this.zzf;
            zzb$zza0.zzg = this.zzg;
            return zzb$zza0;
        }

        public static zza zzf(InputStream inputStream0) throws IOException {
            zza zzv$zza0 = new zza();
            if(zzv.zzb(inputStream0) != 0x20150306) {
                throw new IOException();
            }
            zzv$zza0.zzaC = zzv.zzd(inputStream0);
            zzv$zza0.zzb = zzv.zzd(inputStream0);
            if(zzv$zza0.zzb.equals("")) {
                zzv$zza0.zzb = null;
            }
            zzv$zza0.zzc = zzv.zzc(inputStream0);
            zzv$zza0.zzd = zzv.zzc(inputStream0);
            zzv$zza0.zze = zzv.zzc(inputStream0);
            zzv$zza0.zzf = zzv.zzc(inputStream0);
            zzv$zza0.zzg = zzv.zze(inputStream0);
            return zzv$zza0;
        }
    }

    static class com.google.android.gms.internal.zzv.zzb extends FilterInputStream {
        private int zzaD;

        private com.google.android.gms.internal.zzv.zzb(InputStream inputStream0) {
            super(inputStream0);
            this.zzaD = 0;
        }

        com.google.android.gms.internal.zzv.zzb(InputStream inputStream0, com.google.android.gms.internal.zzv.1 zzv$10) {
            this(inputStream0);
        }

        @Override
        public int read() throws IOException {
            int v = super.read();
            if(v != -1) {
                ++this.zzaD;
            }
            return v;
        }

        @Override
        public int read(byte[] buffer, int offset, int count) throws IOException {
            int v2 = super.read(buffer, offset, count);
            if(v2 != -1) {
                this.zzaD += v2;
            }
            return v2;
        }
    }

    private final int zzaA;
    private final Map zzax;
    private long zzay;
    private final File zzaz;

    public zzv(File file0) {
        this(file0, 0x500000);
    }

    public zzv(File file0, int v) {
        this.zzax = new LinkedHashMap(16, 0.75f, true);
        this.zzay = 0L;
        this.zzaz = file0;
        this.zzaA = v;
    }

    public void remove(String key) {
        synchronized(this) {
            boolean z = this.zzf(key).delete();
            this.removeEntry(key);
            if(!z) {
                zzs.zzb("Could not delete cache entry for key=%s, filename=%s", new Object[]{key, this.zze(key)});
            }
        }
    }

    private void removeEntry(String key) {
        zza zzv$zza0 = (zza)this.zzax.get(key);
        if(zzv$zza0 != null) {
            this.zzay -= zzv$zza0.zzaB;
            this.zzax.remove(key);
        }
    }

    private static int zza(InputStream inputStream0) throws IOException {
        int v = inputStream0.read();
        if(v == -1) {
            throw new EOFException();
        }
        return v;
    }

    static void zza(OutputStream outputStream0, int v) throws IOException {
        outputStream0.write(v & 0xFF);
        outputStream0.write(v >> 8 & 0xFF);
        outputStream0.write(v >> 16 & 0xFF);
        outputStream0.write(v >> 24 & 0xFF);
    }

    static void zza(OutputStream outputStream0, long v) throws IOException {
        outputStream0.write(((int)(((byte)(((int)v))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 8)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 16)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 24)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 0x20)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 40)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 0x30)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 56)))))));
    }

    static void zza(OutputStream outputStream0, String s) throws IOException {
        byte[] arr_b = s.getBytes("UTF-8");
        zzv.zza(outputStream0, ((long)arr_b.length));
        outputStream0.write(arr_b, 0, arr_b.length);
    }

    private void zza(String s, zza zzv$zza0) {
        if(this.zzax.containsKey(s)) {
            zza zzv$zza1 = (zza)this.zzax.get(s);
            this.zzay = zzv$zza0.zzaB - zzv$zza1.zzaB + this.zzay;
        }
        else {
            this.zzay += zzv$zza0.zzaB;
        }
        this.zzax.put(s, zzv$zza0);
    }

    static void zza(Map map0, OutputStream outputStream0) throws IOException {
        if(map0 != null) {
            zzv.zza(outputStream0, map0.size());
            for(Object object0: map0.entrySet()) {
                zzv.zza(outputStream0, ((String)((Map.Entry)object0).getKey()));
                zzv.zza(outputStream0, ((String)((Map.Entry)object0).getValue()));
            }
            return;
        }
        zzv.zza(outputStream0, 0);
    }

    private static byte[] zza(InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        int v1;
        for(v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 == -1) {
                break;
            }
        }
        if(v1 != v) {
            throw new IOException("Expected " + v + " bytes, read " + v1 + " bytes");
        }
        return arr_b;
    }

    @Override  // com.google.android.gms.internal.zzb
    public com.google.android.gms.internal.zzb.zza zza(String s) {
        com.google.android.gms.internal.zzb.zza zzb$zza0;
        com.google.android.gms.internal.zzv.zzb zzv$zzb0;
        File file0;
        zza zzv$zza0;
        synchronized(this) {
            zzv$zza0 = (zza)this.zzax.get(s);
            if(zzv$zza0 == null) {
                zzb$zza0 = null;
            }
            else {
                file0 = this.zzf(s);
                goto label_4;
            }
            return zzb$zza0;
        }
        try {
            try {
            label_4:
                zzv$zzb0 = null;
                zzv$zzb0 = new com.google.android.gms.internal.zzv.zzb(new FileInputStream(file0), null);
                zza.zzf(zzv$zzb0);
                zzb$zza0 = zzv$zza0.zzb(zzv.zza(zzv$zzb0, ((int)(file0.length() - ((long)zzv$zzb0.zzaD)))));
                goto label_26;
            }
            catch(IOException iOException0) {
            }
            zzs.zzb("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
            this.remove(s);
            if(zzv$zzb0 != null) {
                goto label_13;
            }
            return null;
        }
        catch(Throwable throwable1) {
            goto label_20;
        }
        try {
        label_13:
            zzv$zzb0.close();
            return null;
        }
        catch(IOException unused_ex) {
            return null;
        label_20:
            if(zzv$zzb0 != null) {
                try {
                    zzv$zzb0.close();
                    throw throwable1;
                }
                catch(IOException unused_ex) {
                }
                catch(Throwable throwable0) {
                    throw throwable0;
                }
                return null;
            }
            try {
                throw throwable1;
                try {
                label_26:
                    zzv$zzb0.close();
                }
                catch(IOException unused_ex) {
                    zzb$zza0 = null;
                }
                return zzb$zza0;
            }
            catch(Throwable throwable0) {
            }
            throw throwable0;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    @Override  // com.google.android.gms.internal.zzb
    public void zza() {
        BufferedInputStream bufferedInputStream1;
        BufferedInputStream bufferedInputStream0;
        File file0;
        int v;
        synchronized(this) {
            if(this.zzaz.exists()) {
                File[] arr_file = this.zzaz.listFiles();
                if(arr_file != null) {
                    v = 0;
                    while(true) {
                    label_8:
                        if(v >= arr_file.length) {
                            break;
                        }
                        file0 = arr_file[v];
                        bufferedInputStream0 = null;
                        bufferedInputStream1 = null;
                        bufferedInputStream1 = new BufferedInputStream(new FileInputStream(file0));
                        goto label_16;
                    }
                }
            }
            else if(!this.zzaz.mkdirs()) {
                zzs.zzc("Unable to create cache dir %s", new Object[]{this.zzaz.getAbsolutePath()});
            }
            return;
        }
        try {
            bufferedInputStream1 = null;
            bufferedInputStream1 = new BufferedInputStream(new FileInputStream(file0));
            goto label_16;
        }
        catch(IOException unused_ex) {
            goto label_20;
        }
        catch(Throwable throwable1) {
        }
        goto label_29;
        try {
        label_16:
            zza zzv$zza0 = zza.zzf(bufferedInputStream1);
            zzv$zza0.zzaB = file0.length();
            this.zza(zzv$zza0.zzaC, zzv$zza0);
            goto label_32;
        }
        catch(IOException unused_ex) {
        label_20:
            if(file0 != null) {
                try {
                    file0.delete();
                }
                catch(Throwable throwable2) {
                    goto label_27;
                }
            }
            if(bufferedInputStream1 != null) {
                try {
                    bufferedInputStream1.close();
                }
                catch(IOException unused_ex) {
                }
                catch(Throwable throwable0) {
                    throw throwable0;
                }
            }
            ++v;
            goto label_8;
        }
        catch(Throwable throwable2) {
        label_27:
            bufferedInputStream0 = bufferedInputStream1;
            throwable1 = throwable2;
        }
    label_29:
        if(bufferedInputStream0 == null) {
            throw throwable1;
        }
        else {
            try {
                try {
                    bufferedInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                throw throwable1;
                try {
                label_32:
                    bufferedInputStream1.close();
                }
                catch(IOException unused_ex) {
                }
                ++v;
                goto label_8;
            }
            catch(Throwable throwable0) {
            }
        }
        throw throwable0;
    }

    @Override  // com.google.android.gms.internal.zzb
    public void zza(String s, com.google.android.gms.internal.zzb.zza zzb$zza0) {
        synchronized(this) {
            this.zzc(zzb$zza0.data.length);
            File file0 = this.zzf(s);
            try {
                FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
                zza zzv$zza0 = new zza(s, zzb$zza0);
                if(!zzv$zza0.zza(fileOutputStream0)) {
                    fileOutputStream0.close();
                    zzs.zzb("Failed to write header for %s", new Object[]{file0.getAbsolutePath()});
                    throw new IOException();
                }
                fileOutputStream0.write(zzb$zza0.data);
                fileOutputStream0.close();
                this.zza(s, zzv$zza0);
            }
            catch(IOException unused_ex) {
                if(!file0.delete()) {
                    zzs.zzb("Could not clean up file %s", new Object[]{file0.getAbsolutePath()});
                }
            }
        }
    }

    static int zzb(InputStream inputStream0) throws IOException {
        return zzv.zza(inputStream0) | zzv.zza(inputStream0) << 8 | zzv.zza(inputStream0) << 16 | zzv.zza(inputStream0) << 24;
    }

    static long zzc(InputStream inputStream0) throws IOException {
        return ((long)zzv.zza(inputStream0)) & 0xFFL | (((long)zzv.zza(inputStream0)) & 0xFFL) << 8 | (((long)zzv.zza(inputStream0)) & 0xFFL) << 16 | (((long)zzv.zza(inputStream0)) & 0xFFL) << 24 | (((long)zzv.zza(inputStream0)) & 0xFFL) << 0x20 | (((long)zzv.zza(inputStream0)) & 0xFFL) << 40 | (((long)zzv.zza(inputStream0)) & 0xFFL) << 0x30 | (((long)zzv.zza(inputStream0)) & 0xFFL) << 56;
    }

    private void zzc(int v) {
        int v4;
        if(this.zzay + ((long)v) >= ((long)this.zzaA)) {
            if(zzs.DEBUG) {
                zzs.zza("Pruning old cache entries.", new Object[0]);
            }
            long v1 = this.zzay;
            long v2 = SystemClock.elapsedRealtime();
            Iterator iterator0 = this.zzax.entrySet().iterator();
            for(int v3 = 0; true; v3 = v4) {
                if(!iterator0.hasNext()) {
                    v4 = v3;
                    break;
                }
                Object object0 = iterator0.next();
                zza zzv$zza0 = (zza)((Map.Entry)object0).getValue();
                if(this.zzf(zzv$zza0.zzaC).delete()) {
                    this.zzay -= zzv$zza0.zzaB;
                }
                else {
                    zzs.zzb("Could not delete cache entry for key=%s, filename=%s", new Object[]{zzv$zza0.zzaC, this.zze(zzv$zza0.zzaC)});
                }
                iterator0.remove();
                v4 = v3 + 1;
                if(((float)(this.zzay + ((long)v))) < ((float)this.zzaA) * 0.9f) {
                    break;
                }
            }
            if(zzs.DEBUG) {
                zzs.zza("pruned %d files, %d bytes, %d ms", new Object[]{v4, ((long)(this.zzay - v1)), ((long)(SystemClock.elapsedRealtime() - v2))});
            }
        }
    }

    static String zzd(InputStream inputStream0) throws IOException {
        return new String(zzv.zza(inputStream0, ((int)zzv.zzc(inputStream0))), "UTF-8");
    }

    private String zze(String s) {
        int v = s.length();
        return s.substring(0, v / 2).hashCode() + String.valueOf(s.substring(v / 2).hashCode());
    }

    static Map zze(InputStream inputStream0) throws IOException {
        int v = zzv.zzb(inputStream0);
        Map map0 = v == 0 ? Collections.emptyMap() : new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            map0.put(zzv.zzd(inputStream0).intern(), zzv.zzd(inputStream0).intern());
        }
        return map0;
    }

    public File zzf(String s) {
        String s1 = this.zze(s);
        return new File(this.zzaz, s1);
    }

    class com.google.android.gms.internal.zzv.1 {
    }

}

