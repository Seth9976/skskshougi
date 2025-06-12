package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.Api.ClientKey;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class zzk {
    public static final ClientKey zzNX;
    public static final String zzUQ;
    public static final String zzUR;
    public static final Charset zzUS;

    static {
        zzk.zzNX = new ClientKey();
        zzk.zzUQ = "urn:x-cast:com.google.cast.receiver";
        zzk.zzUR = "urn:x-cast:com.google.cast.tp.connection";
        Charset charset0 = null;
        try {
            charset0 = Charset.forName("UTF-8");
        }
        catch(IllegalCharsetNameException | UnsupportedCharsetException unused_ex) {
        }
        zzk.zzUS = charset0;
    }
}

