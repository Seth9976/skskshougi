package com.loopj.android.http;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

public class SerializableCookie implements Serializable {
    private transient BasicClientCookie clientCookie;
    private final transient Cookie cookie;
    private static final long serialVersionUID = 0x58765A8013AEB70CL;

    public SerializableCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie getCookie() {
        Cookie bestCookie = this.cookie;
        return this.clientCookie != null ? this.clientCookie : bestCookie;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.clientCookie = new BasicClientCookie(((String)in.readObject()), ((String)in.readObject()));
        this.clientCookie.setComment(((String)in.readObject()));
        this.clientCookie.setDomain(((String)in.readObject()));
        this.clientCookie.setExpiryDate(((Date)in.readObject()));
        this.clientCookie.setPath(((String)in.readObject()));
        this.clientCookie.setVersion(in.readInt());
        this.clientCookie.setSecure(in.readBoolean());
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(this.cookie.getName());
        out.writeObject(this.cookie.getValue());
        out.writeObject(this.cookie.getComment());
        out.writeObject(this.cookie.getDomain());
        out.writeObject(this.cookie.getExpiryDate());
        out.writeObject(this.cookie.getPath());
        out.writeInt(this.cookie.getVersion());
        out.writeBoolean(this.cookie.isSecure());
    }
}

