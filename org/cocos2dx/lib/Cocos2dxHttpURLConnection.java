package org.cocos2dx.lib;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class Cocos2dxHttpURLConnection {
    private static final String POST_METHOD = "POST";
    private static final String PUT_METHOD = "PUT";

    static void addRequestHeader(HttpURLConnection urlConnection, String key, String value) {
        urlConnection.setRequestProperty(key, value);
    }

    public static String combinCookies(List list0, String hostDomain) {
        StringBuilder sbCookies = new StringBuilder();
        String domain = hostDomain;
        String path = "/";
        String secure = "FALSE";
        String key = null;
        String value = null;
        String expires = null;
        for(Object object0: list0) {
            String[] arr$ = ((String)object0).split(";");
            for(int i$ = 0; i$ < arr$.length; ++i$) {
                String part = arr$[i$];
                int v1 = part.indexOf("=");
                if(-1 != v1) {
                    String s8 = part.substring(0, v1);
                    String s9 = part.substring(v1 + 1);
                    if("expires".equalsIgnoreCase(s8.trim())) {
                        expires = Cocos2dxHttpURLConnection.str2Seconds(s9.trim());
                    }
                    else if("path".equalsIgnoreCase(s8.trim())) {
                        path = s9;
                    }
                    else if("secure".equalsIgnoreCase(s8.trim())) {
                        secure = s9;
                    }
                    else if("domain".equalsIgnoreCase(s8.trim())) {
                        domain = s9;
                    }
                    else if(!"version".equalsIgnoreCase(s8.trim()) && !"max-age".equalsIgnoreCase(s8.trim())) {
                        key = s8;
                        value = s9;
                    }
                }
            }
            if(domain == null) {
                domain = "none";
            }
            sbCookies.append(domain);
            sbCookies.append('\t');
            sbCookies.append("FALSE");
            sbCookies.append('\t');
            sbCookies.append(path);
            sbCookies.append('\t');
            sbCookies.append(secure);
            sbCookies.append('\t');
            sbCookies.append(expires);
            sbCookies.append("\t");
            sbCookies.append(key);
            sbCookies.append("\t");
            sbCookies.append(value);
            sbCookies.append('\n');
        }
        return sbCookies.toString();
    }

    static int connect(HttpURLConnection http) {
        try {
            http.connect();
            return 0;
        }
        catch(IOException e) {
            Log.e("cocos2d-x debug info", "come in connect");
            Log.e("cocos2d-x debug info", e.toString());
            return 1;
        }
    }

    static HttpURLConnection createHttpURLConnection(String linkURL) {
        try {
            HttpURLConnection urlConnection = (HttpURLConnection)new URL(linkURL).openConnection();
            urlConnection.setRequestProperty("Accept-Encoding", "identity");
            urlConnection.setDoInput(true);
            return urlConnection;
        }
        catch(Exception e) {
            Log.e("URLConnection exception", e.toString());
            return null;
        }
    }

    static void disconnect(HttpURLConnection http) {
        http.disconnect();
    }

    static int getResponseCode(HttpURLConnection http) {
        try {
            return http.getResponseCode();
        }
        catch(IOException e) {
            Log.e("URLConnection exception", e.toString());
            return 0;
        }
    }

    static byte[] getResponseContent(HttpURLConnection http) {
        InputStream in;
        try {
            in = http.getInputStream();
            String s = http.getContentEncoding();
            if(s != null) {
                if(s.equalsIgnoreCase("gzip")) {
                    in = new GZIPInputStream(http.getInputStream());
                }
                else if(s.equalsIgnoreCase("deflate")) {
                    in = new InflaterInputStream(http.getInputStream());
                }
            }
        }
        catch(IOException unused_ex) {
            in = http.getErrorStream();
        }
        catch(Exception e) {
            Log.e("URLConnection exception", e.toString());
            return null;
        }
        try {
            byte[] buffer = new byte[0x400];
            ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
            int size;
            while((size = in.read(buffer, 0, 0x400)) != -1) {
                bytestream.write(buffer, 0, size);
            }
            byte[] arr_b1 = bytestream.toByteArray();
            bytestream.close();
            return arr_b1;
        }
        catch(Exception e) {
            Log.e("URLConnection exception", e.toString());
            return null;
        }
    }

    static String getResponseHeaderByIdx(HttpURLConnection http, int idx) {
        Map map0 = http.getHeaderFields();
        if(map0 == null) {
            return null;
        }
        int counter = 0;
        for(Object object0: map0.entrySet()) {
            Map.Entry entry = (Map.Entry)object0;
            if(counter == idx) {
                String key = (String)entry.getKey();
                return key == null ? Cocos2dxHttpURLConnection.listToString(((List)entry.getValue()), ",") + "\n" : key + ":" + Cocos2dxHttpURLConnection.listToString(((List)entry.getValue()), ",") + "\n";
            }
            ++counter;
        }
        return null;
    }

    static String getResponseHeaderByKey(HttpURLConnection http, String key) {
        if(key != null) {
            Map map0 = http.getHeaderFields();
            if(map0 != null) {
                for(Object object0: map0.entrySet()) {
                    Map.Entry entry = (Map.Entry)object0;
                    if(key.equalsIgnoreCase(((String)entry.getKey()))) {
                        return "set-cookie".equalsIgnoreCase(key) ? Cocos2dxHttpURLConnection.combinCookies(((List)entry.getValue()), http.getURL().getHost()) : Cocos2dxHttpURLConnection.listToString(((List)entry.getValue()), ",");
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    static int getResponseHeaderByKeyInt(HttpURLConnection http, String key) {
        String s1 = http.getHeaderField(key);
        return s1 == null ? 0 : Integer.parseInt(s1);
    }

    static String getResponseHeaders(HttpURLConnection http) {
        Map map0 = http.getHeaderFields();
        if(map0 == null) {
            return null;
        }
        String header = "";
        for(Object object0: map0.entrySet()) {
            Map.Entry entry = (Map.Entry)object0;
            String key = (String)entry.getKey();
            header = key == null ? header + Cocos2dxHttpURLConnection.listToString(((List)entry.getValue()), ",") + "\n" : header + key + ":" + Cocos2dxHttpURLConnection.listToString(((List)entry.getValue()), ",") + "\n";
        }
        return header;
    }

    static String getResponseMessage(HttpURLConnection http) {
        try {
            return http.getResponseMessage();
        }
        catch(IOException e) {
            String s = e.toString();
            Log.e("URLConnection exception", s);
            return s;
        }
    }

    public static String listToString(List list0, String strInterVal) {
        if(list0 == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for(Object object0: list0) {
            String str = (String)object0;
            if(flag) {
                result.append(strInterVal);
            }
            if(str == null) {
                str = "";
            }
            result.append(str);
            flag = true;
        }
        return result.toString();
    }

    static void sendRequest(HttpURLConnection http, byte[] byteArray) {
        try {
            OutputStream outputStream0 = http.getOutputStream();
            if(byteArray != null) {
                outputStream0.write(byteArray);
                outputStream0.flush();
            }
            outputStream0.close();
        }
        catch(IOException e) {
            Log.e("URLConnection exception", e.toString());
        }
    }

    static void setReadAndConnectTimeout(HttpURLConnection urlConnection, int readMiliseconds, int connectMiliseconds) {
        urlConnection.setReadTimeout(readMiliseconds);
        urlConnection.setConnectTimeout(connectMiliseconds);
    }

    static void setRequestMethod(HttpURLConnection urlConnection, String method) {
        try {
            urlConnection.setRequestMethod(method);
            if(method.equalsIgnoreCase("POST") || method.equalsIgnoreCase("PUT")) {
                urlConnection.setDoOutput(true);
            }
        }
        catch(ProtocolException e) {
            Log.e("URLConnection exception", e.toString());
        }
    }

    static void setVerifySSL(HttpURLConnection urlConnection, String sslFilename) {
        if(!(urlConnection instanceof HttpsURLConnection)) {
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)urlConnection;
        try {
            BufferedInputStream caInput = sslFilename.startsWith("/") ? new BufferedInputStream(new FileInputStream(sslFilename)) : new BufferedInputStream(Cocos2dxHelper.getActivity().getAssets().open(sslFilename.substring(7)));
            Certificate certificate0 = CertificateFactory.getInstance("X.509").generateCertificate(caInput);
            System.out.println("ca=" + ((X509Certificate)certificate0).getSubjectDN());
            caInput.close();
            KeyStore keyStore0 = KeyStore.getInstance("pkcs12");
            keyStore0.load(null, null);
            keyStore0.setCertificateEntry("ca", certificate0);
            TrustManagerFactory trustManagerFactory0 = TrustManagerFactory.getInstance("PKIX");
            trustManagerFactory0.init(keyStore0);
            SSLContext sSLContext0 = SSLContext.getInstance("TLS");
            sSLContext0.init(null, trustManagerFactory0.getTrustManagers(), null);
            httpsURLConnection.setSSLSocketFactory(sSLContext0.getSocketFactory());
        }
        catch(Exception e) {
            Log.e("URLConnection exception", e.toString());
        }
    }

    private static String str2Seconds(String strTime) {
        Calendar calendar0 = Calendar.getInstance();
        try {
            calendar0.setTime(new SimpleDateFormat("EEE, dd-MMM-yy hh:mm:ss zzz", Locale.US).parse(strTime));
            return Long.toString(calendar0.getTimeInMillis() / 1000L);
        }
        catch(ParseException e) {
            Log.e("URLConnection exception", e.toString());
            return "0";
        }
    }
}

