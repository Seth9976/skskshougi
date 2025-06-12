package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbb;
import com.google.android.gms.internal.zzgd;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzg {
    public interface zza {
        String getCustomTemplateId();

        void zza(zzg arg1);

        String zzdE();

        com.google.android.gms.ads.internal.formats.zza zzdF();
    }

    private final Context mContext;
    private final Object zzqt;
    private final zzan zzvA;
    private boolean zzvB;
    private final zzm zzvw;
    private final JSONObject zzvx;
    private final zzbb zzvy;
    private final zza zzvz;

    public zzg(Context context0, zzm zzm0, zzbb zzbb0, zzan zzan0, JSONObject jSONObject0, zza zzg$zza0) {
        this.zzqt = new Object();
        this.mContext = context0;
        this.zzvw = zzm0;
        this.zzvy = zzbb0;
        this.zzvA = zzan0;
        this.zzvx = jSONObject0;
        this.zzvz = zzg$zza0;
    }

    public void performClick(String assetId) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("asset", assetId);
            jSONObject0.put("template", this.zzvz.zzdE());
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("ad", this.zzvx);
            jSONObject1.put("click", jSONObject0);
            String s1 = this.zzvz.getCustomTemplateId();
            jSONObject1.put("has_custom_click_handler", this.zzvw.zzq(s1) != null);
            this.zzvy.zza("google.afma.nativeAds.handleClickGmsg", jSONObject1);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Unable to create click JSON.", jSONException0);
        }
    }

    public void recordImpression() {
        this.zzvB = true;
        this.zzvw.zzaP();
    }

    public com.google.android.gms.ads.internal.formats.zzb zza(View.OnClickListener view$OnClickListener0) {
        com.google.android.gms.ads.internal.formats.zza zza0 = this.zzvz.zzdF();
        if(zza0 == null) {
            return null;
        }
        com.google.android.gms.ads.internal.formats.zzb zzb0 = new com.google.android.gms.ads.internal.formats.zzb(this.mContext, zza0);
        zzb0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        zzb0.zzdv().setOnClickListener(view$OnClickListener0);
        return zzb0;
    }

    public void zzb(MotionEvent motionEvent0) {
        this.zzvA.zza(motionEvent0);
    }

    public void zzh(View view0) {
        synchronized(this.zzqt) {
            if(this.zzvB) {
                return;
            }
            if(!view0.isShown()) {
                return;
            }
            if(!view0.getGlobalVisibleRect(new Rect(), null)) {
                return;
            }
            this.recordImpression();
        }
    }
}

