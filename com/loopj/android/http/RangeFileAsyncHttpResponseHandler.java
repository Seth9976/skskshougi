package com.loopj.android.http;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpUriRequest;

public abstract class RangeFileAsyncHttpResponseHandler extends FileAsyncHttpResponseHandler {
    private static final String LOG_TAG = "RangeFileAsyncHttpRH";
    private boolean append;
    private long current;

    public RangeFileAsyncHttpResponseHandler(File file) {
        super(file);
        this.current = 0L;
        this.append = false;
    }

    @Override  // com.loopj.android.http.FileAsyncHttpResponseHandler
    protected byte[] getResponseData(HttpEntity entity) throws IOException {
        if(entity != null) {
            InputStream inputStream0 = entity.getContent();
            long contentLength = entity.getContentLength() + this.current;
            FileOutputStream buffer = new FileOutputStream(this.getTargetFile(), this.append);
            if(inputStream0 != null) {
                try {
                    byte[] tmp = new byte[0x1000];
                    while(this.current < contentLength) {
                        int v2 = inputStream0.read(tmp);
                        if(v2 == -1 || Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        this.current += (long)v2;
                        buffer.write(tmp, 0, v2);
                        this.sendProgressMessage(this.current, contentLength);
                    }
                }
                finally {
                    inputStream0.close();
                    buffer.flush();
                    buffer.close();
                }
            }
        }
        return null;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public void sendResponseMessage(HttpResponse response) throws IOException {
        if(!Thread.currentThread().isInterrupted()) {
            StatusLine statusLine0 = response.getStatusLine();
            if(statusLine0.getStatusCode() == 0x1A0) {
                if(!Thread.currentThread().isInterrupted()) {
                    this.sendSuccessMessage(statusLine0.getStatusCode(), response.getAllHeaders(), null);
                }
            }
            else if(statusLine0.getStatusCode() >= 300) {
                if(!Thread.currentThread().isInterrupted()) {
                    this.sendFailureMessage(statusLine0.getStatusCode(), response.getAllHeaders(), null, ((Throwable)new HttpResponseException(statusLine0.getStatusCode(), statusLine0.getReasonPhrase())));
                }
            }
            else if(!Thread.currentThread().isInterrupted()) {
                Header header0 = response.getFirstHeader("Content-Range");
                if(header0 == null) {
                    this.append = false;
                    this.current = 0L;
                }
                else {
                    AsyncHttpClient.log.v("RangeFileAsyncHttpRH", "Content-Range: " + header0.getValue());
                }
                this.sendSuccessMessage(statusLine0.getStatusCode(), response.getAllHeaders(), this.getResponseData(response.getEntity()));
            }
        }
    }

    public void updateRequestHeaders(HttpUriRequest uriRequest) {
        if(this.file.exists() && this.file.canWrite()) {
            this.current = this.file.length();
        }
        if(this.current > 0L) {
            this.append = true;
            uriRequest.setHeader("Range", "bytes=" + this.current + "-");
        }
    }
}

