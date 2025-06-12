package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

@zzgd
public class zzeo extends zzeu {
    private final Context mContext;
    private final Map zzyn;
    private String zzyo;
    private long zzyp;
    private long zzyq;
    private String zzyr;
    private String zzys;

    public zzeo(zzid zzid0, Map map0) {
        super(zzid0, "createCalendarEvent");
        this.zzyn = map0;
        this.mContext = zzid0.zzgB();
        this.zzeb();
    }

    Intent createIntent() {
        Intent intent0 = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        intent0.putExtra("title", this.zzyo);
        intent0.putExtra("eventLocation", this.zzys);
        intent0.putExtra("description", this.zzyr);
        if(this.zzyp > -1L) {
            intent0.putExtra("beginTime", this.zzyp);
        }
        if(this.zzyq > -1L) {
            intent0.putExtra("endTime", this.zzyq);
        }
        intent0.setFlags(0x10000000);
        return intent0;
    }

    public void execute() {
        if(this.mContext == null) {
            this.zzae("Activity context is not available.");
            return;
        }
        if(!zzo.zzbv().zzK(this.mContext).zzcV()) {
            this.zzae("This feature is not available on the device.");
            return;
        }
        AlertDialog.Builder alertDialog$Builder0 = zzo.zzbv().zzJ(this.mContext);
        alertDialog$Builder0.setTitle(zzo.zzby().zzc(string.create_calendar_title, "Create calendar event"));
        alertDialog$Builder0.setMessage(zzo.zzby().zzc(string.create_calendar_message, "Allow Ad to create a calendar event?"));
        alertDialog$Builder0.setPositiveButton(zzo.zzby().zzc(string.accept, "Accept"), new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                Intent intent0 = zzeo.this.createIntent();
                zzeo.this.mContext.startActivity(intent0);
            }
        });
        alertDialog$Builder0.setNegativeButton(zzo.zzby().zzc(string.decline, "Decline"), new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                zzeo.this.zzae("Operation denied by user.");
            }
        });
        alertDialog$Builder0.create().show();
    }

    // 去混淆评级： 低(20)
    private String zzab(String s) {
        return TextUtils.isEmpty(((CharSequence)this.zzyn.get(s))) ? "" : ((String)this.zzyn.get(s));
    }

    private long zzac(String s) {
        String s1 = (String)this.zzyn.get(s);
        if(s1 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s1);
        }
        catch(NumberFormatException unused_ex) {
            return -1L;
        }
    }

    private void zzeb() {
        this.zzyo = this.zzab("description");
        this.zzyr = this.zzab("summary");
        this.zzyp = this.zzac("start_ticks");
        this.zzyq = this.zzac("end_ticks");
        this.zzys = this.zzab("location");
    }
}

