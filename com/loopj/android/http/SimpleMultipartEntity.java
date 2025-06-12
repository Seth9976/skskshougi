package com.loopj.android.http;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class SimpleMultipartEntity implements HttpEntity {
    class FilePart {
        public File file;
        public byte[] header;

        public FilePart(String key, File file, String type) {
            this.header = this.createHeader(key, file.getName(), type);
            this.file = file;
        }

        public FilePart(String key, File file, String type, String customFileName) {
            if(TextUtils.isEmpty(customFileName)) {
                customFileName = file.getName();
            }
            this.header = this.createHeader(key, customFileName, type);
            this.file = file;
        }

        private byte[] createHeader(String key, String filename, String type) {
            ByteArrayOutputStream headerStream = new ByteArrayOutputStream();
            try {
                headerStream.write(SimpleMultipartEntity.this.boundaryLine);
                headerStream.write(SimpleMultipartEntity.this.createContentDisposition(key, filename));
                headerStream.write(SimpleMultipartEntity.this.createContentType(type));
                headerStream.write(new byte[]{67, 0x6F, 110, 0x74, 101, 110, 0x74, 45, 84, 0x72, 97, 110, 0x73, 102, 101, 0x72, 45, 69, 110, 99, 0x6F, 100, 105, 110, 103, 58, 0x20, 98, 105, 110, 97, 0x72, 0x79, 13, 10});
                headerStream.write(new byte[]{13, 10});
                return headerStream.toByteArray();
            }
            catch(IOException e) {
                AsyncHttpClient.log.e("SimpleMultipartEntity", "createHeader ByteArrayOutputStream exception", e);
                return headerStream.toByteArray();
            }
        }

        public long getTotalLength() {
            long v = this.file.length();
            return ((long)this.header.length) + (v + ((long)SimpleMultipartEntity.CR_LF.length));
        }

        public void writeTo(OutputStream out) throws IOException {
            out.write(this.header);
            SimpleMultipartEntity.this.updateProgress(((long)this.header.length));
            FileInputStream inputStream = new FileInputStream(this.file);
            byte[] tmp = new byte[0x1000];
            int v;
            while((v = inputStream.read(tmp)) != -1) {
                out.write(tmp, 0, v);
                SimpleMultipartEntity.this.updateProgress(((long)v));
            }
            out.write(new byte[]{13, 10});
            SimpleMultipartEntity.this.updateProgress(2L);
            out.flush();
            AsyncHttpClient.silentCloseInputStream(inputStream);
        }
    }

    private static final byte[] CR_LF = null;
    private static final String LOG_TAG = "SimpleMultipartEntity";
    private static final char[] MULTIPART_CHARS = null;
    private static final String STR_CR_LF = "\r\n";
    private static final byte[] TRANSFER_ENCODING_BINARY;
    private final String boundary;
    private final byte[] boundaryEnd;
    private final byte[] boundaryLine;
    private long bytesWritten;
    private final List fileParts;
    private boolean isRepeatable;
    private final ByteArrayOutputStream out;
    private final ResponseHandlerInterface progressHandler;
    private long totalSize;

    static {
        SimpleMultipartEntity.CR_LF = "\r\n".getBytes();
        SimpleMultipartEntity.TRANSFER_ENCODING_BINARY = "Content-Transfer-Encoding: binary\r\n".getBytes();
        SimpleMultipartEntity.MULTIPART_CHARS = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    public SimpleMultipartEntity(ResponseHandlerInterface progressHandler) {
        this.fileParts = new ArrayList();
        this.out = new ByteArrayOutputStream();
        StringBuilder buf = new StringBuilder();
        Random rand = new Random();
        for(int i = 0; i < 30; ++i) {
            buf.append(SimpleMultipartEntity.MULTIPART_CHARS[rand.nextInt(SimpleMultipartEntity.MULTIPART_CHARS.length)]);
        }
        this.boundary = buf.toString();
        this.boundaryLine = ("--" + this.boundary + "\r\n").getBytes();
        this.boundaryEnd = ("--" + this.boundary + "--" + "\r\n").getBytes();
        this.progressHandler = progressHandler;
    }

    static byte[] access$300() [...] // Potential decryptor

    public void addPart(String key, File file) {
        this.addPart(key, file, null);
    }

    public void addPart(String key, File file, String type) {
        FilePart simpleMultipartEntity$FilePart0 = new FilePart(this, key, file, this.normalizeContentType(type));
        this.fileParts.add(simpleMultipartEntity$FilePart0);
    }

    public void addPart(String key, File file, String type, String customFileName) {
        FilePart simpleMultipartEntity$FilePart0 = new FilePart(this, key, file, this.normalizeContentType(type), customFileName);
        this.fileParts.add(simpleMultipartEntity$FilePart0);
    }

    public void addPart(String key, String value) {
        this.addPartWithCharset(key, value, null);
    }

    public void addPart(String key, String streamName, InputStream inputStream, String type) throws IOException {
        this.out.write(this.boundaryLine);
        byte[] arr_b = this.createContentDisposition(key, streamName);
        this.out.write(arr_b);
        byte[] arr_b1 = this.createContentType(type);
        this.out.write(arr_b1);
        this.out.write(SimpleMultipartEntity.TRANSFER_ENCODING_BINARY);
        this.out.write(SimpleMultipartEntity.CR_LF);
        byte[] tmp = new byte[0x1000];
        int v;
        while((v = inputStream.read(tmp)) != -1) {
            this.out.write(tmp, 0, v);
        }
        this.out.write(SimpleMultipartEntity.CR_LF);
        this.out.flush();
    }

    public void addPart(String key, String value, String contentType) {
        try {
            this.out.write(this.boundaryLine);
            byte[] arr_b = this.createContentDisposition(key);
            this.out.write(arr_b);
            byte[] arr_b1 = this.createContentType(contentType);
            this.out.write(arr_b1);
            this.out.write(SimpleMultipartEntity.CR_LF);
            this.out.write(value.getBytes());
            this.out.write(SimpleMultipartEntity.CR_LF);
        }
        catch(IOException e) {
            AsyncHttpClient.log.e("SimpleMultipartEntity", "addPart ByteArrayOutputStream exception", e);
        }
    }

    public void addPartWithCharset(String key, String value, String charset) {
        if(charset == null) {
            charset = "UTF-8";
        }
        this.addPart(key, value, "text/plain; charset=" + charset);
    }

    public void consumeContent() throws IOException, UnsupportedOperationException {
    }

    private byte[] createContentDisposition(String key) {
        return ("Content-Disposition: form-data; name=\"" + key + "\"" + "\r\n").getBytes();
    }

    private byte[] createContentDisposition(String key, String fileName) {
        return ("Content-Disposition: form-data; name=\"" + key + "\"" + "; filename=\"" + fileName + "\"" + "\r\n").getBytes();
    }

    private byte[] createContentType(String type) {
        return ("Content-Type: " + this.normalizeContentType(type) + "\r\n").getBytes();
    }

    public InputStream getContent() throws IOException, UnsupportedOperationException {
        throw new UnsupportedOperationException("getContent() is not supported. Use writeTo() instead.");
    }

    public Header getContentEncoding() {
        return null;
    }

    public long getContentLength() {
        long contentLen = (long)this.out.size();
        for(Object object0: this.fileParts) {
            long v1 = ((FilePart)object0).getTotalLength();
            if(v1 < 0L) {
                return -1L;
            }
            contentLen += v1;
        }
        return contentLen + ((long)this.boundaryEnd.length);
    }

    public Header getContentType() {
        return new BasicHeader("Content-Type", "multipart/form-data; boundary=" + this.boundary);
    }

    public boolean isChunked() {
        return false;
    }

    public boolean isRepeatable() {
        return this.isRepeatable;
    }

    public boolean isStreaming() [...] // Inlined contents

    private String normalizeContentType(String type) {
        return type == null ? "application/octet-stream" : type;
    }

    public void setIsRepeatable(boolean isRepeatable) {
        this.isRepeatable = isRepeatable;
    }

    private void updateProgress(long count) {
        this.bytesWritten += count;
        this.progressHandler.sendProgressMessage(this.bytesWritten, this.totalSize);
    }

    public void writeTo(OutputStream outstream) throws IOException {
        this.bytesWritten = 0L;
        this.totalSize = (long)(((int)this.getContentLength()));
        this.out.writeTo(outstream);
        this.updateProgress(((long)this.out.size()));
        for(Object object0: this.fileParts) {
            ((FilePart)object0).writeTo(outstream);
        }
        outstream.write(this.boundaryEnd);
        this.updateProgress(((long)this.boundaryEnd.length));
    }
}

