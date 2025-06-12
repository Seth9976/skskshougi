package com.loopj.android.http;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.protocol.HttpContext;

public class PreemptiveAuthorizationHttpRequestInterceptor implements HttpRequestInterceptor {
    public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
        AuthState authState = (AuthState)context.getAttribute("http.auth.target-scope");
        CredentialsProvider credsProvider = (CredentialsProvider)context.getAttribute("http.auth.credentials-provider");
        HttpHost targetHost = (HttpHost)context.getAttribute("http.target_host");
        if(authState.getAuthScheme() == null) {
            Credentials credentials0 = credsProvider.getCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()));
            if(credentials0 != null) {
                authState.setAuthScheme(((AuthScheme)new BasicScheme()));
                authState.setCredentials(credentials0);
            }
        }
    }
}

