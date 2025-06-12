package com.google.android.gms.tagmanager;

class zzde extends Number implements Comparable {
    private double zzaOq;
    private long zzaOr;
    private boolean zzaOs;

    private zzde(double f) {
        this.zzaOq = f;
        this.zzaOs = false;
    }

    private zzde(long v) {
        this.zzaOr = v;
        this.zzaOs = true;
    }

    @Override
    public byte byteValue() {
        return (byte)(((int)this.longValue()));
    }

    @Override
    public int compareTo(Object x0) {
        return this.zza(((zzde)x0));
    }

    // 去混淆评级： 低(20)
    @Override
    public double doubleValue() {
        return this.zzzG() ? ((double)this.zzaOr) : this.zzaOq;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof zzde && this.zza(((zzde)other)) == 0;
    }

    @Override
    public float floatValue() {
        return (float)this.doubleValue();
    }

    @Override
    public int hashCode() {
        return new Long(this.longValue()).hashCode();
    }

    @Override
    public int intValue() {
        return this.zzzI();
    }

    @Override
    public long longValue() {
        return this.zzzH();
    }

    @Override
    public short shortValue() {
        return this.zzzJ();
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return this.zzzG() ? Long.toString(this.zzaOr) : Double.toString(this.zzaOq);
    }

    public static zzde zzT(long v) {
        return new zzde(v);
    }

    public static zzde zza(Double double0) {
        return new zzde(((double)double0));
    }

    // 去混淆评级： 低(20)
    public int zza(zzde zzde0) {
        return !this.zzzG() || !zzde0.zzzG() ? Double.compare(this.doubleValue(), zzde0.doubleValue()) : new Long(this.zzaOr).compareTo(zzde0.zzaOr);
    }

    public static zzde zzeI(String s) throws NumberFormatException {
        try {
            return new zzde(Long.parseLong(s));
        }
        catch(NumberFormatException unused_ex) {
            try {
                return new zzde(Double.parseDouble(s));
            }
            catch(NumberFormatException unused_ex) {
                throw new NumberFormatException(s + " is not a valid TypedNumber");
            }
        }
    }

    public boolean zzzF() {
        return !this.zzzG();
    }

    public boolean zzzG() {
        return this.zzaOs;
    }

    // 去混淆评级： 低(20)
    public long zzzH() {
        return this.zzzG() ? this.zzaOr : ((long)this.zzaOq);
    }

    public int zzzI() {
        return (int)this.longValue();
    }

    public short zzzJ() {
        return (short)(((int)this.longValue()));
    }
}

