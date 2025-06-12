package com.google.android.gms.tagmanager;

class zzm {
    public interface zza {
        int sizeOf(Object arg1, Object arg2);
    }

    final zza zzaKw;

    public zzm() {
        this.zzaKw = new zza() {
            @Override  // com.google.android.gms.tagmanager.zzm$zza
            public int sizeOf(Object object0, Object object1) {
                return 1;
            }
        };
    }

    public zzl zza(int v, zza zzm$zza0) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        return new zzba(v, zzm$zza0);
    }

    int zzyj() [...] // Potential decryptor
}

