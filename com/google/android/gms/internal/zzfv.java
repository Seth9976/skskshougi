package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzgd
public class zzfv extends zzfu {
    private Object zzBx;
    private PopupWindow zzBy;
    private boolean zzBz;

    zzfv(Context context0, zza zzha$zza0, zzid zzid0, com.google.android.gms.internal.zzft.zza zzft$zza0) {
        super(context0, zzha$zza0, zzid0, zzft$zza0);
        this.zzBx = new Object();
        this.zzBz = false;
    }

    @Override  // com.google.android.gms.internal.zzfp
    public void onStop() {
        this.zzfo();
        super.onStop();
    }

    @Override  // com.google.android.gms.internal.zzfu
    protected void zzfn() {
        Window window0 = this.mContext instanceof Activity ? ((Activity)this.mContext).getWindow() : null;
        if(window0 != null && window0.getDecorView() != null && !((Activity)this.mContext).isDestroyed()) {
            FrameLayout frameLayout0 = new FrameLayout(this.mContext);
            frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout0.addView(this.zzoA.getWebView(), -1, -1);
            synchronized(this.zzBx) {
                if(this.zzBz) {
                    return;
                }
                this.zzBy = new PopupWindow(frameLayout0, 1, 1, false);
                this.zzBy.setOutsideTouchable(true);
                this.zzBy.setClippingEnabled(false);
                zzb.zzay("Displaying the 1x1 popup off the screen.");
                try {
                    this.zzBy.showAtLocation(window0.getDecorView(), 0, -1, -1);
                }
                catch(Exception unused_ex) {
                    this.zzBy = null;
                }
            }
        }
    }

    private void zzfo() {
        synchronized(this.zzBx) {
            this.zzBz = true;
            if(this.mContext instanceof Activity && ((Activity)this.mContext).isDestroyed()) {
                this.zzBy = null;
            }
            if(this.zzBy != null) {
                if(this.zzBy.isShowing()) {
                    this.zzBy.dismiss();
                }
                this.zzBy = null;
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzfs
    protected void zzk(zzha zzha0) {
        this.zzfo();
        super.zzk(zzha0);
    }
}

