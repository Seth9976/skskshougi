package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class zzcb {
    private final Context mContext;
    private final String zzqr;
    private int zzuA;
    private int zzuB;
    private int zzuC;
    private String zzuD;
    private BlockingQueue zzuF;
    private ExecutorService zzuG;
    private LinkedHashMap zzuH;
    private AtomicBoolean zzuI;
    private File zzuJ;
    private int zzuz;

    public zzcb(Context context0, String s, String s1, int v, int v1, int v2, int v3, Map map0, int v4) {
        this.zzuH = new LinkedHashMap();
        this.mContext = context0;
        this.zzqr = s;
        this.zzuD = s1;
        this.zzuA = v;
        this.zzuB = v1;
        this.zzuC = v2;
        this.zzq(v3);
        this.zzuI = new AtomicBoolean(false);
        this.zzuI.set(((Boolean)zzbz.zzub.get()).booleanValue());
        if(this.zzuI.get()) {
            File file0 = Environment.getExternalStorageDirectory();
            if(file0 != null) {
                this.zzuJ = new File(file0, "sdk_csi_data.txt");
            }
        }
        for(Object object0: map0.entrySet()) {
            this.zzd(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        if(v4 == 1) {
            this.zzdj();
        }
        if(v4 == 2) {
            this.zzdk();
        }
        this.init();
    }

    private void init() {
        this.zzuF = new ArrayBlockingQueue(this.zzuA);
        this.zzuG = Executors.newSingleThreadExecutor();
        this.zzuG.execute(() -> {
            Iterator iterator0;
            List list0;
            do {
                try {
                    do {
                        list0 = zzcb.this.zzp(zzcb.this.zzuz);
                    }
                    while(list0 == null);
                }
                catch(InterruptedException interruptedException0) {
                    zzb.zzd("CsiReporter:reporter interrupted", interruptedException0);
                    return;
                }
                iterator0 = zzcb.this.zzc(list0).values().iterator();
            label_7:
            }
            while(!iterator0.hasNext());
            Object object0 = iterator0.next();
            zzcb.this.zzc(((Map)object0));
            goto label_7;
        });

        class com.google.android.gms.internal.zzcb.1 implements Runnable {
            @Override
            public void run() {
                zzcb.this.zzdl();
            }
        }

    }

    private void zza(File file0, String s) {
        FileOutputStream fileOutputStream0;
        if(file0 != null) {
            try {
                try {
                    fileOutputStream0 = null;
                    fileOutputStream0 = new FileOutputStream(file0, true);
                    fileOutputStream0.write(s.getBytes());
                    fileOutputStream0.write(10);
                    goto label_22;
                }
                catch(IOException iOException0) {
                }
                zzb.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", iOException0);
                if(fileOutputStream0 != null) {
                    goto label_9;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_16;
            }
            try {
            label_9:
                fileOutputStream0.close();
            }
            catch(IOException iOException1) {
                zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException1);
            }
            return;
        label_16:
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException iOException2) {
                    zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException2);
                }
            }
            throw throwable0;
            try {
            label_22:
                fileOutputStream0.close();
            }
            catch(IOException iOException3) {
                zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", iOException3);
            }
            return;
        }
        zzb.zzaC("CsiReporter: File doesn\'t exists. Cannot write CSI data to file.");
    }

    String zza(String s, Map map0) {
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        for(Object object0: map0.entrySet()) {
            uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return uri$Builder0.build().toString();
    }

    public boolean zza(zzce zzce0) {
        return this.zzuF.offer(zzce0);
    }

    private void zzb(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            this.zzd("eid", TextUtils.join(",", list0));
        }
    }

    private boolean zzc(Map map0) {
        boolean z = false;
        for(int v = 0; !z && v < this.zzuB; ++v) {
            try {
                Thread.sleep(this.zzuC);
                String s = this.zza(this.zzuD, map0);
                if(this.zzuI.get()) {
                    this.zza(this.zzuJ, s);
                }
                else {
                    zzo.zzbv().zzc(this.mContext, this.zzqr, s);
                }
                z = true;
            }
            catch(InterruptedException interruptedException0) {
                zzb.zzd("CsiReporter: interrupted in sendReport()", interruptedException0);
                Thread.currentThread().interrupt();
            }
        }
        return z;
    }

    Map zzc(List list0) {
        Map map1;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: list0) {
            zzce zzce0 = (zzce)object0;
            String s = zzce0.zzdr();
            if(linkedHashMap0.containsKey(s)) {
                ((List)linkedHashMap0.get(s)).add(zzce0);
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(zzce0);
                linkedHashMap0.put(s, arrayList0);
            }
        }
        Map map0 = new LinkedHashMap();
        for(Object object1: linkedHashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            List list1 = (List)map$Entry0.getValue();
            LinkedHashMap linkedHashMap1 = new LinkedHashMap(this.zzuH);
            try {
                map1 = zzce.zza(((zzce[])list1.toArray(new zzce[list1.size()])));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzb.zzd(("CsiReporter:failed to merge tickers:" + list1), illegalArgumentException0);
                continue;
            }
            linkedHashMap1.putAll(map1);
            map0.put(map$Entry0.getKey(), linkedHashMap1);
        }
        return map0;
    }

    void zzd(String s, String s1) {
        this.zzuH.put(s, s1);
    }

    private void zzdj() {
        this.zzb(zzbz.zzdb());
    }

    private void zzdk() {
        this.zzb(zzbz.zzx(this.mContext));
    }

    // 检测为 lambda 实现。
    private void zzdl() {
        Iterator iterator0;
        List list0;
        do {
            try {
                do {
                    list0 = this.zzp(this.zzuz);
                }
                while(list0 == null);
            }
            catch(InterruptedException interruptedException0) {
                zzb.zzd("CsiReporter:reporter interrupted", interruptedException0);
                return;
            }
            iterator0 = this.zzc(list0).values().iterator();
        label_7:
        }
        while(!iterator0.hasNext());
        Object object0 = iterator0.next();
        this.zzc(((Map)object0));
        goto label_7;
    }

    private List zzp(int v) throws InterruptedException {
        List list0 = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(this.zzuF.take());
        }
        return list0;
    }

    private void zzq(int v) {
        if(v < 1) {
            zzb.zzaC(("CsiReporter - too small batch size :" + v + ", changed to 1"));
            v = 1;
        }
        if(v > this.zzuA) {
            zzb.zzaC(("CsiReporter - batch size :" + v + " bigger than buffer size, " + "change to buffer limit"));
            v = this.zzuA;
        }
        this.zzuz = v;
    }
}

