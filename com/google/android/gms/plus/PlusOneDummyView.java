package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;

public class PlusOneDummyView extends FrameLayout {
    static class zza implements zzd {
        private Context mContext;

        private zza(Context context0) {
            this.mContext = context0;
        }

        zza(Context context0, com.google.android.gms.plus.PlusOneDummyView.1 plusOneDummyView$10) {
            this(context0);
        }

        @Override  // com.google.android.gms.plus.PlusOneDummyView$zzd
        public Drawable getDrawable(int size) {
            return this.mContext.getResources().getDrawable(0x1080004);
        }

        @Override  // com.google.android.gms.plus.PlusOneDummyView$zzd
        public boolean isValid() {
            return true;
        }
    }

    static class zzb implements zzd {
        private Context mContext;

        private zzb(Context context0) {
            this.mContext = context0;
        }

        zzb(Context context0, com.google.android.gms.plus.PlusOneDummyView.1 plusOneDummyView$10) {
            this(context0);
        }

        @Override  // com.google.android.gms.plus.PlusOneDummyView$zzd
        public Drawable getDrawable(int size) {
            String s;
            try {
                Resources resources0 = this.mContext.createPackageContext("com.google.android.gms", 4).getResources();
                switch(size) {
                    case 0: {
                        s = "ic_plusone_small";
                        break;
                    }
                    case 1: {
                        s = "ic_plusone_medium";
                        break;
                    }
                    case 2: {
                        s = "ic_plusone_tall";
                        break;
                    }
                    default: {
                        s = "ic_plusone_standard";
                    }
                }
                return resources0.getDrawable(resources0.getIdentifier(s, "drawable", "com.google.android.gms"));
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                return null;
            }
        }

        @Override  // com.google.android.gms.plus.PlusOneDummyView$zzd
        public boolean isValid() {
            try {
                this.mContext.createPackageContext("com.google.android.gms", 4).getResources();
                return true;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                return false;
            }
        }
    }

    static class zzc implements zzd {
        private Context mContext;

        private zzc(Context context0) {
            this.mContext = context0;
        }

        zzc(Context context0, com.google.android.gms.plus.PlusOneDummyView.1 plusOneDummyView$10) {
            this(context0);
        }

        @Override  // com.google.android.gms.plus.PlusOneDummyView$zzd
        public Drawable getDrawable(int size) {
            String s;
            switch(size) {
                case 0: {
                    s = "ic_plusone_small_off_client";
                    break;
                }
                case 1: {
                    s = "ic_plusone_medium_off_client";
                    break;
                }
                case 2: {
                    s = "ic_plusone_tall_off_client";
                    break;
                }
                default: {
                    s = "ic_plusone_standard_off_client";
                }
            }
            int v1 = this.mContext.getResources().getIdentifier(s, "drawable", "org.dyndns.vivi.SkskShogi");
            return this.mContext.getResources().getDrawable(v1);
        }

        @Override  // com.google.android.gms.plus.PlusOneDummyView$zzd
        public boolean isValid() {
            return this.mContext.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", "org.dyndns.vivi.SkskShogi") != 0 && this.mContext.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", "org.dyndns.vivi.SkskShogi") != 0 && this.mContext.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", "org.dyndns.vivi.SkskShogi") != 0 && this.mContext.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", "org.dyndns.vivi.SkskShogi") != 0;
        }
    }

    interface zzd {
        Drawable getDrawable(int arg1);

        boolean isValid();
    }

    public static final String TAG = "PlusOneDummyView";

    public PlusOneDummyView(Context context, int size) {
        super(context);
        Button button0 = new Button(context);
        button0.setEnabled(false);
        button0.setBackgroundDrawable(this.zzxq().getDrawable(size));
        Point point0 = this.zzix(size);
        this.addView(button0, new FrameLayout.LayoutParams(point0.x, point0.y, 17));
    }

    private Point zzix(int v) {
        int v1 = 24;
        int v2 = 20;
        Point point0 = new Point();
        switch(v) {
            case 0: {
                v2 = 14;
                break;
            }
            case 1: {
                v1 = 0x20;
                break;
            }
            case 2: {
                v1 = 50;
                break;
            }
            default: {
                v1 = 38;
                v2 = 24;
            }
        }
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        float f = TypedValue.applyDimension(1, ((float)v1), displayMetrics0);
        float f1 = TypedValue.applyDimension(1, ((float)v2), displayMetrics0);
        point0.x = (int)(((double)f) + 0.5);
        point0.y = (int)(((double)f1) + 0.5);
        return point0;
    }

    private zzd zzxq() {
        zzd plusOneDummyView$zzd0 = new zzb(this.getContext(), null);
        if(!plusOneDummyView$zzd0.isValid()) {
            plusOneDummyView$zzd0 = new zzc(this.getContext(), null);
        }
        return !plusOneDummyView$zzd0.isValid() ? new zza(this.getContext(), null) : plusOneDummyView$zzd0;
    }

    class com.google.android.gms.plus.PlusOneDummyView.1 {
    }

}

