package com.google.android.gms.internal;

import android.database.CharArrayBuffer;

public final class zzlc {
    public static void zzb(String s, CharArrayBuffer charArrayBuffer0) {
        if(charArrayBuffer0.data == null || charArrayBuffer0.data.length < s.length()) {
            charArrayBuffer0.data = s.toCharArray();
        }
        charArrayBuffer0.sizeCopied = s.length();
    }
}

