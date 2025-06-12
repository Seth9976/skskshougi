package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class zzri {
    public final int tag;
    protected final int type;
    protected final Class zzaVV;
    protected final boolean zzaVW;

    private zzri(int v, Class class0, int v1, boolean z) {
        this.type = v;
        this.zzaVV = class0;
        this.tag = v1;
        this.zzaVW = z;
    }

    protected Object zzA(zzrf zzrf0) {
        zzrn zzrn0;
        Class class0 = this.zzaVW ? this.zzaVV.getComponentType() : this.zzaVV;
        try {
            switch(this.type) {
                case 10: {
                    zzrn0 = (zzrn)class0.newInstance();
                    zzrf0.zza(zzrn0, this.tag >>> 3);
                    return zzrn0;
                }
                case 11: {
                    zzrn0 = (zzrn)class0.newInstance();
                    zzrf0.zza(zzrn0);
                    return zzrn0;
                }
                default: {
                    throw new IllegalArgumentException("Unknown type " + this.type);
                }
            }
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalArgumentException("Error creating instance of class " + class0, instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalArgumentException("Error creating instance of class " + class0, illegalAccessException0);
        }
        catch(IOException iOException0) {
            throw new IllegalArgumentException("Error reading extension field", iOException0);
        }
    }

    // 去混淆评级： 低(20)
    int zzQ(Object object0) {
        return this.zzaVW ? this.zzR(object0) : this.zzS(object0);
    }

    protected int zzR(Object object0) {
        int v = 0;
        int v1 = Array.getLength(object0);
        for(int v2 = 0; v2 < v1; ++v2) {
            if(Array.get(object0, v2) != null) {
                v += this.zzS(Array.get(object0, v2));
            }
        }
        return v;
    }

    protected int zzS(Object object0) {
        int v = this.tag >>> 3;
        switch(this.type) {
            case 10: {
                return zzrg.zzb(v, ((zzrn)object0));
            }
            case 11: {
                return zzrg.zzc(v, ((zzrn)object0));
            }
            default: {
                throw new IllegalArgumentException("Unknown type " + this.type);
            }
        }
    }

    @Deprecated
    public static zzri zza(int v, Class class0, int v1) {
        return new zzri(v, class0, v1, false);
    }

    protected void zza(zzrp zzrp0, List list0) {
        list0.add(this.zzA(zzrf.zzz(zzrp0.zzaWg)));
    }

    void zza(Object object0, zzrg zzrg0) throws IOException {
        if(this.zzaVW) {
            this.zzc(object0, zzrg0);
            return;
        }
        this.zzb(object0, zzrg0);
    }

    protected void zzb(Object object0, zzrg zzrg0) {
        try {
            zzrg0.zzkN(this.tag);
            switch(this.type) {
                case 10: {
                    zzrg0.zzb(((zzrn)object0));
                    zzrg0.zzC(this.tag >>> 3, 4);
                    return;
                }
                case 11: {
                    zzrg0.zzc(((zzrn)object0));
                    return;
                }
                default: {
                    throw new IllegalArgumentException("Unknown type " + this.type);
                }
            }
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    protected void zzc(Object object0, zzrg zzrg0) {
        int v = Array.getLength(object0);
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = Array.get(object0, v1);
            if(object1 != null) {
                this.zzb(object1, zzrg0);
            }
        }
    }

    final Object zzx(List list0) {
        if(list0 == null) {
            return null;
        }
        return this.zzaVW ? this.zzy(list0) : this.zzz(list0);
    }

    private Object zzy(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzrp zzrp0 = (zzrp)list0.get(v1);
            if(zzrp0.zzaWg.length != 0) {
                this.zza(zzrp0, arrayList0);
            }
        }
        int v2 = arrayList0.size();
        if(v2 == 0) {
            return null;
        }
        Object object0 = Array.newInstance(this.zzaVV.getComponentType(), v2);
        Object object1 = this.zzaVV.cast(object0);
        for(int v = 0; v < v2; ++v) {
            Array.set(object1, v, arrayList0.get(v));
        }
        return object1;
    }

    private Object zzz(List list0) {
        if(list0.isEmpty()) {
            return null;
        }
        Object object0 = this.zzA(zzrf.zzz(((zzrp)list0.get(list0.size() - 1)).zzaWg));
        return this.zzaVV.cast(object0);
    }
}

