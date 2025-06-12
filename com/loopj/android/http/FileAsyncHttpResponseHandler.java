package com.loopj.android.http;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public abstract class FileAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "FileAsyncHttpRH";
    protected final boolean append;
    protected final File file;
    protected File frontendFile;
    protected final boolean renameIfExists;

    public FileAsyncHttpResponseHandler(Context context) {
        this.file = this.getTemporaryFile(context);
        this.append = false;
        this.renameIfExists = false;
    }

    public FileAsyncHttpResponseHandler(File file) {
        this(file, false);
    }

    public FileAsyncHttpResponseHandler(File file, boolean append) {
        this(file, append, false);
    }

    public FileAsyncHttpResponseHandler(File file, boolean append, boolean renameTargetFileIfExists) {
        Utils.asserts(file != null, "File passed into FileAsyncHttpResponseHandler constructor must not be null");
        if(!file.isDirectory() && !file.getParentFile().isDirectory()) {
            Utils.asserts(file.getParentFile().mkdirs(), "Cannot create parent directories for requested File location");
        }
        if(file.isDirectory() && !file.mkdirs()) {
            AsyncHttpClient.log.d("FileAsyncHttpRH", "Cannot create directories for requested Directory location, might not be a problem");
        }
        this.file = file;
        this.append = append;
        this.renameIfExists = renameTargetFileIfExists;
    }

    public boolean deleteTargetFile() {
        return this.getTargetFile() != null && this.getTargetFile().delete();
    }

    protected File getOriginalFile() {
        Utils.asserts(this.file != null, "Target file is null, fatal!");
        return this.file;
    }

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    protected byte[] getResponseData(HttpEntity entity) throws IOException {
        if(entity != null) {
            InputStream inputStream0 = entity.getContent();
            long v = entity.getContentLength();
            FileOutputStream buffer = new FileOutputStream(this.getTargetFile(), this.append);
            if(inputStream0 != null) {
                try {
                    byte[] tmp = new byte[0x1000];
                    int count = 0;
                    while(true) {
                        int v3 = inputStream0.read(tmp);
                        if(v3 == -1 || Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        count += v3;
                        buffer.write(tmp, 0, v3);
                        this.sendProgressMessage(((long)count), v);
                    }
                }
                finally {
                    AsyncHttpClient.silentCloseInputStream(inputStream0);
                    buffer.flush();
                    AsyncHttpClient.silentCloseOutputStream(buffer);
                }
            }
        }
        return null;
    }

    public File getTargetFile() {
        if(this.frontendFile == null) {
            this.frontendFile = this.getOriginalFile().isDirectory() ? this.getTargetFileByParsingURL() : this.getOriginalFile();
        }
        return this.frontendFile;
    }

    protected File getTargetFileByParsingURL() {
        File targetFileRtn;
        Utils.asserts(this.getOriginalFile().isDirectory(), "Target file is not a directory, cannot proceed");
        Utils.asserts(this.getRequestURI() != null, "RequestURI is null, cannot proceed");
        String s = this.getRequestURI().toString();
        String s1 = s.substring(s.lastIndexOf(0x2F) + 1, s.length());
        File targetFileRtn = new File(this.getOriginalFile(), s1);
        if(targetFileRtn.exists() && this.renameIfExists) {
            String s2 = s1.contains(".") ? s1.substring(0, s1.lastIndexOf(46)) + " (%d)" + s1.substring(s1.lastIndexOf(46), s1.length()) : s1 + " (%d)";
            for(int index = 0; true; ++index) {
                targetFileRtn = new File(this.getOriginalFile(), String.format(s2, index));
                if(!targetFileRtn.exists()) {
                    break;
                }
            }
            return targetFileRtn;
        }
        return targetFileRtn;
    }

    protected File getTemporaryFile(Context context) {
        Utils.asserts(context != null, "Tried creating temporary file without having Context");
        try {
            return File.createTempFile("temp_", "_handled", context.getCacheDir());
        }
        catch(IOException e) {
            AsyncHttpClient.log.e("FileAsyncHttpRH", "Cannot create temporary file", e);
            return null;
        }
    }

    public abstract void onFailure(int arg1, Header[] arg2, Throwable arg3, File arg4);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public final void onFailure(int statusCode, Header[] headers, byte[] responseBytes, Throwable throwable) {
        this.onFailure(statusCode, headers, throwable, this.getTargetFile());
    }

    public abstract void onSuccess(int arg1, Header[] arg2, File arg3);

    @Override  // com.loopj.android.http.AsyncHttpResponseHandler
    public final void onSuccess(int statusCode, Header[] headers, byte[] responseBytes) {
        this.onSuccess(statusCode, headers, this.getTargetFile());
    }
}

