package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.app.DownloadManager.Request;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

@zzgd
public class zzer extends zzeu {
    private final Context mContext;
    private final Map zzyn;

    public zzer(zzid zzid0, Map map0) {
        super(zzid0, "storePicture");
        this.zzyn = map0;
        this.mContext = zzid0.zzgB();
    }

    public void execute() {
        if(this.mContext == null) {
            this.zzae("Activity context is not available");
            return;
        }
        if(!zzo.zzbv().zzK(this.mContext).zzcS()) {
            this.zzae("Feature is not supported by the device.");
            return;
        }
        String s = (String)this.zzyn.get("iurl");
        if(TextUtils.isEmpty(s)) {
            this.zzae("Image url cannot be empty.");
            return;
        }
        if(!URLUtil.isValidUrl(s)) {
            this.zzae("Invalid image url: " + s);
            return;
        }
        String s1 = this.zzad(s);
        if(!zzo.zzbv().zzav(s1)) {
            this.zzae("Image type not recognized: " + s1);
            return;
        }
        AlertDialog.Builder alertDialog$Builder0 = zzo.zzbv().zzJ(this.mContext);
        alertDialog$Builder0.setTitle(zzo.zzby().zzc(string.store_picture_title, "Save image"));
        alertDialog$Builder0.setMessage(zzo.zzby().zzc(string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
        alertDialog$Builder0.setPositiveButton(zzo.zzby().zzc(string.accept, "Accept"), new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                DownloadManager downloadManager0 = (DownloadManager)zzer.this.mContext.getSystemService("download");
                try {
                    downloadManager0.enqueue(zzer.this.zzf(s, s1));
                }
                catch(IllegalStateException unused_ex) {
                    zzer.this.zzae("Could not store picture.");
                }
            }
        });
        alertDialog$Builder0.setNegativeButton(zzo.zzby().zzc(string.decline, "Decline"), new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                zzer.this.zzae("User canceled the download.");
            }
        });
        alertDialog$Builder0.create().show();
    }

    String zzad(String s) {
        return Uri.parse(s).getLastPathSegment();
    }

    DownloadManager.Request zzf(String s, String s1) {
        DownloadManager.Request downloadManager$Request0 = new DownloadManager.Request(Uri.parse(s));
        downloadManager$Request0.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s1);
        zzo.zzbx().zza(downloadManager$Request0);
        return downloadManager$Request0;
    }
}

