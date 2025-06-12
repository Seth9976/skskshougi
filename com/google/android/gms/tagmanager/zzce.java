package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class zzce extends zzak {
    private static final String ID;
    private static final String zzaMO;
    private static final String zzaMP;
    private static final String zzaMQ;
    private static final String zzaMR;

    static {
        zzce.ID = "_reg";
        zzce.zzaMO = "arg0";
        zzce.zzaMP = "arg1";
        zzce.zzaMQ = "ignore_case";
        zzce.zzaMR = "group";
    }

    // 去混淆评级： 低(30)
    public zzce() {
        super("_reg", new String[]{"arg0", "arg1"});
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        int v1;
        int v = 0x40;
        zza zzag$zza0 = (zza)map0.get("arg0");
        zza zzag$zza1 = (zza)map0.get(zzce.zzaMP);
        if(zzag$zza0 == null || zzag$zza0 == zzdf.zzzQ() || zzag$zza1 == null || zzag$zza1 == zzdf.zzzQ()) {
            return zzdf.zzzQ();
        }
        if(zzdf.zzk(((zza)map0.get("ignore_case"))).booleanValue()) {
            v = 66;
        }
        zza zzag$zza2 = (zza)map0.get("group");
        if(zzag$zza2 == null) {
            v1 = 1;
        }
        else {
            Long long0 = zzdf.zzi(zzag$zza2);
            if(long0 == zzdf.zzzL()) {
                return zzdf.zzzQ();
            }
            v1 = long0.intValue();
            if(v1 < 0) {
                return zzdf.zzzQ();
            }
        }
        try {
            String s = zzdf.zzg(zzag$zza0);
            String s1 = null;
            Matcher matcher0 = Pattern.compile(zzdf.zzg(zzag$zza1), v).matcher(s);
            if(matcher0.find() && matcher0.groupCount() >= v1) {
                s1 = matcher0.group(v1);
            }
            return s1 == null ? zzdf.zzzQ() : zzdf.zzI(s1);
        }
        catch(PatternSyntaxException unused_ex) {
            return zzdf.zzzQ();
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

