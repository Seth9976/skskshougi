package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.LinkedList;

@zzgd
public class zzhb {
    @zzgd
    static final class zza {
        private long zzFC;
        private long zzFD;

        public zza() {
            this.zzFC = -1L;
            this.zzFD = -1L;
        }

        public Bundle toBundle() {
            Bundle bundle0 = new Bundle();
            bundle0.putLong("topen", this.zzFC);
            bundle0.putLong("tclose", this.zzFD);
            return bundle0;
        }

        public long zzfS() {
            return this.zzFD;
        }

        public void zzfT() {
            this.zzFD = SystemClock.elapsedRealtime();
        }

        public void zzfU() {
            this.zzFC = SystemClock.elapsedRealtime();
        }
    }

    private boolean zzDY;
    private long zzFA;
    private long zzFB;
    private final LinkedList zzFt;
    private final String zzFu;
    private final String zzFv;
    private long zzFw;
    private long zzFx;
    private long zzFy;
    private long zzFz;
    private final zzhc zzpv;
    private final Object zzqt;

    public zzhb(zzhc zzhc0, String s, String s1) {
        this.zzqt = new Object();
        this.zzFw = -1L;
        this.zzFx = -1L;
        this.zzDY = false;
        this.zzFy = -1L;
        this.zzFz = 0L;
        this.zzFA = -1L;
        this.zzFB = -1L;
        this.zzpv = zzhc0;
        this.zzFu = s;
        this.zzFv = s1;
        this.zzFt = new LinkedList();
    }

    public zzhb(String s, String s1) {
        this(zzo.zzby(), s, s1);
    }

    public Bundle toBundle() {
        synchronized(this.zzqt) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("seq_num", this.zzFu);
            bundle0.putString("slotid", this.zzFv);
            bundle0.putBoolean("ismediation", this.zzDY);
            bundle0.putLong("treq", this.zzFA);
            bundle0.putLong("tresponse", this.zzFB);
            bundle0.putLong("timp", this.zzFx);
            bundle0.putLong("tload", this.zzFy);
            bundle0.putLong("pcc", this.zzFz);
            bundle0.putLong("tfetch", this.zzFw);
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: this.zzFt) {
                arrayList0.add(((zza)object1).toBundle());
            }
            bundle0.putParcelableArrayList("tclick", arrayList0);
            return bundle0;
        }
    }

    public void zzfP() {
        synchronized(this.zzqt) {
            if(this.zzFB != -1L && this.zzFx == -1L) {
                this.zzFx = SystemClock.elapsedRealtime();
                this.zzpv.zza(this);
            }
            this.zzpv.zzfX().zzfP();
        }
    }

    public void zzfQ() {
        synchronized(this.zzqt) {
            if(this.zzFB != -1L) {
                zza zzhb$zza0 = new zza();
                zzhb$zza0.zzfU();
                this.zzFt.add(zzhb$zza0);
                ++this.zzFz;
                this.zzpv.zzfX().zzfQ();
                this.zzpv.zza(this);
            }
        }
    }

    public void zzfR() {
        synchronized(this.zzqt) {
            if(this.zzFB != -1L && !this.zzFt.isEmpty()) {
                zza zzhb$zza0 = (zza)this.zzFt.getLast();
                if(zzhb$zza0.zzfS() == -1L) {
                    zzhb$zza0.zzfT();
                    this.zzpv.zza(this);
                }
            }
        }
    }

    public void zzh(AdRequestParcel adRequestParcel0) {
        synchronized(this.zzqt) {
            this.zzFA = SystemClock.elapsedRealtime();
            this.zzpv.zzfX().zzb(adRequestParcel0, this.zzFA);
        }
    }

    public void zzl(long v) {
        synchronized(this.zzqt) {
            this.zzFB = v;
            if(this.zzFB != -1L) {
                this.zzpv.zza(this);
            }
        }
    }

    public void zzm(long v) {
        synchronized(this.zzqt) {
            if(this.zzFB != -1L) {
                this.zzFw = v;
                this.zzpv.zza(this);
            }
        }
    }

    public void zzy(boolean z) {
        synchronized(this.zzqt) {
            if(this.zzFB != -1L) {
                this.zzFy = SystemClock.elapsedRealtime();
                if(!z) {
                    this.zzFx = this.zzFy;
                    this.zzpv.zza(this);
                }
            }
        }
    }

    public void zzz(boolean z) {
        synchronized(this.zzqt) {
            if(this.zzFB != -1L) {
                this.zzDY = z;
                this.zzpv.zza(this);
            }
        }
    }
}

