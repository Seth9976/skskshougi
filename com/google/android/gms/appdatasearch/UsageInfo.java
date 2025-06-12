package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzrn;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.CRC32;

public class UsageInfo implements SafeParcelable {
    public static final class zza {
        private String zzHZ;
        private DocumentId zzNH;
        private long zzNI;
        private int zzNJ;
        private DocumentContents zzNK;
        private boolean zzNL;
        private int zzNM;
        private int zzNN;

        public zza() {
            this.zzNI = -1L;
            this.zzNJ = -1;
            this.zzNM = -1;
            this.zzNL = false;
            this.zzNN = 0;
        }

        public zza zzL(boolean z) {
            this.zzNL = z;
            return this;
        }

        public zza zza(DocumentContents documentContents0) {
            this.zzNK = documentContents0;
            return this;
        }

        public zza zza(DocumentId documentId0) {
            this.zzNH = documentId0;
            return this;
        }

        public zza zzal(int v) {
            this.zzNJ = v;
            return this;
        }

        public zza zzam(int v) {
            this.zzNN = v;
            return this;
        }

        public UsageInfo zzkN() {
            return new UsageInfo(this.zzNH, this.zzNI, this.zzNJ, this.zzHZ, this.zzNK, this.zzNL, this.zzNM, this.zzNN, null);
        }

        public zza zzw(long v) {
            this.zzNI = v;
            return this;
        }
    }

    public static final zzj CREATOR;
    final int zzCY;
    final DocumentId zzNH;
    final long zzNI;
    int zzNJ;
    final DocumentContents zzNK;
    final boolean zzNL;
    int zzNM;
    int zzNN;
    public final String zztt;

    static {
        UsageInfo.CREATOR = new zzj();
    }

    UsageInfo(int versionCode, DocumentId documentId, long timestamp, int usageType, String query, DocumentContents document, boolean isDeviceOnly, int taskPosition, int eventStatus) {
        this.zzCY = versionCode;
        this.zzNH = documentId;
        this.zzNI = timestamp;
        this.zzNJ = usageType;
        this.zztt = query;
        this.zzNK = document;
        this.zzNL = isDeviceOnly;
        this.zzNM = taskPosition;
        this.zzNN = eventStatus;
    }

    private UsageInfo(DocumentId documentId, long timestampMs, int usageType, String query, DocumentContents document, boolean isDeviceOnly, int taskPosition, int eventStatus) {
        this(1, documentId, timestampMs, usageType, query, document, isDeviceOnly, taskPosition, eventStatus);
    }

    UsageInfo(DocumentId x0, long x1, int x2, String x3, DocumentContents x4, boolean x5, int x6, int x7, com.google.android.gms.appdatasearch.UsageInfo.1 x8) {
        this(x0, x1, x2, x3, x4, x5, x6, x7);
    }

    public UsageInfo(String packageName, Intent viewIntent, String title, Uri webUrl, String schemaOrgType, List list0, int eventStatus) {
        this(1, UsageInfo.zza(packageName, viewIntent), System.currentTimeMillis(), 0, null, UsageInfo.zza(viewIntent, title, webUrl, schemaOrgType, list0).zzkJ(), false, -1, eventStatus);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.zzNH, this.zzNI, this.zzNJ, this.zzNN);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzj.zza(this, dest, flags);
    }

    public static com.google.android.gms.appdatasearch.DocumentContents.zza zza(Intent intent0, String s, Uri uri0, String s1, List list0) {
        com.google.android.gms.appdatasearch.DocumentContents.zza documentContents$zza0 = new com.google.android.gms.appdatasearch.DocumentContents.zza();
        documentContents$zza0.zza(UsageInfo.zzbt(s));
        if(uri0 != null) {
            documentContents$zza0.zza(UsageInfo.zzh(uri0));
        }
        if(list0 != null) {
            documentContents$zza0.zza(UsageInfo.zzh(list0));
        }
        String s2 = intent0.getAction();
        if(s2 != null) {
            documentContents$zza0.zza(UsageInfo.zzp("intent_action", s2));
        }
        String s3 = intent0.getDataString();
        if(s3 != null) {
            documentContents$zza0.zza(UsageInfo.zzp("intent_data", s3));
        }
        ComponentName componentName0 = intent0.getComponent();
        if(componentName0 != null) {
            documentContents$zza0.zza(UsageInfo.zzp("intent_activity", componentName0.getClassName()));
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            String s4 = bundle0.getString("intent_extra_data_key");
            if(s4 != null) {
                documentContents$zza0.zza(UsageInfo.zzp("intent_extra_data", s4));
            }
        }
        return documentContents$zza0.zzbp(s1).zzI(true);
    }

    public static DocumentId zza(String s, Intent intent0) {
        return UsageInfo.zzo(s, UsageInfo.zzg(intent0));
    }

    private static DocumentSection zzbt(String s) {
        return new DocumentSection(s, new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza("title").zzaj(1).zzK(true).zzbs("name").zzkM(), "text1");
    }

    private static String zzg(Intent intent0) {
        String s = intent0.toUri(1);
        CRC32 cRC320 = new CRC32();
        try {
            cRC320.update(s.getBytes("UTF-8"));
            return Long.toHexString(cRC320.getValue());
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new IllegalStateException(unsupportedEncodingException0);
        }
    }

    private static DocumentSection zzh(Uri uri0) {
        return new DocumentSection(uri0.toString(), new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza("web_url").zzaj(4).zzJ(true).zzbs("url").zzkM());
    }

    private static DocumentSection zzh(List list0) {
        com.google.android.gms.internal.zznj.zza zznj$zza0 = new com.google.android.gms.internal.zznj.zza();
        com.google.android.gms.internal.zznj.zza.zza[] arr_zznj$zza$zza = new com.google.android.gms.internal.zznj.zza.zza[list0.size()];
        for(int v = 0; v < arr_zznj$zza$zza.length; ++v) {
            arr_zznj$zza$zza[v] = new com.google.android.gms.internal.zznj.zza.zza();
            AppIndexingLink appIndexApi$AppIndexingLink0 = (AppIndexingLink)list0.get(v);
            arr_zznj$zza$zza[v].zzawm = appIndexApi$AppIndexingLink0.appIndexingUrl.toString();
            arr_zznj$zza$zza[v].viewId = appIndexApi$AppIndexingLink0.viewId;
            if(appIndexApi$AppIndexingLink0.webUrl != null) {
                arr_zznj$zza$zza[v].zzawn = appIndexApi$AppIndexingLink0.webUrl.toString();
            }
        }
        zznj$zza0.zzawk = arr_zznj$zza$zza;
        return new DocumentSection(zzrn.zzf(zznj$zza0), new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza("outlinks").zzJ(true).zzbs(".private:outLinks").zzbr("blob").zzkM());
    }

    private static DocumentId zzo(String s, String s1) {
        return new DocumentId(s, "", s1);
    }

    private static DocumentSection zzp(String s, String s1) {
        return new DocumentSection(s1, new com.google.android.gms.appdatasearch.RegisterSectionInfo.zza(s).zzJ(true).zzkM(), s);
    }

    class com.google.android.gms.appdatasearch.UsageInfo.1 {
    }

}

