package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzky;
import com.google.android.gms.internal.zzlh;
import com.google.android.gms.internal.zzli;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class SafeParcelResponse extends FastJsonResponse implements SafeParcelable {
    public static final zze CREATOR;
    private final String mClassName;
    private final int zzCY;
    private final FieldMappingDictionary zzabO;
    private final Parcel zzabV;
    private final int zzabW;
    private int zzabX;
    private int zzabY;

    static {
        SafeParcelResponse.CREATOR = new zze();
    }

    SafeParcelResponse(int versionCode, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.zzCY = versionCode;
        this.zzabV = (Parcel)zzu.zzu(parcel);
        this.zzabW = 2;
        this.zzabO = fieldMappingDictionary;
        this.mClassName = this.zzabO == null ? null : this.zzabO.zzoC();
        this.zzabX = 2;
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, FieldMappingDictionary dictionary, String className) {
        this.zzCY = 1;
        this.zzabV = Parcel.obtain();
        safeParcelable.writeToParcel(this.zzabV, 0);
        this.zzabW = 1;
        this.zzabO = (FieldMappingDictionary)zzu.zzu(dictionary);
        this.mClassName = (String)zzu.zzu(className);
        this.zzabX = 2;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public String toString() {
        zzu.zzb(this.zzabO, "Cannot convert to JSON on client side.");
        Parcel parcel0 = this.zzoE();
        parcel0.setDataPosition(0);
        StringBuilder stringBuilder0 = new StringBuilder(100);
        this.zza(stringBuilder0, this.zzabO.zzco(this.mClassName), parcel0);
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zze.zza(this, out, flags);
    }

    private static HashMap zzC(Map map0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: map0.entrySet()) {
            hashMap0.put(((Field)((Map.Entry)object0).getValue()).zzot(), ((Map.Entry)object0));
        }
        return hashMap0;
    }

    public static SafeParcelResponse zza(FastJsonResponse fastJsonResponse0) {
        String s = fastJsonResponse0.getClass().getCanonicalName();
        return new SafeParcelResponse(((SafeParcelable)fastJsonResponse0), SafeParcelResponse.zzb(fastJsonResponse0), s);
    }

    private static void zza(FieldMappingDictionary fieldMappingDictionary0, FastJsonResponse fastJsonResponse0) {
        Class class0 = fastJsonResponse0.getClass();
        if(!fieldMappingDictionary0.zzb(class0)) {
            Map map0 = fastJsonResponse0.zzom();
            fieldMappingDictionary0.zza(class0, map0);
            for(Object object0: map0.keySet()) {
                Field fastJsonResponse$Field0 = (Field)map0.get(((String)object0));
                Class class1 = fastJsonResponse$Field0.zzou();
                if(class1 != null) {
                    try {
                        SafeParcelResponse.zza(fieldMappingDictionary0, ((FastJsonResponse)class1.newInstance()));
                    }
                    catch(InstantiationException instantiationException0) {
                        throw new IllegalStateException("Could not instantiate an object of type " + fastJsonResponse$Field0.zzou().getCanonicalName(), instantiationException0);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        throw new IllegalStateException("Could not access object of type " + fastJsonResponse$Field0.zzou().getCanonicalName(), illegalAccessException0);
                    }
                }
            }
        }
    }

    private void zza(StringBuilder stringBuilder0, int v, Object object0) {
        switch(v) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                stringBuilder0.append(object0);
                return;
            }
            case 7: {
                stringBuilder0.append("\"").append(zzlh.zzcr(object0.toString())).append("\"");
                return;
            }
            case 8: {
                stringBuilder0.append("\"").append(zzky.zzi(((byte[])object0))).append("\"");
                return;
            }
            case 9: {
                stringBuilder0.append("\"").append(zzky.zzj(((byte[])object0)));
                stringBuilder0.append("\"");
                return;
            }
            case 10: {
                zzli.zza(stringBuilder0, ((HashMap)object0));
                return;
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
            default: {
                throw new IllegalArgumentException("Unknown type = " + v);
            }
        }
    }

    private void zza(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, Parcel parcel0, int v) {
        switch(fastJsonResponse$Field0.zzol()) {
            case 0: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzg(parcel0, v)));
                return;
            }
            case 1: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzk(parcel0, v)));
                return;
            }
            case 2: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzi(parcel0, v)));
                return;
            }
            case 3: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzl(parcel0, v)));
                return;
            }
            case 4: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzm(parcel0, v)));
                return;
            }
            case 5: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzn(parcel0, v)));
                return;
            }
            case 6: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, Boolean.valueOf(zza.zzc(parcel0, v))));
                return;
            }
            case 7: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzo(parcel0, v)));
                return;
            }
            case 8: 
            case 9: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, zza.zzr(parcel0, v)));
                return;
            }
            case 10: {
                this.zzb(stringBuilder0, fastJsonResponse$Field0, this.zza(fastJsonResponse$Field0, SafeParcelResponse.zzh(zza.zzq(parcel0, v))));
                return;
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
            default: {
                throw new IllegalArgumentException("Unknown field out type = " + fastJsonResponse$Field0.zzol());
            }
        }
    }

    private void zza(StringBuilder stringBuilder0, String s, Field fastJsonResponse$Field0, Parcel parcel0, int v) {
        stringBuilder0.append("\"").append(s).append("\":");
        if(fastJsonResponse$Field0.zzow()) {
            this.zza(stringBuilder0, fastJsonResponse$Field0, parcel0, v);
            return;
        }
        this.zzb(stringBuilder0, fastJsonResponse$Field0, parcel0, v);
    }

    private void zza(StringBuilder stringBuilder0, Map map0, Parcel parcel0) {
        HashMap hashMap0 = SafeParcelResponse.zzC(map0);
        stringBuilder0.append('{');
        int v = zza.zzab(parcel0);
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = zza.zzaa(parcel0);
            Map.Entry map$Entry0 = (Map.Entry)hashMap0.get(((int)(0xFFFF & v1)));
            if(map$Entry0 != null) {
                if(z) {
                    stringBuilder0.append(",");
                }
                this.zza(stringBuilder0, ((String)map$Entry0.getKey()), ((Field)map$Entry0.getValue()), parcel0, v1);
                z = true;
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        stringBuilder0.append('}');
    }

    private static FieldMappingDictionary zzb(FastJsonResponse fastJsonResponse0) {
        FieldMappingDictionary fieldMappingDictionary0 = new FieldMappingDictionary(fastJsonResponse0.getClass());
        SafeParcelResponse.zza(fieldMappingDictionary0, fastJsonResponse0);
        fieldMappingDictionary0.zzoA();
        fieldMappingDictionary0.zzoz();
        return fieldMappingDictionary0;
    }

    private void zzb(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, Parcel parcel0, int v) {
        if(fastJsonResponse$Field0.zzor()) {
            stringBuilder0.append("[");
        alab1:
            switch(fastJsonResponse$Field0.zzol()) {
                case 0: {
                    zzkx.zza(stringBuilder0, zza.zzu(parcel0, v));
                    break;
                }
                case 1: {
                    zzkx.zza(stringBuilder0, zza.zzw(parcel0, v));
                    break;
                }
                case 2: {
                    zzkx.zza(stringBuilder0, zza.zzv(parcel0, v));
                    break;
                }
                case 3: {
                    zzkx.zza(stringBuilder0, zza.zzx(parcel0, v));
                    break;
                }
                case 4: {
                    zzkx.zza(stringBuilder0, zza.zzy(parcel0, v));
                    break;
                }
                case 5: {
                    zzkx.zza(stringBuilder0, zza.zzz(parcel0, v));
                    break;
                }
                case 6: {
                    zzkx.zza(stringBuilder0, zza.zzt(parcel0, v));
                    break;
                }
                case 7: {
                    zzkx.zza(stringBuilder0, zza.zzA(parcel0, v));
                    break;
                }
                case 8: 
                case 9: 
                case 10: {
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                }
                case 11: {
                    Parcel[] arr_parcel = zza.zzE(parcel0, v);
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= arr_parcel.length) {
                            break alab1;
                        }
                        if(v1 > 0) {
                            stringBuilder0.append(",");
                        }
                        arr_parcel[v1].setDataPosition(0);
                        this.zza(stringBuilder0, fastJsonResponse$Field0.zzoy(), arr_parcel[v1]);
                    }
                }
                default: {
                    throw new IllegalStateException("Unknown field type out.");
                }
            }
            stringBuilder0.append("]");
            return;
        }
        switch(fastJsonResponse$Field0.zzol()) {
            case 0: {
                stringBuilder0.append(zza.zzg(parcel0, v));
                return;
            }
            case 1: {
                stringBuilder0.append(zza.zzk(parcel0, v));
                return;
            }
            case 2: {
                stringBuilder0.append(zza.zzi(parcel0, v));
                return;
            }
            case 3: {
                stringBuilder0.append(zza.zzl(parcel0, v));
                return;
            }
            case 4: {
                stringBuilder0.append(zza.zzm(parcel0, v));
                return;
            }
            case 5: {
                stringBuilder0.append(zza.zzn(parcel0, v));
                return;
            }
            case 6: {
                stringBuilder0.append(zza.zzc(parcel0, v));
                return;
            }
            case 7: {
                String s = zza.zzo(parcel0, v);
                stringBuilder0.append("\"").append(zzlh.zzcr(s)).append("\"");
                return;
            }
            case 8: {
                byte[] arr_b = zza.zzr(parcel0, v);
                stringBuilder0.append("\"").append(zzky.zzi(arr_b)).append("\"");
                return;
            }
            case 9: {
                byte[] arr_b1 = zza.zzr(parcel0, v);
                stringBuilder0.append("\"").append(zzky.zzj(arr_b1));
                stringBuilder0.append("\"");
                return;
            }
            case 10: {
                Bundle bundle0 = zza.zzq(parcel0, v);
                Set set0 = bundle0.keySet();
                set0.size();
                stringBuilder0.append("{");
                boolean z = true;
                for(Object object0: set0) {
                    if(!z) {
                        stringBuilder0.append(",");
                    }
                    stringBuilder0.append("\"").append(((String)object0)).append("\"");
                    stringBuilder0.append(":");
                    stringBuilder0.append("\"").append(zzlh.zzcr(bundle0.getString(((String)object0)))).append("\"");
                    z = false;
                }
                stringBuilder0.append("}");
                return;
            }
            case 11: {
                Parcel parcel1 = zza.zzD(parcel0, v);
                parcel1.setDataPosition(0);
                this.zza(stringBuilder0, fastJsonResponse$Field0.zzoy(), parcel1);
                return;
            }
            default: {
                throw new IllegalStateException("Unknown field type out");
            }
        }
    }

    private void zzb(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, Object object0) {
        if(fastJsonResponse$Field0.zzoq()) {
            this.zzb(stringBuilder0, fastJsonResponse$Field0, ((ArrayList)object0));
            return;
        }
        this.zza(stringBuilder0, fastJsonResponse$Field0.zzok(), object0);
    }

    private void zzb(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, ArrayList arrayList0) {
        stringBuilder0.append("[");
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 != 0) {
                stringBuilder0.append(",");
            }
            this.zza(stringBuilder0, fastJsonResponse$Field0.zzok(), arrayList0.get(v1));
        }
        stringBuilder0.append("]");
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected Object zzck(String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean zzcl(String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public static HashMap zzh(Bundle bundle0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            hashMap0.put(((String)object0), bundle0.getString(((String)object0)));
        }
        return hashMap0;
    }

    public Parcel zzoE() {
        switch(this.zzabX) {
            case 0: {
                this.zzabY = zzb.zzac(this.zzabV);
                zzb.zzH(this.zzabV, this.zzabY);
                this.zzabX = 2;
                return this.zzabV;
            }
            case 1: {
                zzb.zzH(this.zzabV, this.zzabY);
                this.zzabX = 2;
                return this.zzabV;
            }
            default: {
                return this.zzabV;
            }
        }
    }

    FieldMappingDictionary zzoF() {
        switch(this.zzabW) {
            case 0: {
                return null;
            }
            case 1: {
                return this.zzabO;
            }
            case 2: {
                return this.zzabO;
            }
            default: {
                throw new IllegalStateException("Invalid creation type: " + this.zzabW);
            }
        }
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Map zzom() {
        return this.zzabO == null ? null : this.zzabO.zzco(this.mClassName);
    }
}

