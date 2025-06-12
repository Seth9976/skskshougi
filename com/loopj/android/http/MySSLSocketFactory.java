package com.loopj.android.http;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class MySSLSocketFactory extends SSLSocketFactory {
    SSLContext sslContext;

    public MySSLSocketFactory(KeyStore truststore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(truststore);
        this.sslContext = SSLContext.getInstance("TLS");
        TrustManager[] arr_trustManager = {new X509TrustManager() {
            @Override  // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            @Override  // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            @Override  // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }};
        this.sslContext.init(null, arr_trustManager, null);
    }

    @Override  // org.apache.http.conn.ssl.SSLSocketFactory
    public Socket createSocket() throws IOException {
        return this.sslContext.getSocketFactory().createSocket();
    }

    @Override  // org.apache.http.conn.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException {
        return this.sslContext.getSocketFactory().createSocket(socket, host, port, autoClose);
    }

    public void fixHttpsURLConnection() {
        HttpsURLConnection.setDefaultSSLSocketFactory(this.sslContext.getSocketFactory());
    }

    public static SSLSocketFactory getFixedSocketFactory() {
        try {
            SSLSocketFactory socketFactory = new MySSLSocketFactory(MySSLSocketFactory.getKeystore());
            socketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            return socketFactory;
        }
        catch(Throwable t) {
            t.printStackTrace();
            return SSLSocketFactory.getSocketFactory();
        }
    }

    public static KeyStore getKeystore() {
        KeyStore trustStore = null;
        try {
            trustStore = KeyStore.getInstance("pkcs12");
            trustStore.load(null, null);
        }
        catch(Throwable t) {
            t.printStackTrace();
        }
        return trustStore;
    }

    public static KeyStore getKeystoreOfCA(InputStream cert) {
        KeyStore keyStore;
        BufferedInputStream caInput;
        CertificateFactory certificateFactory0;
        Certificate ca;
        BufferedInputStream caInput = null;
        try {
            ca = null;
            certificateFactory0 = CertificateFactory.getInstance("X.509");
            caInput = new BufferedInputStream(cert);
            ca = certificateFactory0.generateCertificate(caInput);
            goto label_29;
        }
        catch(CertificateException e1) {
            goto label_11;
            try {
                ca = certificateFactory0.generateCertificate(caInput);
                goto label_29;
            }
            catch(CertificateException e1) {
            }
            catch(Throwable throwable0) {
                goto label_22;
            }
            caInput = caInput;
            try {
            label_11:
                e1.printStackTrace();
                goto label_15;
            }
            catch(Throwable throwable0) {
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_23;
        }
    label_15:
        if(caInput != null) {
            try {
                caInput.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
            goto label_33;
        label_22:
            caInput = caInput;
        label_23:
            if(caInput != null) {
                try {
                    caInput.close();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
            throw throwable0;
            try {
            label_29:
                caInput.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        try {
        label_33:
            keyStore = null;
            keyStore = KeyStore.getInstance("pkcs12");
            keyStore.load(null, null);
            keyStore.setCertificateEntry("ca", ca);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return keyStore;
    }

    public static DefaultHttpClient getNewHttpClient(KeyStore keyStore) {
        try {
            MySSLSocketFactory sf = new MySSLSocketFactory(keyStore);
            SchemeRegistry registry = new SchemeRegistry();
            registry.register(new Scheme("http", ((SocketFactory)PlainSocketFactory.getSocketFactory()), 80));
            registry.register(new Scheme("https", sf, 443));
            BasicHttpParams params = new BasicHttpParams();
            HttpProtocolParams.setVersion(((HttpParams)params), ((ProtocolVersion)HttpVersion.HTTP_1_1));
            HttpProtocolParams.setContentCharset(((HttpParams)params), "UTF-8");
            return new DefaultHttpClient(((ClientConnectionManager)new ThreadSafeClientConnManager(((HttpParams)params), registry)), ((HttpParams)params));
        }
        catch(Exception unused_ex) {
            return new DefaultHttpClient();
        }
    }
}

