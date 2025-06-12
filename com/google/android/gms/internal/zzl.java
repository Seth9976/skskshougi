package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class zzl {
    public interface zza {
        void zzg(zzk arg1);
    }

    private AtomicInteger zzY;
    private final Map zzZ;
    private final Set zzaa;
    private final PriorityBlockingQueue zzab;
    private final PriorityBlockingQueue zzac;
    private zzg[] zzad;
    private zzc zzae;
    private List zzaf;
    private final zzb zzj;
    private final zzn zzk;
    private final zzf zzz;

    public zzl(zzb zzb0, zzf zzf0) {
        this(zzb0, zzf0, 4);
    }

    public zzl(zzb zzb0, zzf zzf0, int v) {
        this(zzb0, zzf0, v, new zze(new Handler(Looper.getMainLooper())));
    }

    public zzl(zzb zzb0, zzf zzf0, int v, zzn zzn0) {
        this.zzY = new AtomicInteger();
        this.zzZ = new HashMap();
        this.zzaa = new HashSet();
        this.zzab = new PriorityBlockingQueue();
        this.zzac = new PriorityBlockingQueue();
        this.zzaf = new ArrayList();
        this.zzj = zzb0;
        this.zzz = zzf0;
        this.zzad = new zzg[v];
        this.zzk = zzn0;
    }

    public int getSequenceNumber() {
        return this.zzY.incrementAndGet();
    }

    public void start() {
        this.stop();
        this.zzae = new zzc(this.zzab, this.zzac, this.zzj, this.zzk);
        this.zzae.start();
        for(int v = 0; v < this.zzad.length; ++v) {
            zzg zzg0 = new zzg(this.zzac, this.zzz, this.zzj, this.zzk);
            this.zzad[v] = zzg0;
            zzg0.start();
        }
    }

    public void stop() {
        if(this.zzae != null) {
            this.zzae.quit();
        }
        for(int v = 0; v < this.zzad.length; ++v) {
            if(this.zzad[v] != null) {
                this.zzad[v].quit();
            }
        }
    }

    public zzk zze(zzk zzk0) {
        zzk0.zza(this);
        synchronized(this.zzaa) {
            this.zzaa.add(zzk0);
        }
        zzk0.zza(this.getSequenceNumber());
        zzk0.zzc("add-to-queue");
        if(!zzk0.zzr()) {
            this.zzac.add(zzk0);
            return zzk0;
        }
        synchronized(this.zzZ) {
            String s = zzk0.zzh();
            if(this.zzZ.containsKey(s)) {
                Queue queue0 = (Queue)this.zzZ.get(s);
                if(queue0 == null) {
                    queue0 = new LinkedList();
                }
                queue0.add(zzk0);
                this.zzZ.put(s, queue0);
                if(zzs.DEBUG) {
                    zzs.zza("Request for cacheKey=%s is in flight, putting on hold.", new Object[]{s});
                }
            }
            else {
                this.zzZ.put(s, null);
                this.zzab.add(zzk0);
            }
            return zzk0;
        }
    }

    void zzf(zzk zzk0) {
        Map map0;
        synchronized(this.zzaa) {
            this.zzaa.remove(zzk0);
        }
        synchronized(this.zzaf) {
            for(Object object0: this.zzaf) {
                ((zza)object0).zzg(zzk0);
            }
        }
        if(zzk0.zzr()) {
            map0 = this.zzZ;
            synchronized(map0) {
                String s = zzk0.zzh();
                Queue queue0 = (Queue)this.zzZ.remove(s);
                if(queue0 != null) {
                    if(zzs.DEBUG) {
                        zzs.zza("Releasing %d waiting requests for cacheKey=%s.", new Object[]{queue0.size(), s});
                    }
                    this.zzab.addAll(queue0);
                }
            }
        }
    }
}

