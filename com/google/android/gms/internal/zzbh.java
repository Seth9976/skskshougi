package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;

@zzgd
public class zzbh {
    private final Object zzqt;
    private final int zzrj;
    private final int zzrk;
    private final int zzrl;
    private final zzbm zzrm;
    private ArrayList zzrn;
    private int zzro;
    private int zzrp;
    private int zzrq;
    private int zzrr;
    private String zzrs;

    public zzbh(int v, int v1, int v2, int v3) {
        this.zzqt = new Object();
        this.zzrn = new ArrayList();
        this.zzro = 0;
        this.zzrp = 0;
        this.zzrq = 0;
        this.zzrs = "";
        this.zzrj = v;
        this.zzrk = v1;
        this.zzrl = v2;
        this.zzrm = new zzbm(v3);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof zzbh)) {
            return false;
        }
        return obj == this ? true : ((zzbh)obj).zzci() != null && ((zzbh)obj).zzci().equals(this.zzci());
    }

    public int getScore() {
        return this.zzrr;
    }

    @Override
    public int hashCode() {
        return this.zzci().hashCode();
    }

    @Override
    public String toString() {
        return "ActivityContent fetchId: " + this.zzrp + " score:" + this.zzrr + " total_length:" + this.zzro + "\n text: " + this.zza(this.zzrn, 200) + "\n signture: " + this.zzrs;
    }

    private String zza(ArrayList arrayList0, int v) {
        if(arrayList0.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        for(Object object0: arrayList0) {
            stringBuffer0.append(((String)object0));
            stringBuffer0.append(' ');
            if(stringBuffer0.length() > v) {
                break;
            }
        }
        stringBuffer0.deleteCharAt(stringBuffer0.length() - 1);
        String s = stringBuffer0.toString();
        return s.length() < v ? s : s.substring(0, v);
    }

    int zza(int v, int v1) {
        return this.zzrj * v + this.zzrk * v1;
    }

    public boolean zzch() {
        synchronized(this.zzqt) {
        }
        return this.zzrq == 0;
    }

    public String zzci() {
        return this.zzrs;
    }

    public void zzcj() {
        synchronized(this.zzqt) {
            this.zzrr += -100;
        }
    }

    public void zzck() {
        synchronized(this.zzqt) {
            --this.zzrq;
        }
    }

    public void zzcl() {
        synchronized(this.zzqt) {
            ++this.zzrq;
        }
    }

    public void zzcm() {
        synchronized(this.zzqt) {
            int v1 = this.zza(this.zzro, this.zzrp);
            if(v1 > this.zzrr) {
                this.zzrr = v1;
                this.zzrs = this.zzrm.zza(this.zzrn);
            }
        }
    }

    int zzcn() {
        return this.zzro;
    }

    public void zzg(int v) {
        this.zzrp = v;
    }

    public void zzu(String s) {
        this.zzw(s);
        synchronized(this.zzqt) {
            if(this.zzrq < 0) {
                zzb.zzay("ActivityContent: negative number of WebViews.");
            }
            this.zzcm();
        }
    }

    public void zzv(String s) {
        this.zzw(s);
    }

    private void zzw(String s) {
        if(s == null || s.length() < this.zzrl) {
            return;
        }
        synchronized(this.zzqt) {
            this.zzrn.add(s);
            this.zzro += s.length();
        }
    }
}

