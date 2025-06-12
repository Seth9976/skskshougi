package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.internal.zzky;
import com.google.android.gms.internal.zzlh;
import com.google.android.gms.internal.zzli;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {
    public static class Field implements SafeParcelable {
        public static final zza CREATOR;
        private final int zzCY;
        protected final int zzabG;
        protected final boolean zzabH;
        protected final int zzabI;
        protected final boolean zzabJ;
        protected final String zzabK;
        protected final int zzabL;
        protected final Class zzabM;
        protected final String zzabN;
        private FieldMappingDictionary zzabO;
        private com.google.android.gms.common.server.response.FastJsonResponse.zza zzabP;

        static {
            Field.CREATOR = new zza();
        }

        Field(int versionCode, int typeIn, boolean typeInArray, int typeOut, boolean typeOutArray, String outputFieldName, int safeParcelableFieldId, String concreteTypeName, ConverterWrapper wrappedConverter) {
            this.zzCY = versionCode;
            this.zzabG = typeIn;
            this.zzabH = typeInArray;
            this.zzabI = typeOut;
            this.zzabJ = typeOutArray;
            this.zzabK = outputFieldName;
            this.zzabL = safeParcelableFieldId;
            if(concreteTypeName == null) {
                this.zzabM = null;
                this.zzabN = null;
            }
            else {
                this.zzabM = SafeParcelResponse.class;
                this.zzabN = concreteTypeName;
            }
            if(wrappedConverter == null) {
                this.zzabP = null;
                return;
            }
            this.zzabP = wrappedConverter.zzoi();
        }

        protected Field(int typeIn, boolean typeInArray, int typeOut, boolean typeOutArray, String outputFieldName, int safeParcelableFieldId, Class class0, com.google.android.gms.common.server.response.FastJsonResponse.zza fastJsonResponse$zza0) {
            this.zzCY = 1;
            this.zzabG = typeIn;
            this.zzabH = typeInArray;
            this.zzabI = typeOut;
            this.zzabJ = typeOutArray;
            this.zzabK = outputFieldName;
            this.zzabL = safeParcelableFieldId;
            this.zzabM = class0;
            this.zzabN = class0 == null ? null : class0.getCanonicalName();
            this.zzabP = fastJsonResponse$zza0;
        }

        public Object convertBack(Object object0) {
            return this.zzabP.convertBack(object0);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getVersionCode() {
            return this.zzCY;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Field\n");
            stringBuilder0.append("            versionCode=").append(this.zzCY).append('\n');
            stringBuilder0.append("                 typeIn=").append(this.zzabG).append('\n');
            stringBuilder0.append("            typeInArray=").append(this.zzabH).append('\n');
            stringBuilder0.append("                typeOut=").append(this.zzabI).append('\n');
            stringBuilder0.append("           typeOutArray=").append(this.zzabJ).append('\n');
            stringBuilder0.append("        outputFieldName=").append(this.zzabK).append('\n');
            stringBuilder0.append("      safeParcelFieldId=").append(this.zzabL).append('\n');
            stringBuilder0.append("       concreteTypeName=").append(this.zzov()).append('\n');
            if(this.zzou() != null) {
                stringBuilder0.append("     concreteType.class=").append(this.zzou().getCanonicalName()).append('\n');
            }
            stringBuilder0.append("          converterName=").append((this.zzabP == null ? "null" : this.zzabP.getClass().getCanonicalName())).append('\n');
            return stringBuilder0.toString();
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zza.zza(this, out, flags);
        }

        public static Field zza(String s, int v, com.google.android.gms.common.server.response.FastJsonResponse.zza fastJsonResponse$zza0, boolean z) {
            return new Field(fastJsonResponse$zza0.zzok(), z, fastJsonResponse$zza0.zzol(), false, s, v, null, fastJsonResponse$zza0);
        }

        public static Field zza(String s, int v, Class class0) {
            return new Field(11, false, 11, false, s, v, class0, null);
        }

        public void zza(FieldMappingDictionary fieldMappingDictionary0) {
            this.zzabO = fieldMappingDictionary0;
        }

        public static Field zzb(String s, int v, Class class0) {
            return new Field(11, true, 11, true, s, v, class0, null);
        }

        public static Field zzi(String s, int v) {
            return new Field(0, false, 0, false, s, v, null, null);
        }

        public static Field zzj(String s, int v) {
            return new Field(4, false, 4, false, s, v, null, null);
        }

        public static Field zzk(String s, int v) {
            return new Field(6, false, 6, false, s, v, null, null);
        }

        public static Field zzl(String s, int v) {
            return new Field(7, false, 7, false, s, v, null, null);
        }

        public static Field zzm(String s, int v) {
            return new Field(7, true, 7, true, s, v, null, null);
        }

        public int zzok() {
            return this.zzabG;
        }

        public int zzol() {
            return this.zzabI;
        }

        public Field zzop() {
            ConverterWrapper converterWrapper0 = this.zzox();
            return new Field(this.zzCY, this.zzabG, this.zzabH, this.zzabI, this.zzabJ, this.zzabK, this.zzabL, this.zzabN, converterWrapper0);
        }

        public boolean zzoq() {
            return this.zzabH;
        }

        public boolean zzor() {
            return this.zzabJ;
        }

        public String zzos() {
            return this.zzabK;
        }

        public int zzot() {
            return this.zzabL;
        }

        public Class zzou() {
            return this.zzabM;
        }

        String zzov() {
            return this.zzabN == null ? null : this.zzabN;
        }

        public boolean zzow() {
            return this.zzabP != null;
        }

        ConverterWrapper zzox() {
            return this.zzabP == null ? null : ConverterWrapper.zza(this.zzabP);
        }

        public Map zzoy() {
            zzu.zzu(this.zzabN);
            zzu.zzu(this.zzabO);
            return this.zzabO.zzco(this.zzabN);
        }
    }

    public interface com.google.android.gms.common.server.response.FastJsonResponse.zza {
        Object convertBack(Object arg1);

        int zzok();

        int zzol();
    }

    @Override
    public String toString() {
        Map map0 = this.zzom();
        StringBuilder stringBuilder0 = new StringBuilder(100);
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Field fastJsonResponse$Field0 = (Field)map0.get(s);
            if(this.zza(fastJsonResponse$Field0)) {
                Object object1 = this.zza(fastJsonResponse$Field0, this.zzb(fastJsonResponse$Field0));
                if(stringBuilder0.length() == 0) {
                    stringBuilder0.append("{");
                }
                else {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append("\"").append(s).append("\":");
                if(object1 == null) {
                    stringBuilder0.append("null");
                }
                else {
                    switch(fastJsonResponse$Field0.zzol()) {
                        case 8: {
                            stringBuilder0.append("\"").append(zzky.zzi(((byte[])object1))).append("\"");
                            break;
                        }
                        case 9: {
                            stringBuilder0.append("\"").append(zzky.zzj(((byte[])object1))).append("\"");
                            break;
                        }
                        case 10: {
                            zzli.zza(stringBuilder0, ((HashMap)object1));
                            break;
                        }
                        default: {
                            if(fastJsonResponse$Field0.zzoq()) {
                                this.zza(stringBuilder0, fastJsonResponse$Field0, ((ArrayList)object1));
                                continue;
                            }
                            else {
                                this.zza(stringBuilder0, fastJsonResponse$Field0, object1);
                                break;
                            }
                            stringBuilder0.append("\"").append(zzky.zzi(((byte[])object1))).append("\"");
                            break;
                        }
                    }
                }
            }
        }
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("{}");
        return stringBuilder0.toString();
    }

    private void zza(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, Object object0) {
        switch(fastJsonResponse$Field0.zzok()) {
            case 7: {
                stringBuilder0.append("\"");
                stringBuilder0.append(zzlh.zzcr(((String)object0)));
                stringBuilder0.append("\"");
                return;
            }
            case 11: {
                stringBuilder0.append(((FastJsonResponse)fastJsonResponse$Field0.zzou().cast(object0)).toString());
                return;
            }
            default: {
                stringBuilder0.append(object0);
            }
        }
    }

    private void zza(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, ArrayList arrayList0) {
        stringBuilder0.append("[");
        int v1 = arrayList0.size();
        for(int v = 0; v < v1; ++v) {
            if(v > 0) {
                stringBuilder0.append(",");
            }
            Object object0 = arrayList0.get(v);
            if(object0 != null) {
                this.zza(stringBuilder0, fastJsonResponse$Field0, object0);
            }
        }
        stringBuilder0.append("]");
    }

    protected Object zza(Field fastJsonResponse$Field0, Object object0) {
        return fastJsonResponse$Field0.zzabP == null ? object0 : fastJsonResponse$Field0.convertBack(object0);
    }

    protected boolean zza(Field fastJsonResponse$Field0) {
        if(fastJsonResponse$Field0.zzol() == 11) {
            return fastJsonResponse$Field0.zzor() ? this.zzcn(fastJsonResponse$Field0.zzos()) : this.zzcm(fastJsonResponse$Field0.zzos());
        }
        return this.zzcl(fastJsonResponse$Field0.zzos());
    }

    protected Object zzb(Field fastJsonResponse$Field0) {
        String s = fastJsonResponse$Field0.zzos();
        if(fastJsonResponse$Field0.zzou() != null) {
            zzu.zza(this.zzck(fastJsonResponse$Field0.zzos()) == null, "Concrete field shouldn\'t be value object: %s", new Object[]{fastJsonResponse$Field0.zzos()});
            try {
                return this.getClass().getMethod("get" + Character.toUpperCase(s.charAt(0)) + s.substring(1)).invoke(this);
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0);
            }
        }
        return this.zzck(fastJsonResponse$Field0.zzos());
    }

    protected abstract Object zzck(String arg1);

    protected abstract boolean zzcl(String arg1);

    protected boolean zzcm(String s) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean zzcn(String s) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public abstract Map zzom();

    public HashMap zzon() [...] // Inlined contents

    public HashMap zzoo() [...] // Inlined contents
}

