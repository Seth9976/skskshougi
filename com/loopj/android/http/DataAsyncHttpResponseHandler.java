package com.loopj.android.http;

import android.os.Message;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "DataAsyncHttpRH";
    protected static final int PROGRESS_DATA_MESSAGE = 7;

    public static byte[] copyOfRange(byte[] original, int start, int end) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NullPointerException {
        if(start > end) {
            throw new IllegalArgumentException();
        }
        if(start < 0 || start > original.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int resultLength = end - start;
        byte[] result = new byte[resultLength];
        System.arraycopy(original, start, result, 0, Math.min(resultLength, original.length - start));
        return result;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    byte[] getResponseData(HttpEntity entity) throws IOException {
        if(entity != null) {
            InputStream inputStream0 = entity.getContent();
            if(inputStream0 != null) {
                long contentLength = entity.getContentLength();
                if(contentLength > 0x7FFFFFFFL) {
                    throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
                }
                if(contentLength < 0L) {
                    contentLength = 0x1000L;
                }
                try {
                    ByteArrayBuffer buffer = new ByteArrayBuffer(((int)contentLength));
                    try {
                        byte[] tmp = new byte[0x1000];
                        while(true) {
                            int v2 = inputStream0.read(tmp);
                            if(v2 == -1 || Thread.currentThread().isInterrupted()) {
                                break;
                            }
                            buffer.append(tmp, 0, v2);
                            this.sendProgressDataMessage(DataAsyncHttpResponseHandler.copyOfRange(tmp, 0, v2));
                            this.sendProgressMessage(0L, contentLength);
                        }
                    }
                    finally {
                        AsyncHttpClient.silentCloseInputStream(inputStream0);
                    }
                    return buffer.toByteArray();
                }
                catch(OutOfMemoryError unused_ex) {
                    System.gc();
                    throw new IOException("File too large to fit into available memory");
                }
            }
        }
        return null;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    protected void handleMessage(Message message) {
        super.handleMessage(message);
        if(message.what != 7) {
            return;
        }
        Object[] response = (Object[])message.obj;
        if(response != null && response.length >= 1) {
            try {
                this.onProgressData(((byte[])response[0]));
            }
            catch(Throwable t) {
                AsyncHttpClient.log.e("DataAsyncHttpRH", "custom onProgressData contains an error", t);
            }
            return;
        }
        AsyncHttpClient.log.e("DataAsyncHttpRH", "PROGRESS_DATA_MESSAGE didn\'t got enough params");
    }

    public void onProgressData(byte[] responseBody) {
        AsyncHttpClient.log.d("DataAsyncHttpRH", "onProgressData(byte[]) was not overriden, but callback was received");
    }

    public final void sendProgressDataMessage(byte[] responseBytes) {
        this.sendMessage(this.obtainMessage(7, new Object[]{responseBytes}));
    }
}

