package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

public abstract class zzak implements zzaj {
    protected MotionEvent zzmR;
    protected DisplayMetrics zzmS;
    protected zzap zzmT;
    private zzaq zzmU;

    protected zzak(Context context0, zzap zzap0, zzaq zzaq0) {
        this.zzmT = zzap0;
        this.zzmU = zzaq0;
        try {
            this.zzmS = context0.getResources().getDisplayMetrics();
        }
        catch(UnsupportedOperationException unused_ex) {
            this.zzmS = new DisplayMetrics();
            this.zzmS.density = 1.0f;
        }
    }

    private void zzS() {
        this.zzmU.reset();
    }

    private byte[] zzT() throws IOException {
        return this.zzmU.zzac();
    }

    private String zza(Context context0, String s, boolean z) {
        byte[] arr_b;
        try {
            synchronized(this) {
                this.zzS();
                if(z) {
                    this.zzd(context0);
                }
                else {
                    this.zzc(context0);
                }
                arr_b = this.zzT();
            }
            return arr_b.length == 0 ? "5" : this.zza(arr_b, s);
        }
        catch(NoSuchAlgorithmException unused_ex) {
            return "7";
        }
        catch(UnsupportedEncodingException unused_ex) {
            return "7";
        }
        catch(IOException unused_ex) {
            return "3";
        }
    }

    @Override  // com.google.android.gms.internal.zzaj
    public String zza(Context context0, String s) {
        return this.zza(context0, s, true);
    }

    String zza(byte[] arr_b, String s) throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException {
        byte[] arr_b2;
        if(arr_b.length > 0xEF) {
            this.zzS();
            this.zza(20, 1L);
            arr_b = this.zzT();
        }
        if(arr_b.length < 0xEF) {
            byte[] arr_b1 = new byte[0xEF - arr_b.length];
            new SecureRandom().nextBytes(arr_b1);
            arr_b2 = ByteBuffer.allocate(0xF0).put(((byte)arr_b.length)).put(arr_b).put(arr_b1).array();
        }
        else {
            arr_b2 = ByteBuffer.allocate(0xF0).put(((byte)arr_b.length)).put(arr_b).array();
        }
        MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
        messageDigest0.update(arr_b2);
        byte[] arr_b3 = messageDigest0.digest();
        byte[] arr_b4 = ByteBuffer.allocate(0x100).put(arr_b3).put(arr_b2).array();
        byte[] arr_b5 = new byte[0x100];
        new zzai().zzb(arr_b4, arr_b5);
        if(s != null && s.length() > 0) {
            this.zza(s, arr_b5);
        }
        return this.zzmT.zza(arr_b5, true);
    }

    @Override  // com.google.android.gms.internal.zzaj
    public void zza(int v, int v1, int v2) {
        if(this.zzmR != null) {
            this.zzmR.recycle();
        }
        this.zzmR = MotionEvent.obtain(0L, v2, 1, ((float)v) * this.zzmS.density, ((float)v1) * this.zzmS.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    protected void zza(int v, long v1) throws IOException {
        this.zzmU.zzb(v, v1);
    }

    protected void zza(int v, String s) throws IOException {
        this.zzmU.zzb(v, s);
    }

    @Override  // com.google.android.gms.internal.zzaj
    public void zza(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1) {
            if(this.zzmR != null) {
                this.zzmR.recycle();
            }
            this.zzmR = MotionEvent.obtain(motionEvent0);
        }
    }

    void zza(String s, byte[] arr_b) throws UnsupportedEncodingException {
        if(s.length() > 0x20) {
            s = s.substring(0, 0x20);
        }
        new zzre(s.getBytes("UTF-8")).zzy(arr_b);
    }

    @Override  // com.google.android.gms.internal.zzaj
    public String zzb(Context context0) {
        return this.zza(context0, null, false);
    }

    protected abstract void zzc(Context arg1);

    protected abstract void zzd(Context arg1);

    protected String zzk(String s) {
        if(s != null && s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uUID0 = UUID.fromString(s);
            byte[] arr_b = new byte[16];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            byteBuffer0.putLong(uUID0.getMostSignificantBits());
            byteBuffer0.putLong(uUID0.getLeastSignificantBits());
            return this.zzmT.zza(arr_b, true);
        }
        return s;
    }
}

