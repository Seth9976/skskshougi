package com.google.android.gms.internal;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public class zzfq implements Runnable {
    public final class zza extends AsyncTask {
        private final WebView zzBl;
        private Bitmap zzBm;
        final zzfq zzBn;

        public zza(WebView webView0) {
            this.zzBl = webView0;
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] x0) {
            return this.zza(((Void[])x0));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object x0) {
            this.zza(((Boolean)x0));
        }

        @Override  // android.os.AsyncTask
        protected void onPreExecute() {
            synchronized(this) {
                this.zzBm = Bitmap.createBitmap(zzfq.this.zznM, zzfq.this.zznN, Bitmap.Config.ARGB_8888);
                this.zzBl.setVisibility(0);
                int v1 = View.MeasureSpec.makeMeasureSpec(zzfq.this.zznM, 0);
                int v2 = View.MeasureSpec.makeMeasureSpec(zzfq.this.zznN, 0);
                this.zzBl.measure(v1, v2);
                this.zzBl.layout(0, 0, zzfq.this.zznM, zzfq.this.zznN);
                Canvas canvas0 = new Canvas(this.zzBm);
                this.zzBl.draw(canvas0);
                this.zzBl.invalidate();
            }
        }

        protected Boolean zza(Void[] arr_void) {
            Boolean boolean0;
            synchronized(this) {
                int v1 = this.zzBm.getWidth();
                int v2 = this.zzBm.getHeight();
                if(v1 != 0 && v2 != 0) {
                    int v4 = 0;
                    for(int v3 = 0; v3 < v1; v3 += 10) {
                        for(int v5 = 0; v5 < v2; v5 += 10) {
                            if(this.zzBm.getPixel(v3, v5) != 0) {
                                ++v4;
                            }
                        }
                    }
                    boolean0 = Boolean.valueOf(((double)v4) / (((double)(v1 * v2)) / 100.0) > 0.1);
                }
                else {
                    boolean0 = Boolean.FALSE;
                }
                return boolean0;
            }
        }

        protected void zza(Boolean boolean0) {
            zzfq.zzc(zzfq.this);
            if(boolean0.booleanValue() || zzfq.this.zzfl() || zzfq.this.zzBh <= 0L) {
                zzfq.this.zzBk = boolean0.booleanValue();
                zzfq.this.zzBi.zza(zzfq.this.zzoA, true);
                return;
            }
            if(zzfq.this.zzBh > 0L) {
                if(zzb.zzL(2)) {
                    zzb.zzay("Ad not detected, scheduling another run.");
                }
                zzfq.this.zzBf.postDelayed(zzfq.this, zzfq.this.zzBg);
            }
        }
    }

    private final Handler zzBf;
    private final long zzBg;
    private long zzBh;
    private com.google.android.gms.internal.zzie.zza zzBi;
    protected boolean zzBj;
    protected boolean zzBk;
    private final int zznM;
    private final int zznN;
    protected final zzid zzoA;

    public zzfq(com.google.android.gms.internal.zzie.zza zzie$zza0, zzid zzid0, int v, int v1) {
        this(zzie$zza0, zzid0, v, v1, 200L, 50L);
    }

    public zzfq(com.google.android.gms.internal.zzie.zza zzie$zza0, zzid zzid0, int v, int v1, long v2, long v3) {
        this.zzBg = v2;
        this.zzBh = v3;
        this.zzBf = new Handler(Looper.getMainLooper());
        this.zzoA = zzid0;
        this.zzBi = zzie$zza0;
        this.zzBj = false;
        this.zzBk = false;
        this.zznN = v1;
        this.zznM = v;
    }

    @Override
    public void run() {
        if(this.zzoA == null || this.zzfl()) {
            this.zzBi.zza(this.zzoA, true);
            return;
        }
        new zza(this, this.zzoA.getWebView()).execute(new Void[0]);
    }

    public void zza(AdResponseParcel adResponseParcel0) {
        this.zza(adResponseParcel0, new zzil(this, this.zzoA, adResponseParcel0.zzCR));
    }

    public void zza(AdResponseParcel adResponseParcel0, zzil zzil0) {
        this.zzoA.setWebViewClient(zzil0);
        String s = TextUtils.isEmpty(adResponseParcel0.zzzG) ? null : zzo.zzbv().zzat(adResponseParcel0.zzzG);
        this.zzoA.loadDataWithBaseURL(s, adResponseParcel0.zzCI, "text/html", "UTF-8", null);
    }

    static long zzc(zzfq zzfq0) {
        long v = zzfq0.zzBh - 1L;
        zzfq0.zzBh = v;
        return v;
    }

    public void zzfj() {
        this.zzBf.postDelayed(this, this.zzBg);
    }

    public void zzfk() {
        synchronized(this) {
            this.zzBj = true;
        }
    }

    public boolean zzfl() {
        synchronized(this) {
        }
        return this.zzBj;
    }

    public boolean zzfm() {
        return this.zzBk;
    }
}

