package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class Cocos2dxBitmap {
    private static final int HORIZONTAL_ALIGN_CENTER = 3;
    private static final int HORIZONTAL_ALIGN_LEFT = 1;
    private static final int HORIZONTAL_ALIGN_RIGHT = 2;
    private static final int VERTICAL_ALIGN_BOTTOM = 2;
    private static final int VERTICAL_ALIGN_CENTER = 3;
    private static final int VERTICAL_ALIGN_TOP = 1;
    private static Context sContext;

    public static boolean createTextBitmapShadowStroke(byte[] bytes, String fontName, int fontSize, int fontTintR, int fontTintG, int fontTintB, int fontTintA, int alignment, int width, int height, boolean shadow, float shadowDX, float shadowDY, float shadowBlur, float shadowOpacity, boolean stroke, int strokeR, int strokeG, int strokeB, int strokeA, float strokeSize) {
        if(bytes == null || bytes.length == 0) {
            return false;
        }
        String string = new String(bytes);
        Layout.Alignment hAlignment = Layout.Alignment.ALIGN_NORMAL;
        switch(alignment & 15) {
            case 2: {
                hAlignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            }
            case 3: {
                hAlignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        TextPaint textPaint0 = Cocos2dxBitmap.newPaint(fontName, fontSize);
        if(stroke) {
            textPaint0.setStyle(Paint.Style.STROKE);
            textPaint0.setStrokeWidth(strokeSize);
        }
        StaticLayout staticLayout = new StaticLayout(string, textPaint0, (width > 0 ? width : ((int)Math.ceil(StaticLayout.getDesiredWidth(string, textPaint0)))), hAlignment, 1.0f, 0.0f, false);
        int v12 = staticLayout.getWidth();
        int v13 = staticLayout.getLineTop(staticLayout.getLineCount());
        int v14 = Math.max(v12, width);
        int bitmapHeight = height <= 0 ? v13 : height;
        int offsetX = 0;
        if(v14 == 0 || bitmapHeight == 0) {
            return false;
        }
        switch(alignment & 15) {
            case 2: {
                offsetX = v14 - v12;
                break;
            }
            case 3: {
                offsetX = (v14 - v12) / 2;
            }
        }
        int offsetY = 0;
        switch(alignment >> 4 & 15) {
            case 2: {
                offsetY = bitmapHeight - v13;
                break;
            }
            case 3: {
                offsetY = (bitmapHeight - v13) / 2;
            }
        }
        Bitmap bitmap0 = Bitmap.createBitmap(v14, bitmapHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap0);
        canvas.translate(((float)offsetX), ((float)offsetY));
        if(stroke) {
            textPaint0.setARGB(strokeA, strokeR, strokeG, strokeB);
            staticLayout.draw(canvas);
        }
        textPaint0.setStyle(Paint.Style.FILL);
        textPaint0.setARGB(fontTintA, fontTintR, fontTintG, fontTintB);
        staticLayout.draw(canvas);
        Cocos2dxBitmap.initNativeObject(bitmap0);
        return true;
    }

    public static int getFontSizeAccordingHeight(int height) {
        TextPaint paint = new TextPaint();
        Rect bounds = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        int text_size = 1;
        boolean found_desired_size = false;
        while(!found_desired_size) {
            paint.setTextSize(((float)text_size));
            paint.getTextBounds("SghMNy", 0, 6, bounds);
            ++text_size;
            if(height - bounds.height() <= 2) {
                found_desired_size = true;
            }
        }
        return text_size;
    }

    private static byte[] getPixels(Bitmap bitmap) {
        if(bitmap != null) {
            byte[] pixels = new byte[bitmap.getWidth() * bitmap.getHeight() * 4];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(pixels);
            byteBuffer0.order(ByteOrder.nativeOrder());
            bitmap.copyPixelsToBuffer(byteBuffer0);
            return pixels;
        }
        return null;
    }

    private static String getStringWithEllipsis(String string, float width, float fontSize) {
        if(TextUtils.isEmpty(string)) {
            return "";
        }
        TextPaint paint = new TextPaint();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(fontSize);
        return TextUtils.ellipsize(string, paint, width, TextUtils.TruncateAt.END).toString();
    }

    private static void initNativeObject(Bitmap bitmap) {
        byte[] arr_b = Cocos2dxBitmap.getPixels(bitmap);
        if(arr_b == null) {
            return;
        }
        Cocos2dxBitmap.nativeInitBitmapDC(bitmap.getWidth(), bitmap.getHeight(), arr_b);
    }

    private static native void nativeInitBitmapDC(int arg0, int arg1, byte[] arg2) {
    }

    private static TextPaint newPaint(String fontName, int fontSize) {
        TextPaint paint = new TextPaint();
        paint.setTextSize(((float)fontSize));
        paint.setAntiAlias(true);
        if(fontName.endsWith(".ttf")) {
            try {
                paint.setTypeface(Cocos2dxTypefaces.get(Cocos2dxBitmap.sContext, fontName));
            }
            catch(Exception unused_ex) {
                Log.e("Cocos2dxBitmap", "error to create ttf type face: " + fontName);
                paint.setTypeface(Typeface.create(fontName, 0));
            }
            return paint;
        }
        paint.setTypeface(Typeface.create(fontName, 0));
        return paint;
    }

    public static void setContext(Context context) {
        Cocos2dxBitmap.sContext = context;
    }
}

