package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class zzg implements DialogInterface.OnClickListener {
    private final Activity mActivity;
    private final Intent mIntent;
    private final Fragment zzZX;
    private final int zzZY;

    public zzg(Activity activity0, Intent intent0, int v) {
        this.mActivity = activity0;
        this.zzZX = null;
        this.mIntent = intent0;
        this.zzZY = v;
    }

    public zzg(Fragment fragment0, Intent intent0, int v) {
        this.mActivity = null;
        this.zzZX = fragment0;
        this.mIntent = intent0;
        this.zzZY = v;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        try {
            if(this.mIntent != null && this.zzZX != null) {
                this.zzZX.startActivityForResult(this.mIntent, this.zzZY);
            }
            else if(this.mIntent != null) {
                this.mActivity.startActivityForResult(this.mIntent, this.zzZY);
            }
            dialog.dismiss();
        }
        catch(ActivityNotFoundException unused_ex) {
            Log.e("SettingsRedirect", "Can\'t redirect to app settings for Google Play services");
        }
    }
}

