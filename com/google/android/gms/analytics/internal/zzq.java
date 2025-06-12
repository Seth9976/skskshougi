package com.google.android.gms.analytics.internal;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class zzq extends zzc {
    public interface zza {
        void zzc(String arg1, boolean arg2);

        void zzd(String arg1, int arg2);

        zzp zziV();

        void zzk(String arg1, String arg2);

        void zzl(String arg1, String arg2);
    }

    zza zzKN;

    public zzq(zzf zzf0, zza zzq$zza0) {
        super(zzf0);
        this.zzKN = zzq$zza0;
    }

    private zzp zza(XmlResourceParser xmlResourceParser0) {
        try {
            xmlResourceParser0.next();
            for(int v = xmlResourceParser0.getEventType(); v != 1; v = xmlResourceParser0.next()) {
                if(xmlResourceParser0.getEventType() == 2) {
                    String s = xmlResourceParser0.getName().toLowerCase();
                    if(s.equals("screenname")) {
                        String s7 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s8 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s7) && !TextUtils.isEmpty(s8)) {
                            this.zzKN.zzk(s7, s8);
                        }
                    }
                    else if(s.equals("string")) {
                        String s1 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s2 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s1) && s2 != null) {
                            this.zzKN.zzl(s1, s2);
                        }
                    }
                    else if(s.equals("bool")) {
                        String s5 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s6 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s5) && !TextUtils.isEmpty(s6)) {
                            try {
                                this.zzKN.zzc(s5, Boolean.parseBoolean(s6));
                            }
                            catch(NumberFormatException numberFormatException1) {
                                this.zzc("Error parsing bool configuration value", s6, numberFormatException1);
                            }
                        }
                    }
                    else if(s.equals("integer")) {
                        String s3 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s4 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4)) {
                            try {
                                int v1 = Integer.parseInt(s4);
                                this.zzKN.zzd(s3, v1);
                            }
                            catch(NumberFormatException numberFormatException0) {
                                this.zzc("Error parsing int configuration value", s4, numberFormatException0);
                            }
                        }
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
            this.zze("Error parsing tracker configuration file", xmlPullParserException0);
            return this.zzKN.zziV();
        }
        catch(IOException iOException0) {
            this.zze("Error parsing tracker configuration file", iOException0);
            return this.zzKN.zziV();
        }
        return this.zzKN.zziV();
    }

    public zzp zzab(int v) {
        try {
            return this.zza(this.zzhM().zzic().getResources().getXml(v));
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            this.zzd("inflate() called with unknown resourceId", resources$NotFoundException0);
            return null;
        }
    }
}

