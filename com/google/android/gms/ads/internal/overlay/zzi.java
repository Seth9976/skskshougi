package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhl;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@zzgd
public class zzi extends SurfaceView implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {
    private int zzAa;
    private int zzAb;
    private int zzAc;
    private int zzAd;
    private int zzAe;
    private float zzAf;
    private boolean zzAg;
    private boolean zzAh;
    private int zzAi;
    private zzg zzAj;
    private static final Map zzzU;
    private int zzzV;
    private int zzzW;
    private SurfaceHolder zzzX;
    private MediaPlayer zzzY;
    private Uri zzzZ;

    static {
        zzi.zzzU = new HashMap();
        zzi.zzzU.put(-1004, "MEDIA_ERROR_IO");
        zzi.zzzU.put(-1007, "MEDIA_ERROR_MALFORMED");
        zzi.zzzU.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        zzi.zzzU.put(-110, "MEDIA_ERROR_TIMED_OUT");
        zzi.zzzU.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzi.zzzU.put(1, "MEDIA_ERROR_UNKNOWN");
        zzi.zzzU.put(1, "MEDIA_INFO_UNKNOWN");
        zzi.zzzU.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzi.zzzU.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        zzi.zzzU.put(701, "MEDIA_INFO_BUFFERING_START");
        zzi.zzzU.put(702, "MEDIA_INFO_BUFFERING_END");
        zzi.zzzU.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzi.zzzU.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzi.zzzU.put(802, "MEDIA_INFO_METADATA_UPDATE");
        zzi.zzzU.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        zzi.zzzU.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzi(Context context0) {
        super(context0);
        this.zzzV = 0;
        this.zzzW = 0;
        this.zzAf = 1.0f;
        this.getHolder().addCallback(this);
        if(Build.VERSION.SDK_INT < 11) {
            this.getHolder().setType(3);
        }
    }

    // 去混淆评级： 低(20)
    public int getCurrentPosition() {
        return this.zzeT() ? this.zzzY.getCurrentPosition() : 0;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        if(focusChange > 0) {
            this.zzeU();
            return;
        }
        if(focusChange < 0) {
            this.zzeV();
        }
    }

    @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mp, int percent) {
        this.zzAe = percent;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public void onCompletion(MediaPlayer mp) {
        zzb.zzaB("AdVideoView completion");
        this.zzzV = 5;
        this.zzzW = 5;
        com.google.android.gms.ads.internal.overlay.zzi.2 zzi$20 = new Runnable() {
            @Override
            public void run() {
                if(zzi.this.zzAj != null) {
                    zzi.this.zzAj.zzeF();
                }
            }
        };
        zzhl.zzGk.post(zzi$20);
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public boolean onError(MediaPlayer mp, int what, int extra) {
        String s = (String)zzi.zzzU.get(what);
        String s1 = (String)zzi.zzzU.get(extra);
        zzb.zzaC(("AdVideoView MediaPlayer error: " + s + ":" + s1));
        this.zzzV = -1;
        this.zzzW = -1;
        com.google.android.gms.ads.internal.overlay.zzi.3 zzi$30 = new Runnable() {
            @Override
            public void run() {
                if(zzi.this.zzAj != null) {
                    zzi.this.zzAj.zzg(s, s1);
                }
            }
        };
        zzhl.zzGk.post(zzi$30);
        return true;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public boolean onInfo(MediaPlayer mp, int what, int extra) {
        zzb.zzaB(("AdVideoView MediaPlayer info: " + ((String)zzi.zzzU.get(what)) + ":" + ((String)zzi.zzzU.get(extra))));
        return true;
    }

    @Override  // android.view.SurfaceView
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int v2 = zzi.getDefaultSize(this.zzAa, widthMeasureSpec);
        int v3 = zzi.getDefaultSize(this.zzAb, heightMeasureSpec);
        if(this.zzAa > 0 && this.zzAb > 0) {
            int v4 = View.MeasureSpec.getMode(widthMeasureSpec);
            int v5 = View.MeasureSpec.getSize(widthMeasureSpec);
            int v6 = View.MeasureSpec.getMode(heightMeasureSpec);
            v3 = View.MeasureSpec.getSize(heightMeasureSpec);
            if(v4 != 0x40000000 || v6 != 0x40000000) {
                if(v4 == 0x40000000) {
                    int v7 = this.zzAb * v5 / this.zzAa;
                    if(v6 != 0x80000000 || v7 <= v3) {
                        v3 = v7;
                    }
                    v2 = v5;
                }
                else if(v6 == 0x40000000) {
                    v2 = this.zzAa * v3 / this.zzAb;
                    if(v4 == 0x80000000 && v2 > v5) {
                        v2 = v5;
                    }
                }
                else {
                    int v8 = this.zzAa;
                    int v9 = this.zzAb;
                    if(v6 != 0x80000000 || v9 <= v3) {
                        v3 = v9;
                        v2 = v8;
                    }
                    else {
                        v2 = this.zzAa * v3 / this.zzAb;
                    }
                    if(v4 == 0x80000000 && v2 > v5) {
                        v3 = this.zzAb * v5 / this.zzAa;
                        v2 = v5;
                    }
                }
            }
            else if(this.zzAa * v3 < this.zzAb * v5) {
                v2 = this.zzAa * v3 / this.zzAb;
            }
            else {
                if(this.zzAa * v3 > this.zzAb * v5) {
                    v3 = this.zzAb * v5 / this.zzAa;
                }
                v2 = v5;
            }
        }
        this.setMeasuredDimension(v2, v3);
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        zzb.zzaB("AdVideoView prepared");
        this.zzzV = 2;
        com.google.android.gms.ads.internal.overlay.zzi.1 zzi$10 = new Runnable() {
            @Override
            public void run() {
                if(zzi.this.zzAj != null) {
                    zzi.this.zzAj.onPrepared(mediaPlayer);
                }
            }
        };
        zzhl.zzGk.post(zzi$10);
        this.zzAa = mediaPlayer.getVideoWidth();
        this.zzAb = mediaPlayer.getVideoHeight();
        if(this.zzAi != 0) {
            this.seekTo(this.zzAi);
        }
        this.zzeQ();
        if(this.zzAa != 0 && this.zzAb != 0) {
            zzb.zzaA(("AdVideoView stream dimensions: " + this.zzAa + " x " + this.zzAb));
            this.getHolder().setFixedSize(this.zzAa, this.zzAb);
            if(this.zzAc == this.zzAa && this.zzAd == this.zzAb && this.zzzW == 3) {
                this.play();
            }
        }
        else if(this.zzzW == 3) {
            this.play();
        }
        this.zzeR();
        this.zzeW();
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
        zzb.zzaB(("AdVideoView size changed: " + width + " x " + height));
        this.zzAa = mp.getVideoWidth();
        this.zzAb = mp.getVideoHeight();
        if(this.zzAa != 0 && this.zzAb != 0) {
            this.getHolder().setFixedSize(this.zzAa, this.zzAb);
            this.requestLayout();
        }
    }

    public void pause() {
        zzb.zzaB("AdVideoView pause");
        if(this.zzeT() && this.zzzY.isPlaying()) {
            this.zzzY.pause();
            this.zzzV = 4;
            com.google.android.gms.ads.internal.overlay.zzi.7 zzi$70 = new Runnable() {
                @Override
                public void run() {
                    if(zzi.this.zzAj != null) {
                        zzi.this.zzAj.onPaused();
                    }
                }
            };
            zzhl.zzGk.post(zzi$70);
        }
        this.zzzW = 4;
    }

    public void play() {
        zzb.zzaB("AdVideoView play");
        if(this.zzeT()) {
            this.zzzY.start();
            this.zzzV = 3;
            com.google.android.gms.ads.internal.overlay.zzi.6 zzi$60 = new Runnable() {
                @Override
                public void run() {
                    if(zzi.this.zzAj != null) {
                        zzi.this.zzAj.zzeE();
                    }
                }
            };
            zzhl.zzGk.post(zzi$60);
        }
        this.zzzW = 3;
    }

    public void seekTo(int millis) {
        zzb.zzaB(("AdVideoView seek " + millis));
        if(this.zzeT()) {
            this.zzzY.seekTo(millis);
            this.zzAi = 0;
            return;
        }
        this.zzAi = millis;
    }

    public void setVideoPath(String path) {
        this.setVideoURI(Uri.parse(path));
    }

    public void setVideoURI(Uri uri) {
        this.zzzZ = uri;
        this.zzAi = 0;
        this.zzeP();
        this.requestLayout();
        this.invalidate();
    }

    public void stop() {
        zzb.zzaB("AdVideoView stop");
        if(this.zzzY != null) {
            this.zzzY.stop();
            this.zzzY.release();
            this.zzzY = null;
            this.zzzV = 0;
            this.zzzW = 0;
            this.zzeS();
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
        boolean z = true;
        zzb.zzaB("AdVideoView surface changed");
        this.zzAc = w;
        this.zzAd = h;
        boolean z1 = this.zzzW == 3;
        if(this.zzAa != w || this.zzAb != h) {
            z = false;
        }
        if(this.zzzY != null && z1 && z) {
            if(this.zzAi != 0) {
                this.seekTo(this.zzAi);
            }
            this.play();
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceCreated(SurfaceHolder holder) {
        zzb.zzaB("AdVideoView surface created");
        this.zzzX = holder;
        this.zzeP();
        com.google.android.gms.ads.internal.overlay.zzi.4 zzi$40 = new Runnable() {
            @Override
            public void run() {
                if(zzi.this.zzAj != null) {
                    zzi.this.zzAj.zzeD();
                }
            }
        };
        zzhl.zzGk.post(zzi$40);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        zzb.zzaB("AdVideoView surface destroyed");
        if(this.zzzY != null && this.zzAi == 0) {
            this.zzAi = this.zzzY.getCurrentPosition();
        }
        this.zzzX = null;
        com.google.android.gms.ads.internal.overlay.zzi.5 zzi$50 = new Runnable() {
            @Override
            public void run() {
                if(zzi.this.zzAj != null) {
                    zzi.this.zzAj.onPaused();
                    zzi.this.zzAj.zzeG();
                }
            }
        };
        zzhl.zzGk.post(zzi$50);
        this.zzv(true);
    }

    @Override  // android.view.View
    public String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }

    public void zza(float f) {
        this.zzAf = f;
        this.zzeW();
    }

    public void zza(zzg zzg0) {
        this.zzAj = zzg0;
    }

    private void zzb(float f) {
        if(this.zzzY != null) {
            try {
                this.zzzY.setVolume(f, f);
            }
            catch(IllegalStateException unused_ex) {
            }
            return;
        }
        zzb.zzaC("AdVideoView setMediaPlayerVolume() called before onPrepared().");
    }

    public void zzeI() {
        this.zzAg = true;
        this.zzeW();
    }

    public void zzeJ() {
        this.zzAg = false;
        this.zzeW();
    }

    private void zzeP() {
        zzb.zzaB("AdVideoView init MediaPlayer");
        if(this.zzzZ == null || this.zzzX == null) {
            return;
        }
        this.zzv(false);
        try {
            this.zzzY = new MediaPlayer();
            this.zzzY.setOnBufferingUpdateListener(this);
            this.zzzY.setOnCompletionListener(this);
            this.zzzY.setOnErrorListener(this);
            this.zzzY.setOnInfoListener(this);
            this.zzzY.setOnPreparedListener(this);
            this.zzzY.setOnVideoSizeChangedListener(this);
            this.zzAe = 0;
            this.zzzY.setDataSource(this.getContext(), this.zzzZ);
            this.zzzY.setDisplay(this.zzzX);
            this.zzzY.setAudioStreamType(3);
            this.zzzY.setScreenOnWhilePlaying(true);
            this.zzzY.prepareAsync();
            this.zzzV = 1;
        }
        catch(IOException | IllegalArgumentException iOException0) {
            zzb.zzd(("Failed to initialize MediaPlayer at " + this.zzzZ), iOException0);
            this.onError(this.zzzY, 1, 0);
        }
    }

    private void zzeQ() {
        if(this.zzeT() && this.zzzW != 3) {
            zzb.zzaB("AdVideoView nudging MediaPlayer");
            this.zzzY.start();
            int v = this.zzzY.getCurrentPosition();
            long v1 = zzo.zzbz().currentTimeMillis();
            while(this.zzeT() && this.zzzY.getCurrentPosition() == v && zzo.zzbz().currentTimeMillis() - v1 <= 0xFAL) {
            }
            this.zzzY.pause();
        }
    }

    private void zzeR() {
        AudioManager audioManager0 = this.zzeX();
        if(audioManager0 != null && !this.zzAh) {
            if(audioManager0.requestAudioFocus(this, 3, 2) == 1) {
                this.zzeU();
                return;
            }
            zzb.zzaC("AdVideoView audio focus request failed");
        }
    }

    private void zzeS() {
        zzb.zzaB("AdVideoView abandon audio focus");
        AudioManager audioManager0 = this.zzeX();
        if(audioManager0 != null && this.zzAh) {
            if(audioManager0.abandonAudioFocus(this) == 1) {
                this.zzAh = false;
                return;
            }
            zzb.zzaC("AdVideoView abandon audio focus failed");
        }
    }

    private boolean zzeT() {
        return this.zzzY != null && (this.zzzV != -1 && this.zzzV != 0 && this.zzzV != 1);
    }

    private void zzeU() {
        zzb.zzaB("AdVideoView audio focus gained");
        this.zzAh = true;
        this.zzeW();
    }

    private void zzeV() {
        zzb.zzaB("AdVideoView audio focus lost");
        this.zzAh = false;
        this.zzeW();
    }

    private void zzeW() {
        if(!this.zzAg && this.zzAh) {
            this.zzb(this.zzAf);
            return;
        }
        this.zzb(0.0f);
    }

    private AudioManager zzeX() {
        return (AudioManager)this.getContext().getSystemService("audio");
    }

    private void zzv(boolean z) {
        zzb.zzaB("AdVideoView release");
        if(this.zzzY != null) {
            this.zzzY.reset();
            this.zzzY.release();
            this.zzzY = null;
            this.zzzV = 0;
            if(z) {
                this.zzzW = 0;
            }
            this.zzeS();
        }
    }
}

