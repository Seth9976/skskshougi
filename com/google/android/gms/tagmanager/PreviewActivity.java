package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity {
    @Override  // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            zzbg.zzaA("Preview activity");
            Uri uri0 = this.getIntent().getData();
            if(!TagManager.getInstance(this).zzl(uri0)) {
                String s = "Cannot preview the app with the uri: " + uri0 + ". Launching current version instead.";
                zzbg.zzaC(s);
                this.zzj("Preview failure", s, "Continue");
            }
            Intent intent0 = this.getPackageManager().getLaunchIntentForPackage("org.dyndns.vivi.SkskShogi");
            if(intent0 != null) {
                zzbg.zzaA("Invoke the launch activity for package name: org.dyndns.vivi.SkskShogi");
                this.startActivity(intent0);
                return;
            }
            zzbg.zzaA("No launch activity found for package name: org.dyndns.vivi.SkskShogi");
        }
        catch(Exception exception0) {
            zzbg.zzaz(("Calling preview threw an exception: " + exception0.getMessage()));
        }
    }

    private void zzj(String s, String s1, String s2) {
        AlertDialog alertDialog0 = new AlertDialog.Builder(this).create();
        alertDialog0.setTitle(s);
        alertDialog0.setMessage(s1);
        alertDialog0.setButton(-1, s2, new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog0.show();
    }
}

