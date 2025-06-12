package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;

public class zzbm {
    static class zza {
        ByteArrayOutputStream zzrQ;
        Base64OutputStream zzrR;

        public zza() {
            this.zzrQ = new ByteArrayOutputStream(0x1000);
            this.zzrR = new Base64OutputStream(this.zzrQ, 10);
        }

        @Override
        public String toString() {
            try {
                this.zzrR.close();
            }
            catch(IOException iOException0) {
                zzb.zzb("HashManager: Unable to convert to Base64.", iOException0);
            }
            try {
                try {
                    this.zzrQ.close();
                    String s = this.zzrQ.toString();
                    this.zzrQ = null;
                    this.zzrR = null;
                    return s;
                }
                catch(IOException iOException1) {
                    zzb.zzb("HashManager: Unable to convert to Base64.", iOException1);
                    this.zzrQ = null;
                    this.zzrR = null;
                    return "";
                }
            }
            catch(Throwable throwable0) {
                this.zzrQ = null;
                this.zzrR = null;
                throw throwable0;
            }
        }

        public void write(byte[] data) throws IOException {
            this.zzrR.write(data);
        }
    }

    private final int zzrL;
    private final int zzrM;
    private final int zzrN;
    private final zzbl zzrO;

    public zzbm(int v) {
        this.zzrO = new zzbo();
        this.zzrM = v;
        this.zzrL = 6;
        this.zzrN = 0;
    }

    String zzA(String s) {
        String[] arr_s = s.split("\n");
        if(arr_s.length == 0) {
            return "";
        }
        zza zzbm$zza0 = this.zzcv();
        com.google.android.gms.internal.zzbm.2 zzbm$20 = new Comparator() {
            public int zza(com.google.android.gms.internal.zzbp.zza zzbp$zza0, com.google.android.gms.internal.zzbp.zza zzbp$zza1) {
                return (int)(zzbp$zza0.value - zzbp$zza1.value);
            }
        };
        PriorityQueue priorityQueue0 = new PriorityQueue(this.zzrM, zzbm$20);
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = zzbn.zzC(arr_s[v]);
            if(arr_s1.length >= this.zzrL) {
                zzbp.zza(arr_s1, this.zzrM, this.zzrL, priorityQueue0);
            }
        }
        for(Object object0: priorityQueue0) {
            com.google.android.gms.internal.zzbp.zza zzbp$zza0 = (com.google.android.gms.internal.zzbp.zza)object0;
            try {
                zzbm$zza0.write(this.zzrO.zzy(zzbp$zza0.zzrT));
            }
            catch(IOException iOException0) {
                zzb.zzb("Error while writing hash to byteStream", iOException0);
                if(true) {
                    break;
                }
            }
        }
        return zzbm$zza0.toString();
    }

    public String zza(ArrayList arrayList0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        for(Object object0: arrayList0) {
            stringBuffer0.append(((String)object0).toLowerCase(Locale.US));
            stringBuffer0.append('\n');
        }
        switch(this.zzrN) {
            case 0: {
                return this.zzA(stringBuffer0.toString());
            }
            case 1: {
                return this.zzz(stringBuffer0.toString());
            }
            default: {
                return "";
            }
        }
    }

    zza zzcv() {
        return new zza();
    }

    private String zzz(String s) {
        String[] arr_s = s.split("\n");
        if(arr_s.length == 0) {
            return "";
        }
        zza zzbm$zza0 = this.zzcv();
        Arrays.sort(arr_s, new Comparator() {
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });
        for(int v = 0; v < arr_s.length && v < this.zzrM; ++v) {
            if(arr_s[v].trim().length() != 0) {
                try {
                    zzbm$zza0.write(this.zzrO.zzy(arr_s[v]));
                }
                catch(IOException iOException0) {
                    zzb.zzb("Error while writing hash to byteStream", iOException0);
                    return zzbm$zza0.toString();
                }
            }
        }
        return zzbm$zza0.toString();
    }
}

