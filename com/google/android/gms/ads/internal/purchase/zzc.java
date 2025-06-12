package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@zzgd
public class zzc extends zzhh implements ServiceConnection {
    private Context mContext;
    private boolean zzAC;
    private zzfj zzAD;
    private zzb zzAE;
    private zzh zzAF;
    private List zzAG;
    private zzk zzAH;
    private final Object zzqt;

    public zzc(Context context0, zzfj zzfj0, zzk zzk0) {
        this(context0, zzfj0, zzk0, new zzb(context0), zzh.zzy(context0.getApplicationContext()));
    }

    zzc(Context context0, zzfj zzfj0, zzk zzk0, zzb zzb0, zzh zzh0) {
        this.zzqt = new Object();
        this.zzAC = false;
        this.mContext = context0;
        this.zzAD = zzfj0;
        this.zzAH = zzk0;
        this.zzAE = zzb0;
        this.zzAF = zzh0;
        this.zzAG = this.zzAF.zzf(10L);
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        synchronized(this.zzqt) {
            this.zzAE.zzK(service);
            this.zzfe();
            this.zzAC = true;
            this.zzqt.notify();
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaA("In-app billing service disconnected.");
        this.zzAE.destroy();
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
        synchronized(this.zzqt) {
            com.google.android.gms.common.stats.zzb.zzoO().zza(this.mContext, this);
            this.zzAE.destroy();
        }
    }

    protected void zza(zzf zzf0, String s, String s1) {
        Intent intent0 = new Intent();
        zzo.zzbF();
        intent0.putExtra("RESPONSE_CODE", 0);
        zzo.zzbF();
        intent0.putExtra("INAPP_PURCHASE_DATA", s);
        zzo.zzbF();
        intent0.putExtra("INAPP_DATA_SIGNATURE", s1);
        com.google.android.gms.ads.internal.purchase.zzc.1 zzc$10 = new Runnable() {
            @Override
            public void run() {
                try {
                    if(zzc.this.zzAH.zza(zzf0.zzAS, -1, intent0)) {
                        zzc.this.zzAD.zza(new zzg(zzc.this.mContext, zzf0.zzAT, true, -1, intent0, zzf0));
                        return;
                    }
                    zzc.this.zzAD.zza(new zzg(zzc.this.mContext, zzf0.zzAT, false, -1, intent0, zzf0));
                }
                catch(RemoteException unused_ex) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to verify and dispatch pending transaction");
                }
            }
        };
        zzhl.zzGk.post(zzc$10);
    }

    private void zzd(long v) {
        do {
            if(!this.zze(v)) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Timeout waiting for pending transaction to be processed.");
            }
        }
        while(!this.zzAC);
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        synchronized(this.zzqt) {
            Intent intent0 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent0.setPackage("com.android.vending");
            com.google.android.gms.common.stats.zzb.zzoO().zza(this.mContext, intent0, this, 1);
            this.zzd(SystemClock.elapsedRealtime());
            com.google.android.gms.common.stats.zzb.zzoO().zza(this.mContext, this);
            this.zzAE.destroy();
        }
    }

    private boolean zze(long v) {
        long v1 = 60000L - (SystemClock.elapsedRealtime() - v);
        if(v1 <= 0L) {
            return false;
        }
        try {
            this.zzqt.wait(v1);
        }
        catch(InterruptedException unused_ex) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    protected void zzfe() {
        if(!this.zzAG.isEmpty()) {
            HashMap hashMap0 = new HashMap();
            for(Object object0: this.zzAG) {
                hashMap0.put(((zzf)object0).zzAT, ((zzf)object0));
            }
            String s = null;
            while(true) {
                Bundle bundle0 = this.zzAE.zzi("org.dyndns.vivi.SkskShogi", s);
                if(bundle0 == null || zzo.zzbF().zzb(bundle0) != 0) {
                    goto label_32;
                }
                ArrayList arrayList0 = bundle0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList arrayList1 = bundle0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList arrayList2 = bundle0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                String s1 = bundle0.getString("INAPP_CONTINUATION_TOKEN");
                for(int v = 0; v < arrayList0.size(); ++v) {
                    if(hashMap0.containsKey(arrayList0.get(v))) {
                        String s2 = (String)arrayList0.get(v);
                        String s3 = (String)arrayList1.get(v);
                        String s4 = (String)arrayList2.get(v);
                        zzf zzf0 = (zzf)hashMap0.get(s2);
                        String s5 = zzo.zzbF().zzai(s3);
                        if(zzf0.zzAS.equals(s5)) {
                            this.zza(zzf0, s3, s4);
                            hashMap0.remove(s2);
                        }
                    }
                }
                if(s1 == null || hashMap0.isEmpty()) {
                    break;
                }
                s = s1;
            }
            Iterator iterator1 = hashMap0.keySet().iterator();
            goto label_33;
        label_32:
            iterator1 = hashMap0.keySet().iterator();
        label_33:
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                this.zzAF.zza(((zzf)hashMap0.get(((String)object1))));
            }
        }
    }
}

