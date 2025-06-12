package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class zzkh {
    public static Bitmap zza(Bitmap bitmap0) {
        int v3;
        int v = 0;
        if(bitmap0 == null) {
            return null;
        }
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        if(v1 >= v2) {
            v = v1 / 2 - v2 / 2;
            v3 = 0;
        }
        else {
            v3 = v2 / 2 - v1 / 2;
            v2 = v1;
        }
        Bitmap bitmap1 = Bitmap.createBitmap(v2, v2, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint(1);
        paint0.setColor(0xFF000000);
        canvas0.drawCircle(((float)(v2 / 2)), ((float)(v2 / 2)), ((float)(v2 / 2)), paint0);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas0.drawBitmap(bitmap0, ((float)v), ((float)v3), paint0);
        return bitmap1;
    }

    private static Bitmap zza(Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        if(drawable0 instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable0).getBitmap();
        }
        Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
        drawable0.draw(canvas0);
        return bitmap0;
    }

    public static Drawable zza(Resources resources0, Drawable drawable0) {
        return new BitmapDrawable(resources0, zzkh.zza(zzkh.zza(drawable0)));
    }
}

