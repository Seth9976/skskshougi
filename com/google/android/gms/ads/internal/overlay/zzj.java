package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zzj extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzAo;
    private final zzl zzAp;

    public zzj(Context context0, int v, zzl zzl0) {
        super(context0);
        this.zzAp = zzl0;
        this.setOnClickListener(this);
        this.zzAo = new ImageButton(context0);
        this.zzAo.setImageResource(0x1080017);
        this.zzAo.setBackgroundColor(0);
        this.zzAo.setOnClickListener(this);
        this.zzAo.setPadding(0, 0, 0, 0);
        this.zzAo.setContentDescription("Interstitial close button");
        int v1 = zzk.zzcA().zzb(context0, v);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, v1, 17);
        this.addView(this.zzAo, frameLayout$LayoutParams0);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view) {
        if(this.zzAp != null) {
            this.zzAp.zzes();
        }
    }

    public void zza(boolean z, boolean z1) {
        if(z1) {
            if(z) {
                this.zzAo.setVisibility(4);
                return;
            }
            this.zzAo.setVisibility(8);
            return;
        }
        this.zzAo.setVisibility(0);
    }
}

