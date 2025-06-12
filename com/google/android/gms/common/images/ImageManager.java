package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzkj;
import com.google.android.gms.internal.zzku;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    final class ImageReceiver extends ResultReceiver {
        private final Uri mUri;
        private final ArrayList zzYX;
        final ImageManager zzYY;

        ImageReceiver(Uri uri) {
            super(new Handler(Looper.getMainLooper()));
            this.mUri = uri;
            this.zzYX = new ArrayList();
        }

        @Override  // android.os.ResultReceiver
        public void onReceiveResult(int resultCode, Bundle resultData) {
            ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)resultData.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.this.zzYR.execute(new zzc(ImageManager.this, this.mUri, parcelFileDescriptor0));
        }

        public void zzb(zza zza0) {
            zzb.zzbY("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zzYX.add(zza0);
        }

        public void zzc(zza zza0) {
            zzb.zzbY("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zzYX.remove(zza0);
        }

        public void zzno() {
            Intent intent0 = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent0.putExtra("com.google.android.gms.extras.uri", this.mUri);
            intent0.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent0.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.mContext.sendBroadcast(intent0);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri arg1, Drawable arg2, boolean arg3);
    }

    static final class com.google.android.gms.common.images.ImageManager.zza {
        static int zza(ActivityManager activityManager0) {
            return activityManager0.getLargeMemoryClass();
        }
    }

    static final class com.google.android.gms.common.images.ImageManager.zzb extends zzku {
        public com.google.android.gms.common.images.ImageManager.zzb(Context context0) {
            super(com.google.android.gms.common.images.ImageManager.zzb.zzag(context0));
        }

        @Override  // com.google.android.gms.internal.zzku
        protected void entryRemoved(boolean x0, Object x1, Object x2, Object x3) {
            this.zza(x0, ((com.google.android.gms.common.images.zza.zza)x1), ((Bitmap)x2), ((Bitmap)x3));
        }

        @Override  // com.google.android.gms.internal.zzku
        protected int sizeOf(Object x0, Object x1) {
            return this.zza(((com.google.android.gms.common.images.zza.zza)x0), ((Bitmap)x1));
        }

        protected int zza(com.google.android.gms.common.images.zza.zza zza$zza0, Bitmap bitmap0) {
            return bitmap0.getHeight() * bitmap0.getRowBytes();
        }

        protected void zza(boolean z, com.google.android.gms.common.images.zza.zza zza$zza0, Bitmap bitmap0, Bitmap bitmap1) {
            super.entryRemoved(z, zza$zza0, bitmap0, bitmap1);
        }

        // 去混淆评级： 低(25)
        private static int zzag(Context context0) {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            return (context0.getApplicationInfo().flags & 0x100000) == 0 ? ((int)(((float)(activityManager0.getMemoryClass() * 0x100000)) * 0.33f)) : ((int)(((float)(com.google.android.gms.common.images.ImageManager.zza.zza(activityManager0) * 0x100000)) * 0.33f));
        }
    }

    final class zzc implements Runnable {
        private final Uri mUri;
        final ImageManager zzYY;
        private final ParcelFileDescriptor zzYZ;

        public zzc(Uri uri0, ParcelFileDescriptor parcelFileDescriptor0) {
            this.mUri = uri0;
            this.zzYZ = parcelFileDescriptor0;
        }

        @Override
        public void run() {
            zzb.zzbZ("LoadBitmapFromDiskRunnable can\'t be executed in the main thread");
            boolean z = false;
            Bitmap bitmap0 = null;
            if(this.zzYZ != null) {
                try {
                    bitmap0 = BitmapFactory.decodeFileDescriptor(this.zzYZ.getFileDescriptor());
                }
                catch(OutOfMemoryError outOfMemoryError0) {
                    Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.mUri, outOfMemoryError0);
                    z = true;
                }
                try {
                    this.zzYZ.close();
                }
                catch(IOException iOException0) {
                    Log.e("ImageManager", "closed failed", iOException0);
                }
            }
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            ImageManager.this.mHandler.post(new zzf(ImageManager.this, this.mUri, bitmap0, z, countDownLatch0));
            try {
                countDownLatch0.await();
            }
            catch(InterruptedException unused_ex) {
                Log.w("ImageManager", "Latch interrupted while posting " + this.mUri);
            }
        }
    }

    final class zzd implements Runnable {
        final ImageManager zzYY;
        private final zza zzZa;

        public zzd(zza zza0) {
            this.zzZa = zza0;
        }

        @Override
        public void run() {
            zzb.zzbY("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageManager$ImageReceiver0 = (ImageReceiver)ImageManager.this.zzYU.get(this.zzZa);
            if(imageManager$ImageReceiver0 != null) {
                ImageManager.this.zzYU.remove(this.zzZa);
                imageManager$ImageReceiver0.zzc(this.zzZa);
            }
            com.google.android.gms.common.images.zza.zza zza$zza0 = this.zzZa.zzZc;
            if(zza$zza0.uri == null) {
                this.zzZa.zza(ImageManager.this.mContext, ImageManager.this.zzYT, true);
                return;
            }
            Bitmap bitmap0 = ImageManager.this.zza(zza$zza0);
            if(bitmap0 != null) {
                this.zzZa.zza(ImageManager.this.mContext, bitmap0, true);
                return;
            }
            Long long0 = (Long)ImageManager.this.zzYW.get(zza$zza0.uri);
            if(long0 != null) {
                if(SystemClock.elapsedRealtime() - ((long)long0) < 3600000L) {
                    this.zzZa.zza(ImageManager.this.mContext, ImageManager.this.zzYT, true);
                    return;
                }
                ImageManager.this.zzYW.remove(zza$zza0.uri);
            }
            this.zzZa.zza(ImageManager.this.mContext, ImageManager.this.zzYT);
            ImageReceiver imageManager$ImageReceiver1 = (ImageReceiver)ImageManager.this.zzYV.get(zza$zza0.uri);
            if(imageManager$ImageReceiver1 == null) {
                imageManager$ImageReceiver1 = new ImageReceiver(ImageManager.this, zza$zza0.uri);
                ImageManager.this.zzYV.put(zza$zza0.uri, imageManager$ImageReceiver1);
            }
            imageManager$ImageReceiver1.zzb(this.zzZa);
            if(!(this.zzZa instanceof com.google.android.gms.common.images.zza.zzc)) {
                ImageManager.this.zzYU.put(this.zzZa, imageManager$ImageReceiver1);
            }
            synchronized(ImageManager.zzYN) {
                if(!ImageManager.zzYO.contains(zza$zza0.uri)) {
                    ImageManager.zzYO.add(zza$zza0.uri);
                    imageManager$ImageReceiver1.zzno();
                }
            }
        }
    }

    static final class zze implements ComponentCallbacks2 {
        private final com.google.android.gms.common.images.ImageManager.zzb zzYS;

        public zze(com.google.android.gms.common.images.ImageManager.zzb imageManager$zzb0) {
            this.zzYS = imageManager$zzb0;
        }

        @Override  // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
        }

        @Override  // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.zzYS.evictAll();
        }

        @Override  // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            if(level >= 60) {
                this.zzYS.evictAll();
                return;
            }
            if(level >= 20) {
                this.zzYS.trimToSize(this.zzYS.size() / 2);
            }
        }
    }

    final class zzf implements Runnable {
        private final Bitmap mBitmap;
        private final Uri mUri;
        final ImageManager zzYY;
        private boolean zzZb;
        private final CountDownLatch zzoD;

        public zzf(Uri uri0, Bitmap bitmap0, boolean z, CountDownLatch countDownLatch0) {
            this.mUri = uri0;
            this.mBitmap = bitmap0;
            this.zzZb = z;
            this.zzoD = countDownLatch0;
        }

        @Override
        public void run() {
            zzb.zzbY("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if(ImageManager.this.zzYS != null) {
                if(this.zzZb) {
                    ImageManager.this.zzYS.evictAll();
                    System.gc();
                    this.zzZb = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                }
                if(z) {
                    ImageManager.this.zzYS.put(new com.google.android.gms.common.images.zza.zza(this.mUri), this.mBitmap);
                }
            }
            ImageReceiver imageManager$ImageReceiver0 = (ImageReceiver)ImageManager.this.zzYV.remove(this.mUri);
            if(imageManager$ImageReceiver0 != null) {
                this.zza(imageManager$ImageReceiver0, z);
            }
            this.zzoD.countDown();
            synchronized(ImageManager.zzYN) {
                ImageManager.zzYO.remove(this.mUri);
            }
        }

        private void zza(ImageReceiver imageManager$ImageReceiver0, boolean z) {
            ArrayList arrayList0 = imageManager$ImageReceiver0.zzYX;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                zza zza0 = (zza)arrayList0.get(v1);
                if(z) {
                    zza0.zza(ImageManager.this.mContext, this.mBitmap, false);
                }
                else {
                    Long long0 = SystemClock.elapsedRealtime();
                    ImageManager.this.zzYW.put(this.mUri, long0);
                    zza0.zza(ImageManager.this.mContext, ImageManager.this.zzYT, false);
                }
                if(!(zza0 instanceof com.google.android.gms.common.images.zza.zzc)) {
                    ImageManager.this.zzYU.remove(zza0);
                }
            }
        }
    }

    private final Context mContext;
    private final Handler mHandler;
    private static final Object zzYN;
    private static HashSet zzYO;
    private static ImageManager zzYP;
    private static ImageManager zzYQ;
    private final ExecutorService zzYR;
    private final com.google.android.gms.common.images.ImageManager.zzb zzYS;
    private final zzkj zzYT;
    private final Map zzYU;
    private final Map zzYV;
    private final Map zzYW;

    static {
        ImageManager.zzYN = new Object();
        ImageManager.zzYO = new HashSet();
    }

    private ImageManager(Context context, boolean withMemoryCache) {
        this.mContext = context.getApplicationContext();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.zzYR = Executors.newFixedThreadPool(4);
        if(withMemoryCache) {
            this.zzYS = new com.google.android.gms.common.images.ImageManager.zzb(this.mContext);
            this.zznl();
        }
        else {
            this.zzYS = null;
        }
        this.zzYT = new zzkj();
        this.zzYU = new HashMap();
        this.zzYV = new HashMap();
        this.zzYW = new HashMap();
    }

    public static ImageManager create(Context context) {
        return ImageManager.zzb(context, false);
    }

    public void loadImage(ImageView imageView, int resId) {
        this.zza(new com.google.android.gms.common.images.zza.zzb(imageView, resId));
    }

    public void loadImage(ImageView imageView, Uri uri) {
        this.zza(new com.google.android.gms.common.images.zza.zzb(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int defaultResId) {
        com.google.android.gms.common.images.zza.zzb zza$zzb0 = new com.google.android.gms.common.images.zza.zzb(imageView, uri);
        zza$zzb0.zzbm(defaultResId);
        this.zza(zza$zzb0);
    }

    public void loadImage(OnImageLoadedListener listener, Uri uri) {
        this.zza(new com.google.android.gms.common.images.zza.zzc(listener, uri));
    }

    public void loadImage(OnImageLoadedListener listener, Uri uri, int defaultResId) {
        com.google.android.gms.common.images.zza.zzc zza$zzc0 = new com.google.android.gms.common.images.zza.zzc(listener, uri);
        zza$zzc0.zzbm(defaultResId);
        this.zza(zza$zzc0);
    }

    private Bitmap zza(com.google.android.gms.common.images.zza.zza zza$zza0) {
        return this.zzYS == null ? null : ((Bitmap)this.zzYS.get(zza$zza0));
    }

    public void zza(zza zza0) {
        zzb.zzbY("ImageManager.loadImage() must be called in the main thread");
        new zzd(this, zza0).run();
    }

    public static ImageManager zzb(Context context0, boolean z) {
        if(z) {
            if(ImageManager.zzYQ == null) {
                ImageManager.zzYQ = new ImageManager(context0, true);
            }
            return ImageManager.zzYQ;
        }
        if(ImageManager.zzYP == null) {
            ImageManager.zzYP = new ImageManager(context0, false);
        }
        return ImageManager.zzYP;
    }

    private void zznl() {
        zze imageManager$zze0 = new zze(this.zzYS);
        this.mContext.registerComponentCallbacks(imageManager$zze0);
    }
}

