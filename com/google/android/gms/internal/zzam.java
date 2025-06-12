package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzam extends zzal {
    class zza {
        private String zznr;
        private boolean zzns;
        final zzam zznt;

        public zza(String s, boolean z) {
            this.zznr = s;
            this.zzns = z;
        }

        public String getId() {
            return this.zznr;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzns;
        }
    }

    static final class zzb implements Runnable {
        private Context zznu;

        public zzb(Context context0) {
            this.zznu = context0.getApplicationContext();
            if(this.zznu == null) {
                this.zznu = context0;
            }
        }

        @Override
        public void run() {
            try {
                AdvertisingIdClient advertisingIdClient0 = new AdvertisingIdClient(this.zznu);
                advertisingIdClient0.start();
                Class class0 = zzam.class;
                synchronized(class0) {
                    if(zzam.zznn == null) {
                        zzam.zznn = advertisingIdClient0;
                    }
                    else {
                        advertisingIdClient0.finish();
                    }
                }
            }
            catch(GooglePlayServicesNotAvailableException unused_ex) {
                zzam.zznp = true;
            }
            catch(IOException | GooglePlayServicesRepairableException unused_ex) {
            }
            zzam.zzno.countDown();
        }
    }

    private static AdvertisingIdClient zznn;
    private static CountDownLatch zzno;
    private static boolean zznp;
    private boolean zznq;

    static {
        zzam.zznn = null;
        zzam.zzno = new CountDownLatch(1);
    }

    protected zzam(Context context0, zzap zzap0, zzaq zzaq0, boolean z) {
        super(context0, zzap0, zzaq0);
        this.zznq = z;
    }

    zza zzY() throws IOException {
        synchronized(zzam.class) {
            try {
                if(!zzam.zzno.await(2L, TimeUnit.SECONDS)) {
                    return new zza(this, null, false);
                }
            }
            catch(InterruptedException unused_ex) {
                return new zza(this, null, false);
            }
        }
        if(zzam.zznn == null) {
            return new zza(this, null, false);
        }
        Info advertisingIdClient$Info0 = zzam.zznn.getInfo();
        return new zza(this, this.zzk(advertisingIdClient$Info0.getId()), advertisingIdClient$Info0.isLimitAdTrackingEnabled());
    }

    public static zzam zza(String s, Context context0, boolean z) {
        zzah zzah0 = new zzah();
        zzam.zza(s, context0, zzah0);
        if(z) {
            synchronized(zzam.class) {
                if(zzam.zznn == null) {
                    new Thread(new zzb(context0)).start();
                }
            }
        }
        return new zzam(context0, zzah0, new zzas(0xEF), z);
    }

    @Override  // com.google.android.gms.internal.zzal
    protected void zzc(Context context0) {
        super.zzc(context0);
        try {
            if(zzam.zznp || !this.zznq) {
                this.zza(24, zzam.zze(context0));
                return;
            }
            zza zzam$zza0 = this.zzY();
            String s = zzam$zza0.getId();
            if(s == null) {
                return;
            }
            this.zza(28, (zzam$zza0.isLimitAdTrackingEnabled() ? 1L : 0L));
            this.zza(26, 5L);
            this.zza(24, s);
        }
        catch(IOException unused_ex) {
        }
        catch(com.google.android.gms.internal.zzal.zza unused_ex) {
        }
    }
}

