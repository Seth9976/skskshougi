package com.google.android.gms.internal;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

@zzgd
public class zzho {
    public interface zza {
        Object zzft();

        Object zzh(InputStream arg1);
    }

    static class zzb extends zzk {
        private final zza zzGz;
        private final com.google.android.gms.internal.zzm.zzb zzaH;

        public zzb(String s, zza zzho$zza0, com.google.android.gms.internal.zzm.zzb zzm$zzb0) {
            super(0, s, new com.google.android.gms.internal.zzm.zza() {
                @Override  // com.google.android.gms.internal.zzm$zza
                public void zze(zzr zzr0) {
                    Object object0 = this.zzGB.zzft();
                    zzho$zza0.zzb(object0);
                }
            });
            this.zzGz = zzho$zza0;
            this.zzaH = zzm$zzb0;
        }

        @Override  // com.google.android.gms.internal.zzk
        protected zzm zza(zzi zzi0) {
            return zzm.zza(new ByteArrayInputStream(zzi0.data), zzx.zzb(zzi0));
        }

        @Override  // com.google.android.gms.internal.zzk
        protected void zza(Object object0) {
            this.zzj(((InputStream)object0));
        }

        protected void zzj(InputStream inputStream0) {
            Object object0 = this.zzGz.zzh(inputStream0);
            this.zzaH.zzb(object0);
        }
    }

    class zzc extends zzhs implements com.google.android.gms.internal.zzm.zzb {
        final zzho zzGx;

        private zzc() {
        }

        zzc(com.google.android.gms.internal.zzho.1 zzho$10) {
        }

        @Override  // com.google.android.gms.internal.zzm$zzb
        public void zzb(Object object0) {
            super.zzf(object0);
        }
    }

    private static zzl zzGu;
    public static final zza zzGv;
    private static final Object zzoW;

    static {
        zzho.zzoW = new Object();
        zzho.zzGv = new zza() {
            public Void zzgu() [...] // Inlined contents

            public Void zzi(InputStream inputStream0) [...] // Inlined contents
        };
    }

    public zzho(Context context0) {
        zzho.zzGu = zzho.zzN(context0);
    }

    private static zzl zzN(Context context0) {
        synchronized(zzho.zzoW) {
            if(zzho.zzGu == null) {
                zzho.zzGu = zzac.zza(context0.getApplicationContext());
            }
            return zzho.zzGu;
        }
    }

    public zzhv zza(String s, zza zzho$zza0) {
        zzhv zzhv0 = new zzc(this, null);
        zzho.zzGu.zze(new zzb(s, zzho$zza0, ((com.google.android.gms.internal.zzm.zzb)zzhv0)));
        return zzhv0;
    }

    public zzhv zzb(String s, Map map0) {
        zzhv zzhv0 = new zzc(this, null);
        com.google.android.gms.internal.zzho.3 zzho$30 = new zzab(s, ((com.google.android.gms.internal.zzm.zzb)zzhv0), new com.google.android.gms.internal.zzm.zza() {
            @Override  // com.google.android.gms.internal.zzm$zza
            public void zze(zzr zzr0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Failed to load URL: " + s + "\n" + zzr0.toString()));
                ((zzc)zzhv0).zzb(null);
            }
        }) {
            @Override  // com.google.android.gms.internal.zzk
            public Map getHeaders() throws com.google.android.gms.internal.zza {
                return map0 == null ? super.getHeaders() : map0;
            }
        };
        zzho.zzGu.zze(zzho$30);
        return zzhv0;
    }
}

