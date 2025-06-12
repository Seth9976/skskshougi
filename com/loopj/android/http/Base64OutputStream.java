package com.loopj.android.http;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64OutputStream extends FilterOutputStream {
    private static byte[] EMPTY;
    private int bpos;
    private byte[] buffer;
    private final Coder coder;
    private final int flags;

    static {
        Base64OutputStream.EMPTY = new byte[0];
    }

    public Base64OutputStream(OutputStream out, int flags) {
        this(out, flags, true);
    }

    public Base64OutputStream(OutputStream out, int flags, boolean encode) {
        super(out);
        this.buffer = null;
        this.bpos = 0;
        this.flags = flags;
        if(encode) {
            this.coder = new Encoder(flags, null);
            return;
        }
        this.coder = new Decoder(flags, null);
    }

    @Override
    public void close() throws IOException {
        IOException thrown = null;
        try {
            this.flushBuffer();
            this.internalWrite(Base64OutputStream.EMPTY, 0, 0, true);
        }
        catch(IOException e) {
            thrown = e;
        }
        try {
            if((this.flags & 16) == 0) {
                this.out.close();
            }
            else {
                this.out.flush();
            }
        }
        catch(IOException e) {
            if(thrown != null) {
                thrown = e;
            }
        }
        if(thrown != null) {
            throw thrown;
        }
    }

    private byte[] embiggen(byte[] b, int len) {
        return b != null && b.length >= len ? b : new byte[len];
    }

    private void flushBuffer() throws IOException {
        if(this.bpos > 0) {
            this.internalWrite(this.buffer, 0, this.bpos, false);
            this.bpos = 0;
        }
    }

    private void internalWrite(byte[] b, int off, int len, boolean finish) throws IOException {
        this.coder.output = this.embiggen(this.coder.output, this.coder.maxOutputSize(len));
        if(!this.coder.process(b, off, len, finish)) {
            throw new Base64DataException("bad base-64");
        }
        this.out.write(this.coder.output, 0, this.coder.op);
    }

    @Override
    public void write(int b) throws IOException {
        if(this.buffer == null) {
            this.buffer = new byte[0x400];
        }
        if(this.bpos >= this.buffer.length) {
            this.internalWrite(this.buffer, 0, this.bpos, false);
            this.bpos = 0;
        }
        int v1 = this.bpos;
        this.bpos = v1 + 1;
        this.buffer[v1] = (byte)b;
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        if(len <= 0) {
            return;
        }
        this.flushBuffer();
        this.internalWrite(b, off, len, false);
    }
}

