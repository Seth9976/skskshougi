package com.google.android.gms.tagmanager;

class zzk {
    public static byte[] zzee(String s) {
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("purported base16 string has odd number of characters");
        }
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            int v2 = Character.digit(s.charAt(v1), 16);
            int v3 = Character.digit(s.charAt(v1 + 1), 16);
            if(v2 == -1 || v3 == -1) {
                throw new IllegalArgumentException("purported base16 string has illegal char");
            }
            arr_b[v1 / 2] = (byte)((v2 << 4) + v3);
        }
        return arr_b;
    }

    public static String zzi(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if((v1 & 0xF0) == 0) {
                stringBuilder0.append("0");
            }
            stringBuilder0.append(Integer.toHexString(v1 & 0xFF));
        }
        return stringBuilder0.toString().toUpperCase();
    }
}

