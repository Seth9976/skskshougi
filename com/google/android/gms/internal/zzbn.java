package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class zzbn {
    public static int zzB(String s) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes("UTF-8");
            return zzlj.zza(arr_b, 0, arr_b.length, 0);
        }
        catch(UnsupportedEncodingException unused_ex) {
            arr_b = s.getBytes();
            return zzlj.zza(arr_b, 0, arr_b.length, 0);
        }
    }

    public static String[] zzC(String s) {
        int v7;
        int v6;
        if(s == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        char[] arr_c = s.toCharArray();
        int v = s.length();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v3 < v) {
            int v4 = Character.codePointAt(arr_c, v3);
            int v5 = Character.charCount(v4);
            if(zzbn.zzh(v4)) {
                if(v1 != 0) {
                    arrayList0.add(new String(arr_c, v2, v3 - v2));
                }
                arrayList0.add(new String(arr_c, v3, v5));
                v6 = v2;
                v7 = 0;
            }
            else if(!Character.isLetterOrDigit(v4) && Character.getType(v4) != 6 && Character.getType(v4) != 8) {
                if(v1 != 0) {
                    arrayList0.add(new String(arr_c, v2, v3 - v2));
                }
                v6 = v2;
                v7 = 0;
            }
            else {
                if(v1 == 0) {
                    v2 = v3;
                }
                v6 = v2;
                v7 = 1;
            }
            v3 += v5;
            v2 = v6;
            v1 = v7;
        }
        if(v1 != 0) {
            arrayList0.add(new String(arr_c, v2, v3 - v2));
        }
        return (String[])arrayList0.toArray(new String[arrayList0.size()]);
    }

    private static boolean zza(Character.UnicodeBlock character$UnicodeBlock0) {
        return character$UnicodeBlock0 == Character.UnicodeBlock.BOPOMOFO || character$UnicodeBlock0 == Character.UnicodeBlock.BOPOMOFO_EXTENDED || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_COMPATIBILITY || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || character$UnicodeBlock0 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || character$UnicodeBlock0 == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || character$UnicodeBlock0 == Character.UnicodeBlock.HANGUL_JAMO || character$UnicodeBlock0 == Character.UnicodeBlock.HANGUL_SYLLABLES || character$UnicodeBlock0 == Character.UnicodeBlock.HIRAGANA || character$UnicodeBlock0 == Character.UnicodeBlock.KATAKANA || character$UnicodeBlock0 == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS;
    }

    // 去混淆评级： 低(30)
    static boolean zzh(int v) {
        return Character.isLetter(v) && (zzbn.zza(Character.UnicodeBlock.of(v)) || zzbn.zzi(v));
    }

    // 去混淆评级： 低(20)
    private static boolean zzi(int v) {
        return v >= 0xFF66 && v <= 0xFF9D || v >= 0xFFA1 && v <= 0xFFDC;
    }
}

