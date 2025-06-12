package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

public class CommonWalletObject implements SafeParcelable {
    public final class zza {
        final CommonWalletObject zzaSw;

        private zza() {
        }

        zza(com.google.android.gms.wallet.wobs.CommonWalletObject.1 commonWalletObject$10) {
        }

        public CommonWalletObject zzAO() {
            return CommonWalletObject.this;
        }

        public zza zzff(String s) {
            CommonWalletObject.this.zzhI = s;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    String name;
    int state;
    private final int zzCY;
    String zzaQN;
    String zzaQP;
    String zzaQQ;
    String zzaQR;
    String zzaQS;
    String zzaQT;
    ArrayList zzaQU;
    TimeInterval zzaQV;
    ArrayList zzaQW;
    String zzaQX;
    String zzaQY;
    ArrayList zzaQZ;
    boolean zzaRa;
    ArrayList zzaRb;
    ArrayList zzaRc;
    ArrayList zzaRd;
    String zzhI;

    static {
        CommonWalletObject.CREATOR = new com.google.android.gms.wallet.wobs.zza();
    }

    CommonWalletObject() {
        this.zzCY = 1;
        this.zzaQU = zzkx.zzoP();
        this.zzaQW = zzkx.zzoP();
        this.zzaQZ = zzkx.zzoP();
        this.zzaRb = zzkx.zzoP();
        this.zzaRc = zzkx.zzoP();
        this.zzaRd = zzkx.zzoP();
    }

    CommonWalletObject(int versionCode, String id, String classId, String name, String issuerName, String barcodeAlternateText, String barcodeType, String barcodeValue, String barcodeLabel, int state, ArrayList arrayList0, TimeInterval validTimeInterval, ArrayList arrayList1, String infoModuleDataHexFontColor, String infoModuleDataHexBackgroundColor, ArrayList arrayList2, boolean infoModuleDataShowLastUpdateTime, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.zzCY = versionCode;
        this.zzhI = id;
        this.zzaQT = classId;
        this.name = name;
        this.zzaQN = issuerName;
        this.zzaQP = barcodeAlternateText;
        this.zzaQQ = barcodeType;
        this.zzaQR = barcodeValue;
        this.zzaQS = barcodeLabel;
        this.state = state;
        this.zzaQU = arrayList0;
        this.zzaQV = validTimeInterval;
        this.zzaQW = arrayList1;
        this.zzaQX = infoModuleDataHexFontColor;
        this.zzaQY = infoModuleDataHexBackgroundColor;
        this.zzaQZ = arrayList2;
        this.zzaRa = infoModuleDataShowLastUpdateTime;
        this.zzaRb = arrayList3;
        this.zzaRc = arrayList4;
        this.zzaRd = arrayList5;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.zzhI;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        com.google.android.gms.wallet.wobs.zza.zza(this, dest, flags);
    }

    public static zza zzAN() {
        CommonWalletObject commonWalletObject0 = new CommonWalletObject();
        commonWalletObject0.getClass();
        return new zza(commonWalletObject0, null);
    }

    class com.google.android.gms.wallet.wobs.CommonWalletObject.1 {
    }

}

