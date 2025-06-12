package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.internal.zzav;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {
    public static final class Info {
        private final String zzoh;
        private final boolean zzoi;

        public Info(String advertisingId, boolean limitAdTrackingEnabled) {
            this.zzoh = advertisingId;
            this.zzoi = limitAdTrackingEnabled;
        }

        public String getId() {
            return this.zzoh;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzoi;
        }

        @Override
        public String toString() {
            return "{" + this.zzoh + "}" + this.zzoi;
        }
    }

    static class zza extends Thread {
        private WeakReference zzod;
        private long zzoe;
        CountDownLatch zzof;
        boolean zzog;

        public zza(AdvertisingIdClient advertisingIdClient0, long v) {
            this.zzod = new WeakReference(advertisingIdClient0);
            this.zzoe = v;
            this.zzof = new CountDownLatch(1);
            this.zzog = false;
            this.start();
        }

        public void cancel() {
            this.zzof.countDown();
        }

        private void disconnect() {
            AdvertisingIdClient advertisingIdClient0 = (AdvertisingIdClient)this.zzod.get();
            if(advertisingIdClient0 != null) {
                advertisingIdClient0.finish();
                this.zzog = true;
            }
        }

        @Override
        public void run() {
            try {
                if(!this.zzof.await(this.zzoe, TimeUnit.MILLISECONDS)) {
                    this.disconnect();
                }
            }
            catch(InterruptedException unused_ex) {
                this.disconnect();
            }
        }

        public boolean zzaK() {
            return this.zzog;
        }
    }

    private final Context mContext;
    com.google.android.gms.common.zza zznX;
    zzav zznY;
    boolean zznZ;
    Object zzoa;
    zza zzob;
    final long zzoc;

    public AdvertisingIdClient(Context context) {
        this(context, 30000L);
    }

    public AdvertisingIdClient(Context context, long timeoutInMillis) {
        this.zzoa = new Object();
        zzu.zzu(context);
        this.mContext = context;
        this.zznZ = false;
        this.zzoc = timeoutInMillis;
    }

    @Override
    protected void finalize() throws Throwable {
        this.finish();
        super.finalize();
    }

    public void finish() {
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        synchronized(this) {
            if(this.mContext == null || this.zznX == null) {
                return;
            }
            if(this.zznZ) {
                try {
                    zzb.zzoO().zza(this.mContext, this.zznX);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", illegalArgumentException0);
                }
            }
            this.zznZ = false;
            this.zznY = null;
            this.zznX = null;
        }
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient0 = new AdvertisingIdClient(context, -1L);
        try {
            advertisingIdClient0.zzb(false);
            return advertisingIdClient0.getInfo();
        }
        finally {
            advertisingIdClient0.finish();
        }
    }

    public Info getInfo() throws IOException {
        Info advertisingIdClient$Info0;
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        synchronized(this) {
            if(!this.zznZ) {
                Object object0 = this.zzoa;
                synchronized(object0) {
                    if(this.zzob == null || !this.zzob.zzaK()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    this.zzb(false);
                }
                catch(Exception exception0) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", exception0);
                }
                if(!this.zznZ) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                }
            }
            zzu.zzu(this.zznX);
            zzu.zzu(this.zznY);
            try {
                advertisingIdClient$Info0 = new Info(this.zznY.getId(), this.zznY.zzc(true));
            }
            catch(RemoteException remoteException0) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", remoteException0);
                throw new IOException("Remote exception");
            }
        }
        this.zzaJ();
        return advertisingIdClient$Info0;
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        this.zzb(true);
    }

    static zzav zza(Context context0, com.google.android.gms.common.zza zza0) throws IOException {
        try {
            return com.google.android.gms.internal.zzav.zza.zzb(zza0.zzmh());
        }
        catch(InterruptedException unused_ex) {
            throw new IOException("Interrupted exception");
        }
    }

    private void zzaJ() {
        synchronized(this.zzoa) {
            if(this.zzob != null) {
                this.zzob.cancel();
                try {
                    this.zzob.join();
                }
                catch(InterruptedException unused_ex) {
                }
            }
            if(this.zzoc > 0L) {
                this.zzob = new zza(this, this.zzoc);
            }
        }
    }

    protected void zzb(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        synchronized(this) {
            if(this.zznZ) {
                this.finish();
            }
            this.zznX = AdvertisingIdClient.zzo(this.mContext);
            this.zznY = AdvertisingIdClient.zza(this.mContext, this.zznX);
            this.zznZ = true;
            if(z) {
                this.zzaJ();
            }
        }
    }

    static com.google.android.gms.common.zza zzo(Context context0) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context0.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
        try {
            GooglePlayServicesUtil.zzY(context0);
        }
        catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
            throw new IOException(googlePlayServicesNotAvailableException0);
        }
        com.google.android.gms.common.zza zza0 = new com.google.android.gms.common.zza();
        Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent0.setPackage("com.google.android.gms");
        if(!zzb.zzoO().zza(context0, intent0, zza0, 1)) {
            throw new IOException("Connection failure");
        }
        return zza0;
    }
}

