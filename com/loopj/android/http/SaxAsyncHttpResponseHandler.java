package com.loopj.android.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public abstract class SaxAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "SaxAsyncHttpRH";
    private DefaultHandler handler;

    public SaxAsyncHttpResponseHandler(DefaultHandler defaultHandler0) {
        this.handler = null;
        if(defaultHandler0 == null) {
            throw new Error("null instance of <T extends DefaultHandler> passed to constructor");
        }
        this.handler = defaultHandler0;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    protected byte[] getResponseData(HttpEntity entity) throws IOException {
        InputStreamReader inputStreamReader;
        XMLReader xMLReader0;
        if(entity != null) {
            InputStream inputStream0 = entity.getContent();
            InputStreamReader inputStreamReader = null;
            if(inputStream0 != null) {
                try {
                    xMLReader0 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                    xMLReader0.setContentHandler(this.handler);
                    inputStreamReader = new InputStreamReader(inputStream0, this.getCharset());
                    goto label_12;
                }
                catch(SAXException e) {
                    goto label_16;
                }
                catch(ParserConfigurationException e) {
                    goto label_24;
                    try {
                    label_12:
                        xMLReader0.parse(new InputSource(inputStreamReader));
                        goto label_39;
                    }
                    catch(SAXException e) {
                    }
                    catch(ParserConfigurationException e) {
                        goto label_23;
                    }
                    catch(Throwable throwable0) {
                        goto label_34;
                    }
                    inputStreamReader = inputStreamReader;
                    try {
                    label_16:
                        AsyncHttpClient.log.e("SaxAsyncHttpRH", "getResponseData exception", e);
                    }
                    catch(Throwable throwable0) {
                        goto label_35;
                    }
                    AsyncHttpClient.silentCloseInputStream(inputStream0);
                    if(inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        }
                        catch(IOException unused_ex) {
                        }
                        return null;
                    label_23:
                        inputStreamReader = inputStreamReader;
                        try {
                        label_24:
                            AsyncHttpClient.log.e("SaxAsyncHttpRH", "getResponseData exception", e);
                            goto label_28;
                        }
                        catch(Throwable throwable0) {
                        }
                        goto label_35;
                    }
                    return null;
                }
                catch(Throwable throwable0) {
                    goto label_35;
                }
            label_28:
                AsyncHttpClient.silentCloseInputStream(inputStream0);
                if(inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    }
                    catch(IOException unused_ex) {
                    }
                    return null;
                label_34:
                    inputStreamReader = inputStreamReader;
                label_35:
                    AsyncHttpClient.silentCloseInputStream(inputStream0);
                    if(inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        }
                        catch(IOException unused_ex) {
                        }
                    }
                    throw throwable0;
                label_39:
                    AsyncHttpClient.silentCloseInputStream(inputStream0);
                    try {
                        inputStreamReader.close();
                    }
                    catch(IOException unused_ex) {
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public abstract void onFailure(int arg1, Header[] arg2, DefaultHandler arg3);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
        this.onFailure(statusCode, headers, this.handler);
    }

    public abstract void onSuccess(int arg1, Header[] arg2, DefaultHandler arg3);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
        this.onSuccess(statusCode, headers, this.handler);
    }
}

