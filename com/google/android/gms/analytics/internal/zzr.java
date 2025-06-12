package com.google.android.gms.analytics.internal;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import java.util.HashSet;
import java.util.Set;

public class zzr {
    private final zzf zzIa;
    private Boolean zzKO;
    private String zzKP;
    private Set zzKQ;

    protected zzr(zzf zzf0) {
        zzu.zzu(zzf0);
        this.zzIa = zzf0;
    }

    public boolean zziW() [...] // Potential decryptor

    public boolean zziX() {
        if(this.zzKO == null) {
            synchronized(this) {
                if(this.zzKO == null) {
                    Context context0 = this.zzIa.getContext();
                    ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
                    if(applicationInfo0 != null) {
                        String s = applicationInfo0.processName;
                        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
                        if(activityManager0 != null) {
                            int v1 = Process.myPid();
                            for(Object object0: activityManager0.getRunningAppProcesses()) {
                                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                                if(v1 == activityManager$RunningAppProcessInfo0.pid) {
                                    this.zzKO = Boolean.valueOf(s != null && s.equals(activityManager$RunningAppProcessInfo0.processName));
                                    break;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                    }
                    if(this.zzKO == null) {
                        this.zzKO = Boolean.TRUE;
                        this.zzIa.zzhQ().zzaX("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzKO.booleanValue();
    }

    public boolean zziY() {
        return ((Boolean)zzy.zzLa.get()).booleanValue();
    }

    public int zziZ() {
        return (int)(((Integer)zzy.zzLt.get()));
    }

    public int zzjA() {
        return (int)(((Integer)zzy.zzLE.get()));
    }

    public long zzjB() {
        return (long)(((Long)zzy.zzLF.get()));
    }

    public long zzjC() {
        return (long)(((Long)zzy.zzLO.get()));
    }

    public int zzja() {
        return (int)(((Integer)zzy.zzLx.get()));
    }

    public int zzjb() {
        return (int)(((Integer)zzy.zzLy.get()));
    }

    public int zzjc() {
        return (int)(((Integer)zzy.zzLz.get()));
    }

    public long zzjd() {
        return (long)(((Long)zzy.zzLi.get()));
    }

    public long zzje() {
        return (long)(((Long)zzy.zzLh.get()));
    }

    public long zzjf() {
        return (long)(((Long)zzy.zzLl.get()));
    }

    public long zzjg() {
        return (long)(((Long)zzy.zzLm.get()));
    }

    public int zzjh() {
        return (int)(((Integer)zzy.zzLn.get()));
    }

    public int zzji() {
        return (int)(((Integer)zzy.zzLo.get()));
    }

    public long zzjj() {
        return (long)(((int)(((Integer)zzy.zzLB.get()))));
    }

    // 去混淆评级： 低(20)
    public String zzjk() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    public String zzjl() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    public String zzjm() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    public String zzjn() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    public zzm zzjo() {
        return zzm.zzbc("BATCH_BY_COUNT");
    }

    // 去混淆评级： 低(20)
    public zzo zzjp() {
        return zzo.zzbd("GZIP");
    }

    public Set zzjq() {
        if(this.zzKQ == null || this.zzKP == null || !this.zzKP.equals("404,502")) {
            String[] arr_s = TextUtils.split("404,502", ",");
            HashSet hashSet0 = new HashSet();
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                try {
                    hashSet0.add(Integer.parseInt(s));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            this.zzKP = "404,502";
            this.zzKQ = hashSet0;
        }
        return this.zzKQ;
    }

    public long zzjr() {
        return (long)(((Long)zzy.zzLJ.get()));
    }

    public long zzjs() {
        return (long)(((Long)zzy.zzLK.get()));
    }

    public long zzjt() {
        return (long)(((Long)zzy.zzLN.get()));
    }

    public int zzju() {
        return (int)(((Integer)zzy.zzLe.get()));
    }

    public int zzjv() {
        return (int)(((Integer)zzy.zzLg.get()));
    }

    public String zzjw() [...] // Potential decryptor

    public String zzjx() [...] // Potential decryptor

    public long zzjy() {
        return 86400000L;
    }

    public int zzjz() {
        return (int)(((Integer)zzy.zzLD.get()));
    }
}

