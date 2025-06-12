package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import org.json.JSONException;

public final class zzqc {
    public static zzqb zzaPm;

    static {
        zzqc.zzaPm = new zzqb() {
            @Override  // com.google.android.gms.internal.zzqb
            public Object zzt(byte[] arr_b) throws zzg {
                if(arr_b == null) {
                    throw new zzg("Cannot parse a null byte[]");
                }
                if(arr_b.length == 0) {
                    throw new zzg("Cannot parse a 0 length byte[]");
                }
                try {
                    zzc zzqf$zzc0 = zzpz.zzey(new String(arr_b));
                    if(zzqf$zzc0 != null) {
                        zzbg.zzaB("The container was successfully parsed from the resource");
                    }
                    return zzqf$zzc0;
                }
                catch(JSONException unused_ex) {
                    throw new zzg("The resource data is corrupted. The container cannot be extracted from the binary data");
                }
                catch(zzg unused_ex) {
                    throw new zzg("The resource data is invalid. The container cannot be extracted from the binary data");
                }
            }
        };
    }
}

