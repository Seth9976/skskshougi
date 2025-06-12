package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.internal.zzu;

class zzb extends RelativeLayout {
    private static final float[] zzve;
    private final RelativeLayout zzvf;

    static {
        zzb.zzve = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    }

    public zzb(Context context0, zza zza0) {
        super(context0);
        zzu.zzu(zza0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule(11);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(zzb.zzve, null, null));
        shapeDrawable0.getPaint().setColor(zza0.getBackgroundColor());
        this.zzvf = new RelativeLayout(context0);
        this.zzvf.setLayoutParams(relativeLayout$LayoutParams0);
        zzo.zzbx().zza(this.zzvf, shapeDrawable0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        TextView textView0 = new TextView(context0);
        textView0.setLayoutParams(relativeLayout$LayoutParams1);
        textView0.setId(0x47470001);
        textView0.setTypeface(Typeface.DEFAULT);
        textView0.setText(zza0.getText());
        textView0.setTextColor(zza0.zzdu());
        textView0.setTextSize(((float)zza0.getTextSize()));
        textView0.setPadding(zzk.zzcA().zzb(context0, 4), 0, zzk.zzcA().zzb(context0, 4), 0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(1, textView0.getId());
        ImageView imageView0 = new ImageView(context0);
        imageView0.setLayoutParams(relativeLayout$LayoutParams2);
        imageView0.setId(0x47470002);
        imageView0.setImageDrawable(zza0.getIcon());
        this.zzvf.addView(textView0);
        this.zzvf.addView(imageView0);
        this.addView(this.zzvf);
    }

    public ViewGroup zzdv() {
        return this.zzvf;
    }
}

