package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzam;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhk;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@zzgd
class zzg implements zzaj, Runnable {
    private final List zzoB;
    private final AtomicReference zzoC;
    CountDownLatch zzoD;
    private zzp zzon;

    public zzg(zzp zzp0) {
        this.zzoB = new Vector();
        this.zzoC = new AtomicReference();
        this.zzoD = new CountDownLatch(1);
        this.zzon = zzp0;
        if(zzk.zzcA().zzgw()) {
            zzhk.zza(this);
            return;
        }
        this.run();
    }

    @Override
    public void run() {
        try {
            boolean z = !((Boolean)zzbz.zztU.get()).booleanValue() || this.zzon.zzpJ.zzGJ;
            this.zza(this.zzb(this.zzon.zzpJ.zzGG, this.zzp(this.zzon.zzpH), z));
        }
        finally {
            this.zzoD.countDown();
            this.zzon = null;
        }
    }

    @Override  // com.google.android.gms.internal.zzaj
    public String zza(Context context0, String s) {
        if(this.zzbe()) {
            zzaj zzaj0 = (zzaj)this.zzoC.get();
            if(zzaj0 != null) {
                this.zzbf();
                return zzaj0.zza(this.zzp(context0), s);
            }
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.zzaj
    public void zza(int v, int v1, int v2) {
        zzaj zzaj0 = (zzaj)this.zzoC.get();
        if(zzaj0 != null) {
            this.zzbf();
            zzaj0.zza(v, v1, v2);
            return;
        }
        this.zzoB.add(new Object[]{v, v1, v2});
    }

    @Override  // com.google.android.gms.internal.zzaj
    public void zza(MotionEvent motionEvent0) {
        zzaj zzaj0 = (zzaj)this.zzoC.get();
        if(zzaj0 != null) {
            this.zzbf();
            zzaj0.zza(motionEvent0);
            return;
        }
        this.zzoB.add(new Object[]{motionEvent0});
    }

    protected void zza(zzaj zzaj0) {
        this.zzoC.set(zzaj0);
    }

    protected zzaj zzb(String s, Context context0, boolean z) {
        return zzam.zza(s, context0, z);
    }

    @Override  // com.google.android.gms.internal.zzaj
    public String zzb(Context context0) {
        if(this.zzbe()) {
            zzaj zzaj0 = (zzaj)this.zzoC.get();
            if(zzaj0 != null) {
                this.zzbf();
                return zzaj0.zzb(this.zzp(context0));
            }
        }
        return "";
    }

    protected boolean zzbe() {
        try {
            this.zzoD.await();
            return true;
        }
        catch(InterruptedException interruptedException0) {
            zzb.zzd("Interrupted during GADSignals creation.", interruptedException0);
            return false;
        }
    }

    private void zzbf() {
        if(this.zzoB.isEmpty()) {
            return;
        }
        for(Object object0: this.zzoB) {
            Object[] arr_object = (Object[])object0;
            if(arr_object.length == 1) {
                ((zzaj)this.zzoC.get()).zza(((MotionEvent)arr_object[0]));
            }
            else if(arr_object.length == 3) {
                ((zzaj)this.zzoC.get()).zza(((int)(((Integer)arr_object[0]))), ((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))));
            }
        }
        this.zzoB.clear();
    }

    private Context zzp(Context context0) {
        if(!((Boolean)zzbz.zztM.get()).booleanValue()) {
            return context0;
        }
        Context context1 = context0.getApplicationContext();
        return context1 == null ? context0 : context1;
    }
}

