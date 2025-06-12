package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzt {
    public static final class zza {
        private final Object zzGE;
        private final List zzabb;

        private zza(Object object0) {
            this.zzGE = zzu.zzu(object0);
            this.zzabb = new ArrayList();
        }

        zza(Object object0, com.google.android.gms.common.internal.zzt.1 zzt$10) {
            this(object0);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(100).append(this.zzGE.getClass().getSimpleName()).append('{');
            int v = this.zzabb.size();
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(((String)this.zzabb.get(v1)));
                if(v1 < v - 1) {
                    stringBuilder0.append(", ");
                }
            }
            return stringBuilder0.append('}').toString();
        }

        public zza zzg(String s, Object object0) {
            String s1 = ((String)zzu.zzu(s)) + "=" + object0;
            this.zzabb.add(s1);
            return this;
        }
    }

    // 去混淆评级： 低(20)
    public static boolean equal(Object a, Object b) {
        return a == b || a != null && a.equals(b);
    }

    public static int hashCode(Object[] objects) {
        return Arrays.hashCode(objects);
    }

    public static zza zzt(Object object0) {
        return new zza(object0, null);
    }

    class com.google.android.gms.common.internal.zzt.1 {
    }

}

