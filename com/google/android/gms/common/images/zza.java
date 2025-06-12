package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzki;
import com.google.android.gms.internal.zzkj;
import java.lang.ref.WeakReference;

public abstract class zza {
    static final class com.google.android.gms.common.images.zza.zza {
        public final Uri uri;

        public com.google.android.gms.common.images.zza.zza(Uri uri0) {
            this.uri = uri0;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof com.google.android.gms.common.images.zza.zza)) {
                return false;
            }
            return this == obj ? true : zzt.equal(((com.google.android.gms.common.images.zza.zza)obj).uri, this.uri);
        }

        @Override
        public int hashCode() {
            return zzt.hashCode(new Object[]{this.uri});
        }
    }

    public static final class zzb extends zza {
        private WeakReference zzZl;

        public zzb(ImageView imageView0, int v) {
            super(null, v);
            com.google.android.gms.common.internal.zzb.zzq(imageView0);
            this.zzZl = new WeakReference(imageView0);
        }

        public zzb(ImageView imageView0, Uri uri0) {
            super(uri0, 0);
            com.google.android.gms.common.internal.zzb.zzq(imageView0);
            this.zzZl = new WeakReference(imageView0);
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof zzb)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            ImageView imageView0 = (ImageView)this.zzZl.get();
            ImageView imageView1 = (ImageView)((zzb)obj).zzZl.get();
            return imageView1 != null && imageView0 != null && zzt.equal(imageView1, imageView0);
        }

        @Override
        public int hashCode() {
            return 0;
        }

        private void zza(ImageView imageView0, Drawable drawable0, boolean z, boolean z1, boolean z2) {
            boolean z3 = !z1 && !z2;
            if(!z3 || !(imageView0 instanceof zzki)) {
            label_4:
                boolean z4 = this.zzb(z, z1);
                Drawable drawable1 = !this.zzZf || drawable0 == null ? drawable0 : drawable0.getConstantState().newDrawable();
                if(z4) {
                    drawable1 = this.zza(imageView0.getDrawable(), drawable1);
                }
                imageView0.setImageDrawable(drawable1);
                if(imageView0 instanceof zzki) {
                    ((zzki)imageView0).zzi((z2 ? this.zzZc.uri : null));
                    ((zzki)imageView0).zzbo((z3 ? this.zzZe : 0));
                }
                if(z4) {
                    ((zzkg)drawable1).startTransition(0xFA);
                }
            }
            else {
                int v = ((zzki)imageView0).zznr();
                if(this.zzZe == 0 || v != this.zzZe) {
                    goto label_4;
                }
            }
        }

        @Override  // com.google.android.gms.common.images.zza
        protected void zza(Drawable drawable0, boolean z, boolean z1, boolean z2) {
            ImageView imageView0 = (ImageView)this.zzZl.get();
            if(imageView0 != null) {
                this.zza(imageView0, drawable0, z, z1, z2);
            }
        }
    }

    public static final class zzc extends zza {
        private WeakReference zzZm;

        public zzc(OnImageLoadedListener imageManager$OnImageLoadedListener0, Uri uri0) {
            super(uri0, 0);
            com.google.android.gms.common.internal.zzb.zzq(imageManager$OnImageLoadedListener0);
            this.zzZm = new WeakReference(imageManager$OnImageLoadedListener0);
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof zzc)) {
                return false;
            }
            if(this == obj) {
                return true;
            }
            OnImageLoadedListener imageManager$OnImageLoadedListener0 = (OnImageLoadedListener)this.zzZm.get();
            OnImageLoadedListener imageManager$OnImageLoadedListener1 = (OnImageLoadedListener)((zzc)obj).zzZm.get();
            return imageManager$OnImageLoadedListener1 != null && imageManager$OnImageLoadedListener0 != null && zzt.equal(imageManager$OnImageLoadedListener1, imageManager$OnImageLoadedListener0) && zzt.equal(((zzc)obj).zzZc, this.zzZc);
        }

        @Override
        public int hashCode() {
            return zzt.hashCode(new Object[]{this.zzZc});
        }

        @Override  // com.google.android.gms.common.images.zza
        protected void zza(Drawable drawable0, boolean z, boolean z1, boolean z2) {
            if(!z1) {
                OnImageLoadedListener imageManager$OnImageLoadedListener0 = (OnImageLoadedListener)this.zzZm.get();
                if(imageManager$OnImageLoadedListener0 != null) {
                    imageManager$OnImageLoadedListener0.onImageLoaded(this.zzZc.uri, drawable0, z2);
                }
            }
        }
    }

    final com.google.android.gms.common.images.zza.zza zzZc;
    protected int zzZd;
    protected int zzZe;
    protected boolean zzZf;
    protected OnImageLoadedListener zzZg;
    private boolean zzZh;
    private boolean zzZi;
    private boolean zzZj;
    protected int zzZk;

    public zza(Uri uri0, int v) {
        this.zzZd = 0;
        this.zzZe = 0;
        this.zzZf = false;
        this.zzZh = true;
        this.zzZi = false;
        this.zzZj = true;
        this.zzZc = new com.google.android.gms.common.images.zza.zza(uri0);
        this.zzZe = v;
    }

    private Drawable zza(Context context0, zzkj zzkj0, int v) {
        Resources resources0 = context0.getResources();
        if(this.zzZk > 0) {
            com.google.android.gms.internal.zzkj.zza zzkj$zza0 = new com.google.android.gms.internal.zzkj.zza(v, this.zzZk);
            Drawable drawable0 = (Drawable)zzkj0.get(zzkj$zza0);
            if(drawable0 == null) {
                drawable0 = resources0.getDrawable(v);
                if((this.zzZk & 1) != 0) {
                    drawable0 = this.zza(resources0, drawable0);
                }
                zzkj0.put(zzkj$zza0, drawable0);
            }
            return drawable0;
        }
        return resources0.getDrawable(v);
    }

    protected Drawable zza(Resources resources0, Drawable drawable0) {
        return zzkh.zza(resources0, drawable0);
    }

    protected zzkg zza(Drawable drawable0, Drawable drawable1) {
        if(drawable0 != null) {
            if(drawable0 instanceof zzkg) {
                drawable0 = ((zzkg)drawable0).zznp();
            }
            return new zzkg(drawable0, drawable1);
        }
        return new zzkg(null, drawable1);
    }

    void zza(Context context0, Bitmap bitmap0, boolean z) {
        com.google.android.gms.common.internal.zzb.zzq(bitmap0);
        if((this.zzZk & 1) != 0) {
            bitmap0 = zzkh.zza(bitmap0);
        }
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(context0.getResources(), bitmap0);
        if(this.zzZg != null) {
            this.zzZg.onImageLoaded(this.zzZc.uri, bitmapDrawable0, true);
        }
        this.zza(bitmapDrawable0, z, false, true);
    }

    void zza(Context context0, zzkj zzkj0) {
        Drawable drawable0 = null;
        if(this.zzZj) {
            if(this.zzZd != 0) {
                drawable0 = this.zza(context0, zzkj0, this.zzZd);
            }
            this.zza(drawable0, false, true, false);
        }
    }

    void zza(Context context0, zzkj zzkj0, boolean z) {
        Drawable drawable0 = this.zzZe == 0 ? null : this.zza(context0, zzkj0, this.zzZe);
        if(this.zzZg != null) {
            this.zzZg.onImageLoaded(this.zzZc.uri, drawable0, false);
        }
        this.zza(drawable0, z, false, false);
    }

    protected abstract void zza(Drawable arg1, boolean arg2, boolean arg3, boolean arg4);

    // 去混淆评级： 低(40)
    protected boolean zzb(boolean z, boolean z1) {
        return this.zzZh && !z1 && (!z || this.zzZi);
    }

    public void zzbm(int v) {
        this.zzZe = v;
    }
}

