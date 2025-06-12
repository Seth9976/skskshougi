package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzid;
import java.util.HashMap;

@zzgd
public class zzh extends FrameLayout implements zzg {
    private final zzid zzoA;
    private String zzwC;
    private final FrameLayout zzzO;
    private final zzi zzzP;
    private final zzm zzzQ;
    private TextView zzzR;
    private long zzzS;
    private long zzzT;

    public zzh(Context context0, zzid zzid0) {
        super(context0);
        this.zzoA = zzid0;
        this.zzzO = new FrameLayout(context0);
        this.addView(this.zzzO);
        this.zzzP = new zzi(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1, 17);
        this.zzzO.addView(this.zzzP, frameLayout$LayoutParams0);
        this.zzzR = new TextView(context0);
        this.zzzR.setBackgroundColor(0xFF000000);
        this.zzeM();
        this.zzzQ = new zzm(this);
        this.zzzQ.zzeY();
        this.zzzP.zza(this);
    }

    public void destroy() {
        this.zzzQ.cancel();
        this.zzzP.stop();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzg
    public void onPaused() {
        this.zza("pause", new String[0]);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzg
    public void onPrepared(MediaPlayer mediaPlayer) {
        if(this.zzzT == 0L) {
            this.zza("canplaythrough", new String[]{"duration", String.valueOf(((float)mediaPlayer.getDuration()) / 1000.0f), "videoWidth", String.valueOf(mediaPlayer.getVideoWidth()), "videoHeight", String.valueOf(mediaPlayer.getVideoHeight())});
        }
    }

    public void pause() {
        this.zzzP.pause();
    }

    public void play() {
        this.zzzP.play();
    }

    public void seekTo(int millis) {
        this.zzzP.seekTo(millis);
    }

    private void zza(String s, String[] arr_s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", s);
        int v = 0;
        for(String s1 = null; v < arr_s.length; s1 = s2) {
            String s2 = arr_s[v];
            if(s1 != null) {
                hashMap0.put(s1, s2);
                s2 = null;
            }
            ++v;
        }
        this.zzoA.zzc("onVideoEvent", hashMap0);
    }

    public void zza(float f) {
        this.zzzP.zza(f);
    }

    public void zzah(String s) {
        this.zzwC = s;
    }

    public void zzc(MotionEvent motionEvent0) {
        this.zzzP.dispatchTouchEvent(motionEvent0);
    }

    public static void zzd(zzid zzid0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", "no_video_view");
        zzid0.zzc("onVideoEvent", hashMap0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzg
    public void zzeD() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzg
    public void zzeE() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzg
    public void zzeF() {
        this.zza("ended", new String[0]);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzg
    public void zzeG() {
        this.zzeM();
        this.zzzT = this.zzzS;
    }

    public void zzeH() {
        if(!TextUtils.isEmpty(this.zzwC)) {
            this.zzzP.setVideoPath(this.zzwC);
            return;
        }
        this.zza("no_src", new String[0]);
    }

    public void zzeI() {
        this.zzzP.zzeI();
    }

    public void zzeJ() {
        this.zzzP.zzeJ();
    }

    public void zzeK() {
        TextView textView0 = new TextView(this.zzzP.getContext());
        textView0.setText("AdMob");
        textView0.setTextColor(0xFFFF0000);
        textView0.setBackgroundColor(0xFFFFFF00);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2, 17);
        this.zzzO.addView(textView0, frameLayout$LayoutParams0);
        this.zzzO.bringChildToFront(textView0);
    }

    void zzeL() {
        long v = (long)this.zzzP.getCurrentPosition();
        if(this.zzzS != v && v > 0L) {
            this.zzeN();
            this.zza("timeupdate", new String[]{"time", String.valueOf(((float)v) / 1000.0f)});
            this.zzzS = v;
        }
    }

    private void zzeM() {
        if(!this.zzeO()) {
            TextView textView0 = this.zzzR;
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            this.zzzO.addView(textView0, frameLayout$LayoutParams0);
            this.zzzO.bringChildToFront(this.zzzR);
        }
    }

    private void zzeN() {
        if(this.zzeO()) {
            this.zzzO.removeView(this.zzzR);
        }
    }

    private boolean zzeO() {
        return this.zzzR.getParent() != null;
    }

    public void zzf(int v, int v1, int v2, int v3) {
        if(v2 == 0 || v3 == 0) {
            return;
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v2 + 2, v3 + 2);
        frameLayout$LayoutParams0.setMargins(v - 1, v1 - 1, 0, 0);
        this.zzzO.setLayoutParams(frameLayout$LayoutParams0);
        this.requestLayout();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzg
    public void zzg(String s, String s1) {
        this.zza("error", new String[]{"what", s, "extra", s1});
    }
}

