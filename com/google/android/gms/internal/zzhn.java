package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

@zzgd
public class zzhn {
    private final Context mContext;
    private int mState;
    private String zzGo;
    private float zzGp;
    private float zzGq;
    private float zzGr;
    private final float zzyV;

    public zzhn(Context context0) {
        this.mState = 0;
        this.mContext = context0;
        this.zzyV = context0.getResources().getDisplayMetrics().density;
    }

    public zzhn(Context context0, String s) {
        this(context0);
        this.zzGo = s;
    }

    private void showDialog() {
        String s;
        if(!(this.mContext instanceof Activity)) {
            zzb.zzaA("Can not create dialog without Activity Context");
            return;
        }
        if(TextUtils.isEmpty(this.zzGo)) {
            s = "No debug information";
        }
        else {
            Uri uri0 = new Uri.Builder().encodedQuery(this.zzGo).build();
            StringBuilder stringBuilder0 = new StringBuilder();
            Map map0 = zzo.zzbv().zzd(uri0);
            for(Object object0: map0.keySet()) {
                stringBuilder0.append(((String)object0)).append(" = ").append(((String)map0.get(((String)object0)))).append("\n\n");
            }
            s = stringBuilder0.toString().trim();
            if(TextUtils.isEmpty(s)) {
                s = "No debug information";
            }
        }
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(this.mContext);
        alertDialog$Builder0.setMessage(s);
        alertDialog$Builder0.setTitle("Ad Information");
        alertDialog$Builder0.setPositiveButton("Share", new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                zzhn.this.mContext.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", s), "Share via"));
            }
        });
        alertDialog$Builder0.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog$Builder0.create().show();
    }

    void zza(int v, float f, float f1) {
        if(v == 0) {
            this.mState = 0;
            this.zzGp = f;
            this.zzGq = f1;
            this.zzGr = f1;
            return;
        }
        if(this.mState != -1) {
            if(v == 2) {
                if(f1 > this.zzGq) {
                    this.zzGq = f1;
                }
                else if(f1 < this.zzGr) {
                    this.zzGr = f1;
                }
                if(this.zzGq - this.zzGr > 30.0f * this.zzyV) {
                    this.mState = -1;
                    return;
                }
                switch(this.mState) {
                    case 0: 
                    case 2: {
                        if(f - this.zzGp >= 50.0f * this.zzyV) {
                            this.zzGp = f;
                            ++this.mState;
                        }
                        break;
                    }
                    case 1: 
                    case 3: {
                        if(f - this.zzGp <= -50.0f * this.zzyV) {
                            this.zzGp = f;
                            ++this.mState;
                        }
                    }
                }
                switch(this.mState) {
                    case 2: {
                        if(f < this.zzGp) {
                            this.zzGp = f;
                            return;
                        }
                        break;
                    }
                    case 1: 
                    case 3: {
                        if(f > this.zzGp) {
                            this.zzGp = f;
                            return;
                        }
                        break;
                    }
                }
            }
            else if(v == 1 && this.mState == 4) {
                this.showDialog();
            }
        }
    }

    public void zzaw(String s) {
        this.zzGo = s;
    }

    public void zzd(MotionEvent motionEvent0) {
        int v = motionEvent0.getHistorySize();
        for(int v1 = 0; v1 < v; ++v1) {
            this.zza(motionEvent0.getActionMasked(), motionEvent0.getHistoricalX(0, v1), motionEvent0.getHistoricalY(0, v1));
        }
        this.zza(motionEvent0.getActionMasked(), motionEvent0.getX(), motionEvent0.getY());
    }
}

