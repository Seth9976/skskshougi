package com.loopj.android.http;

import java.io.UnsupportedEncodingException;

public class Base64 {
    static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int arg1);

        public abstract boolean process(byte[] arg1, int arg2, int arg3, boolean arg4);
    }

    static class Decoder extends Coder {
        private static final int[] DECODE = null;
        private static final int[] DECODE_WEBSAFE = null;
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        static {
            Decoder.DECODE = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 0x3F, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            Decoder.DECODE_WEBSAFE = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 0x3F, -1, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        }

        public Decoder(int flags, byte[] output) {
            this.output = output;
            this.alphabet = (flags & 8) == 0 ? Decoder.DECODE : Decoder.DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override  // com.loopj.android.http.Base64$Coder
        public int maxOutputSize(int len) {
            return len * 3 / 4 + 10;
        }

        @Override  // com.loopj.android.http.Base64$Coder
        public boolean process(byte[] input, int offset, int len, boolean finish) {
            int op;
            int op;
            if(this.state == 6) {
                return false;
            }
            int p = offset;
            int v3 = len + offset;
            int state = this.state;
            int value = this.value;
            int op = 0;
            byte[] output = this.output;
            int[] alphabet = this.alphabet;
            while(true) {
                if(p < v3) {
                    if(state != 0) {
                        goto label_23;
                    }
                    while(p + 4 <= v3) {
                        value = alphabet[input[p] & 0xFF] << 18 | alphabet[input[p + 1] & 0xFF] << 12 | alphabet[input[p + 2] & 0xFF] << 6 | alphabet[input[p + 3] & 0xFF];
                        if(value < 0) {
                            break;
                        }
                        output[op + 2] = (byte)value;
                        output[op + 1] = (byte)(value >> 8);
                        output[op] = (byte)(value >> 16);
                        op += 3;
                        p += 4;
                    }
                    if(p < v3) {
                    label_23:
                        int d = alphabet[input[p] & 0xFF];
                        switch(state) {
                            case 0: {
                                if(d >= 0) {
                                    value = d;
                                    state = 1;
                                }
                                else if(d != -1) {
                                    this.state = 6;
                                    return false;
                                }
                                break;
                            }
                            case 1: {
                                if(d >= 0) {
                                    value = value << 6 | d;
                                    state = 2;
                                }
                                else if(d != -1) {
                                    this.state = 6;
                                    return false;
                                }
                                break;
                            }
                            case 2: {
                                if(d >= 0) {
                                    value = value << 6 | d;
                                    state = 3;
                                }
                                else if(d == -2) {
                                    output[op] = (byte)(value >> 4);
                                    state = 4;
                                    ++op;
                                }
                                else if(d != -1) {
                                    this.state = 6;
                                    return false;
                                }
                                break;
                            }
                            case 3: {
                                if(d >= 0) {
                                    value = value << 6 | d;
                                    output[op + 2] = (byte)value;
                                    output[op + 1] = (byte)(value >> 8);
                                    output[op] = (byte)(value >> 16);
                                    op += 3;
                                    state = 0;
                                }
                                else if(d == -2) {
                                    output[op + 1] = (byte)(value >> 2);
                                    output[op] = (byte)(value >> 10);
                                    op += 2;
                                    state = 5;
                                }
                                else if(d != -1) {
                                    this.state = 6;
                                    return false;
                                }
                                break;
                            }
                            case 4: {
                                if(d == -2) {
                                    state = 5;
                                }
                                else if(d != -1) {
                                    this.state = 6;
                                    return false;
                                }
                                break;
                            }
                            case 5: {
                                if(d != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            }
                        }
                        ++p;
                        continue;
                    }
                }
                op = op;
                break;
            }
            if(!finish) {
                this.state = state;
                this.value = value;
                this.op = op;
                return true;
            }
            switch(state) {
                case 0: {
                    op = op;
                    break;
                }
                case 1: {
                    this.state = 6;
                    return false;
                }
                case 2: {
                    op = op + 1;
                    output[op] = (byte)(value >> 4);
                    break;
                }
                case 3: {
                    output[op] = (byte)(value >> 10);
                    output[op + 1] = (byte)(value >> 2);
                    op = op + 2;
                    break;
                }
                case 4: {
                    this.state = 6;
                    return false;
                }
                default: {
                    op = op;
                    break;
                }
            }
            this.state = state;
            this.op = op;
            return true;
        }
    }

    static class Encoder extends Coder {
        private static final byte[] ENCODE = null;
        private static final byte[] ENCODE_WEBSAFE = null;
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        static {
            Encoder.ENCODE = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
            Encoder.ENCODE_WEBSAFE = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F};
        }

        public Encoder(int flags, byte[] output) {
            boolean z = true;
            super();
            this.output = output;
            this.do_padding = (flags & 1) == 0;
            this.do_newline = (flags & 2) == 0;
            if((flags & 4) == 0) {
                z = false;
            }
            this.do_cr = z;
            this.alphabet = (flags & 8) == 0 ? Encoder.ENCODE : Encoder.ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = this.do_newline ? 19 : -1;
        }

        @Override  // com.loopj.android.http.Base64$Coder
        public int maxOutputSize(int len) {
            return len * 8 / 5 + 10;
        }

        @Override  // com.loopj.android.http.Base64$Coder
        public boolean process(byte[] input, int offset, int len, boolean finish) {
            int op;
            int v21;
            int p;
            int v19;
            int op;
            int v14;
            int t;
            int t;
            int p;
            int op;
            byte[] alphabet = this.alphabet;
            byte[] output = this.output;
            int op = 0;
            int count = this.count;
            int p = offset;
            int v5 = len + offset;
            int v = -1;
            switch(this.tailLen) {
                case 1: {
                    if(p + 2 <= v5) {
                        int p = p + 1;
                        int v8 = (this.tail[0] & 0xFF) << 16 | (input[p] & 0xFF) << 8;
                        p = p + 1;
                        v = v8 | input[p] & 0xFF;
                        this.tailLen = 0;
                    }
                    break;
                }
                case 2: {
                    if(p + 1 <= v5) {
                        v = (this.tail[0] & 0xFF) << 16 | (this.tail[1] & 0xFF) << 8 | input[p] & 0xFF;
                        this.tailLen = 0;
                        ++p;
                    }
                }
            }
            if(v != -1) {
                output[0] = alphabet[v >> 18 & 0x3F];
                output[1] = alphabet[v >> 12 & 0x3F];
                output[2] = alphabet[v >> 6 & 0x3F];
                op = 4;
                output[3] = alphabet[v & 0x3F];
                --count;
                if(count == 0) {
                    if(this.do_cr) {
                        output[4] = 13;
                        op = 5;
                    }
                    op = op + 1;
                    output[op] = 10;
                    count = 19;
                    p = p;
                    goto label_38;
                }
            }
            while(true) {
                p = p;
                op = op;
            label_38:
                t = 0;
                t = 0;
                if(p + 3 > v5) {
                    break;
                }
                int v = (input[p] & 0xFF) << 16 | (input[p + 1] & 0xFF) << 8 | input[p + 2] & 0xFF;
                output[op] = alphabet[v >> 18 & 0x3F];
                output[op + 1] = alphabet[v >> 12 & 0x3F];
                output[op + 2] = alphabet[v >> 6 & 0x3F];
                output[op + 3] = alphabet[v & 0x3F];
                p = p + 3;
                op = op + 4;
                if(count - 1 != 0) {
                    --count;
                    continue;
                }
                if(this.do_cr) {
                    output[op] = 13;
                    ++op;
                }
                op = op + 1;
                output[op] = 10;
                count = 19;
                p = p;
                goto label_38;
            }
            if(!finish) {
                if(p == v5 - 1) {
                    int v24 = this.tailLen;
                    this.tailLen = v24 + 1;
                    this.tail[v24] = input[p];
                }
                else if(p == v5 - 2) {
                    int v25 = this.tailLen;
                    this.tailLen = v25 + 1;
                    this.tail[v25] = input[p];
                    int v26 = this.tailLen;
                    this.tailLen = v26 + 1;
                    this.tail[v26] = input[p + 1];
                }
                op = op;
            }
            else if(p - this.tailLen == v5 - 1) {
                if(this.tailLen > 0) {
                    v14 = this.tail[0];
                    t = 1;
                }
                else {
                    v14 = input[p];
                }
                int v = (v14 & 0xFF) << 4;
                this.tailLen -= t;
                output[op] = alphabet[v >> 6 & 0x3F];
                int op = op + 2;
                output[op + 1] = alphabet[v & 0x3F];
                if(this.do_padding) {
                    int op = op + 1;
                    output[op] = 61;
                    op = op + 1;
                    output[op] = 61;
                }
                op = op;
                if(this.do_newline) {
                    if(this.do_cr) {
                        output[op] = 13;
                        ++op;
                    }
                    output[op] = 10;
                    ++op;
                }
            }
            else if(p - this.tailLen == v5 - 2) {
                if(this.tailLen > 1) {
                    v19 = this.tail[0];
                    t = 1;
                    p = p;
                }
                else {
                    p = p + 1;
                    v19 = input[p];
                }
                if(this.tailLen > 0) {
                    v21 = this.tail[t];
                    ++t;
                }
                else {
                    v21 = input[p];
                }
                int v = (v19 & 0xFF) << 10 | (v21 & 0xFF) << 2;
                this.tailLen -= t;
                output[op] = alphabet[v >> 12 & 0x3F];
                output[op + 1] = alphabet[v >> 6 & 0x3F];
                op = op + 3;
                output[op + 2] = alphabet[v & 0x3F];
                if(this.do_padding) {
                    output[op] = 61;
                    ++op;
                }
                if(this.do_newline) {
                    if(this.do_cr) {
                        output[op] = 13;
                        ++op;
                    }
                    output[op] = 10;
                    ++op;
                }
            }
            else if(!this.do_newline || op <= 0 || count == 19) {
                op = op;
            }
            else {
                if(this.do_cr) {
                    op = op + 1;
                    output[op] = 13;
                }
                else {
                    op = op;
                }
                output[op] = 10;
                op = op + 1;
            }
            this.op = op;
            this.count = count;
            return true;
        }
    }

    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    public static byte[] decode(String str, int flags) {
        return Base64.decode(str.getBytes(), flags);
    }

    public static byte[] decode(byte[] input, int flags) {
        return Base64.decode(input, 0, input.length, flags);
    }

    public static byte[] decode(byte[] input, int offset, int len, int flags) {
        Decoder decoder = new Decoder(flags, new byte[len * 3 / 4]);
        if(!decoder.process(input, offset, len, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if(decoder.op == decoder.output.length) {
            return decoder.output;
        }
        byte[] temp = new byte[decoder.op];
        System.arraycopy(decoder.output, 0, temp, 0, decoder.op);
        return temp;
    }

    public static byte[] encode(byte[] input, int flags) {
        return Base64.encode(input, 0, input.length, flags);
    }

    public static byte[] encode(byte[] input, int offset, int len, int flags) {
        Encoder encoder = new Encoder(flags, null);
        int output_len = len / 3 * 4;
        if(!encoder.do_padding) {
            switch(len % 3) {
                case 1: {
                    output_len += 2;
                    break;
                }
                case 2: {
                    output_len += 3;
                }
            }
        }
        else if(len % 3 > 0) {
            output_len += 4;
        }
        if(encoder.do_newline && len > 0) {
            output_len += (encoder.do_cr ? 2 : 1) * ((len - 1) / 57 + 1);
        }
        encoder.output = new byte[output_len];
        encoder.process(input, offset, len, true);
        return encoder.output;
    }

    public static String encodeToString(byte[] input, int flags) {
        try {
            return new String(Base64.encode(input, flags), "US-ASCII");
        }
        catch(UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String encodeToString(byte[] input, int offset, int len, int flags) {
        try {
            return new String(Base64.encode(input, offset, len, flags), "US-ASCII");
        }
        catch(UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}

