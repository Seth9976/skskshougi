package com.loopj.android.http;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.client.RedirectLocations;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

class MyRedirectHandler extends DefaultRedirectHandler {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private final boolean enableRedirects;

    public MyRedirectHandler(boolean allowRedirects) {
        this.enableRedirects = allowRedirects;
    }

    public URI getLocationURI(HttpResponse response, HttpContext context) throws ProtocolException {
        URI redirectURI;
        URI uri;
        if(response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        Header header0 = response.getFirstHeader("location");
        if(header0 == null) {
            throw new ProtocolException("Received redirect response " + response.getStatusLine() + " but no location header");
        }
        String s = header0.getValue().replaceAll(" ", "%20");
        try {
            uri = new URI(s);
        }
        catch(URISyntaxException ex) {
            throw new ProtocolException("Invalid redirect URI: " + s, ex);
        }
        HttpParams httpParams0 = response.getParams();
        if(!uri.isAbsolute()) {
            if(httpParams0.isParameterTrue("http.protocol.reject-relative-redirect")) {
                throw new ProtocolException("Relative redirect location \'" + uri + "\' not allowed");
            }
            HttpHost target = (HttpHost)context.getAttribute("http.target_host");
            if(target == null) {
                throw new IllegalStateException("Target host not available in the HTTP context");
            }
            HttpRequest request = (HttpRequest)context.getAttribute("http.request");
            try {
                uri = URIUtils.resolve(URIUtils.rewriteURI(new URI(request.getRequestLine().getUri()), target, true), uri);
            }
            catch(URISyntaxException ex) {
                throw new ProtocolException(ex.getMessage(), ex);
            }
        }
        if(httpParams0.isParameterFalse("http.protocol.allow-circular-redirects")) {
            RedirectLocations redirectLocations = (RedirectLocations)context.getAttribute("http.protocol.redirect-locations");
            if(redirectLocations == null) {
                redirectLocations = new RedirectLocations();
                context.setAttribute("http.protocol.redirect-locations", redirectLocations);
            }
            if(uri.getFragment() == null) {
                redirectURI = uri;
            }
            else {
                try {
                    redirectURI = URIUtils.rewriteURI(uri, new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), true);
                }
                catch(URISyntaxException ex) {
                    throw new ProtocolException(ex.getMessage(), ex);
                }
            }
            if(redirectLocations.contains(redirectURI)) {
                throw new CircularRedirectException("Circular redirect to \'" + redirectURI + "\'");
            }
            redirectLocations.add(redirectURI);
        }
        return uri;
    }

    public boolean isRedirectRequested(HttpResponse response, HttpContext context) {
        if(!this.enableRedirects) {
            return false;
        }
        if(response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        switch(response.getStatusLine().getStatusCode()) {
            case 301: 
            case 302: 
            case 303: 
            case 307: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

