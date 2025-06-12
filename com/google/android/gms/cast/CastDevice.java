package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastDevice implements SafeParcelable {
    public static final int CAPABILITY_AUDIO_IN = 8;
    public static final int CAPABILITY_AUDIO_OUT = 4;
    public static final int CAPABILITY_VIDEO_IN = 2;
    public static final int CAPABILITY_VIDEO_OUT = 1;
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private String zzQL;
    String zzQM;
    private Inet4Address zzQN;
    private String zzQO;
    private String zzQP;
    private String zzQQ;
    private int zzQR;
    private List zzQS;
    private int zzQT;
    private int zzwS;

    static {
        CastDevice.CREATOR = new zzb();
    }

    private CastDevice() {
        this(3, null, null, null, null, null, -1, new ArrayList(), 0, -1);
    }

    CastDevice(int versionCode, String deviceId, String hostAddress, String friendlyName, String modelName, String deviceVersion, int servicePort, List list0, int capabilities, int status) {
        this.zzCY = versionCode;
        this.zzQL = deviceId;
        this.zzQM = hostAddress;
        if(this.zzQM != null) {
            try {
                InetAddress inetAddress0 = InetAddress.getByName(this.zzQM);
                if(inetAddress0 instanceof Inet4Address) {
                    this.zzQN = (Inet4Address)inetAddress0;
                }
            }
            catch(UnknownHostException unused_ex) {
                this.zzQN = null;
            }
        }
        this.zzQO = friendlyName;
        this.zzQP = modelName;
        this.zzQQ = deviceVersion;
        this.zzQR = servicePort;
        this.zzQS = list0;
        this.zzQT = capabilities;
        this.zzwS = status;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof CastDevice)) {
            return false;
        }
        return this.getDeviceId() == null ? ((CastDevice)obj).getDeviceId() == null : zzf.zza(this.zzQL, ((CastDevice)obj).zzQL) && zzf.zza(this.zzQN, ((CastDevice)obj).zzQN) && zzf.zza(this.zzQP, ((CastDevice)obj).zzQP) && zzf.zza(this.zzQO, ((CastDevice)obj).zzQO) && zzf.zza(this.zzQQ, ((CastDevice)obj).zzQQ) && this.zzQR == ((CastDevice)obj).zzQR && zzf.zza(this.zzQS, ((CastDevice)obj).zzQS) && this.zzQT == ((CastDevice)obj).zzQT && this.zzwS == ((CastDevice)obj).zzwS;
    }

    public int getCapabilities() {
        return this.zzQT;
    }

    public String getDeviceId() {
        return this.zzQL;
    }

    public String getDeviceVersion() {
        return this.zzQQ;
    }

    public String getFriendlyName() {
        return this.zzQO;
    }

    public static CastDevice getFromBundle(Bundle extras) {
        if(extras == null) {
            return null;
        }
        extras.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice)extras.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public WebImage getIcon(int preferredWidth, int preferredHeight) {
        WebImage webImage3;
        WebImage webImage0 = null;
        if(this.zzQS.isEmpty()) {
            return null;
        }
        if(preferredWidth <= 0 || preferredHeight <= 0) {
            return (WebImage)this.zzQS.get(0);
        }
        WebImage webImage1 = null;
        for(Object object0: this.zzQS) {
            WebImage webImage2 = (WebImage)object0;
            int v2 = webImage2.getWidth();
            int v3 = webImage2.getHeight();
            if(v2 < preferredWidth || v3 < preferredHeight) {
                if(v2 < preferredWidth && v3 < preferredHeight && (webImage0 == null || webImage0.getWidth() < v2 && webImage0.getHeight() < v3)) {
                    webImage3 = webImage1;
                }
            }
            else if(webImage1 == null || webImage1.getWidth() > v2 && webImage1.getHeight() > v3) {
                webImage3 = webImage2;
                webImage2 = webImage0;
            }
            else {
                webImage2 = webImage0;
                webImage3 = webImage1;
            }
            webImage1 = webImage3;
            webImage0 = webImage2;
        }
        if(webImage1 != null) {
            return webImage1;
        }
        return webImage0 == null ? ((WebImage)this.zzQS.get(0)) : webImage0;
    }

    public List getIcons() {
        return Collections.unmodifiableList(this.zzQS);
    }

    public Inet4Address getIpAddress() {
        return this.zzQN;
    }

    public String getModelName() {
        return this.zzQP;
    }

    public int getServicePort() {
        return this.zzQR;
    }

    public int getStatus() {
        return this.zzwS;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public boolean hasCapabilities(int[] capabilities) {
        if(capabilities != null) {
            for(int v = 0; v < capabilities.length; ++v) {
                if(!this.hasCapability(capabilities[v])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean hasCapability(int capability) {
        return (this.zzQT & capability) == capability;
    }

    public boolean hasIcons() {
        return !this.zzQS.isEmpty();
    }

    @Override
    public int hashCode() {
        return this.zzQL == null ? 0 : this.zzQL.hashCode();
    }

    public boolean isOnLocalNetwork() {
        return !this.zzQL.startsWith("__cast_nearby__");
    }

    public boolean isSameDevice(CastDevice castDevice) {
        if(castDevice == null) {
            return false;
        }
        return this.getDeviceId() == null ? castDevice.getDeviceId() == null : zzf.zza(this.getDeviceId(), castDevice.getDeviceId());
    }

    public void putInBundle(Bundle bundle) {
        if(bundle == null) {
            return;
        }
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" (%s)", this.zzQO, this.zzQL);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }
}

