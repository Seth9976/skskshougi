package com.loopj.android.http;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

public class PersistentCookieStore implements CookieStore {
    private static final String COOKIE_NAME_PREFIX = "cookie_";
    private static final String COOKIE_NAME_STORE = "names";
    private static final String COOKIE_PREFS = "CookiePrefsFile";
    private static final String LOG_TAG = "PersistentCookieStore";
    private final SharedPreferences cookiePrefs;
    private final ConcurrentHashMap cookies;
    private boolean omitNonPersistentCookies;

    public PersistentCookieStore(Context context) {
        this.omitNonPersistentCookies = false;
        this.cookiePrefs = context.getSharedPreferences("CookiePrefsFile", 0);
        this.cookies = new ConcurrentHashMap();
        String s = this.cookiePrefs.getString("names", null);
        if(s != null) {
            String[] arr_s = TextUtils.split(s, ",");
            for(int v = 0; v < arr_s.length; ++v) {
                String name = arr_s[v];
                String s2 = this.cookiePrefs.getString("cookie_" + name, null);
                if(s2 != null) {
                    Cookie cookie0 = this.decodeCookie(s2);
                    if(cookie0 != null) {
                        this.cookies.put(name, cookie0);
                    }
                }
            }
            this.clearExpired(new Date());
        }
    }

    public void addCookie(Cookie cookie) {
        if(this.omitNonPersistentCookies && !cookie.isPersistent()) {
            return;
        }
        String s = cookie.getName() + cookie.getDomain();
        if(cookie.isExpired(new Date())) {
            this.cookies.remove(s);
        }
        else {
            this.cookies.put(s, cookie);
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.cookiePrefs.edit();
        sharedPreferences$Editor0.putString("names", TextUtils.join(",", this.cookies.keySet()));
        sharedPreferences$Editor0.putString("cookie_" + s, this.encodeCookie(new SerializableCookie(cookie)));
        sharedPreferences$Editor0.commit();
    }

    protected String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for(int v = 0; v < bytes.length; ++v) {
            int v = bytes[v] & 0xFF;
            if(v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    public void clear() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.cookiePrefs.edit();
        for(Object object0: this.cookies.keySet()) {
            sharedPreferences$Editor0.remove("cookie_" + ((String)object0));
        }
        sharedPreferences$Editor0.remove("names");
        sharedPreferences$Editor0.commit();
        this.cookies.clear();
    }

    public boolean clearExpired(Date date) {
        boolean clearedAny = false;
        SharedPreferences.Editor sharedPreferences$Editor0 = this.cookiePrefs.edit();
        for(Object object0: this.cookies.entrySet()) {
            String name = (String)((Map.Entry)object0).getKey();
            if(((Cookie)((Map.Entry)object0).getValue()).isExpired(date)) {
                this.cookies.remove(name);
                sharedPreferences$Editor0.remove("cookie_" + name);
                clearedAny = true;
            }
        }
        if(clearedAny) {
            sharedPreferences$Editor0.putString("names", TextUtils.join(",", this.cookies.keySet()));
        }
        sharedPreferences$Editor0.commit();
        return clearedAny;
    }

    protected Cookie decodeCookie(String cookieString) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.hexStringToByteArray(cookieString));
        try {
            return ((SerializableCookie)new ObjectInputStream(byteArrayInputStream).readObject()).getCookie();
        }
        catch(IOException e) {
            AsyncHttpClient.log.d("PersistentCookieStore", "IOException in decodeCookie", e);
            return null;
        }
        catch(ClassNotFoundException e) {
            AsyncHttpClient.log.d("PersistentCookieStore", "ClassNotFoundException in decodeCookie", e);
            return null;
        }
    }

    public void deleteCookie(Cookie cookie) {
        String s = cookie.getName() + cookie.getDomain();
        this.cookies.remove(s);
        SharedPreferences.Editor sharedPreferences$Editor0 = this.cookiePrefs.edit();
        sharedPreferences$Editor0.remove("cookie_" + s);
        sharedPreferences$Editor0.commit();
    }

    protected String encodeCookie(SerializableCookie cookie) {
        if(cookie == null) {
            return null;
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(os).writeObject(cookie);
            return this.byteArrayToHexString(os.toByteArray());
        }
        catch(IOException e) {
            AsyncHttpClient.log.d("PersistentCookieStore", "IOException in encodeCookie", e);
            return null;
        }
    }

    public List getCookies() {
        return new ArrayList(this.cookies.values());
    }

    protected byte[] hexStringToByteArray(String hexString) {
        int v = hexString.length();
        byte[] data = new byte[v / 2];
        for(int i = 0; i < v; i += 2) {
            data[i / 2] = (byte)((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i + 1), 16));
        }
        return data;
    }

    public void setOmitNonPersistentCookies(boolean omitNonPersistentCookies) {
        this.omitNonPersistentCookies = omitNonPersistentCookies;
    }
}

