package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@zzgd
public class zzdr {
    private zzid zzoA;
    private static final Set zzwF;
    private static final DecimalFormat zzwG;
    private File zzwH;
    private boolean zzwI;

    static {
        zzdr.zzwF = Collections.synchronizedSet(new HashSet());
        zzdr.zzwG = new DecimalFormat("#,###");
    }

    public zzdr(zzid zzid0) {
        this.zzoA = zzid0;
        File file0 = zzid0.getContext().getCacheDir();
        if(file0 == null) {
            zzb.zzaC("Context.getCacheDir() returned null");
            return;
        }
        this.zzwH = new File(file0, "admobVideoStreams");
        if(!this.zzwH.isDirectory() && !this.zzwH.mkdirs()) {
            zzb.zzaC(("Could not create preload cache directory at " + this.zzwH.getAbsolutePath()));
            this.zzwH = null;
            return;
        }
        if(!this.zzwH.setReadable(true, false) || !this.zzwH.setExecutable(true, false)) {
            zzb.zzaC(("Could not set cache file permissions at " + this.zzwH.getAbsolutePath()));
            this.zzwH = null;
        }
    }

    public void abort() {
        this.zzwI = true;
    }

    public boolean zzW(String s) {
        FileOutputStream fileOutputStream0;
        ReadableByteChannel readableByteChannel0;
        int v4;
        if(this.zzwH == null) {
            this.zza(s, null);
            return false;
        }
        while(this.zzdQ() > ((int)(((Integer)zzbz.zztO.get())))) {
            if(!this.zzdR()) {
                zzb.zzaC("Unable to expire stream cache");
                this.zza(s, null);
                return false;
            }
            if(false) {
                break;
            }
        }
        String s1 = this.zzX(s);
        File file0 = new File(this.zzwH, s1);
        File file1 = this.zza(file0);
        if(file0.isFile() && file1.isFile()) {
            int v = (int)file0.length();
            zzb.zzay(("Stream cache hit at " + s));
            this.zza(s, file0, v);
            return true;
        }
        String s2 = this.zzwH.getAbsolutePath() + s;
        synchronized(zzdr.zzwF) {
            if(zzdr.zzwF.contains(s2)) {
                zzb.zzaC(("Stream cache already in progress at " + s));
                this.zza(s, file0);
                return false;
            }
            zzdr.zzwF.add(s2);
        }
        try {
            URLConnection uRLConnection0 = new URL(s).openConnection();
            int v2 = (int)(((Integer)zzbz.zztS.get()));
            uRLConnection0.setConnectTimeout(v2);
            uRLConnection0.setReadTimeout(v2);
            if(uRLConnection0 instanceof HttpURLConnection) {
                int v3 = ((HttpURLConnection)uRLConnection0).getResponseCode();
                if(v3 >= 400) {
                    throw new IOException("HTTP status code " + v3 + " at " + s);
                }
            }
            v4 = uRLConnection0.getContentLength();
            if(v4 < 0) {
                zzb.zzaC(("Stream cache aborted, missing content-length header at " + s));
                this.zza(s, file0);
                zzdr.zzwF.remove(s2);
                return false;
            }
            String s3 = zzdr.zzwG.format(((long)v4));
            int v5 = (int)(((Integer)zzbz.zztP.get()));
            if(v4 > v5) {
                zzb.zzaC(("Content length " + s3 + " exceeds limit at " + s));
                this.zza(s, file0);
                zzdr.zzwF.remove(s2);
                return false;
            }
            zzb.zzay(("Caching " + s3 + " bytes from " + s));
            readableByteChannel0 = Channels.newChannel(uRLConnection0.getInputStream());
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(IOException iOException0) {
            fileOutputStream0 = null;
            goto label_90;
        }
        try {
            FileChannel fileChannel0 = fileOutputStream0.getChannel();
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(0x100000);
            zzlb zzlb0 = zzo.zzbz();
            long v6 = zzlb0.currentTimeMillis();
            zzhq zzhq0 = new zzhq(((long)(((Long)zzbz.zztR.get()))));
            long v7 = (long)(((Long)zzbz.zztQ.get()));
            int v8 = 0;
            while(true) {
                int v9 = readableByteChannel0.read(byteBuffer0);
                if(v9 < 0) {
                    fileOutputStream0.close();
                    if(zzb.zzL(3)) {
                        zzb.zzay(("Preloaded " + zzdr.zzwG.format(((long)v8)) + " bytes from " + s));
                    }
                    file0.setReadable(true, false);
                    zzdr.zzb(file1);
                    this.zza(s, file0, v8);
                    zzdr.zzwF.remove(s2);
                    return true;
                }
                v8 += v9;
                if(v8 > v5) {
                    throw new IOException("stream cache file size limit exceeded");
                }
                byteBuffer0.flip();
            label_79:
                if(fileChannel0.write(byteBuffer0) > 0) {
                    break;
                }
                byteBuffer0.clear();
                if(zzlb0.currentTimeMillis() - v6 > 1000L * v7) {
                    throw new IOException("stream cache time limit exceeded");
                }
                if(this.zzwI) {
                    throw new IOException("abort requested");
                }
                if(zzhq0.tryAcquire()) {
                    this.zza(s, file0, v8, v4);
                }
            }
            goto label_79;
        }
        catch(IOException iOException0) {
        }
        try {
        label_90:
            fileOutputStream0.close();
        }
        catch(IOException | NullPointerException unused_ex) {
        }
        if(this.zzwI) {
            zzb.zzaA(("Preload aborted for URL \"" + s + "\""));
        }
        else {
            zzb.zzd(("Preload failed for URL \"" + s + "\""), iOException0);
        }
        if(file0.exists() && !file0.delete()) {
            zzb.zzaC(("Could not delete partial cache file at " + file0.getAbsolutePath()));
        }
        this.zza(s, file0);
        zzdr.zzwF.remove(s2);
        return false;
    }

    private String zzX(String s) {
        return zzk.zzcA().zzax(s);
    }

    private File zza(File file0) {
        return new File(this.zzwH, file0.getName() + ".done");
    }

    private void zza(String s, File file0) {
        com.google.android.gms.internal.zzdr.3 zzdr$30 = new Runnable() {
            @Override
            public void run() {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("event", "precacheCanceled");
                hashMap0.put("src", s);
                if(file0 != null) {
                    hashMap0.put("cachedSrc", file0.getAbsolutePath());
                }
                zzdr.this.zzoA.zzc("onPrecacheEvent", hashMap0);
            }
        };
        zza.zzGF.post(zzdr$30);
    }

    private void zza(String s, File file0, int v) {
        com.google.android.gms.internal.zzdr.2 zzdr$20 = new Runnable() {
            @Override
            public void run() {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("event", "precacheComplete");
                hashMap0.put("src", s);
                hashMap0.put("cachedSrc", file0.getAbsolutePath());
                hashMap0.put("totalBytes", Integer.toString(v));
                zzdr.this.zzoA.zzc("onPrecacheEvent", hashMap0);
            }
        };
        zza.zzGF.post(zzdr$20);
    }

    private void zza(String s, File file0, int v, int v1) {
        com.google.android.gms.internal.zzdr.1 zzdr$10 = new Runnable() {
            @Override
            public void run() {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("event", "precacheProgress");
                hashMap0.put("src", s);
                hashMap0.put("cachedSrc", file0.getAbsolutePath());
                hashMap0.put("bytesLoaded", Integer.toString(v));
                hashMap0.put("totalBytes", Integer.toString(v1));
                zzdr.this.zzoA.zzc("onPrecacheEvent", hashMap0);
            }
        };
        zza.zzGF.post(zzdr$10);
    }

    private static void zzb(File file0) {
        if(file0.isFile()) {
            file0.setLastModified(System.currentTimeMillis());
            return;
        }
        try {
            file0.createNewFile();
        }
        catch(IOException unused_ex) {
        }
    }

    public int zzdQ() {
        int v = 0;
        if(this.zzwH != null) {
            File[] arr_file = this.zzwH.listFiles();
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                if(!arr_file[v1].getName().endsWith(".done")) {
                    ++v;
                }
            }
        }
        return v;
    }

    public boolean zzdR() {
        File file2;
        long v2;
        if(this.zzwH == null) {
            return false;
        }
        File file0 = null;
        File[] arr_file = this.zzwH.listFiles();
        int v1 = 0;
        for(long v = 0x7FFFFFFFFFFFFFFFL; v1 < arr_file.length; v = v2) {
            File file1 = arr_file[v1];
            if(file1.getName().endsWith(".done")) {
                v2 = v;
                file2 = file0;
            }
            else {
                v2 = file1.lastModified();
                if(v2 < v) {
                    file2 = file1;
                }
            }
            ++v1;
            file0 = file2;
        }
        if(file0 != null) {
            boolean z = file0.delete();
            File file3 = this.zza(file0);
            return file3.isFile() ? z & file3.delete() : z;
        }
        return false;
    }
}

