package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@zzgd
class zzgj {
    private int zzBv;
    private final String zzDK;
    private final List zzEg;
    private final List zzEh;
    private final String zzEi;
    private final String zzEj;
    private final String zzEk;
    private final String zzEl;
    private final boolean zzEm;
    private String zzF;

    public zzgj(int v, Map map0) {
        this.zzF = (String)map0.get("url");
        this.zzEj = (String)map0.get("base_uri");
        this.zzEk = (String)map0.get("post_parameters");
        this.zzEm = zzgj.parseBoolean(((String)map0.get("drt_include")));
        this.zzEi = (String)map0.get("activation_overlay_url");
        this.zzEh = this.zzan(((String)map0.get("check_packages")));
        this.zzDK = (String)map0.get("request_id");
        this.zzEl = (String)map0.get("type");
        this.zzEg = this.zzan(((String)map0.get("errors")));
        this.zzBv = v;
    }

    public int getErrorCode() {
        return this.zzBv;
    }

    public String getRequestId() {
        return this.zzDK;
    }

    public String getType() {
        return this.zzEl;
    }

    public String getUrl() {
        return this.zzF;
    }

    // 去混淆评级： 低(20)
    private static boolean parseBoolean(String bool) {
        return bool != null && (bool.equals("1") || bool.equals("true"));
    }

    public void setUrl(String url) {
        this.zzF = url;
    }

    private List zzan(String s) {
        return s == null ? null : Arrays.asList(s.split(","));
    }

    public List zzfG() {
        return this.zzEg;
    }

    public String zzfH() {
        return this.zzEk;
    }

    public boolean zzfI() {
        return this.zzEm;
    }
}

